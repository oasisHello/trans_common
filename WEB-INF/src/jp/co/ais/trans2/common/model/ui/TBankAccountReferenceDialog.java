package jp.co.ais.trans2.common.model.ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans2.common.config.*;
import jp.co.ais.trans2.common.gui.*;
import jp.co.ais.trans2.common.gui.TTable;
import jp.co.ais.trans2.define.*;

/**
 * 銀行口座検索コンポーネントダイアログ
 */
public class TBankAccountReferenceDialog extends TReferenceDialog {

	/** 預金金種 */
	public TDepositKindComboBox cmbDepositKind;

	/**
	 * 検索ダイアログの列番号定義
	 * 
	 * @author AIS
	 */
	public enum SC {
		/** Bean */
		bean,
		/** コード */
		code,
		/** 略称 */
		names,
		/** 預金金種 */
		depositkind,
		/** 検索名称 */
		namek
	}

	/**
	 * コンストラクタ
	 * 
	 * @param controller
	 */
	public TBankAccountReferenceDialog(TReferenceController controller) {
		super(controller);
	}

	/**
	 * コンポーネント初期化
	 */
	@Override
	protected void initComponents() {
		tbl = new TTable();
		tbl.getTableHeader().setReorderingAllowed(false);
		tbl.addColumn(SC.bean, "", -1);
		tbl.addColumn(SC.code, getWord(controller.getCodeCaption()), controller.getCodeColumnSize());

		if (this.show3rdColumn) {
			tbl.addColumn(SC.names, getWord(controller.getNamesCaption()), controller.getNamesColumnSize(),
				controller.getNamesColumnAlignment());
			tbl.addColumn(SC.depositkind, getWord("C10762"), 80, SwingConstants.CENTER);// 預金金種
			tbl.addColumn(SC.namek, getWord(controller.getNamekCaption()), controller.getNamekColumnSize(),
				controller.getNamekColumnAlignment());
		} else {
			tbl.addColumn(SC.names, getWord(controller.getNameCaption()), controller.getNamesColumnSize(),
				controller.getNamesColumnAlignment());
			tbl.addColumn(SC.depositkind, getWord("C10762"), 80, SwingConstants.CENTER);// 預金金種
			tbl.addColumn(SC.namek, getWord(controller.getNamekCaption()), 0, controller.getNamekColumnAlignment());
		}

		code = new TTextField();
		names = new TTextField();
		namek = new TTextField();
		btnSearch = new TButton();
		btnSettle = new TButton();
		btnBack = new TButton();

		cmbDepositKind = new TDepositKindComboBox();
	}

	/**
	 * コンポーネント配置
	 */
	@Override
	protected void allocateComponents() {

		setLayout(new GridBagLayout());
		setResizable(true);

		setPreferredSize(new Dimension(710, 520));

		setTitle(controller.getDialogTitle());

		// 一覧
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.insets = new Insets(10, 10, 0, 10);
		gc.weightx = 1.0d;
		gc.weighty = 1.0d;
		add(tbl, gc);
		tbl.addSpreadSheetSelectChange(btnSettle);

		// 検索条件指定フィールド
		TPanel pnlSearch = new TPanel();
		pnlSearch.setLayout(new GridBagLayout());
		pnlSearch.setMinimumSize(new Dimension(0, 20));
		pnlSearch.setPreferredSize(new Dimension(0, 20));
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridy = 1;
		add(pnlSearch, gc);

		// コード検索
		TTableInformation ti = tbl.getTableInformation();
		int codeLength = ti.getWidthList().get(SC.code.ordinal());
		code.setMinimumSize(new Dimension(codeLength, 20));
		code.setPreferredSize(new Dimension(codeLength, 20));
		code.setImeMode(false);
		int marginX = tbl.getRowColumnWidth() + 10;
		gc = new GridBagConstraints();
		gc.insets = new Insets(0, marginX, 0, 0);

		pnlSearch.add(code, gc);

		// 略称検索
		int namesLength = ti.getWidthList().get(SC.names.ordinal());
		names.setMinimumSize(new Dimension(namesLength, 20));
		names.setPreferredSize(new Dimension(namesLength, 20));
		gc = new GridBagConstraints();
		gc.insets = new Insets(0, 0, 0, 0);
		pnlSearch.add(names, gc);

		// 預金金種
		int depositKindLength = ti.getWidthList().get(SC.depositkind.ordinal());
		TComboBox box = cmbDepositKind.getComboBox();
		TGuiUtil.setComponentSize(box, new Dimension(depositKindLength, 20));
		gc = new GridBagConstraints();
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.NORTHWEST;

		// 預金種目
		DepositKind depositKind = ((TBankAccountReferenceController) controller).getCondition().getDepositKind();
		// 預金種目指定された場合、変更不可
		if (depositKind != null) {
			cmbDepositKind.setSelectedDepositKind(depositKind);
			cmbDepositKind.setEnabled(false);
		}

		pnlSearch.add(box, gc);

		// 検索名称
		int namekLength = ti.getWidthList().get(SC.namek.ordinal());
		namek.setMinimumSize(new Dimension(namekLength, 20));
		namek.setPreferredSize(new Dimension(namekLength, 20));
		gc = new GridBagConstraints();
		gc.insets = new Insets(0, 0, 0, 0);
		gc.weightx = 1.0d;
		gc.weighty = 1.0d;
		gc.anchor = GridBagConstraints.NORTHWEST;

		pnlSearch.add(namek, gc);
		if (!show3rdColumn) {
			namek.setVisible(true);
		}

		// ボタンフィールド
		TPanel pnlButton = new TPanel();
		pnlButton.setLayout(new GridBagLayout());
		pnlButton.setMinimumSize(new Dimension(0, 40));
		pnlButton.setPreferredSize(new Dimension(0, 40));
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridy = 2;
		add(pnlButton, gc);

		// 検索ボタン
		btnSearch.setPreferredSize(new Dimension(120, 25));
		btnSearch.setLangMessageID("C00155");
		btnSearch.setShortcutKey(KeyEvent.VK_F2);
		pnlButton.add(btnSearch);
		gc = new GridBagConstraints();
		pnlButton.add(btnSearch, gc);

		// 確定ボタン
		btnSettle.setPreferredSize(new Dimension(120, 25));
		btnSettle.setLangMessageID("C01019");
		btnSettle.setShortcutKey(KeyEvent.VK_F8);
		pnlButton.add(btnSettle, gc);

		// 戻るボタン
		btnBack.setPreferredSize(new Dimension(120, 25));
		btnBack.setLangMessageID("C01747");
		btnBack.setShortcutKey(KeyEvent.VK_F12);
		gc = new GridBagConstraints();
		pnlButton.add(btnBack, gc);

		pack();
	}

	/**
	 * Tab順セット
	 */
	@Override
	protected void setTabIndex() {
		int i = 0;
		code.setTabControlNo(i++);
		names.setTabControlNo(i++);
		cmbDepositKind.setTabControlNo(i++);
		namek.setTabControlNo(i++);
		if (ClientConfig.isFlagOn("trans.ref.table.focusable")) {
			tbl.setTabControlNo(i++);
			tbl.setEnterToButton(true);
		}
		btnSearch.setTabControlNo(i++);
		btnSettle.setTabControlNo(i++);
		btnBack.setTabControlNo(i++);
	}
}
