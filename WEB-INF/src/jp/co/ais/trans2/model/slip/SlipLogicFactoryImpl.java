package jp.co.ais.trans2.model.slip;

import java.util.*;

import jp.co.ais.trans.common.config.*;
import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans2.define.*;
import jp.co.ais.trans2.model.*;

/**
 * 伝票ロジックファクトリー実装
 */
public class SlipLogicFactoryImpl extends TModel implements SlipLogicFactory {

	/** ロジック名 */
	protected Map<String, String> logicMap = new TreeMap<String, String>();

	/**
	 * コンストラクタ.
	 */
	public SlipLogicFactoryImpl() {
		initData();
	}

	/**
	 * 伝票ロジックを内部保持.
	 */
	protected void initData() {

		// 011 入金伝票
		logicMap.put("011", "InputCashFlowSlipLogic");
		// 012 出金伝票
		logicMap.put("012", "OutputCashFlowSlipLogic");
		// 013 振替伝票
		logicMap.put("013", "TransferSlipLogic");
		// 014 振戻伝票
		logicMap.put("014", "ReversingSlipLogic");
		// 015 振戻取消伝票
		logicMap.put("015", "ReversingSlipLogic");
		// 016 IFRS帳簿調整伝票
		logicMap.put("016", "IfrsAdjustmentSlipLogic");
		// 017 自国帳簿調整伝票
		logicMap.put("017", "IfrsAdjustmentSlipLogic");

		// 01C BS消込伝票
		logicMap.put("01C", "BsCalculateEraseSlip");
		// 01A 外貨評価替伝票
		logicMap.put("01A", "EvaluationSlip");
		// 01B 外貨評価替取消伝票
		logicMap.put("01B", "EvaluationCancelSlip");

		// 01D 月次費用計上伝票
		logicMap.put("01D", "MonthlyPatternSlipLogic");

		// 021 社員仮払
		logicMap.put("021", "TemporaryPaymentSlipLogic");
		// 022 経費精算
		logicMap.put("022", "SettlementSlipLogic");
		// 023 債務計上
		logicMap.put("023", "APSlipLogic");

		// 024 支払伝票（社員）
		logicMap.put("024", "TransferSlipLogic");
		// 025 支払伝票（臨時）
		// 026 支払伝票（定時）
		// 027 外国送金調整

		// 028 28:支払伝票(共通)
		logicMap.put("028", "ExPaymentSlipLogic");

		// 031 債権計上
		logicMap.put("031", "ARSlipLogic");
		// 032 債権消込
		logicMap.put("032", "ARErasingSlipLogic");
		// 03A 入金自動伝票
		logicMap.put("03A", "CashInAutoSlip");

		// 061 固定資産振替伝票
		logicMap.put("061", "FaAutoTransferSlipLogic");
		logicMap.put("062", "FaAutoTransferSlipLogic");

		// 相殺精算伝票（振替）
		logicMap.put("FSL", "OffsetClearanceSlip");
		// 相殺精算伝票（債務）
		logicMap.put("FSP", "OffsetClearanceApSlip");
		// 相殺精算伝票（債権）
		logicMap.put("FSR", "OffsetClearanceArSlip");

		try {
			// 追加分(振戻伝票)
			String[] reversingSlipTypes = ServerConfig.getProperties("trans.slip.reversing.addon.types");
			String[] reversingCancelSlipTypes = ServerConfig.getProperties("trans.slip.reversing.cancel.addon.types");
			for (String slipTypeCode : reversingSlipTypes) {
				// 振戻伝票
				logicMap.put(slipTypeCode, "ReversingSlipLogic");
			}
			for (String slipTypeCode : reversingCancelSlipTypes) {
				// 振戻取消伝票
				logicMap.put(slipTypeCode, "ReversingSlipLogic");
			}
		} catch (MissingResourceException e) {
			// 設定なし＝処理なし
		}
	}

	/**
	 * 伝票種別を元にロジッククラスを返す.
	 * 
	 * @param slipType 伝票種別
	 * @return ロジッククラス
	 */
	public SlipLogic getLogic(String slipType) {

		try {

			// 伝票種別情報を取得
			SlipTypeManager typeMgr = (SlipTypeManager) getComponent(SlipTypeManager.class);
			SlipTypeSearchCondition condition = new SlipTypeSearchCondition();
			condition.setCompanyCode(getCompanyCode());
			condition.setCode(slipType);
			List<SlipType> typeList = typeMgr.get(condition);
			if (typeList == null || typeList.isEmpty()) {
				throw new TRuntimeException(getMessage("I00128", slipType));// 伝票種別[{0}]が設定されていません。
			}

			String logicName = logicMap.get(slipType);
			if (logicName == null) {
				logicName = getDefaultLogicName(typeList.get(0));
				if (logicName == null) {
					throw new TRuntimeException(getMessage("I00128", slipType));// 伝票種別[{0}]が設定されていません。
				}
			}

			SlipLogic logic = (SlipLogic) getComponent(logicName);
			logic.setSlipType(slipType);

			if (!typeList.isEmpty()) {
				logic.setDataType(typeList.get(0).getDataType());
			}

			return logic;

		} catch (TException ex) {
			throw new TRuntimeException(ex);
		}
	}

	/**
	 * 伝票種別を元にロジッククラスを返す.
	 * 
	 * @param slipType 伝票種別
	 * @param dataType
	 * @return ロジッククラス
	 */
	public SlipLogic getLogic(String slipType, String dataType) {
		try {

			// 伝票種別情報を取得
			SlipTypeManager typeMgr = (SlipTypeManager) getComponent(SlipTypeManager.class);
			SlipTypeSearchCondition condition = new SlipTypeSearchCondition();
			condition.setCompanyCode(getCompanyCode());
			condition.setCode(slipType);
			List<SlipType> typeList = typeMgr.get(condition);
			if (typeList == null || typeList.isEmpty()) {
				throw new TRuntimeException(getMessage("I00128", slipType));// 伝票種別[{0}]が設定されていません。
			}

			String logicName = logicMap.get(slipType);
			if (logicName == null) {
				typeList.get(0).setDataType(dataType);
				logicName = getDefaultLogicName(typeList.get(0));
				if (logicName == null) {
					throw new TRuntimeException(getMessage("I00128", slipType));// 伝票種別[{0}]が設定されていません。
				}
			}

			SlipLogic logic = (SlipLogic) getComponent(logicName);

			logic.setSlipType(slipType);
			if (!typeList.isEmpty()) {
				logic.setDataType(typeList.get(0).getDataType());
			}

			return logic;

		} catch (TException ex) {
			throw new TRuntimeException(ex);
		}
	}

	/**
	 * デフォルトの伝票ロジックを返す
	 * 
	 * @param slipType 伝票種別
	 * @return SlipType
	 */
	protected String getDefaultLogicName(SlipType slipType) {

		SlipKind slipKind = SlipKind.get(slipType.getDataType());

		if (SlipKind.INPUT_CASH_FLOW == slipKind) {
			return logicMap.get("011");
		}

		if (SlipKind.OUTPUT_CASH_FLOW == slipKind) {
			return logicMap.get("012");
		}

		if (SlipKind.TRANSFER == slipKind) {
			return logicMap.get("013");
		}

		if (SlipKind.IFRS_TRANSFER == slipKind) {
			return logicMap.get("016");
		}

		if (SlipKind.SALES == slipKind) {
			return logicMap.get("031");
		}

		if (SlipKind.PURCHASE == slipKind) {
			return logicMap.get("023");
		}

		return null;

	}

}
