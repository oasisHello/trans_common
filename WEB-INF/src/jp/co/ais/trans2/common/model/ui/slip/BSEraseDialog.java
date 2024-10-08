package jp.co.ais.trans2.common.model.ui.slip;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans2.common.gui.TDialog;
import jp.co.ais.trans2.common.gui.TTable;
import jp.co.ais.trans2.common.model.ui.*;
import jp.co.ais.trans2.define.*;
import jp.co.ais.trans2.model.company.*;

/**
 * BScκΜw¦ζΚ
 * 
 * @author AIS
 */
public class BSEraseDialog extends TDialog {

	/**
	 * e[uρΌρΜ
	 */
	public enum SC {
		/** GeBeB */
		BEAN,

		/** Iπ`FbN{bNX */
		CHECK,

		/** ζψζR[h */
		SWK_TRI_CODE,

		/** ζψζ */
		SWK_TRI_NAME_S,

		/** εR[h */
		SWK_DEP_CODE,

		/** ε */
		SWK_DEP_NAME_S,

		/** ΘΪR[h */
		SWK_KMK_CODE,

		/** ΘΪ */
		SWK_KMK_NAME_S,

		/** βΘΪR[h */
		SWK_HKM_CODE,

		/** βΘΪ */
		SWK_HKM_NAME_S,

		/** ΰσΘΪR[h */
		SWK_UKM_CODE,

		/** ΰσ */
		SWK_UKM_NAME_S,

		/** `[ϊt */
		SWK_DEN_DATE,

		/** `[Τ */
		SWK_DEN_NO,

		/** sΤ */
		SWK_GYO_NO,

		/** Κέ */
		SWK_CUR_CODE,

		/** [g */
		SWK_CUR_RATE,

		/** Ψϋ(Oέ) */
		DR_IN_KIN,

		/** Ψϋ */
		DR_KIN,

		/** έϋ(Oέ) */
		CR_IN_KIN,

		/** έϋ */
		CR_KIN,

		/** sEv */
		SWK_GYO_TEK,

		/** ΠυR[h */
		SWK_EMP_CODE,

		/** ΠυͺΜ */
		SWK_EMP_NAME_S,

		/** ΗPR[h */
		SWK_KNR_CODE_1,

		/** ΗPͺΜ */
		SWK_KNR_NAME_S_1,

		/** ΗQR[h */
		SWK_KNR_CODE_2,

		/** ΗQͺΜ */
		SWK_KNR_NAME_S_2,

		/** ΗRR[h */
		SWK_KNR_CODE_3,

		/** ΗRͺΜ */
		SWK_KNR_NAME_S_3,

		/** ΗSR[h */
		SWK_KNR_CODE_4,

		/** ΗSͺΜ */
		SWK_KNR_NAME_S_4,

		/** ΗTR[h */
		SWK_KNR_CODE_5,

		/** ΗTͺΜ */
		SWK_KNR_NAME_S_5,

		/** ΗUR[h */
		SWK_KNR_CODE_6,

		/** ΗUͺΜ */
		SWK_KNR_NAME_S_6,

		/** ροvΎΧP */
		SWK_HM_1,

		/** ροvΎΧQ */
		SWK_HM_2,

		/** ροvΎΧR */
		SWK_HM_3;
	}

	/** `[ϊt */
	public TLabelPopupCalendar ctrlSlipDate;

	/**  */
	public TLabel lblSlipDateEnd;

	/** »έvγοΠ */
	public TCompanyReference ctrlKCompany;

	/** ΘΪEβEΰσΜjbgR|[lg */
	public TItemGroup ctrlItemGroup;

	/** ζψζwθ */
	public TCustomerReference ctrlCustomer;

	/** εwθ */
	public TDepartmentReference ctrlDepartment;

	/** Πυ */
	public TEmployeeReference ctrlEmployee;

	/** Η1 */
	public TManagement1Reference ctrlManage1;

	/** Η2 */
	public TManagement2Reference ctrlManage2;

	/** Η3 */
	public TManagement3Reference ctrlManage3;

	/** Η4 */
	public TManagement4Reference ctrlManage4;

	/** Η5 */
	public TManagement5Reference ctrlManage5;

	/** Η6 */
	public TManagement6Reference ctrlManage6;

	/** ροvΎΧ */
	public TNonAccountintDetailUnit ctrlNonAcDetails;

	/** υ{^ */
	public TButton btnSearch;

	/** mθ{^ */
	public TButton btnSettle;

	/** ζΑ{^ */
	public TButton btnCancel;

	/** DRόΝΰzv */
	public TLabelNumericField ctrlDrInputTotal;

	/** CRόΝΰzv */
	public TLabelNumericField ctrlCrInputTotal;

	/** DRv */
	public TLabelNumericField ctrlDrTotal;

	/** CRv */
	public TLabelNumericField ctrlCrTotal;

	/** ΚέR[h */
	public TLabelField ctrlCurrencyCode;

	/** Xvbh */
	public TTable tbl;

	/** Iπ */
	public TCheckBox chk;

	/**
	 * RXgN^.
	 * 
	 * @param company οΠξρ
	 * @param parent et[
	 */
	public BSEraseDialog(Company company, Frame parent) {
		super(company, parent, true);
	}

	/**
	 * RXgN^.
	 * 
	 * @param company οΠξρ
	 * @param parent eDialog
	 */
	public BSEraseDialog(Company company, Dialog parent) {
		super(company, parent, true);
	}

	/**
	 * ϊ»
	 */
	@Override
	protected void init() {
		gc = new GridBagConstraints();

		setLayout(new GridBagLayout());
		setResizable(true);

		// {fBΜζ
		pnlBody = new TPanel();
		pnlBody.setLayout(new GridBagLayout());
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1.0d;
		gc.weighty = 1.0d;
		gc.fill = GridBagConstraints.BOTH;
		add(pnlBody, gc);
	}

	@Override
	public void initComponents() {
		ctrlSlipDate = new TLabelPopupCalendar();
		lblSlipDateEnd = new TLabel();
		ctrlKCompany = new TCompanyReference();
		ctrlItemGroup = new TItemGroup();
		ctrlCustomer = new TCustomerReference();
		ctrlDepartment = new TDepartmentReference();

		ctrlEmployee = new TEmployeeReference();
		ctrlManage1 = new TManagement1Reference();
		ctrlManage2 = new TManagement2Reference();
		ctrlManage3 = new TManagement3Reference();
		ctrlManage4 = new TManagement4Reference();
		ctrlManage5 = new TManagement5Reference();
		ctrlManage6 = new TManagement6Reference();
		// TODO:ροvΎΧ
		ctrlNonAcDetails = new TNonAccountintDetailUnit();

		btnSearch = new TButton();
		btnSettle = new TButton();
		btnCancel = new TButton();
		ctrlDrInputTotal = new TLabelNumericField();
		ctrlCrInputTotal = new TLabelNumericField();
		ctrlDrTotal = new TLabelNumericField();
		ctrlCrTotal = new TLabelNumericField();
		ctrlCurrencyCode = new TLabelField();
		tbl = new TTable();
		chk = new TCheckBox();
	}

	@Override
	public void allocateComponents() {

		Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

		setSize(rect.width, 700);
		setTitle(getWord("C04292")); // BS¨θΑκ

		// κ
		tbl.addSpreadSheetSelectChange(btnSettle);
		tbl.setEnterToButton(true);

		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.WEST;
		gc.fill = GridBagConstraints.BOTH;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.insets = new Insets(10, 10, 0, 10);
		pnlBody.add(tbl, gc);

		// BODY πp
		TPanel pnlSearch = new TPanel();
		pnlSearch.setLayout(null);
		TGuiUtil.setComponentSize(pnlSearch, new Dimension(this.getWidth(), 200));
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		pnlBody.add(pnlSearch, gc);

		// ζψζπ
		int x = 40;
		int y = 5;

		// `[ϊt
		ctrlSlipDate.setLangMessageID("C00599");
		ctrlSlipDate.setLabelSize(75);
		ctrlSlipDate.setLocation(x, y);
		pnlSearch.add(ctrlSlipDate);

		// ΘO
		lblSlipDateEnd.setSize(80, 20);
		lblSlipDateEnd.setLangMessageID("C00008");
		lblSlipDateEnd.setLocation(ctrlSlipDate.getX() + ctrlSlipDate.getWidth() + 2, y);
		pnlSearch.add(lblSlipDateEnd);

		y += ctrlSlipDate.getHeight();

		// vγοΠ
		ctrlKCompany.btn.setLangMessageID("C01052");
		ctrlKCompany.setLocation(x, y);
		pnlSearch.add(ctrlKCompany);

		y += ctrlKCompany.getHeight();

		// ΘΪΝΝ
		ctrlItemGroup.setLocation(x, y);
		pnlSearch.add(ctrlItemGroup);

		y += ctrlItemGroup.getHeight();

		// ζψζwθ
		ctrlCustomer.setCheckExist(true);
		ctrlCustomer.setLocation(x, y);
		pnlSearch.add(ctrlCustomer);

		y += ctrlCustomer.getHeight();

		// εwθ
		ctrlDepartment.setCheckExist(true);
		ctrlDepartment.setLocation(x, y);
		pnlSearch.add(ctrlDepartment);

		y = ctrlItemGroup.getY() + 125;

		// π{^
		btnSearch.setLangMessageID("C00155");// υ
		btnSearch.setShortcutKey(KeyEvent.VK_F2);
		btnSearch.setSize(25, 110);
		btnSearch.setLocation(x, y);
		pnlSearch.add(btnSearch);

		x += btnSearch.getWidth() + HEADER_MARGIN_X;

		// mθ{^
		btnSettle.setLangMessageID("C01019");// mθ
		btnSettle.setShortcutKey(KeyEvent.VK_F8);
		btnSettle.setSize(25, 110);
		btnSettle.setLocation(x, y);
		pnlSearch.add(btnSettle);

		x += btnSettle.getWidth() + HEADER_MARGIN_X;

		// ζΑ{^
		btnCancel.setLangMessageID("C00405");// ζΑ
		btnCancel.setShortcutKey(KeyEvent.VK_F12);
		btnCancel.setSize(25, 110);
		btnCancel.setLocation(x, y);
		pnlSearch.add(btnCancel);

		x += btnCancel.getWidth() + 20;

		// ΚέR[h\¦
		ctrlCurrencyCode.setLangMessageID("C00371"); // Κέ
		ctrlCurrencyCode.setLabelSize(65);
		ctrlCurrencyCode.setFieldSize(35);
		ctrlCurrencyCode.setEditable(false); // \¦Μέ
		ctrlCurrencyCode.setLocation(x, y);
		pnlSearch.add(ctrlCurrencyCode);

		x = ctrlDepartment.getX() + ctrlDepartment.getWidth();
		y = ctrlSlipDate.getY();

		// DRόΝΰzv
		ctrlDrInputTotal.setLabelSize(165);
		ctrlDrInputTotal.setNumericFormat("#,##0");
		ctrlDrInputTotal.setLangMessageID("C10725");// ΨϋOέv
		ctrlDrInputTotal.setChangeRedOfMinus(true);
		ctrlDrInputTotal.setEditable(false);
		ctrlDrInputTotal.setLocation(x, y);
		pnlSearch.add(ctrlDrInputTotal);

		y += ctrlDrInputTotal.getHeight();

		// DRv
		ctrlDrTotal.setLabelSize(165);
		ctrlDrTotal.setNumericFormat("#,##0");
		ctrlDrTotal.setLangMessageID("C01126");// Ψϋΰzv
		ctrlDrTotal.setChangeRedOfMinus(true);
		ctrlDrTotal.setEditable(false);
		ctrlDrTotal.setLocation(x, y);
		pnlSearch.add(ctrlDrTotal);

		x = ctrlDepartment.getX() + ctrlDepartment.getWidth();
		y = ctrlItemGroup.getY() + ctrlDepartment.getHeight();

		// Πυ
		ctrlEmployee.setCheckExist(true);
		ctrlEmployee.setLocation(x, y);
		pnlSearch.add(ctrlEmployee);

		y += ctrlEmployee.getHeight();

		// Η1
		ctrlManage1.setCheckExist(true);
		ctrlManage1.setLocation(x, y);
		pnlSearch.add(ctrlManage1);

		y += ctrlManage1.getHeight();

		// Η2
		ctrlManage2.setCheckExist(true);
		ctrlManage2.setLocation(x, y);
		pnlSearch.add(ctrlManage2);

		y += ctrlManage2.getHeight();

		// Η3
		ctrlManage3.setCheckExist(true);
		ctrlManage3.setLocation(x, y);
		pnlSearch.add(ctrlManage3);

		x = ctrlEmployee.getX() + ctrlEmployee.getWidth();
		y = ctrlSlipDate.getY();

		// CRόΝΰzv
		ctrlCrInputTotal.setLabelSize(170);
		ctrlCrInputTotal.setNumericFormat("#,##0");
		ctrlCrInputTotal.setLangMessageID("C10726");// έϋOέv
		ctrlCrInputTotal.setChangeRedOfMinus(true);
		ctrlCrInputTotal.setEditable(false);
		ctrlCrInputTotal.setLocation(x, y);
		pnlSearch.add(ctrlCrInputTotal);

		y += ctrlCrInputTotal.getHeight();

		// CRv
		ctrlCrTotal.setLabelSize(170);
		ctrlCrTotal.setNumericFormat("#,##0");
		ctrlCrTotal.setLangMessageID("C01229");// έϋΰzv
		ctrlCrTotal.setChangeRedOfMinus(true);
		ctrlCrTotal.setEditable(false);
		ctrlCrTotal.setLocation(x, y);
		pnlSearch.add(ctrlCrTotal);

		x = ctrlEmployee.getX() + ctrlEmployee.getWidth() + 5;
		y = ctrlEmployee.getY();

		// Η4
		ctrlManage4.setCheckExist(true);
		ctrlManage4.setLocation(x, y);
		pnlSearch.add(ctrlManage4);

		y += ctrlManage4.getHeight();

		// Η5
		ctrlManage5.setCheckExist(true);
		ctrlManage5.setLocation(x, y);
		pnlSearch.add(ctrlManage5);

		y += ctrlManage5.getHeight();

		// Η6
		ctrlManage6.setCheckExist(true);
		ctrlManage6.setLocation(x, y);
		pnlSearch.add(ctrlManage6);

		x = ctrlManage6.getX() - 5;
		y += ctrlManage6.getHeight();

		// ροvΎΧ
		ctrlNonAcDetails.setLocation(x, y);
		pnlSearch.add(ctrlNonAcDetails);

		// XvbhΜϊ»
		initSpread();
	}

	/**
	 * XvbhΜϊ»
	 */
	protected void initSpread() {

		AccountConfig conf = company.getAccountConfig();
		String kmkName = conf.getItemName();
		String hkmName = conf.getSubItemName();
		String ukmName = conf.getDetailItemName();
		int ukm = conf.isUseDetailItem() ? 60 : -1;

		String lblCustomerCode = getWord("C00786"); // ζψζR[h
		String lblCustomerName = getWord("C00408"); // ζψζ
		String lblDeptCode = getWord("C00698"); // εR[h
		String lblDeptName = getWord("C00467"); // ε
		String lblCode = getWord("C00174"); // R[h
		String lblEmpCode = getWord("C00697"); // ΠυR[h
		String lblEmpName = getWord("C00246"); // Πυ

		// Η1`6
		String mng1Name = conf.getManagement1Name();
		String mng2Name = conf.getManagement2Name();
		String mng3Name = conf.getManagement3Name();
		String mng4Name = conf.getManagement4Name();
		String mng5Name = conf.getManagement5Name();
		String mng6Name = conf.getManagement6Name();
		int mng1 = conf.isUseManagement1() ? 70 : -1;
		int mng2 = conf.isUseManagement2() ? 70 : -1;
		int mng3 = conf.isUseManagement3() ? 70 : -1;
		int mng4 = conf.isUseManagement4() ? 70 : -1;
		int mng5 = conf.isUseManagement5() ? 70 : -1;
		int mng6 = conf.isUseManagement6() ? 70 : -1;

		// ροvΎΧ
		NonAccountingDivision nad1 = conf.getNonAccounting1();
		int hm1 = 100; // 
		int align1 = SwingConstants.LEFT; // Κu
		String hm1Name = conf.getNonAccounting1Name(); // ΌΜ

		switch (nad1) {
			case NONE:
				hm1 = -1;
				break;

			case NUMBER:
				align1 = SwingConstants.RIGHT;
				break;

			case YMD_DATE:
			case YMDHM_DATE:
				align1 = SwingConstants.CENTER;
				break;
		}

		NonAccountingDivision nad2 = conf.getNonAccounting2();
		int hm2 = 100;
		int align2 = SwingConstants.LEFT;
		String hm2Name = conf.getNonAccounting2Name();

		switch (nad2) {
			case NONE:
				hm2 = -1;
				break;

			case NUMBER:
				align2 = SwingConstants.RIGHT;
				break;

			case YMD_DATE:
			case YMDHM_DATE:
				align2 = SwingConstants.CENTER;
				break;
		}

		NonAccountingDivision nad3 = conf.getNonAccounting3();
		int hm3 = 100;
		int align3 = SwingConstants.LEFT;
		String hm3Name = conf.getNonAccounting3Name();

		switch (nad3) {
			case NONE:
				hm3 = -1;
				break;

			case NUMBER:
				align3 = SwingConstants.RIGHT;
				break;

			case YMD_DATE:
			case YMDHM_DATE:
				align3 = SwingConstants.CENTER;
				break;
		}

		// XvbhΜέθ
		tbl.addColumn(SC.BEAN, "", -1); // GeBeB
		tbl.addColumn(SC.CHECK, "C00324", 30, chk); // Iπ
		tbl.addColumn(SC.SWK_TRI_CODE, lblCustomerCode, 70); // ζψζR[h
		tbl.addColumn(SC.SWK_TRI_NAME_S, lblCustomerName, 90); // ζψζ
		tbl.addColumn(SC.SWK_DEP_CODE, lblDeptCode, 70); // εR[h
		tbl.addColumn(SC.SWK_DEP_NAME_S, lblDeptName, 90); // ε
		tbl.addColumn(SC.SWK_KMK_CODE, kmkName + lblCode, 60); // ΘΪR[h
		tbl.addColumn(SC.SWK_KMK_NAME_S, kmkName, 80); // ΘΪ
		tbl.addColumn(SC.SWK_HKM_CODE, hkmName + lblCode, 60); // βΘΪR[h
		tbl.addColumn(SC.SWK_HKM_NAME_S, hkmName, 70); // βΘΪ
		tbl.addColumn(SC.SWK_UKM_CODE, ukmName + lblCode, ukm); // ΰσΘΪR[h
		tbl.addColumn(SC.SWK_UKM_NAME_S, ukmName, ukm); // ΰσΘΪ
		tbl.addColumn(SC.SWK_DEN_DATE, "C00599", 75, SwingConstants.CENTER); // `[ϊt
		tbl.addColumn(SC.SWK_DEN_NO, "C00605", 120); // `[Τ
		tbl.addColumn(SC.SWK_GYO_NO, "C01588", 40, SwingConstants.RIGHT); // sΤ
		tbl.addColumn(SC.SWK_CUR_CODE, "C00371", 30, SwingConstants.CENTER); // Κέ
		tbl.addColumn(SC.SWK_CUR_RATE, "C00556", 55, SwingConstants.RIGHT); // [g
		tbl.addColumn(SC.DR_IN_KIN, "C01556", 85, SwingConstants.RIGHT); // Ψϋΰz(Oέ)
		tbl.addColumn(SC.DR_KIN, "C01557", 85, SwingConstants.RIGHT); // Ψϋΰz
		tbl.addColumn(SC.CR_IN_KIN, "C01558", 85, SwingConstants.RIGHT); // έϋΰz(Oέ)
		tbl.addColumn(SC.CR_KIN, "C01559", 85, SwingConstants.RIGHT); // έϋΰz
		tbl.addColumn(SC.SWK_GYO_TEK, "C00119", 220); // sEv

		tbl.addColumn(SC.SWK_EMP_CODE, lblEmpCode, 70); // ΠυR[h
		tbl.addColumn(SC.SWK_EMP_NAME_S, lblEmpName, 90); // ΠυͺΜ
		tbl.addColumn(SC.SWK_KNR_CODE_1, mng1Name + lblCode, mng1); // ΗPR[h
		tbl.addColumn(SC.SWK_KNR_NAME_S_1, mng1Name, mng1); // ΗPͺΜ
		tbl.addColumn(SC.SWK_KNR_CODE_2, mng2Name + lblCode, mng2); // ΗQR[h
		tbl.addColumn(SC.SWK_KNR_NAME_S_2, mng2Name, mng2); // ΗQͺΜ
		tbl.addColumn(SC.SWK_KNR_CODE_3, mng3Name + lblCode, mng3); // ΗRR[h
		tbl.addColumn(SC.SWK_KNR_NAME_S_3, mng3Name, mng3); // ΗRͺΜ
		tbl.addColumn(SC.SWK_KNR_CODE_4, mng4Name + lblCode, mng4); // ΗSR[h
		tbl.addColumn(SC.SWK_KNR_NAME_S_4, mng4Name, mng4); // ΗSͺΜ
		tbl.addColumn(SC.SWK_KNR_CODE_5, mng5Name + lblCode, mng5); // ΗTR[h
		tbl.addColumn(SC.SWK_KNR_NAME_S_5, mng5Name, mng5); // ΗTͺΜ
		tbl.addColumn(SC.SWK_KNR_CODE_6, mng6Name + lblCode, mng6); // ΗUR[h
		tbl.addColumn(SC.SWK_KNR_NAME_S_6, mng6Name, mng6); // ΗUͺΜ
		tbl.addColumn(SC.SWK_HM_1, hm1Name, hm1, align1); // ροvΎΧP
		tbl.addColumn(SC.SWK_HM_2, hm2Name, hm2, align2); // ροvΎΧQ
		tbl.addColumn(SC.SWK_HM_3, hm3Name, hm3, align3); // ροvΎΧR

		tbl.addCheckBoxColumn(SC.CHECK.ordinal());
		tbl.table.enableInputMethods(false); // e[uΜIMEΝνΙOFF

	}

	@Override
	public void setTabIndex() {
		int i = 1;
		ctrlSlipDate.setTabControlNo(i++);
		ctrlKCompany.setTabControlNo(i++);
		ctrlItemGroup.setTabControlNo(i++);
		ctrlCustomer.setTabControlNo(i++);
		ctrlDepartment.setTabControlNo(i++);
		ctrlEmployee.setTabControlNo(i++);
		ctrlManage1.setTabControlNo(i++);
		ctrlManage2.setTabControlNo(i++);
		ctrlManage3.setTabControlNo(i++);
		ctrlManage4.setTabControlNo(i++);
		ctrlManage5.setTabControlNo(i++);
		ctrlManage6.setTabControlNo(i++);
		ctrlNonAcDetails.setTabControlNo(i++);
		btnSearch.setTabControlNo(i++);
		btnSettle.setTabControlNo(i++);
		btnCancel.setTabControlNo(i++);
		tbl.setTabControlNo(i++);
	}
}
