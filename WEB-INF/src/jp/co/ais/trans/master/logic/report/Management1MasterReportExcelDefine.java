package jp.co.ais.trans.master.logic.report;

import java.util.*;

import org.seasar.framework.container.*;
import org.seasar.framework.container.factory.*;

import jp.co.ais.trans.master.entity.*;
import jp.co.ais.trans.master.logic.*;

/**
 * วP}X^ฬExcel่`NX
 */
public class Management1MasterReportExcelDefine extends ReportExcelDefineBase {

	public String getFileName() {
		return "MG0180";
	}

	public String getSheetName() {
		// วP}X^๐ิท
		return "C02343";
	}

	public String[] getHeaderTexts() {
		CMP_MST info = this.getCompanyInfo(getKaiCode());
		// พ๊R[h
		String lang = getLangCode();
		// วPผ { R[h
		String code = String.valueOf(info.getKNR_NAME_1()) + getWord("C00174", lang);
		// วPผ { ผฬ
		String name = String.valueOf(info.getKNR_NAME_1()) + getWord("C00518", lang);
		// วPผ { ชฬ
		String nameS = String.valueOf(info.getKNR_NAME_1()) + getWord("C00548", lang);
		// วPผ { ๕ผฬ
		String nameK = String.valueOf(info.getKNR_NAME_1()) + getWord("C00160", lang);
		// ^Cg๐ิท
		return new String[] { "C00596", code, name, nameS, nameK, "C00055", "C00261" };
	}

	public short[] getColumnWidths() {
		// ๑๐ิท
		return new short[] { 10, 10, 20, 20, 40, 6, 6, };
	}

	public List convertDataToList(Object dto, String langCode) {
		KNR1_MST entity = (KNR1_MST) dto;
		List list = new ArrayList();

		// ๏ะR[h
		list.add(entity.getKAI_CODE());
		// [%วผฬP%]R[h
		list.add(entity.getKNR_CODE_1());
		// [%วผฬP%]ผฬ
		list.add(entity.getKNR_NAME_1());
		// [%วผฬP%]ชฬ
		list.add(entity.getKNR_NAME_S_1());
		// [%วผฬP%]๕ผฬ
		list.add(entity.getKNR_NAME_K_1());
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
