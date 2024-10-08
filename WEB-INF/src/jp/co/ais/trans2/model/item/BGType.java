package jp.co.ais.trans2.model.item;

/**
 * BGÈÚ§äæªR{{bNXÚè`
 */
public enum BGType {

	/** Êí */
	NOMAL("00"),

	/** \ZÇÎÛ */
	BG("11");

	/** l */
	public String value;

	/**
	 * RXgN^.
	 * 
	 * @param value l
	 */
	private BGType(String value) {
		this.value = value;
	}

	/**
	 * BGÈÚ§äæªðÔ·
	 * 
	 * @param bg âÈÚ
	 * @return l
	 */
	public static BGType get(String bg) {
		for (BGType em : values()) {
			if (em.value.equals(bg)) {
				return em;
			}
		}

		return null;
	}

	/**
	 * BGÈÚ§äæªðÔ·
	 * 
	 * @param bg BGÈÚ§äæª
	 * @return BGÈÚ§äæª
	 */
	public static String getName(BGType bg) {

		if (bg == null) {
			return "";
		}

		switch (bg) {
			case NOMAL:
				return "C00372"; // Êí
			case BG:
				return "C02125"; // \ZÇÎÛ
			default:
				return "";
		}

	}
}