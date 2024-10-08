package jp.co.ais.trans2.master.excel;

import java.awt.Color;
import java.util.List;

import javax.swing.*;

import org.apache.poi.ss.usermodel.*;

import jp.co.ais.trans.common.config.*;
import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans.common.util.*;
import jp.co.ais.trans.common.util.DateUtil;
import jp.co.ais.trans2.common.excel.*;
import jp.co.ais.trans2.common.model.format.*;
import jp.co.ais.trans2.define.*;
import jp.co.ais.trans2.model.slip.*;

/**
 * 伝票ヘッダーエクセル
 */
public class SlipHeaderExcel extends TExcel {

	/** true:ファイル添付機能有効 */
	protected static boolean isUseAttachment = ServerConfig.isFlagOn("trans.slip.use.attachment");

	/** true:付箋機能有効 */
	protected static boolean isUseTag = ServerConfig.isFlagOn("trans.slip.use.tag");

	/**
	 * コンストラクタ.
	 * 
	 * @param lang 言語コード
	 */
	public SlipHeaderExcel(String lang) {
		super(lang);
	}

	/**
	 * 伝票一覧をエクセルに返す
	 * 
	 * @param list
	 * @return list
	 * @throws TException
	 */
	public byte[] getExcel(List<SWK_HDR> list) throws TException {
		try {
			createReport(list);
			return getBinary();
		} catch (Exception e) {
			throw new TException(e);
		}
	}

	/**
	 * エクセルを出力する
	 * 
	 * @param list
	 */
	public void createReport(List<SWK_HDR> list) {

		// シート追加
		TExcelSheet sheet = addSheet(getWord("C03662")); // 伝票照会

		// カラム設定
		sheet.addColumn(getWord("C00605"), 4800); // 伝票番号
		sheet.addColumn(getWord("C01618"), 2700); // 修正回数
		sheet.addColumn(getWord("C00599"), 4200); // 伝票日付
		sheet.addColumn(getWord("C01178"), 4500); // 証憑番号
		sheet.addColumn(getWord("C01280"), 6500); // 部門
		sheet.addColumn(getWord("C01278"), 6500); // 入力者
		sheet.addColumn(getWord("C00569"), 7200); // 摘要
		sheet.addColumn(getWord("C00917"), 5500); // 伝票種別
		sheet.addColumn(getWord("C01069"), 4800); // 更新区分
		sheet.addColumn(getWord("C00610"), 4800); // 決算段階
		sheet.addColumn(getWord("C00408"), 6500); // 取引先
		sheet.addColumn(getWord("C00246"), 6500); // 社員
		sheet.addColumn(getWord("C11081"), 4800); // 通貨コード
		sheet.addColumn(getWord("C01620"), 4800); // 支払金額
		sheet.addColumn(getWord("C00600"), 4800); // 支払日
		sheet.addColumn(getWord("C00857"), 7200); // 銀行口座
		sheet.addColumn(getWord("C00233"), 4800); // 支払方法

		if (isUseAttachment) {
			sheet.addColumn(getWord("C11613"), 4200); // 添付あり
		}
		if (isUseTag) {
			sheet.addColumn(getWord("C12055"), 7200); // 付箋1 
			sheet.addColumn(getWord("C12056"), 7200); // 付箋2 
		}

		// 明細描写
		for (SWK_HDR hdr : list) {

			TExcelRow newRow = sheet.addRow();

			newRow.addCell(hdr.getSWK_DEN_NO());
			newRow.addCell(hdr.getSWK_UPD_CNT());
			newRow.addCell(DateUtil.toYMDString(hdr.getSWK_DEN_DATE()), SwingConstants.CENTER);
			newRow.addCell(hdr.getSWK_SEI_NO());
			newRow.addCell(hdr.getSWK_IRAI_DEP_NAME_S());
			newRow.addCell(hdr.getSWK_IRAI_EMP_NAME_S());
			newRow.addCell(hdr.getSWK_TEK());
			newRow.addCell(hdr.getSWK_DEN_SYU_NAME_S());
			newRow.addCell(getWord(SlipState.getSlipStateName(hdr.getSWK_UPD_KBN())), SwingConstants.CENTER);
			newRow.addCell(FormatUtil.settlementLevelFormat(hdr.getSWK_KSN_KBN(), lang), SwingConstants.CENTER);

			newRow.addCell(hdr.getSWK_TRI_NAME_S());
			newRow.addCell(hdr.getSWK_EMP_NAME_S());
			newRow.addCell(hdr.getSWK_CUR_CODE(), SwingConstants.CENTER);

			if (SlipKind.PURCHASE == hdr.getSlipKind()) {
				// 支払金額
				newRow.addCell(NumberFormatUtil.formatNumber(hdr.getSWK_IN_SIHA_KIN(), hdr.getSWK_CUR_DEC_KETA()));
				// 支払予定日
				newRow.addCell(DateUtil.toYMDString(hdr.getSWK_SIHA_DATE()), SwingConstants.CENTER);
				// 振出銀行口座
				newRow.addCell(hdr.getSWK_CBK_NAME());

			} else if (SlipKind.SALES == hdr.getSlipKind()) {
				// 請求金額
				newRow.addCell(NumberFormatUtil.formatNumber(hdr.getSWK_IN_KIN(), hdr.getSWK_CUR_DEC_KETA()));
				// 入金予定日
				newRow.addCell(DateUtil.toYMDString(hdr.getSWK_AR_DATE()), SwingConstants.CENTER);
				// 入金銀行口座
				newRow.addCell(hdr.getSWK_CBK_NAME());

			} else if (SlipKind.INPUT_CASH_FLOW == hdr.getSlipKind()) {// 入金伝票
				// 請求金額
				newRow.addCell(NumberFormatUtil.formatNumber(hdr.getSWK_IN_KIN(), hdr.getSWK_CUR_DEC_KETA()));
				// 入金予定日
				newRow.addCell(DateUtil.toYMDString(hdr.getSWK_AR_DATE()), SwingConstants.CENTER);
				// 入金銀行口座
				newRow.addCell(hdr.getSWK_CBK_NAME());

			} else if (SlipKind.OUTPUT_CASH_FLOW == hdr.getSlipKind()) {// 出金伝票
				// 支払金額
				newRow.addCell(NumberFormatUtil.formatNumber(hdr.getSWK_IN_KIN(), hdr.getSWK_CUR_DEC_KETA()));
				// 支払予定日
				newRow.addCell(DateUtil.toYMDString(hdr.getSWK_SIHA_DATE()), SwingConstants.CENTER);
				// 振出銀行口座
				newRow.addCell(hdr.getSWK_CBK_NAME());

			} else if (SlipKind.EMPLOYEE == hdr.getSlipKind()) {// 社員支払伝票
				// 支払金額
				newRow.addCell(NumberFormatUtil.formatNumber(hdr.getSWK_IN_SIHA_KIN(), hdr.getSWK_CUR_DEC_KETA()));
				// 支払予定日
				newRow.addCell(DateUtil.toYMDString(hdr.getSWK_SIHA_DATE()), SwingConstants.CENTER);
				// 振出銀行口座
				newRow.addCell(hdr.getSWK_CBK_NAME());

			} else {
				// 支払/請求金額
				newRow.addCell("");
				newRow.addCell("");
				newRow.addCell("");
			}

			// 支払方法
			newRow.addCell(hdr.getSWK_HOH_NAME());

			if (isUseAttachment) {
				// 添付ファイル
				// C00006">あり
				// C00412">なし
				newRow.addCell(getWord(hdr.isExistAttachment() ? "C00006" : "C00412"), SwingConstants.CENTER);
			}
			if (isUseTag) {
				// 付箋
				SWK_TAG tag1 = null;
				SWK_TAG tag2 = null;
				for (SWK_TAG bean : hdr.getSwkTags()) {
					if (bean.getSEQ() == 1) {
						tag1 = bean;
					} else if (bean.getSEQ() == 2) {
						tag2 = bean;
					}
				}
				if (tag1 != null) {
					CellStyle tag1Style = getCellStyle(tag1.getTAG_COLOR());
					newRow.addCell(tag1.getTAG_TITLE(), tag1Style);
				} else {
					newRow.addCell("");
				}
				if (tag2 != null) {
					CellStyle tag2Style = getCellStyle(tag2.getTAG_COLOR());
					newRow.addCell(tag2.getTAG_TITLE(), tag2Style);
				} else {
					newRow.addCell("");
				}
			}
		}

	}

	/**
	 * @param fillColor
	 * @return スタイル
	 */
	protected CellStyle getCellStyle(Color fillColor) {

		CellStyle style = workBook.createCellStyle();
		style.cloneStyleFrom(getCellStyleManager().getLeftStyle());
		if (fillColor != null) {
			setFillColor(style, fillColor);
		}
		// 明示的にstyle変更（TExcelOutput.setFillColorで変更されている為）
		style.setWrapText(false);
		style.setAlignment(CellStyle.ALIGN_LEFT);

		return style;
	}

	/**
	 * 背景色設定
	 * 
	 * @param style
	 * @param color
	 */
	protected void setFillColor(CellStyle style, Color color) {
		TExcelOutput.setFillColor(workBook, style, color);
	}
}