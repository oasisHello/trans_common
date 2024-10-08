package jp.co.ais.trans2.master.ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans2.common.gui.*;
import jp.co.ais.trans2.common.gui.TDialog;
import jp.co.ais.trans2.common.model.ui.*;
import jp.co.ais.trans2.define.*;

/**
 * MG0016-EmployeeMaster - Πυ}X^ - _CAOζΚ
 * 
 * @author AIS
 */
public class MG0160EmployeeMasterDialog extends TDialog {

	/** cΕθl */
	protected final int BUTTON_HEIGHT = 25;

	/** ‘Εθl */
	protected final int BUTTON_WIDTH = 110;

	/** mθ{^ */
	public TImageButton btnSettle;

	/** ίι{^ */
	public TButton btnClose;

	/** ΠυR[h */
	public TLabelField ctrlCode;

	/** ΠυΌΜ */
	public TLabelField ctrlName;

	/** ΠυͺΜ */
	public TLabelField ctrlNameS;

	/** ΠυυΌΜ */
	public TLabelField ctrlNameK;

	/** UϋΐΤ */
	public TLabelField ctrlYknNo;

	/** ϋΐΌ`Ji */
	public TLabelField ctrlYknKana;

	/** Uoβsϋΐ */
	public TBankAccountReference ctrlCbkCode;

	/** UβsR[h */
	public TBankReference ctrlBnkCode;

	/** UxXR[h */
	public TBranchReference ctrlStnCode;

	/** Uϋΐ»aΰνΚ:g */
	public TPanel pnlKozaKbn;

	/** Uϋΐ»aΰνΚ:Button Group */
	public ButtonGroup bgKozaKbn;

	/** Uϋΐ»aΰνΚ:1:Κaΰ */
	public TRadioButton ctrlKozaKbnOrd;

	/** Uϋΐ»aΰνΚ:2:ΐaΰ */
	public TRadioButton ctrlKozaKbnCur;

	/** JnNϊ */
	public TLabelPopupCalendar ctrlDateFrom;

	/** IΉNϊ */
	public TLabelPopupCalendar ctrlDateTo;

	/**
	 * RXgN^
	 * 
	 * @param parent
	 * @param mordal
	 */
	public MG0160EmployeeMasterDialog(Frame parent, boolean mordal) {
		super(parent, mordal);
	}

	@Override
	public void initComponents() {
		btnSettle = new TImageButton(IconType.SETTLE);
		btnClose = new TButton();
		ctrlCode = new TLabelField();
		ctrlName = new TLabelField();
		ctrlNameS = new TLabelField();
		ctrlNameK = new TLabelField();
		ctrlCbkCode = new TBankAccountReference();
		ctrlBnkCode = new TBankReference();
		ctrlStnCode = new TBranchReference();
		pnlKozaKbn = new TPanel();
		bgKozaKbn = new ButtonGroup();
		ctrlKozaKbnOrd = new TRadioButton();
		ctrlKozaKbnCur = new TRadioButton();
		ctrlYknNo = new TLabelField();
		ctrlYknKana = new TLabelField();
		ctrlDateFrom = new TLabelPopupCalendar();
		ctrlDateTo = new TLabelPopupCalendar();
	}

	@Override
	public void allocateComponents() {

		setSize(600, 400);

		// Headerϊ»
		pnlHeader.setLayout(null);

		// mθ{^
		btnSettle.setSize(BUTTON_HEIGHT, BUTTON_WIDTH);
		btnSettle.setLangMessageID("C01019");
		btnSettle.setShortcutKey(KeyEvent.VK_F8);
		btnSettle.setLocation(getWidth() - 245, HEADER_Y);
		pnlHeader.add(btnSettle);

		// ίι{^
		btnClose.setSize(BUTTON_HEIGHT, BUTTON_WIDTH);
		btnClose.setLangMessageID("C01747");
		btnClose.setShortcutKey(KeyEvent.VK_F12);
		btnClose.setLocation(getWidth() - 130, HEADER_Y);
		pnlHeader.add(btnClose);

		// Bodyϊ»
		pnlBody.setLayout(null);

		// ΠυR[h
		ctrlCode.setFieldSize(150);
		ctrlCode.setLangMessageID("C00697");
		ctrlCode.setMaxLength(10);
		ctrlCode.setImeMode(false);
		ctrlCode.setAllowedSpace(false);
		ctrlCode.setLocation(20, 10);
		pnlBody.add(ctrlCode);

		// ΠυΌΜ
		ctrlName.setFieldSize(400);
		ctrlName.setLangMessageID("C00807");
		ctrlName.setMaxLength(40);
		ctrlName.setLocation(20, 40);
		pnlBody.add(ctrlName);

		// ΠυͺΜ
		ctrlNameS.setFieldSize(400);
		ctrlNameS.setLangMessageID("C00808");
		ctrlNameS.setMaxLength(20);
		ctrlNameS.setLocation(20, 70);
		pnlBody.add(ctrlNameS);

		// ΠυυΌΜ
		ctrlNameK.setFieldSize(400);
		ctrlNameK.setLabelSize(120);
		ctrlNameK.setLangMessageID("C00809");
		ctrlNameK.setMaxLength(40);
		ctrlNameK.setLocation(0, 100);
		pnlBody.add(ctrlNameK);

		// Uoβsϋΐ
		ctrlCbkCode.setLocation(45, 130);
		pnlBody.add(ctrlCbkCode);

		// Uβs
		ctrlBnkCode.setLocation(45, 160);
		pnlBody.add(ctrlBnkCode);

		// UβsxX
		ctrlStnCode.setLocation(45, 190);
		pnlBody.add(ctrlStnCode);

		// UϋΐaΰνΚ
		pnlKozaKbn.setLayout(null);
		pnlKozaKbn.setSize(150, 70);
		pnlKozaKbn.setLangMessageID(getShortWord("C00471"));
		pnlKozaKbn.setLocation(400, 130);
		pnlBody.add(pnlKozaKbn);

		// UϋΐaΰνΚ:Κ
		ctrlKozaKbnOrd.setSize(100, 20);
		ctrlKozaKbnOrd.setLangMessageID("C00463");
		ctrlKozaKbnOrd.setIndex(1);
		ctrlKozaKbnOrd.setLocation(20, 20);
		pnlKozaKbn.add(ctrlKozaKbnOrd);

		// UϋΐaΰνΚ:ΐ
		ctrlKozaKbnCur.setSize(100, 20);
		ctrlKozaKbnCur.setLangMessageID("C00397");
		ctrlKozaKbnCur.setIndex(2);
		ctrlKozaKbnCur.setLocation(20, 40);
		pnlKozaKbn.add(ctrlKozaKbnCur);

		// Radio Button Group »
		bgKozaKbn.add(ctrlKozaKbnOrd);
		bgKozaKbn.add(ctrlKozaKbnCur);

		// UϋΐΤ
		ctrlYknNo.setFieldSize(80);
		ctrlYknNo.setLangMessageID("C00813");
		ctrlYknNo.setMaxLength(7);
		ctrlYknNo.setImeMode(false);
		ctrlYknNo.setLocation(20, 220);
		pnlBody.add(ctrlYknNo);

		// ϋΐΌ`Ji
		ctrlYknKana.setFieldSize(400);
		ctrlYknKana.setLangMessageID("C00168");
		ctrlYknKana.setMaxLength(30);
		ctrlYknKana.setLocation(20, 250);
		pnlBody.add(ctrlYknKana);

		// JnNϊ
		ctrlDateFrom.setLabelSize(110);
		ctrlDateFrom.setSize(110 + ctrlDateFrom.getCalendarSize() + 5, 20);
		ctrlDateFrom.setLangMessageID("C00055");
		ctrlDateFrom.setLocation(10, 280);
		pnlBody.add(ctrlDateFrom);

		// IΉNϊ
		ctrlDateTo.setLabelSize(110);
		ctrlDateTo.setSize(110 + ctrlDateTo.getCalendarSize() + 5, 20);
		ctrlDateTo.setLangMessageID("C00261");
		ctrlDateTo.setLocation(200, 280);
		pnlBody.add(ctrlDateTo);
	}

	@Override
	/** Tabθ` */
	public void setTabIndex() {
		int i = 1;
		ctrlCode.setTabControlNo(i++);
		ctrlName.setTabControlNo(i++);
		ctrlNameS.setTabControlNo(i++);
		ctrlNameK.setTabControlNo(i++);
		ctrlCbkCode.setTabControlNo(i++);
		ctrlBnkCode.setTabControlNo(i++);
		ctrlStnCode.setTabControlNo(i++);
		ctrlKozaKbnOrd.setTabControlNo(i++);
		ctrlKozaKbnCur.setTabControlNo(i++);
		ctrlYknNo.setTabControlNo(i++);
		ctrlYknKana.setTabControlNo(i++);
		ctrlDateFrom.setTabControlNo(i++);
		ctrlDateTo.setTabControlNo(i++);
		btnSettle.setTabControlNo(i++);
		btnClose.setTabControlNo(i++);
	}
}