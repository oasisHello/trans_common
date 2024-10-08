package jp.co.ais.trans2.common.model.ui.slip;

import java.awt.*;

import jp.co.ais.trans.common.gui.*;

/**
 * 伝票番号＋修正回数
 */
public class TSlipNo extends TLabelField {

	/** 修正回数 */
	protected TNumericField txtUpdCount;

	/**
	 * @see jp.co.ais.trans.common.gui.TLabelField#initComponents()
	 */
	@Override
	protected void initComponents() {
		super.initComponents();

		TGuiUtil.setComponentSize(label, new Dimension(75, 20));
		label.setLangMessageID("C00605");

		field.setImeMode(false);
		field.setMaxLength(20);

		// 修正回数
		txtUpdCount = createUpdateCountField();
		txtUpdCount.setEditable(false);
		txtUpdCount.setNumericFormat("#,###");
		TGuiUtil.setComponentSize(txtUpdCount, new Dimension(30, 20));

		add(txtUpdCount, new GridBagConstraints());

		setPanelSize();
	}

	/**
	 * init
	 */
	@Override
	protected void initControl() {
		field.setEditable(false);
	}

	/**
	 * 修正回数フィールドを生成
	 * 
	 * @return 修正回数フィールド
	 */
	protected TNumericField createUpdateCountField() {
		return new TNumericField();
	}

	/**
	 * @see jp.co.ais.trans.common.gui.TLabelField#setPanelSize()
	 */
	@Override
	protected void setPanelSize() {
		if (txtUpdCount == null) {
			return;
		}

		TGuiUtil.setComponentSize(this, new Dimension(this.label.getWidth() + this.field.getWidth()
			+ txtUpdCount.getWidth() + 5, this.getPreferredSize().height));
	}

	/**
	 * 修正回数セット
	 * 
	 * @param count 修正回数
	 */
	public void setUpdateCount(int count) {
		txtUpdCount.setNumber(count);
	}

	/**
	 * 修正回数ゲット
	 * 
	 * @return 修正回数
	 */
	public int getUpdateCount() {
		return txtUpdCount.getInt();
	}

	/**
	 * 伝票番号セット
	 * 
	 * @param slipNo 伝票番号
	 */
	public void setSlipNo(String slipNo) {
		field.setText(slipNo);
	}

	/**
	 * 伝票番号ゲット
	 * 
	 * @return 伝票番号
	 */
	public String getSlipNo() {
		return field.getText();
	}

	/**
	 * 入力値をクリアする
	 */
	@Override
	public void clear() {
		this.field.clear();
		this.txtUpdCount.clear();
	}
}
