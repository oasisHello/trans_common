package jp.co.ais.trans2.common.model.ui.slip;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans2.common.config.*;
import jp.co.ais.trans2.common.gui.*;
import jp.co.ais.trans2.common.gui.TDialog;
import jp.co.ais.trans2.common.gui.TTable;
import jp.co.ais.trans2.common.model.ui.*;

/**
 * cκΜw¦ζΚB
 * 
 * @author AIS
 */
public class TBalanceListDialog extends TDialog {

	/** true:IπΝ`FbN{bNXπgpClient */
	public static boolean isUseChk = ClientConfig.isFlagOn("trans.use.zan.dialog.select.check");

	/**
	 * e[uρΌρΜ
	 */
	public enum SC {
		/** GeBeB */
		BEAN,

		/** Iπ`FbN{bNX */
		CHECK,

		/** ζψζ */
		CUSTOMER_NAME,

		/** Ώϊ */
		CLAlM_DATE,

		/** `[Τ */
		SLIP_NO,

		/** ΏΤ */
		CLAlM_NO,

		/** όΰ\θϊ */
		PAYMENT_DATE,

		/** Κέ */
		CUR_CODE,

		/** ’ΑΰziOέj */
		NON_ERASE_INPUT_AMOUNT,

		/** ’Αΰz */
		NON_ERASE_AMOUNT,

		/** ΏΰziOέj */
		INPUT_AMOUNT,

		/** Ώΰz */
		AMOUNT,

		/** ΑΰziOέj */
		ERASE_INPUT_AMOUNT,

		/** Αΰz */
		ERASE_AMOUNT,

		/** vγε */
		DEPARTMENT_NAME,

		/** Ev */
		REMARKS;
	}

	/** ζψζπ */
	public TTextField txtCustomer;

	/** Ώϊ/vγϊπ */
	public TPopupCalendar dtPaymentDay;

	/** `[Τπ */
	public TTextField txtSlipNo;

	/** ΏΤπ */
	public TTextField txtBillNo;

	/** \θϊπ */
	public TPopupCalendar dtExpectedDay;

	/** vγεπ */
	public TTextField txtDep;

	/** `[Evπ */
	public TTextField txtTek;

	/** π{^ */
	public TButton btnSearch;

	/** mθ{^ */
	public TButton btnSettle;

	/** ζΑ{^ */
	public TButton btnClose;

	/** v */
	public TLabelNumericField ctrlTotal;

	/** WI{^ ΒΚζψζ */
	public TRadioPanel ctrlCustomerKind;

	/** ζψζ ΝΝwθ */
	public TCustomerReferenceRange ctrlClientRange;

	/** ε ΝΝwθ */
	public TDepartmentReferenceRange ctrlDepartmentRange;

	/** Xvbh */
	public TTable tbl;

	/** Iπ */
	public TCheckBox chk;

	/**
	 * RXgN^.
	 * 
	 * @param parent et[
	 */
	public TBalanceListDialog(Frame parent) {
		super(parent, true);
	}

	/**
	 * RXgN^.
	 * 
	 * @param parent et[
	 */
	public TBalanceListDialog(Dialog parent) {
		super(parent, true);
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

	/**
	 * @see jp.co.ais.trans2.common.gui.TDialog#initComponents()
	 */
	@Override
	public void initComponents() {
		txtCustomer = new TTextField();
		dtPaymentDay = new TPopupCalendar();
		txtSlipNo = new TTextField();
		txtBillNo = new TTextField();
		dtExpectedDay = new TPopupCalendar();
		txtDep = new TTextField();
		txtTek = new TTextField();

		btnSearch = new TButton();
		btnSettle = new TButton();
		btnClose = new TButton();
		ctrlTotal = new TLabelNumericField();
		ctrlCustomerKind = new TRadioPanel("C00408");// ζψζ
		ctrlClientRange = new TCustomerReferenceRange();
		ctrlDepartmentRange = new TDepartmentReferenceRange();
		tbl = new TTable();
		chk = new TCheckBox();
	}

	/**
	 * @see jp.co.ais.trans2.common.gui.TDialog#allocateComponents()
	 */
	@Override
	public void allocateComponents() {
		Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		setSize(rect.width, 600);

		// κ
		if (isUseChk) {
			// `FbNΝXy[XΕέθΒ
			tbl.addCheckBoxColumn(SC.CHECK.ordinal());
			tbl.table.enableInputMethods(false); // e[uΜIMEΝνΙOFF
		} else {
			// ωΆΚθ
			tbl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			tbl.addSpreadSheetSelectChange(btnSettle);
			tbl.setEnterToButton(true);
		}

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
		pnlSearch.setMaximumSize(new Dimension(this.getWidth(), 150));
		pnlSearch.setMinimumSize(new Dimension(this.getWidth(), 150));
		pnlSearch.setPreferredSize(new Dimension(this.getWidth(), 150));
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		pnlBody.add(pnlSearch, gc);

		// ζψζπ
		int x = 40 + (isUseChk ? 30 : 0);
		int y = 2;
		txtCustomer.setLocation(x, y);
		txtCustomer.setImeMode(true);
		txtCustomer.setMaxLength(20);
		txtCustomer.setSize(200, 20);
		pnlSearch.add(txtCustomer);

		// Ώϊ/vγϊπ
		x = txtCustomer.getX() + txtCustomer.getWidth();
		dtPaymentDay.setLocation(x, y);
		dtPaymentDay.setAllowableBlank(true);
		dtPaymentDay.clear();
		pnlSearch.add(dtPaymentDay);

		// `[Τπ
		x = dtPaymentDay.getX() + dtPaymentDay.getWidth();
		txtSlipNo.setLocation(x, y);
		txtSlipNo.setSize(130, 20);
		txtSlipNo.setImeMode(false);
		txtSlipNo.setMaxLength(20);
		pnlSearch.add(txtSlipNo);

		// ΏΤπ
		x = txtSlipNo.getX() + txtSlipNo.getWidth();
		txtBillNo.setLocation(x, y);
		txtBillNo.setSize(130, 20);
		txtBillNo.setImeMode(false);
		txtBillNo.setMaxLength(20);
		pnlSearch.add(txtBillNo);

		// \θϊπ
		x = txtBillNo.getX() + txtBillNo.getWidth();
		dtExpectedDay.setLocation(x, y);
		dtExpectedDay.setAllowableBlank(true);
		dtExpectedDay.clear();
		pnlSearch.add(dtExpectedDay);

		// vγεπ
		x = dtExpectedDay.getX() + dtExpectedDay.getWidth() + 260;
		txtDep.setLocation(x, y);
		txtDep.setSize(150, 20);
		txtDep.setImeMode(true);
		txtDep.setMaxLength(20);
		txtDep.clear();
		pnlSearch.add(txtDep);
		
		// `[Evπ
		x = txtDep.getX() + txtDep.getWidth();
		txtTek.setLocation(x, y);
		txtTek.setSize(300, 20);
		txtTek.setImeMode(true);
		txtTek.setMaxLength(80);
		txtTek.clear();
		pnlSearch.add(txtTek);

		x = 30;
		y = 32;

		// π{^
		btnSearch.setLangMessageID("C00155");// υ
		btnSearch.setShortcutKey(KeyEvent.VK_F2);
		btnSearch.setSize(25, 110);
		btnSearch.setLocation(x, y);
		pnlSearch.add(btnSearch);

		// mθ{^
		x = x + btnSearch.getWidth() + HEADER_MARGIN_X;
		btnSettle.setLangMessageID("C01019");// mθ
		btnSettle.setShortcutKey(KeyEvent.VK_F8);
		btnSettle.setSize(25, 110);
		btnSettle.setEnabled(false);
		btnSettle.setLocation(x, y);
		pnlSearch.add(btnSettle);

		// ζΑ{^
		x = x + btnSettle.getWidth() + HEADER_MARGIN_X;
		btnClose.setLangMessageID("C00405");// ζΑ
		btnClose.setShortcutKey(KeyEvent.VK_F12);
		btnClose.setSize(25, 110);
		btnClose.setLocation(x, y);
		pnlSearch.add(btnClose);

		// v
		x = x + btnClose.getWidth() + HEADER_MARGIN_X;
		ctrlTotal.setLabelSize(30);
		ctrlTotal.setNumericFormat("#,##0");
		ctrlTotal.setLangMessageID("C00165");// v
		ctrlTotal.setLocation(x, y + 2);
		ctrlTotal.setEditable(false);
		pnlSearch.add(ctrlTotal);

		// ζψζ
		x = x + ctrlTotal.getWidth() + 10;
		ctrlCustomerKind.addRadioButton("C10343", 100);// ρϋζψζ
		ctrlCustomerKind.addRadioButton("C10344", 100);// »ΜΌζψζ
		ctrlCustomerKind.setLocation(x, y - 6);
		pnlSearch.add(ctrlCustomerKind);

		// ΝΝwθ
		x = 30;
		y = 70;
		TPanel pnlRenge = new TPanel();
		pnlRenge.setLayout(null);
		pnlRenge.setLangMessageID("C00433");// ΝΝwθ
		pnlRenge.setLocation(x, y);
		pnlRenge.setSize(ctrlClientRange.getWidth() + ctrlDepartmentRange.getWidth() + 50, 75);
		pnlSearch.add(pnlRenge);

		// ζψζΝΝwθ
		ctrlClientRange.setLocation(20, 20);
		Insets zero = new Insets(0, 0, 0, 0);
		ctrlClientRange.ctrlCustomerReferenceFrom.btn.setMargin(zero);
		ctrlClientRange.ctrlCustomerReferenceTo.btn.setMargin(zero);
		ctrlClientRange.ctrlCustomerReferenceFrom.btn.setLangMessageID("C10345");// Jnζψζ
		ctrlClientRange.ctrlCustomerReferenceTo.btn.setLangMessageID("C10346");// IΉζψζ
		ctrlClientRange.setCheckExist(true);
		pnlRenge.add(ctrlClientRange);

		// εΝΝwθ
		ctrlDepartmentRange.setLocation(ctrlClientRange.getX() + ctrlClientRange.getWidth() + 10, 20);
		ctrlDepartmentRange.ctrlDepartmentReferenceFrom.btn.setLangMessageID("C10347");// Jnε
		ctrlDepartmentRange.ctrlDepartmentReferenceTo.btn.setLangMessageID("C10169");// IΉε
		ctrlDepartmentRange.setCheckExist(true);
		pnlRenge.add(ctrlDepartmentRange);

	}

	@Override
	public void setTabIndex() {
		int i = 1;
		txtCustomer.setTabControlNo(++i);
		dtPaymentDay.setTabControlNo(++i);
		txtSlipNo.setTabControlNo(++i);
		txtBillNo.setTabControlNo(++i);
		dtExpectedDay.setTabControlNo(++i);
		txtDep.setTabControlNo(++i);
		txtTek.setTabControlNo(++i);
		btnSearch.setTabControlNo(++i);
		btnSettle.setTabControlNo(++i);
		btnClose.setTabControlNo(++i);
		ctrlCustomerKind.setTabControlNo(++i);
		ctrlClientRange.setTabControlNo(++i);
		ctrlDepartmentRange.setTabControlNo(++i);
		tbl.setTabControlNo(++i);
	}
}
