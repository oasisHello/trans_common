package jp.co.ais.trans.master.logic.report;

import java.util.*;

import org.seasar.framework.container.*;
import org.seasar.framework.container.factory.*;

import jp.co.ais.trans.master.entity.*;
import jp.co.ais.trans.master.logic.*;

/**
 * ว4}X^ฬExcel่`NX
 */
public class Management4MasterReportExcelDefine extends ReportExcelDefineBase {

	public String getFileName() {
		return "MG0210";
	}

	public String getSheetName() {
		// วS}X^๐ิท
		return "C02346";
	}

	public String[] getHeaderTexts() {
		CMP_MST info = this.getCompanyInfo(getKaiCode());
		// พ๊R[h
		String lang = getLangCode();
		// วSผ { R[h
		String code = String.valueOf(info.getKNR_NAME_4()) + getWord("C00174", lang);
		// วSผ { ผฬ
		String name = String.valueOf(info.getKNR_NAME_4()) + getWord("C00518", lang);
		// วSผ { ชฬ
		String nameS = String.valueOf(info.getKNR_NAME_4()) + getWord("C00548", lang);
		// วSผ { ๕ผฬ
		String nameK = String.valueOf(info.getKNR_NAME_4()) + getWord("C00160", lang);
		// ^Cg๐ิท
		return new String[] { "C00596", code, name, nameS, nameK, "C00055", "C00261" };
	}

	public short[] getColumnWidths() {
		// ๑๐ิท
		return new short[] { 10, 10, 20, 20, 40, 6, 6, };
	}

	public List convertDataToList(Object dto, String langCode) {
		KNR4_MST entity = (KNR4_MST) dto;
		List list = new ArrayList();

		// ๏ะR[h
		list.add(entity.getKAI_CODE());
		// [%วผฬ4%]R[h
		list.add(entity.getKNR_CODE_4());
		// [%วผฬ4%]ผฬ
		list.add(entity.getKNR_NAME_4());
		// [%วผฬ4%]ชฬ
		list.add(entity.getKNR_NAME_S_4());
		// [%วผฬ4%]๕ผฬ
		list.add(entity.getKNR_NAME_K_4());
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
