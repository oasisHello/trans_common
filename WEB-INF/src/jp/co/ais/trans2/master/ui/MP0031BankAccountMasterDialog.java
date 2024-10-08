package jp.co.ais.trans2.master.ui;

import java.awt.*;

import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans2.common.model.ui.*;
import jp.co.ais.trans2.model.company.*;

/**
 * 銀行口座マスタ編集画面<br>
 * IBAN等情報追加版
 * 
 * @author AIS
 */
public class MP0031BankAccountMasterDialog extends MP0030BankAccountMasterDialog {

	/** 銀行名（英字） */
	public TLabelField ctrlBankNameE;

	/** 支店名（英字） */
	public TLabelField ctrlBranchNameE;

	/** 口座番号 */
	public TLabelField ctrlIBan;

	/** 銀行識別子 */
	public TLabelField ctrlBankIndentify;

	/** 口座識別子 */
	public TLabelField ctrlBankAccountIndentify;

	/** SWIFTコード */
	public TLabelField ctrlSwift;
	
	/** Bank Country */
	protected TCountryReference ctrlBankCountry;

	/** 住所1 */
	public TLabelField ctrlBnkAdr1;

	/** 住所2 */
	public TLabelField ctrlBnkAdr2;

	/** 住所1（英字） */
	public TLabelField ctrlBnkAdr1E;

	/** 住所2（英字） */
	public TLabelField ctrlBnkAdr2E;

	/**
	 * コンストラクタ
	 * 
	 * @param company
	 * @param parent
	 * @param mordal
	 */
	public MP0031BankAccountMasterDialog(Company company, Frame parent, boolean mordal) {
		super(company, parent, mordal);
	}

	@Override
	public void initComponents() {
		super.initComponents();

		ctrlBankNameE = new TLabelField();
		ctrlBranchNameE = new TLabelField();
		ctrlIBan = new TLabelField();
		ctrlBankIndentify = new TLabelField();
		ctrlBankAccountIndentify = new TLabelField();

		ctrlSwift = new TLabelField();
		ctrlBankCountry = new TCountryReference();
		ctrlBnkAdr1 = new TLabelField();
		ctrlBnkAdr2 = new TLabelField();
		ctrlBnkAdr1E = new TLabelField();
		ctrlBnkAdr2E = new TLabelField();

	}

	/**
	 * @see jp.co.ais.trans2.common.gui.TDialog#allocateComponents()
	 */
	@Override
	public void allocateComponents() {
		super.allocateComponents();

		int CUSTOM_MARGIN_Y = 0;

		setSize(700, 700);

		// 縦揃え基準X座標
		int baseX = 10;

		int labelSize = 130;
		int fieldSize = 450;
		int maxLength = 200;

		ctrlDepositType.setLocation(baseX, ctrlAccountNumber.getY() + ctrlAccountNumber.getHeight()
			+ COMPONENT_MARGIN_Y);
		pnlBody.add(ctrlDepositType);

		// 銀行名（英字）
		ctrlBankNameE.setFieldSize(fieldSize);
		ctrlBankNameE.setLangMessageID("C11891");
		ctrlBankNameE.setMaxLength(maxLength);
		ctrlBankNameE.setLabelSize(labelSize);
		ctrlBankNameE.setImeMode(false); // 半角のみ
		pnlBody.add(ctrlBankNameE);

		// 支店名（英字）
		ctrlBranchNameE.setFieldSize(fieldSize);
		ctrlBranchNameE.setLangMessageID("C11892");
		ctrlBranchNameE.setMaxLength(maxLength);
		ctrlBranchNameE.setLabelSize(labelSize);
		ctrlBranchNameE.setImeMode(false); // 半角のみ
		pnlBody.add(ctrlBranchNameE);

		// 銀行識別子
		ctrlBankIndentify.setLangMessageID("C11457");
		ctrlBankIndentify.setFieldSize(120);
		ctrlBankIndentify.setLabelSize(130);
		ctrlBankIndentify.getField().setAllowedSpace(false);
		ctrlBankIndentify.setMaxLength(11);
		ctrlBankIndentify.setImeMode(false); // 半角のみ

		ctrlBankIndentify.setLocation(baseX, ctrlDepositType.getY() + ctrlDepositType.getHeight() + COMPONENT_MARGIN_Y);
		pnlBody.add(ctrlBankIndentify);

		// 口座識別子
		ctrlBankAccountIndentify.setLangMessageID("C11458");
		ctrlBankAccountIndentify.setFieldSize(250);
		ctrlBankAccountIndentify.setLabelSize(130);
		ctrlBankAccountIndentify.getField().setAllowedSpace(false);
		ctrlBankAccountIndentify.setMaxLength(34);
		ctrlBankAccountIndentify.setImeMode(false); // 半角のみ

		ctrlBankAccountIndentify.setLocation(baseX, ctrlBankIndentify.getY() + ctrlBankIndentify.getHeight()
			+ COMPONENT_MARGIN_Y);
		pnlBody.add(ctrlBankAccountIndentify);

		// IBANコード
		ctrlIBan.setLangMessageID("C11456");
		ctrlIBan.setFieldSize(250);
		ctrlIBan.setLabelSize(130);
		ctrlIBan.getField().setAllowedSpace(false);
		ctrlIBan.setMaxLength(34);
		ctrlIBan.setImeMode(false); // 半角のみ

		ctrlIBan.setLocation(baseX, ctrlBankAccountIndentify.getY() + ctrlBankAccountIndentify.getHeight()
			+ COMPONENT_MARGIN_Y);
		pnlBody.add(ctrlIBan);

		pnlEmployeeFBDivision.setLocation(baseX + 135, ctrlIBan.getY() + ctrlIBan.getHeight() + COMPONENT_MARGIN_Y);

		pnlExternalFBDivision.setLocation(pnlEmployeeFBDivision.getX() + pnlEmployeeFBDivision.getWidth() + 10,
			pnlEmployeeFBDivision.getY());

		ctrlAppropriateDepartment.setLocation(baseX + 55,
			pnlEmployeeFBDivision.getY() + pnlEmployeeFBDivision.getHeight() + COMPONENT_MARGIN_Y);

		ctrlItemUnit.setLocation(baseX + 55, ctrlAppropriateDepartment.getY() + ctrlAppropriateDepartment.getHeight()
			+ COMPONENT_MARGIN_Y);

		dtBeginDate.setLocation(baseX + 65, ctrlItemUnit.getY() + ctrlItemUnit.getHeight() + COMPONENT_MARGIN_Y);

		dtEndDate.setLocation(baseX + 65, dtBeginDate.getY() + dtBeginDate.getHeight() + COMPONENT_MARGIN_Y);

		// SWIFTコード
		ctrlSwift.setLangMessageID("C10414");
		ctrlSwift.setFieldSize(100);
		ctrlSwift.setLabelSize(labelSize);
		ctrlSwift.getField().setAllowedSpace(false);
		ctrlSwift.setMaxLength(11);
		ctrlSwift.setImeMode(false); // 半角のみ
		pnlBody.add(ctrlSwift);
		
		// Add Bank Country controll
		ctrlBankCountry.btn.setLangMessageID("C11425");
		ctrlBankCountry.setButtonSize(110);
		pnlBody.add(this.ctrlBankCountry);

		// 住所1
		ctrlBnkAdr1.setFieldSize(fieldSize);
		ctrlBnkAdr1.setLangMessageID("C00687");
		ctrlBnkAdr1.setMaxLength(maxLength);
		ctrlBnkAdr1.setLabelSize(labelSize);
		pnlBody.add(ctrlBnkAdr1);

		// 住所1（英字）
		ctrlBnkAdr1E.setFieldSize(fieldSize);
		ctrlBnkAdr1E.setLangMessageID("C11893");
		ctrlBnkAdr1E.setMaxLength(maxLength);
		ctrlBnkAdr1E.setLabelSize(labelSize);
		ctrlBnkAdr1E.setImeMode(false); // 半角のみ
		pnlBody.add(ctrlBnkAdr1E);

		// 住所2
		ctrlBnkAdr2.setFieldSize(fieldSize);
		ctrlBnkAdr2.setLangMessageID("C00688");
		ctrlBnkAdr2.setMaxLength(maxLength);
		ctrlBnkAdr2.setLabelSize(labelSize);
		pnlBody.add(ctrlBnkAdr2);

		// 住所2（英字）
		ctrlBnkAdr2E.setFieldSize(fieldSize);
		ctrlBnkAdr2E.setLangMessageID("C11894");
		ctrlBnkAdr2E.setMaxLength(maxLength);
		ctrlBnkAdr2E.setLabelSize(labelSize);
		ctrlBnkAdr2E.setImeMode(false); // 半角のみ
		pnlBody.add(ctrlBnkAdr2E);

		// Location再設定
		ctrlBankAccount.setLocation(baseX + 40, COMPONENT_MARGIN_Y);
		txtBankAccountName.setLocation(ctrlBankAccount.getX() + ctrlBankAccount.getWidth() + 2, COMPONENT_MARGIN_Y);

		ctrlCurrency.setLocation(baseX - 20, ctrlBankAccount.getY() + ctrlBankAccount.getHeight() + COMPONENT_MARGIN_Y);
		ctrlBank.setLocation(baseX + 55, ctrlCurrency.getY() + ctrlCurrency.getHeight() + CUSTOM_MARGIN_Y);
		ctrlBranch.setLocation(baseX + 55, ctrlBank.getY() + ctrlBank.getHeight() + CUSTOM_MARGIN_Y);

		ctrlBankNameE.setLocation(baseX, ctrlBranch.getY() + ctrlBranch.getHeight() + CUSTOM_MARGIN_Y);
		ctrlBranchNameE.setLocation(baseX, ctrlBankNameE.getY() + ctrlBankNameE.getHeight() + CUSTOM_MARGIN_Y);

		ctrlTransferRequesterCode.setLocation(baseX, ctrlBranchNameE.getY() + ctrlBranchNameE.getHeight()
			+ COMPONENT_MARGIN_Y);
		ctrlTransferRequesterKanaName.setLocation(baseX,
			ctrlTransferRequesterCode.getY() + ctrlTransferRequesterCode.getHeight() + CUSTOM_MARGIN_Y);
		ctrlTransferRequesterKanjiName.setLocation(baseX, ctrlTransferRequesterKanaName.getY()
			+ ctrlTransferRequesterKanaName.getHeight() + CUSTOM_MARGIN_Y);
		ctrlTransferRequesterEnglishName.setLocation(baseX, ctrlTransferRequesterKanjiName.getY()
			+ ctrlTransferRequesterKanjiName.getHeight() + CUSTOM_MARGIN_Y);
		ctrlDepositType.setLocation(baseX,
			ctrlTransferRequesterEnglishName.getY() + ctrlTransferRequesterEnglishName.getHeight() + CUSTOM_MARGIN_Y);
		ctrlAccountNumber.setLocation(ctrlDepositType.getX() + ctrlDepositType.getWidth() + 10, ctrlDepositType.getY());

		ctrlBankIndentify.setLocation(baseX, ctrlDepositType.getY() + ctrlDepositType.getHeight() + COMPONENT_MARGIN_Y);
		ctrlBankAccountIndentify.setLocation(baseX, ctrlBankIndentify.getY() + ctrlBankIndentify.getHeight()
			+ CUSTOM_MARGIN_Y);
		ctrlIBan.setLocation(baseX, ctrlBankAccountIndentify.getY() + ctrlBankAccountIndentify.getHeight()
			+ CUSTOM_MARGIN_Y);

		pnlEmployeeFBDivision.setLocation(baseX + 135, ctrlIBan.getY() + ctrlIBan.getHeight() + COMPONENT_MARGIN_Y);
		pnlExternalFBDivision.setLocation(pnlEmployeeFBDivision.getX() + pnlEmployeeFBDivision.getWidth() + 10,
			pnlEmployeeFBDivision.getY());

		ctrlAppropriateDepartment.setLocation(baseX + 55,
			pnlEmployeeFBDivision.getY() + pnlEmployeeFBDivision.getHeight() + COMPONENT_MARGIN_Y);
		ctrlItemUnit.setSize(ctrlItemUnit.ctrlItemReference.getWidth(), 60);
		ctrlItemUnit.setLocation(baseX + 55, ctrlAppropriateDepartment.getY() + ctrlAppropriateDepartment.getHeight()
			+ CUSTOM_MARGIN_Y);
		ctrlItemUnit.ctrlSubItemReference.setLocation(0, 20);
		ctrlItemUnit.ctrlDetailItemReference.setLocation(0, 40);

		ctrlSwift.setLocation(baseX, ctrlItemUnit.getY() + ctrlItemUnit.getHeight() + COMPONENT_MARGIN_Y);
		ctrlBankCountry.setLocation(baseX + ctrlSwift.getWidth() + 50, ctrlSwift.getY()); // Bank Country
		ctrlBnkAdr1.setLocation(baseX, ctrlSwift.getY() + ctrlSwift.getHeight() + CUSTOM_MARGIN_Y);
		ctrlBnkAdr1E.setLocation(baseX, ctrlBnkAdr1.getY() + ctrlBnkAdr1.getHeight() + CUSTOM_MARGIN_Y);
		ctrlBnkAdr2.setLocation(baseX, ctrlBnkAdr1E.getY() + ctrlBnkAdr1E.getHeight() + CUSTOM_MARGIN_Y);
		ctrlBnkAdr2E.setLocation(baseX, ctrlBnkAdr2.getY() + ctrlBnkAdr2.getHeight() + CUSTOM_MARGIN_Y);

		dtBeginDate.setLocation(baseX + 65, ctrlBnkAdr2E.getY() + ctrlBnkAdr2E.getHeight() + COMPONENT_MARGIN_Y);
		dtEndDate.setLocation(baseX + 65, dtBeginDate.getY() + dtBeginDate.getHeight() + CUSTOM_MARGIN_Y);

	}

	/**
	 * @see jp.co.ais.trans2.common.gui.TDialog#setTabIndex()
	 */
	@Override
	public void setTabIndex() {
		int i = 1;
		ctrlBankAccount.setTabControlNo(i++);
		txtBankAccountName.setTabControlNo(i++);
		ctrlCurrency.setTabControlNo(i++);
		ctrlBank.setTabControlNo(i++);
		ctrlBranch.setTabControlNo(i++);
		ctrlBankNameE.setTabControlNo(i++);
		ctrlBranchNameE.setTabControlNo(i++);
		ctrlTransferRequesterCode.setTabControlNo(i++);
		ctrlTransferRequesterKanaName.setTabControlNo(i++);
		ctrlTransferRequesterKanjiName.setTabControlNo(i++);
		ctrlTransferRequesterEnglishName.setTabControlNo(i++);
		ctrlDepositType.setTabControlNo(i++);
		ctrlAccountNumber.setTabControlNo(i++);
		ctrlBankIndentify.setTabControlNo(i++); // 銀行識別子
		ctrlBankAccountIndentify.setTabControlNo(i++); // 口座識別子
		ctrlIBan.setTabControlNo(i++); // IBANコード
		rdoEmployeeFBDivisionException.setTabControlNo(i++);
		rdoEmployeeFBUse.setTabControlNo(i++);
		rdoExternalFBException.setTabControlNo(i++);
		rdoExternalFBUse.setTabControlNo(i++);
		ctrlAppropriateDepartment.setTabControlNo(i++);
		ctrlItemUnit.setTabControlNo(i++);
		ctrlSwift.setTabControlNo(i++);
		ctrlBankCountry.setTabControlNo(i++);
		ctrlBnkAdr1.setTabControlNo(i++);
		ctrlBnkAdr1E.setTabControlNo(i++);
		ctrlBnkAdr2.setTabControlNo(i++);
		ctrlBnkAdr2E.setTabControlNo(i++);
		dtBeginDate.setTabControlNo(i++);
		dtEndDate.setTabControlNo(i++);
		btnSettle.setTabControlNo(i++);
		btnClose.setTabControlNo(i++);

	}

}
