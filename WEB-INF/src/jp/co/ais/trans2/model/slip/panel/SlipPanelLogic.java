package jp.co.ais.trans2.model.slip.panel;

import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans2.model.*;
import jp.co.ais.trans2.model.slip.*;

/**
 * 伝票画面Class取得処理
 */
public abstract class SlipPanelLogic extends TModel {

	/** 伝票種別 */
	protected String slipType;

	/** データ区分 */
	protected String dataType;

	/**
	 * 伝票種別
	 * 
	 * @param slipType 伝票種別
	 */
	public void setSlipType(String slipType) {
		this.slipType = slipType;
	}

	/**
	 * 伝票種別取得
	 * 
	 * @return 伝票種別
	 * @throws TException
	 */
	public SlipType getSlipType() throws TException {
		return getSlipType(this.slipType);
	}

	/**
	 * 伝票種別
	 * 
	 * @param typeNo 伝票種別番号
	 * @return 伝票種別
	 * @throws TException
	 */
	public SlipType getSlipType(String typeNo) throws TException {
		SlipTypeManager slipTypeManager = (SlipTypeManager) getComponent(SlipTypeManager.class);
		SlipType type = slipTypeManager.get(getCompanyCode(), typeNo);

		if (type == null) {
			// 伝票種別[{0}]が設定されていません。
			throw new TException("I00128", typeNo);
		}

		return type;
	}

	/**
	 * データ区分
	 * 
	 * @param dataKind データ区分
	 */
	public void setDataType(String dataKind) {
		this.dataType = dataKind;
	}

	/**
	 * @param prgCode プログラムコード
	 * @return Class
	 */
	public abstract Class getSlipPanelClass(String prgCode);

}
