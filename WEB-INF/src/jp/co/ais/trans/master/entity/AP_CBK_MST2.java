package jp.co.ais.trans.master.entity;

import java.util.*;

/**
 * βsϋΐ}X^pEntity
 */
public class AP_CBK_MST2 extends MasterBase {

	/** e[u */
	public static final String TABLE = "AP_CBK_MST";

	private String kAI_CODE = "";

	private String cBK_CBK_CODE = "";

	private String cBK_NAME = "";

	private String cUR_CODE = "";

	private String cBK_BNK_CODE = "";

	private String cBK_STN_CODE = "";

	private String cBK_IRAI_EMP_CODE = "";

	private String cBK_IRAI_NAME = "";

	private String cBK_IRAI_NAME_J;

	private String cBK_IRAI_NAME_E;

	private int cBK_YKN_KBN;

	private String cBK_YKN_NO = "";

	private int cBK_EMP_FB_KBN;

	private int cBK_OUT_FB_KBN;

	private String cBK_DEP_CODE;

	private String cBK_KMK_CODE;

	private String cBK_HKM_CODE;

	private String cBK_UKM_CODE;

	private Date sTR_DATE;

	private Date eND_DATE;

	private Date cBK_INP_DATE;

	private String pRG_ID;

	private String cUR_NAME;

	private String bNK_NAME_S;

	private String bNK_STN_NAME_S;

	/**
	 * @return οΠR[h
	 */
	public String getKAI_CODE() {
		return kAI_CODE;
	}

	/**
	 * @param kAI_CODE
	 */
	public void setKAI_CODE(String kAI_CODE) {
		this.kAI_CODE = kAI_CODE;
	}

	/**
	 * @return ϋΐR[h
	 */
	public String getCBK_CBK_CODE() {
		return cBK_CBK_CODE;
	}

	/**
	 * @param cBK_CBK_CODE
	 */
	public void setCBK_CBK_CODE(String cBK_CBK_CODE) {
		this.cBK_CBK_CODE = cBK_CBK_CODE;
	}

	/**
	 * @return ϋΐΌΜ
	 */
	public String getCBK_NAME() {
		return cBK_NAME;
	}

	/**
	 * @param cBK_NAME
	 */
	public void setCBK_NAME(String cBK_NAME) {
		this.cBK_NAME = cBK_NAME;
	}

	/**
	 * @return ΚέR[h
	 */
	public String getCUR_CODE() {
		return cUR_CODE;
	}

	/**
	 * @param cUR_CODE
	 */
	public void setCUR_CODE(String cUR_CODE) {
		this.cUR_CODE = cUR_CODE;
	}

	/**
	 * @return βsR[h
	 */
	public String getCBK_BNK_CODE() {
		return cBK_BNK_CODE;
	}

	/**
	 * @param cBK_BNK_CODE
	 */
	public void setCBK_BNK_CODE(String cBK_BNK_CODE) {
		this.cBK_BNK_CODE = cBK_BNK_CODE;
	}

	/**
	 * @return xXR[h
	 */
	public String getCBK_STN_CODE() {
		return cBK_STN_CODE;
	}

	/**
	 * @param cBK_STN_CODE
	 */
	public void setCBK_STN_CODE(String cBK_STN_CODE) {
		this.cBK_STN_CODE = cBK_STN_CODE;
	}

	/**
	 * @return ΛΠυR[h
	 */
	public String getCBK_IRAI_EMP_CODE() {
		return cBK_IRAI_EMP_CODE;
	}

	/**
	 * @param cBK_IRAI_EMP_CODE
	 */
	public void setCBK_IRAI_EMP_CODE(String cBK_IRAI_EMP_CODE) {
		this.cBK_IRAI_EMP_CODE = cBK_IRAI_EMP_CODE;
	}

	/**
	 * @return ΛΌΜ
	 */
	public String getCBK_IRAI_NAME() {
		return cBK_IRAI_NAME;
	}

	/**
	 * @param cBK_IRAI_NAME
	 */
	public void setCBK_IRAI_NAME(String cBK_IRAI_NAME) {
		this.cBK_IRAI_NAME = cBK_IRAI_NAME;
	}

	/**
	 * @return ΛΌΜΏ
	 */
	public String getCBK_IRAI_NAME_J() {
		return cBK_IRAI_NAME_J;
	}

	/**
	 * @param cBK_IRAI_NAME_J
	 */
	public void setCBK_IRAI_NAME_J(String cBK_IRAI_NAME_J) {
		this.cBK_IRAI_NAME_J = cBK_IRAI_NAME_J;
	}

	/**
	 * @return ΛΌΜpκ
	 */
	public String getCBK_IRAI_NAME_E() {
		return cBK_IRAI_NAME_E;
	}

	/**
	 * @param cBK_IRAI_NAME_E
	 */
	public void setCBK_IRAI_NAME_E(String cBK_IRAI_NAME_E) {
		this.cBK_IRAI_NAME_E = cBK_IRAI_NAME_E;
	}

	/**
	 * @return aΰζͺ
	 */
	public int getCBK_YKN_KBN() {
		return cBK_YKN_KBN;
	}

	/**
	 * @param cBK_YKN_KBN
	 */
	public void setCBK_YKN_KBN(int cBK_YKN_KBN) {
		this.cBK_YKN_KBN = cBK_YKN_KBN;
	}

	/**
	 * @return aΰΤ
	 */
	public String getCBK_YKN_NO() {
		return cBK_YKN_NO;
	}

	/**
	 * @param cBK_YKN_NO
	 */
	public void setCBK_YKN_NO(String cBK_YKN_NO) {
		this.cBK_YKN_NO = cBK_YKN_NO;
	}

	/**
	 * @return ΠΰFBζͺ
	 */
	public int getCBK_EMP_FB_KBN() {
		return cBK_EMP_FB_KBN;
	}

	/**
	 * @param cBK_EMP_FB_KBN
	 */
	public void setCBK_EMP_FB_KBN(int cBK_EMP_FB_KBN) {
		this.cBK_EMP_FB_KBN = cBK_EMP_FB_KBN;
	}

	/**
	 * @return ΠOFBζͺ
	 */
	public int getCBK_OUT_FB_KBN() {
		return cBK_OUT_FB_KBN;
	}

	/**
	 * @param cBK_OUT_FB_KBN
	 */
	public void setCBK_OUT_FB_KBN(int cBK_OUT_FB_KBN) {
		this.cBK_OUT_FB_KBN = cBK_OUT_FB_KBN;
	}

	/**
	 * @return εR[h
	 */
	public String getCBK_DEP_CODE() {
		return cBK_DEP_CODE;
	}

	/**
	 * @param cBK_DEP_CODE
	 */
	public void setCBK_DEP_CODE(String cBK_DEP_CODE) {
		this.cBK_DEP_CODE = cBK_DEP_CODE;
	}

	/**
	 * @return ΘΪR[h
	 */
	public String getCBK_KMK_CODE() {
		return cBK_KMK_CODE;
	}

	/**
	 * @param cBK_KMK_CODE
	 */
	public void setCBK_KMK_CODE(String cBK_KMK_CODE) {
		this.cBK_KMK_CODE = cBK_KMK_CODE;
	}

	/**
	 * @return βR[h
	 */
	public String getCBK_HKM_CODE() {
		return cBK_HKM_CODE;
	}

	/**
	 * @param cBK_HKM_CODE
	 */
	public void setCBK_HKM_CODE(String cBK_HKM_CODE) {
		this.cBK_HKM_CODE = cBK_HKM_CODE;
	}

	/**
	 * @return ΰσR[h
	 */
	public String getCBK_UKM_CODE() {
		return cBK_UKM_CODE;
	}

	/**
	 * @param cBK_UKM_CODE
	 */
	public void setCBK_UKM_CODE(String cBK_UKM_CODE) {
		this.cBK_UKM_CODE = cBK_UKM_CODE;
	}

	/**
	 * @return Jnϊ
	 */
	public Date getSTR_DATE() {
		return sTR_DATE;
	}

	/**
	 * @param sTR_DATE
	 */
	public void setSTR_DATE(Date sTR_DATE) {
		this.sTR_DATE = sTR_DATE;
	}

	/**
	 * @return IΉϊ
	 */
	public Date getEND_DATE() {
		return eND_DATE;
	}

	/**
	 * @param eND_DATE
	 */
	public void setEND_DATE(Date eND_DATE) {
		this.eND_DATE = eND_DATE;
	}

	/**
	 * @return o^ϊ
	 */
	public Date getCBK_INP_DATE() {
		return cBK_INP_DATE;
	}

	/**
	 * @param cBK_INP_DATE
	 */
	public void setCBK_INP_DATE(Date cBK_INP_DATE) {
		this.cBK_INP_DATE = cBK_INP_DATE;
	}

	/**
	 * @return vOID
	 */
	public String getPRG_ID() {
		return pRG_ID;
	}

	/**
	 * @param pRG_ID
	 */
	public void setPRG_ID(String pRG_ID) {
		this.pRG_ID = pRG_ID;
	}

	public Date getINP_DATE() {
		return cBK_INP_DATE;
	}

	public void setINP_DATE(Date iNP_DATE) {
		this.cBK_INP_DATE = iNP_DATE;
	}	
	
	public String toString() {
		StringBuffer buff = new StringBuffer("[");
		buff.append("/kAI_CODE=").append(kAI_CODE);
		buff.append("/cBK_CBK_CODE=").append(cBK_CBK_CODE);
		buff.append("/cBK_NAME=").append(cBK_NAME);
		buff.append("/cUR_CODE=").append(cUR_CODE);
		buff.append("/cBK_BNK_CODE=").append(cBK_BNK_CODE);
		buff.append("/cBK_STN_CODE=").append(cBK_STN_CODE);
		buff.append("/cBK_IRAI_EMP_CODE=").append(cBK_IRAI_EMP_CODE);
		buff.append("/cBK_IRAI_NAME=").append(cBK_IRAI_NAME);
		buff.append("/cBK_IRAI_NAME_J=").append(cBK_IRAI_NAME_J);
		buff.append("/cBK_IRAI_NAME_E=").append(cBK_IRAI_NAME_E);
		buff.append("/cBK_YKN_KBN=").append(cBK_YKN_KBN);
		buff.append("/cBK_YKN_NO=").append(cBK_YKN_NO);
		buff.append("/cBK_EMP_FB_KBN=").append(cBK_EMP_FB_KBN);
		buff.append("/cBK_OUT_FB_KBN=").append(cBK_OUT_FB_KBN);
		buff.append("/cBK_DEP_CODE=").append(cBK_DEP_CODE);
		buff.append("/cBK_KMK_CODE=").append(cBK_KMK_CODE);
		buff.append("/cBK_HKM_CODE=").append(cBK_HKM_CODE);
		buff.append("/cBK_UKM_CODE=").append(cBK_UKM_CODE);
		buff.append("/sTR_DATE=").append(sTR_DATE);
		buff.append("/eND_DATE=").append(eND_DATE);
		buff.append("/cBK_INP_DATE=").append(cBK_INP_DATE);
		buff.append("/uPD_DATE=").append(uPD_DATE);
		buff.append("/pRG_ID=").append(pRG_ID);
		buff.append("/uSR_ID=").append(uSR_ID);
		buff.append("]");
		return buff.toString();
	}

	public List<Object> toObjectArray() {
		List<Object> list = new ArrayList<Object>();

		list.add(kAI_CODE);
		list.add(cBK_CBK_CODE);
		list.add(cBK_NAME);
		list.add(cUR_CODE);
		list.add(cUR_NAME);
		list.add(cBK_BNK_CODE);
		list.add(bNK_NAME_S);
		list.add(cBK_STN_CODE);
		list.add(bNK_STN_NAME_S);
		list.add(cBK_IRAI_EMP_CODE);
		list.add(cBK_IRAI_NAME);
		list.add(cBK_IRAI_NAME_J);
		list.add(cBK_IRAI_NAME_E);
		list.add(cBK_YKN_KBN);
		list.add(cBK_YKN_NO);
		list.add(cBK_EMP_FB_KBN);
		list.add(cBK_OUT_FB_KBN);
		list.add(cBK_DEP_CODE);
		list.add(cBK_KMK_CODE);
		list.add(cBK_HKM_CODE);
		list.add(cBK_UKM_CODE);
		list.add(sTR_DATE);
		list.add(eND_DATE);
		list.add(cBK_INP_DATE);
		list.add(uPD_DATE);
		list.add(pRG_ID);
		list.add(uSR_ID);

		return list;
	}

	/**
	 * @return ΚέR[h
	 */
	public String getCUR_NAME() {
		return cUR_NAME;
	}

	/**
	 * @param cur_name
	 */
	public void setCUR_NAME(String cur_name) {
		cUR_NAME = cur_name;
	}

	/**
	 * @return εΌΜ
	 */
	public String getBNK_NAME_S() {
		return bNK_NAME_S;
	}

	/**
	 * @param bnk_name_s
	 */
	public void setBNK_NAME_S(String bnk_name_s) {
		bNK_NAME_S = bnk_name_s;
	}

	/**
	 * @return xXΌΜ
	 */
	public String getBNK_STN_NAME_S() {
		return bNK_STN_NAME_S;
	}

	/**
	 * @param bnk_stn_name_s
	 */
	public void setBNK_STN_NAME_S(String bnk_stn_name_s) {
		bNK_STN_NAME_S = bnk_stn_name_s;
	}
}
