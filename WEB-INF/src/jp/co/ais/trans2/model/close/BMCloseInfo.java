package jp.co.ais.trans2.model.close;

import java.util.*;

import jp.co.ais.trans.common.dt.*;

/**
 * XV<br>
 * RΏχίξρBean
 */
public class BMCloseInfo extends TransferBase {

	/** DR[h */
	protected String VESSEL_CODE;

	/** DΌΜ */
	protected String VESSEL_NAME;

	/** ϋνζͺ */
	protected String OIL_TYPE_KBN;

	/** ϋνζͺΌΜ */
	protected String OIL_TYPE_NAME;

	/** `[ϊt */
	protected Date DEN_DATE;

	/**
	 * DR[hζΎ
	 * 
	 * @return DR[h
	 */
	public String getVESSEL_CODE() {
		return this.VESSEL_CODE;
	}

	/**
	 * DR[hέθ
	 * 
	 * @param vESSEL_CODE
	 */
	public void setVESSEL_CODE(String vESSEL_CODE) {
		VESSEL_CODE = vESSEL_CODE;
	}

	/**
	 * DΌΜζΎ
	 * 
	 * @return DΌΜ
	 */
	public String getVESSEL_NAME() {
		return this.VESSEL_NAME;
	}

	/**
	 * DΌΜέθ
	 * 
	 * @param vESSEL_NAME
	 */
	public void setVESSEL_NAME(String vESSEL_NAME) {
		VESSEL_NAME = vESSEL_NAME;
	}


	/**
	 * ϋνζͺζΎ
	 * 
	 * @return ϋνζͺ
	 */
	public String getOIL_TYPE_KBN() {
		return this.OIL_TYPE_KBN;
	}

	/**
	 * ϋνζͺέθ
	 * 
	 * @param oIL_TYPE_KBN
	 */
	public void setOIL_TYPE_KBN(String oIL_TYPE_KBN) {
		OIL_TYPE_KBN = oIL_TYPE_KBN;
	}
/**
	 * ϋνζͺΌΜζΎ
	 * 
	 * @return ϋνζͺΌΜ
	 */
	public String getOIL_TYPE_NAME() {
		return this.OIL_TYPE_NAME;
	}

	/**
	 * ϋνζͺΌΜέθ
	 * 
	 * @param oIL_TYPE_NAME
	 */
	public void setOIL_TYPE_NAME(String oIL_TYPE_NAME) {
		OIL_TYPE_NAME = oIL_TYPE_NAME;
	}

	/**
	 * `[ϊtζΎ
	 * 
	 * @return `[ϊt
	 */
	public Date getDEN_DATE() {
		return this.DEN_DATE;
	}

	/**
	 * `[ϊtέθ
	 * 
	 * @param dEN_DATE
	 */
	public void setDEN_DATE(Date dEN_DATE) {
		DEN_DATE = dEN_DATE;
	}
}
