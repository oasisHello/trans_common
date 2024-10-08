package jp.co.ais.trans2.master.ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans2.common.gui.*;
import jp.co.ais.trans2.common.gui.TTable;
import jp.co.ais.trans2.common.model.ui.*;
import jp.co.ais.trans2.common.ui.*;
import jp.co.ais.trans2.define.*;

/**
 * ÁïÅ}X^Ìw¦æÊ
 * 
 * @author AIS
 */
public class MG0130ConsumptionTaxMasterPanel extends TMainPanel {

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

	/** ÁïÅÍÍõJnI¹ */
	public TTaxReferenceRange ctrlTaxRefRan;

	/** LøúÔØêð\¦·é© */
	public TCheckBox chkOutputTermEnd;

	/** º */
	public TPanel pnlBodyBottom;

	/** ÁïÅ}X^ê */
	public TTable tbList;

	/** êÌJè` */
	public enum SC {

		/** ÁïÅR[h */
		ZEI_CODE,

		/** ÁïÅ¼Ì */
		ZEI_NAME,

		/** ÁïÅªÌ */
		ZEI_NAME_S,

		/** ÁïÅõ¼Ì */
		ZEI_NAME_K,

		/** ãdüæª */
		US_KBN,

		/** ÁïÅ¦ */
		ZEI_RATE,

		/** ÁïÅvZoÍ */
		ZEI_KEI_KBN,

		/** ñKi¿­sÆÒ */
		noInvReg,

		/** oß[uTÂ\¦ */
		KEKA_SOTI_RATE,

		/** JnNú */
		STR_DATE,

		/** I¹Nú */
		END_DATE,

		/** Entity */
		ENTITY
	}

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
		ctrlTaxRefRan = new TTaxReferenceRange();
		chkOutputTermEnd = new TCheckBox();
		pnlBodyBottom = new TPanel();

		int invoiceWidth = -1;
		int transitMeasureWidth = -1;

		if (MG0130ConsumptionTaxMasterPanelCtrl.isInvoice) {
			invoiceWidth = 150;
			transitMeasureWidth = 115;
		}

		tbList = new TTable();
		tbList.addColumn(SC.ZEI_CODE, getWord("C00573"), 75);
		tbList.addColumn(SC.ZEI_NAME, getWord("C00774"), 155);
		tbList.addColumn(SC.ZEI_NAME_S, getWord("C00775"), 155);
		tbList.addColumn(SC.ZEI_NAME_K, getWord("C00828"), 155);
		tbList.addColumn(SC.US_KBN, getWord("C01283"), 85, SwingConstants.CENTER);
		tbList.addColumn(SC.ZEI_RATE, getWord("C00777"), 75, SwingConstants.RIGHT);
		tbList.addColumn(SC.ZEI_KEI_KBN, getWord("C02045"), 135, SwingConstants.RIGHT);
		tbList.addColumn(SC.noInvReg, getWord("C12197"), invoiceWidth, SwingConstants.CENTER); // ñKi¿­sÆÒ
		tbList.addColumn(SC.KEKA_SOTI_RATE, "C12228", transitMeasureWidth, SwingConstants.RIGHT);
		tbList.addColumn(SC.STR_DATE, getWord("COP706"), 85, SwingConstants.CENTER);
		tbList.addColumn(SC.END_DATE, getWord("COP707"), 85, SwingConstants.CENTER);
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
		pnlBodyTop.setMaximumSize(new Dimension(0, 85));
		pnlBodyTop.setMinimumSize(new Dimension(0, 85));
		pnlBodyTop.setPreferredSize(new Dimension(0, 85));
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.HORIZONTAL;
		pnlBody.add(pnlBodyTop, gc);

		// õðpl
		pnlSearchCondition.setLayout(null);
		pnlSearchCondition.setLangMessageID("C01060");
		pnlSearchCondition.setLocation(30, 10);
		pnlSearchCondition.setSize(600, 75);
		pnlBodyTop.add(pnlSearchCondition);

		// ÁïÅiÍÍjiJnAI¹j
		ctrlTaxRefRan.setLocation(20, 20);
		pnlSearchCondition.add(ctrlTaxRefRan);

		// LøúÔØê\¦
		chkOutputTermEnd.setLangMessageID("C11089");
		chkOutputTermEnd.setSize(140, 20);
		chkOutputTermEnd.setLocation(360, 40);
		pnlSearchCondition.add(chkOutputTermEnd);

		// º
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.gridy = 1;
		gc.weightx = 1.0d;
		gc.weighty = 1.0d;
		gc.insets = new Insets(10, 30, 10, 30);
		pnlBody.add(tbList, gc);
	}

	@Override
	// Tabè`
	public void setTabIndex() {
		int i = 0;
		ctrlTaxRefRan.setTabControlNo(i++);
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