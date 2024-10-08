package jp.co.ais.trans.master.logic.report;

import java.util.*;

import org.seasar.framework.container.*;
import org.seasar.framework.container.factory.*;

import jp.co.ais.trans.master.entity.*;
import jp.co.ais.trans.master.logic.*;

/**
 * ว5}X^ฬExcel่`NX
 */
public class Management5MasterReportExcelDefine extends ReportExcelDefineBase {

	public String getFileName() {
		return "MG0220";
	}

	public String getSheetName() {
		// ว5}X^๐ิท
		return "C02347";
	}

	public String[] getHeaderTexts() {
		CMP_MST info = this.getCompanyInfo(getKaiCode());
		// พ๊R[h
		String lang = getLangCode();
		// วTผ { R[h
		String code = String.valueOf(info.getKNR_NAME_5()) + getWord("C00174", lang);
		// วTผ { ผฬ
		String name = String.valueOf(info.getKNR_NAME_5()) + getWord("C00518", lang);
		// วTผ { ชฬ
		String nameS = String.valueOf(info.getKNR_NAME_5()) + getWord("C00548", lang);
		// วTผ { ๕ผฬ
		String nameK = String.valueOf(info.getKNR_NAME_5()) + getWord("C00160", lang);
		// ^Cg๐ิท
		return new String[] { "C00596", code, name, nameS, nameK, "C00055", "C00261" };
	}

	public short[] getColumnWidths() {
		// ๑๐ิท
		return new short[] { 10, 10, 20, 20, 40, 6, 6, };
	}

	public List convertDataToList(Object dto, String langCode) {
		KNR5_MST entity = (KNR5_MST) dto;
		List list = new ArrayList();

		// ๏ะR[h
		list.add(entity.getKAI_CODE());
		// [%วผฬ5%]R[h
		list.add(entity.getKNR_CODE_5());
		// [%วผฬ5%]ผฬ
		list.add(entity.getKNR_NAME_5());
		// [%วผฬ5%]ชฬ
		list.add(entity.getKNR_NAME_S_5());
		// [%วผฬ5%]๕ผฬ
		list.add(entity.getKNR_NAME_K_5());
		// JnN๚
		list.add(entity.getSTR_DATE());
		// IนN๚
		list.add(entity.getEND_DATE());

		return list;
	}

	/**
	 * @param kaiCode
	 * @return CMP_MST
	 */
	public CMP_MST getCompanyInfo(String kaiCode) {
		S2Container container = SingletonS2ContainerFactory.getContainer();

		CompanyControlLogic logic = (CompanyControlLogic) container.getComponent(CompanyControlLogic.class);

		CMP_MST map = null;
		// ส๐ๆพท้B
		map = (CMP_MST) logic.findOne(kaiCode);
		return map;
	}
}
