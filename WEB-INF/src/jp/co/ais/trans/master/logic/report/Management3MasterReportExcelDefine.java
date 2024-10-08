package jp.co.ais.trans.master.logic.report;

import java.util.*;

import org.seasar.framework.container.*;
import org.seasar.framework.container.factory.*;

import jp.co.ais.trans.master.entity.*;
import jp.co.ais.trans.master.logic.*;

/**
 * ว3}X^ฬExcel่`NX
 */
public class Management3MasterReportExcelDefine extends ReportExcelDefineBase {

	public String getFileName() {
		return "MG0200";
	}

	public String getSheetName() {
		// วR}X^๐ิท
		return "C02345";
	}

	public String[] getHeaderTexts() {
		CMP_MST info = this.getCompanyInfo(getKaiCode());
		// พ๊R[h
		String lang = getLangCode();
		// วRผ { R[h
		String code = String.valueOf(info.getKNR_NAME_3()) + getWord("C00174", lang);
		// วRผ { ผฬ
		String name = String.valueOf(info.getKNR_NAME_3()) + getWord("C00518", lang);
		// วRผ { ชฬ
		String nameS = String.valueOf(info.getKNR_NAME_3()) + getWord("C00548", lang);
		// วRผ { ๕ผฬ
		String nameK = String.valueOf(info.getKNR_NAME_3()) + getWord("C00160", lang);
		// ^Cg๐ิท
		return new String[] { "C00596", code, name, nameS, nameK, "C00055", "C00261" };
	}

	public short[] getColumnWidths() {
		// ๑๐ิท
		return new short[] { 10, 10, 20, 20, 40, 6, 6, };
	}

	public List convertDataToList(Object dto, String langCode) {
		KNR3_MST entity = (KNR3_MST) dto;
		List list = new ArrayList();

		// ๏ะR[h
		list.add(entity.getKAI_CODE());
		// [%วผฬ3%]R[h
		list.add(entity.getKNR_CODE_3());
		// [%วผฬ3%]ผฬ
		list.add(entity.getKNR_NAME_3());
		// [%วผฬ3%]ชฬ
		list.add(entity.getKNR_NAME_S_3());
		// [%วผฬ3%]๕ผฬ
		list.add(entity.getKNR_NAME_K_3());
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
