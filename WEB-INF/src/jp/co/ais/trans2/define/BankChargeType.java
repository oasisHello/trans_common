package jp.co.ais.trans2.define;

/**
 * oN`[Wæª
 */
public enum BankChargeType {

	/** 0:SHA(óælS) */
	SHA(0),

	/** 1:BEN(è¿SzóælS) */
	BEN(1),

	/** 2:OUR(ËlS) */
	OUR(2);

	/** l */
	public int value;

	/**
	 * RXgN^.
	 * 
	 * @param value l
	 */
	private BankChargeType(int value) {
		this.value = value;
	}

	/**
	 * è`æ¾
	 * 
	 * @param value l
	 * @return è`
	 */
	public static BankChargeType get(int value) {
		for (BankChargeType em : values()) {
			if (em.value == value) {
				return em;
			}
		}
		return null;
	}

	/**
	 * ¼ÌðÔ·
	 * 
	 * @return ¼ÌID
	 */
	public String getName() {
		return getName(this);
	}

	/**
	 * ¼Ìæ¾
	 * 
	 * @param type ^Cv
	 * @return ¼ÌID
	 */
	public static String getName(BankChargeType type) {
		if (type == null) {
			return "";
		}

		switch (type) {
			case SHA:
				return "C02600"; // óælS

			case BEN:
				return "C11430"; // è¿SzóælS

			case OUR:
				return "C02601"; // ËlS

			default:
				return "";
		}
	}
}
