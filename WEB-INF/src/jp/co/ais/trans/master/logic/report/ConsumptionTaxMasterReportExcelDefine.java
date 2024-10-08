package jp.co.ais.trans.master.logic.report;

import java.util.*;

import jp.co.ais.trans.common.util.*;
import jp.co.ais.trans.master.common.*;
import jp.co.ais.trans.master.entity.*;

/**
 * ÁïÅ}X^ÌExcelè`NX
 */
public class ConsumptionTaxMasterReportExcelDefine extends ReportExcelDefineBase {

	public String getFileName() {
		return "MG0130";
	}

	public String getSheetName() {
		// ÁïÅ}X^ðÔ·
		return "C02324";
	}

	public String[] getHeaderTexts() {
		// ^CgðÔ·
		return new String[] { "C00596", "C00573", "C00774", "C00775", "C00828", "C01283", "C00777", "C02045", "C00055",
				"C00261" };
	}

	public short[] getColumnWidths() {
		// ñðÔ·
		return new short[] { 0, 10, 40, 20, 40, 10, 8, 25, 6, 6 };
	}

	private Map mapUsKbn;

	/**
	 * 
	 */
	public ConsumptionTaxMasterReportExcelDefine() {
		// ãdüæª 0:ÎÛO 1:ã 2:dü
		mapUsKbn = new HashMap();
		mapUsKbn.put(0, "C02103");
		mapUsKbn.put(1, "C00026");
		mapUsKbn.put(2, "C00201");

	}

	public List convertDataToList(Object dto, String langCode) {
		SZEI_MST entity = (SZEI_MST) dto;
		List list = new ArrayList();

		// ïÐR[h
		list.add(entity.getKAI_CODE());
		// ÁïÅR[h
		list.add(entity.getZEI_CODE());
		// ÁïÅ¼Ì
		list.add(entity.getZEI_NAME());
		// ÁïÅªÌ
		list.add(entity.getZEI_NAME_S());
		// ÁïÅõ¼Ì
		list.add(entity.getZEI_NAME_K());
		// ãdüæª
		list.add(new AlignString(getWord(entity.getUS_KBN(), mapUsKbn, langCode), AlignString.CENTER));
		// ÁïÅ¦
		// DecimalFormat format = new DecimalFormat("##.0");
		// String zeiRate = format.format(Float.valueOf(String.valueOf(entity.getZEI_RATE())));
		// list.add(zeiRate);
		double rate = (Float.valueOf(entity.getZEI_RATE() * 10)).intValue();
		list.add(new AlignString(Double.toString(rate / 10), AlignString.RIGHT));// entity.getZEI_RATE());
		// ÁïÅvZoÍ
		list.add(new AlignString(Util.isNullOrEmpty(entity.getSZEI_KEI_KBN()) ? getWord("C00282", langCode) : entity
			.getSZEI_KEI_KBN(), AlignString.RIGHT));
		// JnNú
		list.add(entity.getSTR_DATE());
		// I¹Nú
		list.add(entity.getEND_DATE());

		return list;
	}
}
