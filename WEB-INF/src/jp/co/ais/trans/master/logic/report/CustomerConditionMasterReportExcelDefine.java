package jp.co.ais.trans.master.logic.report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.ais.trans.master.common.*;
import jp.co.ais.trans.master.entity.TRI_SJ_MST;

/**
 * ζψζπ}X^ΜExcelθ`NX
 */
public class CustomerConditionMasterReportExcelDefine extends ReportExcelDefineBase {

	private Map mapYknKbn;

	/**
	 * RXgN^
	 */
	public CustomerConditionMasterReportExcelDefine() {
		// aΰνΪ 1:Κaΰ 2:ΐaΰ 3:Oέaΰ 4:~aΰ
		mapYknKbn = new HashMap();
		mapYknKbn.put("1", "C00465");
		mapYknKbn.put("2", "C02154");
		mapYknKbn.put("3", "C02168");
		mapYknKbn.put("4", "C02169");
	}

	public String getFileName() {
		return "MG0155";
	}

	public String getSheetName() {
		// ζψζx₯πΟ½ΐπΤ·
		return "C02325";
	}

	public String[] getHeaderTexts() {
		// ^CgπΤ·
		return new String[] { "C00596", "C00786", "C00787", "C00788", "C02056", "C02057", "C02058", "C02059", "C00682",
				"C00233", "C02061", "C00779", "C02055", "C01326", "C00794", "C01068", "C00793", "C02037", "C00795",
				"C00796", "C00797", "C10224", "C00799", "C00800", "C00801", "C00802", "C00803", "C00804", "C00805",
				"C00055", "C00261" };

	}

	public short[] getColumnWidths() {
		// ρπΤ·
		return new short[] { 0, 11, 13, 11, 11, 13, 13, 13, 6, 5, 18, 5, 5, 6, 30, 30, 11, 11, 35, 35, 35, 6, 35, 35,
				35, 35, 35, 35, 35, 6, 6 };
	}

	public List convertDataToList(Object dto, String langCode) {
		TRI_SJ_MST entity = (TRI_SJ_MST) dto;
		List list = new ArrayList();

		// οΠR[h
		list.add(entity.getKAI_CODE());
		// ζψζR[h
		list.add(entity.getTRI_CODE());
		// ζψζͺΜ
		list.add(entity.getTRI_NAME_S());
		// ζψζπR[h
		list.add(entity.getTJK_CODE());
		// UθΏζͺ
		list.add(new AlignString(entity.getFURI_TESU_KBN() == 1 ? getWord("C00399", langCode) : getWord("C00327",
			langCode), AlignString.CENTER));
		// x₯πχίϊ
		// list.add(Integer.parseInt(entity.getSJC_DATE()));
		list.add(new AlignString(entity.getSJC_DATE(), AlignString.LEFT));
		// x₯πχίγ
		// list.add(Integer.parseInt(entity.getSJR_MON()));
		list.add(new AlignString(entity.getSJR_MON(), AlignString.LEFT));
		// x₯πx₯ϊ
		// list.add(Integer.parseInt(entity.getSJP_DATE()));
		list.add(new AlignString(entity.getSJP_DATE(), AlignString.LEFT));
		// x₯ζͺ
		list.add(new AlignString("00".equals(entity.getSIHA_KBN()) ? getWord("C02166", langCode) : getWord("C02167",
			langCode), AlignString.CENTER));
		// x₯ϋ@
		list.add(entity.getSIHA_HOU_CODE());
		// UUoβsϋΐΊ°Δή
		list.add(entity.getFURI_CBK_CODE());
		// βsR[h
		list.add(entity.getBNK_CODE());
		// xXR[h
		list.add(entity.getBNK_STN_CODE());
		// aΰνΪ
		list.add(new AlignString(getWord(entity.getYKN_KBN(), mapYknKbn, langCode), AlignString.CENTER));
		// ϋΐΤ
		list.add(entity.getYKN_NO());
		// ϋΐΌ`Ji
		list.add(entity.getYKN_KANA());
		// ΰΪIR[h
		list.add(entity.getGS_MKT_CODE());
		// ΰΪIΌ
		list.add(entity.getMKT_NAME());
		// νdόβsΌΜ
		list.add(entity.getGS_BNK_NAME());
		// νdόxXΌΜ
		list.add(entity.getGS_STN_NAME());
		// ϋΐΌ`
		list.add(entity.getYKN_NAME());
		// θΏζͺ
		list.add(new AlignString(entity.getGS_TESU_KBN() == 1 ? getWord("C00021", langCode) : getWord("C02319",
			langCode), AlignString.CENTER));
		// x₯βsΌΜ
		list.add(entity.getSIHA_BNK_NAME());
		// x₯xXΌΜ
		list.add(entity.getSIHA_STN_NAME());
		// x₯βsZ
		list.add(entity.getSIHA_BNK_ADR());
		// oRβsΌΜ
		list.add(entity.getKEIYU_BNK_NAME());
		// oRxXΌΜ
		list.add(entity.getKEIYU_STN_NAME());
		// oRβsZ
		list.add(entity.getKEIYU_BNK_ADR());
		// σζlZ
		list.add(entity.getUKE_ADR());
		// JnNϊ
		list.add(entity.getSTR_DATE());
		// IΉNϊ
		list.add(entity.getEND_DATE());

		return list;
	}
}
