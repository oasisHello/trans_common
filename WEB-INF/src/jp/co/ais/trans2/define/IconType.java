package jp.co.ais.trans2.define;

/** Iconๆ */
public enum IconType {

	/** กส */
	COPY,

	/** ํ */
	DELETE,

	/** Cณ */
	EDIT,

	/** GNZ */
	EXCEL,

	/** VK */
	NEW,

	/** ซip^[j */
	PATTERN,

	/** vr[ */
	PREVIEW,

	/** ๕ */
	SEARCH,

	/** m่ */
	SETTLE,

	/** ๆชึ(ถ[๎๓) */
	ALLOW_FIRST,

	/** Oึ(ถ๎๓) */
	ALLOW_PREVIOUS,

	/** ึ(E๎๓) */
	ALLOW_NEXT,

	/** ลใึ(E[๎๓) */
	ALLOW_LAST,

	/** Ytt@C */
	ATTACHMENT,

	/** Ytฎน */
	ATTACHMENT_COMPLETE,

	/** ๐ */
	HISTORY,

	/** wv */
	HELP;

	/**
	 * Iconผ๐ิท
	 * 
	 * @return Iconผ
	 */
	public String getIconName() {
		return getIconName(this);
	}

	/**
	 * Iconผ๐ิท
	 * 
	 * @param it Icon
	 * @return Iconผ
	 */
	public static String getIconName(IconType it) {

		switch (it) {
			case COPY: // กส
				return "images/copy.png";

			case DELETE: // ํ
				return "images/delete.png";

			case EDIT: // Cณ
				return "images/edit.png";

			case EXCEL: // GNZ
				return "images/excel.png";

			case NEW: // VK
				return "images/new.png";

			case PATTERN: // ซip^[j
				return "images/pattern.png";

			case PREVIEW: // vr[
				return "images/preview.png";

			case SEARCH: // ๕
				return "images/search.png";

			case SETTLE: // m่
				return "images/settle.png";

			case ALLOW_FIRST: // ถ[๎๓
				return "images/allow_first.png";

			case ALLOW_PREVIOUS: // ถ๎๓
				return "images/allow_previos.png";

			case ALLOW_NEXT: // E๎๓
				return "images/allow_next.png";

			case ALLOW_LAST: // E[๎๓
				return "images/allow_last.png";

			case ATTACHMENT: // Yt
				return "images/attachment.png";

			case ATTACHMENT_COMPLETE: // Ytฎน
				return "images/attachment_complete.png";
			case HISTORY: // ๐
				return "images/history.png";

			case HELP: // wv
				return "images/help.png";
			default:
				return null;
		}
	}
}