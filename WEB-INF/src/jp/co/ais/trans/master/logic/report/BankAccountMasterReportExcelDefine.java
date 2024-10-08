package jp.co.ais.trans.master.logic.report;

import java.util.*;

import jp.co.ais.trans.master.common.*;
import jp.co.ais.trans.master.entity.*;

/**
 * âsûÀ}X^ÌExcelè`NX
 */
public class BankAccountMasterReportExcelDefine extends ReportExcelDefineBase {

	public String getFileName() {
		return "MP0030";
	}

	public String getSheetName() {
		// âsûÀ}X^ðÔ·
		return "C02322";
	}

	public String[] getHeaderTexts() {
		// ^CgðÔ·
		return new String[] { "C00596", "C01879", "C02145", "C00665", "C00880", "C00779", "C00781", "C02055", "C02060",
				"C00858", "C10133", "C00860", "C00861", "C01326", "C00794", "C01117", "C01122", "C00571", "C00572",
				"C00602", "C00603", "C00055", "C00261" };
	}

	public short[] getColumnWidths() {
		// ñðÔ·
		return new short[] { 0, 10, 40, 6, 40, 6, 30, 6, 30, 12, 40, 40, 70, 5, 10, 7, 7, 10, 10, 10, 10, 6, 6 };
	}

	private Map yknKbnMap;

	/**
	 * 
	 */
	public BankAccountMasterReportExcelDefine() {
		// aàíÚ
		yknKbnMap = new LinkedHashMap();
		yknKbnMap.put(1, "C00463");
		yknKbnMap.put(2, "C00397");
		yknKbnMap.put(3, "C00045");
		yknKbnMap.put(4, "C00368");
	}

	public List convertDataToList(Object dto, String langCode) {
		AP_CBK_MST2 entity = (AP_CBK_MST2) dto;
		List list = new ArrayList();

		// ïÐR[h
		list.add(entity.getKAI_CODE());
		// âsûÀR[h
		list.add(entity.getCBK_CBK_CODE());
		// âsûÀ¼Ì
		list.add(entity.getCBK_NAME());
		// ÊÝR[h
		//list.add(entity.getCUR_CODE());
		
		list.add(new AlignString(entity.getCUR_CODE(),AlignString.CENTER));
		// ÊÝ¼Ì
		list.add(entity.getCUR_NAME());
		// âsR[h
		list.add(entity.getCBK_BNK_CODE());
		// âs¼Ì
		list.add(entity.getBNK_NAME_S());
		// xXR[h
		list.add(entity.getCBK_STN_CODE());
		// xX¼Ì
		list.add(entity.getBNK_STN_NAME_S());
		// UËlR[h
		list.add(entity.getCBK_IRAI_EMP_CODE());
		// UËl¼
		list.add(entity.getCBK_IRAI_NAME());
		// UËl¼i¿j
		list.add(entity.getCBK_IRAI_NAME_J());
		// UËl¼ipj
		list.add(entity.getCBK_IRAI_NAME_E());
		// aàíÚ
		list.add(getWord(entity.getCBK_YKN_KBN(), yknKbnMap, langCode));
		// ûÀÔ
		list.add(entity.getCBK_YKN_NO());
		// Ðõeaæª
		list.add(new AlignString(entity.getCBK_EMP_FB_KBN() == 0 ? getWord("C02148", langCode) : getWord("C02149",
				langCode), AlignString.CENTER));
		// ÐOeaæª
		list.add(new AlignString(entity.getCBK_OUT_FB_KBN() == 0 ? getWord("C02150", langCode) : getWord("C02151",
				langCode), AlignString.CENTER));
		// vãåR[h
		list.add(entity.getCBK_DEP_CODE());
		// ÈÚR[h
		list.add(entity.getCBK_KMK_CODE());
		// âÈÚR[h
		list.add(entity.getCBK_HKM_CODE());
		// àóÈÚR[h
		list.add(entity.getCBK_UKM_CODE());
		// JnNú
		list.add(entity.getSTR_DATE());
		// I¹Nú
		list.add(entity.getEND_DATE());

		return list;
	}
}
