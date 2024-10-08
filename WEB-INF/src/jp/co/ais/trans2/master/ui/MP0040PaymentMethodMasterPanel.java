package jp.co.ais.trans2.master.ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans2.common.gui.*;
import jp.co.ais.trans2.common.gui.TTable;
import jp.co.ais.trans2.common.model.ui.payment.*;
import jp.co.ais.trans2.common.ui.*;
import jp.co.ais.trans2.define.*;

/**
 * x¥û@}X^Ìw¦æÊ
 * 
 * @author AIS
 */
public class MP0040PaymentMethodMasterPanel extends TMainPanel {

	/** VK{^ */
	public TImageButton btnNew;

	/** õ{^ */
	public TImageButton btnSearch;

	/** ÒW{^ */
	public TImageButton btnModify;

	/** ¡Ê{^ */
	public TImageButton btnCopy;

	/** í{^ */
	public TImageButton btnDelete;

	/** GNZ{^ */
	public TImageButton btnExcel;

	/** ã */
	public TPanel pnlBodyTop;

	/** õðpl */
	public TPanel pnlSearchCondition;

	/** x¥ÎÛæªpl */
	public TPanel pnlPaymentDivision;

	/** Ðõx¥ */
	public TCheckBox chkEmployeePayment;

	/** ÐOx¥ */
	public TCheckBox chkExternalPayment;

	/** x¥û@õÍÍ */
	public TPaymentMethodReferenceRange ctrlPayRefRan;

	/** LøúÀØê`FbN{bNX */
	public TCheckBox chkOutputTermEnd;

	/** º */
	public TPanel pnlBodyBottom;

	/** x¥û@ê */
	public TTable tbList;

	/** êÌJè` */
	public enum SC {

		/** x¥û@R[h */
		HOH_HOH_CODE,

		/** x¥û@¼Ì */
		HOH_HOH_NAME,

		/** x¥û@õ¼Ì */
		HOH_HOH_NAME_K,

		/** ÈÚ */
		HOH_KMK_CODE,

		/** â */
		HOH_HKM_CODE,

		/** àó */
		HOH_UKM_CODE,

		/** vãåR[h */
		HOH_DEP_CODE,

		/** x¥ÎÛæª */
		HOH_SHI_KBN,

		/** x¥àR[h */
		HOH_NAI_CODE,

		/** JnNú */
		STR_DATE,

		/** I¹Nú */
		END_DATE,

		/** Entity */
		ENTITY
	}

	@SuppressWarnings("static-access")
	@Override
	public void initComponents() {

		btnNew = new TImageButton(IconType.NEW);
		btnSearch = new TImageButton(IconType.SEARCH);
		btnModify = new TImageButton(IconType.EDIT);
		btnCopy = new TImageButton(IconType.COPY);
		btnDelete = new TImageButton(IconType.DELETE);
		btnExcel = new TImageButton(IconType.EXCEL);
		pnlBodyTop = new TPanel();
		pnlSearchCondition = new TPanel();
		pnlPaymentDivision = new TPanel();
		chkEmployeePayment = new TCheckBox();
		chkExternalPayment = new TCheckBox();
		ctrlPayRefRan = new TPaymentMethodReferenceRange();
		chkOutputTermEnd = new TCheckBox();
		pnlBodyBottom = new TPanel();

		tbList = new TTable();
		tbList.addColumn(SC.HOH_HOH_CODE, getWord("C00864"), 150, SwingConstants.LEFT);
		tbList.addColumn(SC.HOH_HOH_NAME, getWord("C00865"), 240, SwingConstants.LEFT);
		tbList.addColumn(SC.HOH_HOH_NAME_K, getWord("C00866"), 240, SwingConstants.LEFT);
		tbList.addColumn(SC.HOH_KMK_CODE, getWord("C00077"), 120, SwingConstants.LEFT);
		tbList.addColumn(SC.HOH_HKM_CODE, getWord("C00488"), 120, SwingConstants.LEFT);
		tbList.addColumn(SC.HOH_UKM_CODE, getWord("C00025"), 120, SwingConstants.LEFT);
		tbList.addColumn(SC.HOH_DEP_CODE, getWord("C00571"), 120, SwingConstants.LEFT);
		tbList.addColumn(SC.HOH_SHI_KBN, getWord("C01096"), 120, SwingConstants.CENTER);
		tbList.addColumn(SC.HOH_NAI_CODE, getWord("C01097"), 120, SwingConstants.CENTER);
		tbList.addColumn(SC.STR_DATE, getWord("COP706"), 120, SwingConstants.CENTER);
		tbList.addColumn(SC.END_DATE, getWord("COP707"), 120, SwingConstants.CENTER);
		tbList.addColumn(SC.ENTITY, "", -1, false);
	}

	@Override
	public void allocateComponents() {

		// VK{^
		int x = HEADER_LEFT_X;
		btnNew.setSize(25, 110);
		btnNew.setLangMessageID("C00303");
		btnNew.setShortcutKey(KeyEvent.VK_F1);
		btnNew.setLocation(x, HEADER_Y);
		pnlHeader.add(btnNew);

		// õ{^
		x = x + btnNew.getWidth() + HEADER_MARGIN_X;
		btnSearch.setSize(25, 110);
		btnSearch.setLangMessageID("C00155");
		btnSearch.setShortcutKey(KeyEvent.VK_F2);
		btnSearch.setLocation(x, HEADER_Y);
		pnlHeader.add(btnSearch);

		// ÒW{^
		x = x + btnSearch.getWidth() + HEADER_MARGIN_X;
		btnModify.setSize(25, 110);
		btnModify.setLangMessageID("C00481");
		btnModify.setShortcutKey(KeyEvent.VK_F3);
		btnModify.setLocation(x, HEADER_Y);
		pnlHeader.add(btnModify);
		tbList.addSpreadSheetSelectChange(btnModify);

		// ¡Ê{^
		x = x + btnModify.getWidth() + HEADER_MARGIN_X;
		btnCopy.setSize(25, 110);
		btnCopy.setLangMessageID("C00459");
		btnCopy.setShortcutKey(KeyEvent.VK_F4);
		btnCopy.setLocation(x, HEADER_Y);
		pnlHeader.add(btnCopy);

		// í{^
		x = x + btnCopy.getWidth() + HEADER_MARGIN_X;
		btnDelete.setSize(25, 110);
		btnDelete.setLangMessageID("C01544");
		btnDelete.setShortcutKey(KeyEvent.VK_F5);
		btnDelete.setLocation(x, HEADER_Y);
		pnlHeader.add(btnDelete);

		// GNZ{^
		x = x + btnDelete.getWidth() + HEADER_MARGIN_X;
		btnExcel.setSize(25, 130);
		btnExcel.setLangMessageID("C01545");
		btnExcel.setShortcutKey(KeyEvent.VK_F6);
		btnExcel.setLocation(x, HEADER_Y);
		pnlHeader.add(btnExcel);

		// ã
		pnlBodyTop = new TPanel();
		pnlBodyTop.setLayout(null);
		pnlBodyTop.setMaximumSize(new Dimension(0, 180));
		pnlBodyTop.setMinimumSize(new Dimension(0, 180));
		pnlBodyTop.setPreferredSize(new Dimension(0, 180));
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.HORIZONTAL;
		pnlBody.add(pnlBodyTop, gc);

		// õðpl
		pnlSearchCondition.setLayout(null);
		pnlSearchCondition.setLangMessageID("C01060");
		pnlSearchCondition.setLocation(30, 10);
		pnlSearchCondition.setSize(480, 130);
		pnlBodyTop.add(pnlSearchCondition);

		// x¥ÎÛæªpl
		pnlPaymentDivision.setLayout(null);
		pnlPaymentDivision.setLangMessageID("C01096");
		pnlPaymentDivision.setLocation(20, 20);
		pnlPaymentDivision.setSize(280, 50);
		pnlSearchCondition.add(pnlPaymentDivision);

		// Ðõx¥
		chkEmployeePayment.setLangMessageID("C01119");
		chkEmployeePayment.setSize(100, 20);
		chkEmployeePayment.setLocation(20, 20);
		chkEmployeePayment.setSelected(true);
		chkEmployeePayment.setIndex(0);
		pnlPaymentDivision.add(chkEmployeePayment);

		// ÐOx¥
		chkExternalPayment.setLangMessageID("C01124");
		chkExternalPayment.setSize(100, 20);
		chkExternalPayment.setLocation(150, 20);
		chkExternalPayment.setSelected(true);
		chkExternalPayment.setIndex(1);
		pnlPaymentDivision.add(chkExternalPayment);

		// x¥û@iÍÍjiJnAI¹j
		ctrlPayRefRan.setLocation(20, 75);
		pnlSearchCondition.add(ctrlPayRefRan);

		// LøúÔØê\¦
		chkOutputTermEnd.setLangMessageID("C11089"); // LøúÔØê\¦
		chkOutputTermEnd.setLocation(340, 95);
		chkOutputTermEnd.setSize(140, 20);
		pnlSearchCondition.add(chkOutputTermEnd);

		// º
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.gridy = 1;
		gc.weightx = 1.0d;
		gc.weighty = 1.0d;
		gc.insets = new Insets(15, 30, 10, 30);
		pnlBody.add(tbList, gc);
	}

	@Override
	// Tabè`
	public void setTabIndex() {
		int i = 0;
		chkEmployeePayment.setTabControlNo(i++);
		chkExternalPayment.setTabControlNo(i++);
		ctrlPayRefRan.setTabControlNo(i++);
		chkOutputTermEnd.setTabControlNo(i++);
		tbList.setTabControlNo(i++);
		btnNew.setTabControlNo(i++);
		btnSearch.setTabControlNo(i++);
		btnModify.setTabControlNo(i++);
		btnCopy.setTabControlNo(i++);
		btnDelete.setTabControlNo(i++);
		btnExcel.setTabControlNo(i++);
	}
}