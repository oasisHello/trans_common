package jp.co.ais.trans2.define;

import java.util.*;

/**
 * `[íÞ
 */
public enum SlipKind {

	/** üà`[ */
	INPUT_CASH_FLOW,

	/** oà`[ */
	OUTPUT_CASH_FLOW,

	/** UÖ`[ */
	TRANSFER,

	/** ã`[ */
	SALES,

	/** dü`[ */
	PURCHASE,

	/** IFRS²®`[ */
	IFRS_TRANSFER,

	/** Ðõx¥`[ */
	EMPLOYEE;

	/** íÞXg */
	public static Map<String, SlipKind> kindList = Collections.synchronizedMap(new TreeMap<String, SlipKind>());

	static {
		kindList.put("11", INPUT_CASH_FLOW); // 11:üà`[
		kindList.put("12", OUTPUT_CASH_FLOW); // 12:oà`[
		kindList.put("13", TRANSFER); // 13:UÖ`[
		kindList.put("14", TRANSFER); // 14:©Ï`[(Uß)
		kindList.put("15", TRANSFER); // 15:©ÏÁ`[(UßæÁ)
		kindList.put("16", IFRS_TRANSFER); // 16:IFRS²®`[
		kindList.put("17", IFRS_TRANSFER); // 17:©²®`[

		kindList.put("21", EMPLOYEE); // 21:Ðõ¼¥
		kindList.put("22", EMPLOYEE); // 22:oï¸Z
		kindList.put("23", PURCHASE); // 23:¿(Â±)
		kindList.put("24", TRANSFER); // 24:x¥`[(Ðõ)
		kindList.put("25", TRANSFER); // 25:x¥`[(Õ)
		kindList.put("26", TRANSFER); // 26:x¥`[(è)
		kindList.put("27", TRANSFER); // 27:Oà²®
		kindList.put("28", TRANSFER); // 28:x¥`[(¤Ê)
		kindList.put("2E", TRANSFER); // 2E:ðÛïïcï(Ðõ)
		kindList.put("2T", TRANSFER); // 2T:ðÛïïcï(ÐO)

		kindList.put("31", SALES); // 31:Â vã
		kindList.put("32", TRANSFER); // 32:Â Á
		kindList.put("33", TRANSFER); // 33:§Öà¿

		kindList.put("41", TRANSFER); // 41:óèo^
		kindList.put("42", TRANSFER); // 42:óèÏ

		kindList.put("51", TRANSFER); // 51:xèo^
		kindList.put("52", TRANSFER); // 52:xèÏ

		kindList.put("61", TRANSFER); // 61:ÅèYUÖ
		kindList.put("62", TRANSFER); // 62:ÅèYx¥
	}

	/**
	 * wè`[Ì`[íÞðÁè·é
	 * 
	 * @param dataKind f[^æª
	 * @return `[íÞ
	 */
	public static SlipKind get(String dataKind) {
		return kindList.get(dataKind);
	}
}
