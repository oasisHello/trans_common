package jp.co.ais.trans.master.logic.report;

import java.util.*;

import jp.co.ais.trans.master.common.*;
import jp.co.ais.trans.master.entity.*;

/**
 * ÊÝ}X^ÌExcelè`NX
 */
public class CurrencyMasterReportExcelDefine extends ReportExcelDefineBase {

	public String getFileName() {
		return "MG0300";
	}

	public String getSheetName() {
		// ÊÝ}X^ðÔ·
		return "C01985";
	}

	public String[] getHeaderTexts() {
		// ^CgðÔ·
		return new String[] { "C00596", "C00665", "C00880", "C00881", "C00882", "C00896", "C00897", "C00884", "C00055",
				"C00261" };
	}

	public short[] getColumnWidths() {
		// ñðÔ·
		return new short[] { 0, 6, 40, 20, 20, 6, 5, 20, 6, 6 };
	}

	private Map mapConvKbn;

	/**
	 * 
	 */
	public CurrencyMasterReportExcelDefine() {
		// ·Zæª - 0:|Z 1:Z
		mapConvKbn = new HashMap();
		mapConvKbn.put(0, "C00065");
		mapConvKbn.put(1, "C00563");
	}

	public List convertDataToList(Object dto, String langCode) {
		CUR_MST entity = (CUR_MST) dto;
		List list = new ArrayList();

		// ïÐR[h
		list.add(entity.getKAI_CODE());
		// ÊÝR[h
		// list.add(entity.getCUR_CODE());

		list.add(new AlignString(entity.getCUR_CODE(), AlignString.CENTER));

		// ÊÝ¼Ì
		list.add(entity.getCUR_NAME());
		// ÊÝªÌ
		list.add(entity.getCUR_NAME_S());
		// ÊÝõ¼Ì
		list.add(entity.getCUR_NAME_K());
		// [gW
		list.add(entity.getRATE_POW());
		// ·Zæª
		list.add(new AlignString(getWord(entity.getCONV_KBN(), mapConvKbn, langCode), AlignString.CENTER));
		// ¬_Èº
		list.add(entity.getDEC_KETA());
		// JnNú
		list.add(entity.getSTR_DATE());
		// I¹Nú
		list.add(entity.getEND_DATE());

		return list;
	}
}
