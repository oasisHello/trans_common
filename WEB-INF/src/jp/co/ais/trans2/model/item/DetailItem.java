package jp.co.ais.trans2.model.item;

/**
 * 内訳科目
 * 
 * @author AIS
 */
public class DetailItem extends Item {

	/** serialVersionUID */
	private static final long serialVersionUID = 4114371948432422476L;

	/**
	 * クローン
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public DetailItem clone() {
		return (DetailItem) super.clone();
	}
}
