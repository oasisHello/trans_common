package jp.co.ais.trans2.common.gui;

import java.awt.*;

import javax.swing.table.*;

/**
 * ヘッダ描画可能のカラム
 */
public interface TTableColumnHeader {

	/**
	 * ヘッダ描画者の作成
	 * 
	 * @param tbl
	 * @param backGround
	 * @param foreGround
	 * @return ヘッダ描画者
	 */
	public TableCellRenderer createHeaderRenderer(TTable tbl, Color backGround, Color foreGround);

}
