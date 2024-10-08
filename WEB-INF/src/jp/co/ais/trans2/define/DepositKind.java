package jp.co.ais.trans2.define;

/**
 * 預金種目
 * 
 * @author AIS
 */
public enum DepositKind {

	/** 1:普通預金 */
	ORDINARY(1),

	/** 2:当座預金 */
	CURRENT(2),

	/** 3:外貨 */
	FOREIGN_CURRENCY(3),

	/** 4:貯蓄 */
	SAVINGS(4),

	/** 5:定期 */
	FIXED(5),

	/** 9:その他 */
	OTHERS(9);

	/** 値 */
	public int value;

	/**
	 * コンストラクタ.
	 * 
	 * @param value 値
	 */
	private DepositKind(int value) {
		this.value = value;
	}

	/**
	 * 預金種目を取得する
	 * 
	 * @return 預金種目
	 */
	public int getDepositKind() {
		return value;
	}

	/**
	 * 預金種目を返す
	 * 
	 * @param depositKind 預金種目
	 * @return 預金種目名
	 */
	public static DepositKind getDepositKind(int depositKind) {
		for (DepositKind em : values()) {
			if (em.value == depositKind) {
				return em;
			}
		}

		return null;
	}

	/**
	 * 預金種目名称を返す
	 * 
	 * @return 預金種目名称
	 */
	public String getDepositKindName() {
		return getDepositKindName(this);
	}

	/**
	 * 名称を返す
	 * 
	 * @return 名称ID
	 */
	public String getName() {
		return getDepositKindName(this);
	}

	/**
	 * 預金種目名称を返す
	 * 
	 * @param depositKind 預金種目
	 * @return 預金種目名称
	 */
	public static String getDepositKindName(DepositKind depositKind) {

		if (depositKind == null) {
			return "";
		}

		switch (depositKind) {
			case ORDINARY:
				return "C00463"; // 普通

			case CURRENT:
				return "C00397"; // 当座

			case FOREIGN_CURRENCY:
				return "C00045"; // 外貨

			case SAVINGS:
				return "C00368"; // 貯蓄

			case FIXED:
				return "C11057"; // 定期

			case OTHERS:
				return "C00338"; // その他

			default:
				return "";
		}
	}

	/**
	 * 預金種目名称を返す
	 * 
	 * @param depositKind 預金種目
	 * @return 預金種目名称
	 */
	public static String getDepositKindName(int depositKind) {
		return getDepositKindName(getDepositKind(depositKind));
	}

}
