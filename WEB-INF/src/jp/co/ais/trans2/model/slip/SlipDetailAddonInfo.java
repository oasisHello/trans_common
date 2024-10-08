package jp.co.ais.trans2.model.slip;

import java.math.*;
import java.util.*;

import jp.co.ais.trans.common.dt.*;
import jp.co.ais.trans.common.util.*;

/**
 * `[ΗΑξρ
 */
public class SlipDetailAddonInfo extends TransferBase {

	/**
	 * ΆρoΝ
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(map);
		return sb.toString();
	}

	/** }bv(L[, l) */
	protected Map<String, Object> map;

	/** true:TZAfalse:ΐΡ */
	public static final String KEY_ESTIMATE_FLAG = "estimateFlag";

	/** έ¨R[h(CARGO) */
	public static final String KEY_CARGO_CODE = "cargoCode";

	/** έ¨ΌΜ(CARGO) */
	public static final String KEY_CARGO_NAME = "cargoName";

	/** ΧεR[h(CARGO) */
	public static final String KEY_CHTR_CODE = "chtrCode";

	/** ϊΤFROMJnϊ */
	public static final String KEY_PERIOD_FROM = "periodFrom";

	/** ϊΤTOIΉϊ */
	public static final String KEY_PERIOD_TO = "periodTo";

	/** ϊΤϊ(FROM-TO)¬_ΘΊ5(9,5) */
	public static final String KEY_DURATION = "duration";

	/** VC_ρUID */
	public static final String KEY_VCC_UID = "vccUID";

	/** VC_ρΤ */
	public static final String KEY_VCC_CTRT_NO = "vccContractNo";

	/** TC_ρUID */
	public static final String KEY_TCC_UID = "tccUID";

	/** TC_ρΤ */
	public static final String KEY_TCC_CTRT_NO = "tccContractNo";

	/** qC^Cv */
	public static final String KEY_VOY_TYPE = "voyType";

	/** ^ΐΚ */
	public static final String KEY_FRT_QTY = "frtQty";

	/** ΚPΚR[h */
	public static final String KEY_FRT_QTY_UNIT_CODE = "frtQtyUnitCode";

	/** ϋνR[h */
	public static final String KEY_BUNKER_TYPE_CODE = "bunkerTypeCode";

	/** RΏΚ */
	public static final String KEY_BUNKER_QTY = "bunkerQty";

	/** RΏPΏ */
	public static final String KEY_BUNKER_PRICE = "bunkerPrice";

	/** RΏβϋϊ */
	public static final String KEY_BUNKER_SUPPLY_DATE = "bunkerSupplyDate";

	/** RΏβϋζ */
	public static final String KEY_BUNKER_SUPPLIER_CODE = "bunkerSupplierCode";

	/** VOY_UID */
	public static final String KEY_VOY_UID = "voyUID";

	/**
	 * RXgN^[
	 */
	public SlipDetailAddonInfo() {
		map = new HashMap<String, Object>();
	}

	/**
	 * έθ·ι<L[, l>
	 * 
	 * @param key
	 * @param value
	 */
	public void setValue(String key, Object value) {
		map.put(key, value);
	}

	/**
	 * έθlπζΎ·ι
	 * 
	 * @param key
	 * @return l
	 */
	public Object getValue(String key) {
		return map.get(key);
	}

	/**
	 * έθlπζΎ·ι(Άρ[h)
	 * 
	 * @param key
	 * @return l
	 */
	public String getString(String key) {
		Object obj = map.get(key);
		return Util.avoidNull(obj);
	}

	/**
	 * έθlπζΎ·ι(Άρ[h)
	 * 
	 * @param key
	 * @return l
	 */
	public BigDecimal getNumber(String key) {
		String str = getString(key);

		if (!Util.isNumber(str)) {
			return null;
		}

		return DecimalUtil.toBigDecimalNULL(str);
	}

	/**
	 * true:TZAfalse:ΐΡΜζΎ
	 * 
	 * @return estimateFlag true:TZAfalse:ΐΡ
	 */
	public Boolean getEstimateFlag() {
		return (Boolean) getValue(KEY_ESTIMATE_FLAG);
	}

	/**
	 * true:TZAfalse:ΐΡΜέθ
	 * 
	 * @param estimateFlag true:TZAfalse:ΐΡ
	 */
	public void setEstimateFlag(Boolean estimateFlag) {
		setValue(KEY_ESTIMATE_FLAG, estimateFlag);
	}

	/**
	 * έ¨R[h(CARGO)ΜζΎ
	 * 
	 * @return cargoCode έ¨R[h(CARGO)
	 */
	public String getCargoCode() {
		return (String) getValue(KEY_CARGO_CODE);
	}

	/**
	 * έ¨R[h(CARGO)Μέθ
	 * 
	 * @param cargoCode έ¨R[h(CARGO)
	 */
	public void setCargoCode(String cargoCode) {
		setValue(KEY_CARGO_CODE, cargoCode);
	}

	/**
	 * έ¨ΌΜ(CARGO)ΜζΎ
	 * 
	 * @return cargoName έ¨ΌΜ(CARGO)
	 */
	public String getCargoName() {
		return (String) getValue(KEY_CARGO_NAME);
	}

	/**
	 * έ¨ΌΜ(CARGO)Μέθ
	 * 
	 * @param cargoName έ¨ΌΜ(CARGO)
	 */
	public void setCargoName(String cargoName) {
		setValue(KEY_CARGO_NAME, cargoName);
	}

	/**
	 * ΧεR[h(VCC CHTR)ΜζΎ
	 * 
	 * @return chtrCode ΧεR[h(VCC CHTR)
	 */
	public String getChtrCode() {
		return (String) getValue(KEY_CHTR_CODE);
	}

	/**
	 * ΧεR[h(VCC CHTR)Μέθ
	 * 
	 * @param chtrCode ΧεR[h(VCC CHTR)
	 */
	public void setChtrCode(String chtrCode) {
		setValue(KEY_CHTR_CODE, chtrCode);
	}

	/**
	 * ϊΤFROMJnϊΜζΎ
	 * 
	 * @return periodFrom ϊΤFROMJnϊ
	 */
	public Date getPeriodFrom() {
		return (Date) getValue(KEY_PERIOD_FROM);
	}

	/**
	 * ϊΤFROMJnϊΜέθ
	 * 
	 * @param periodFrom ϊΤFROMJnϊ
	 */
	public void setPeriodFrom(Date periodFrom) {
		setValue(KEY_PERIOD_FROM, periodFrom);
	}

	/**
	 * ϊΤTOIΉϊΜζΎ
	 * 
	 * @return periodTo ϊΤTOIΉϊ
	 */
	public Date getPeriodTo() {
		return (Date) getValue(KEY_PERIOD_TO);
	}

	/**
	 * ϊΤTOIΉϊΜέθ
	 * 
	 * @param periodTo ϊΤTOIΉϊ
	 */
	public void setPeriodTo(Date periodTo) {
		setValue(KEY_PERIOD_TO, periodTo);
	}

	/**
	 * ϊΤϊ(FROM-TO)¬_ΘΊ5(9,5)ΜζΎ
	 * 
	 * @return duration ϊΤϊ(FROM-TO)¬_ΘΊ5(9,5)
	 */
	public BigDecimal getDuration() {
		return (BigDecimal) getValue(KEY_DURATION);
	}

	/**
	 * ϊΤϊ(FROM-TO)¬_ΘΊ5(9,5)Μέθ
	 * 
	 * @param duration ϊΤϊ(FROM-TO)¬_ΘΊ5(9,5)
	 */
	public void setDuration(BigDecimal duration) {
		setValue(KEY_DURATION, duration);
	}

	/**
	 * VC_ρUIDΜζΎ
	 * 
	 * @return vccUID VC_ρUID
	 */
	public String getVccUID() {
		return (String) getValue(KEY_VCC_UID);
	}

	/**
	 * VC_ρUIDΜέθ
	 * 
	 * @param vccUID VC_ρUID
	 */
	public void setVccUID(String vccUID) {
		setValue(KEY_VCC_UID, vccUID);
	}

	/**
	 * VC_ρΤΜζΎ
	 * 
	 * @return vccContractNo VC_ρΤ
	 */
	public String getVccContractNo() {
		return (String) getValue(KEY_VCC_CTRT_NO);
	}

	/**
	 * VC_ρΤΜέθ
	 * 
	 * @param vccContractNo VC_ρΤ
	 */
	public void setVccContractNo(String vccContractNo) {
		setValue(KEY_VCC_CTRT_NO, vccContractNo);
	}

	/**
	 * TC_ρUIDΜζΎ
	 * 
	 * @return tccContractNo TC_ρΤ
	 */
	public String getTccUID() {
		return (String) getValue(KEY_TCC_UID);
	}

	/**
	 * TC_ρUIDΜέθ
	 * 
	 * @param tccUID TC_ρUID
	 */
	public void setTccUID(String tccUID) {
		setValue(KEY_TCC_UID, tccUID);
	}

	/**
	 * TC_ρΤΜζΎ
	 * 
	 * @return tccContractNo TC_ρΤ
	 */
	public String getTccContractNo() {
		return (String) getValue(KEY_TCC_CTRT_NO);
	}

	/**
	 * TC_ρΤΜέθ
	 * 
	 * @param tccContractNo TC_ρΤ
	 */
	public void setTccContractNo(String tccContractNo) {
		setValue(KEY_TCC_CTRT_NO, tccContractNo);
	}

	/**
	 * qC^CvΜζΎ
	 * 
	 * @return voyType qC^Cv
	 */
	public String getVoyType() {
		return (String) getValue(KEY_VOY_TYPE);
	}

	/**
	 * qC^CvΜέθ
	 * 
	 * @param voyType qC^Cv
	 */
	public void setVoyType(String voyType) {
		setValue(KEY_VOY_TYPE, voyType);
	}

	/**
	 * ^ΐΚΜζΎ
	 * 
	 * @return frtQty ^ΐΚ
	 */
	public BigDecimal getFrtQty() {
		return (BigDecimal) getValue(KEY_FRT_QTY);
	}

	/**
	 * ^ΐΚΜέθ
	 * 
	 * @param frtQty ^ΐΚ
	 */
	public void setFrtQty(BigDecimal frtQty) {
		setValue(KEY_FRT_QTY, frtQty);
	}

	/**
	 * ΚPΚR[hΜζΎ
	 * 
	 * @return frtQtyUnitCode ΚPΚR[h
	 */
	public String getFrtQtyUnitCode() {
		return (String) getValue(KEY_FRT_QTY_UNIT_CODE);
	}

	/**
	 * ΚPΚR[hΜέθ
	 * 
	 * @param frtQtyUnitCode ΚPΚR[h
	 */
	public void setFrtQtyUnitCode(String frtQtyUnitCode) {
		setValue(KEY_FRT_QTY_UNIT_CODE, frtQtyUnitCode);
	}

	/**
	 * ϋνR[hΜζΎ
	 * 
	 * @return bunkerTypeCode ϋνR[h
	 */
	public String getBunkerTypeCode() {
		return (String) getValue(KEY_BUNKER_TYPE_CODE);
	}

	/**
	 * ϋνR[hΜέθ
	 * 
	 * @param bunkerTypeCode ϋνR[h
	 */
	public void setBunkerTypeCode(String bunkerTypeCode) {
		setValue(KEY_BUNKER_TYPE_CODE, bunkerTypeCode);
	}

	/**
	 * RΏΚΜζΎ
	 * 
	 * @return bunkerQty RΏΚ
	 */
	public BigDecimal getBunkerQty() {
		return (BigDecimal) getValue(KEY_BUNKER_QTY);
	}

	/**
	 * RΏΚΜέθ
	 * 
	 * @param bunkerQty RΏΚ
	 */
	public void setBunkerQty(BigDecimal bunkerQty) {
		setValue(KEY_BUNKER_QTY, bunkerQty);
	}

	/**
	 * RΏPΏΜζΎ
	 * 
	 * @return bunkerPrice RΏPΏ
	 */
	public BigDecimal getBunkerPrice() {
		return (BigDecimal) getValue(KEY_BUNKER_PRICE);
	}

	/**
	 * RΏPΏΜέθ
	 * 
	 * @param bunkerPrice RΏPΏ
	 */
	public void setBunkerPrice(BigDecimal bunkerPrice) {
		setValue(KEY_BUNKER_PRICE, bunkerPrice);
	}

	/**
	 * RΏβϋϊΜζΎ
	 * 
	 * @return bunkerSupplyDate RΏβϋϊ
	 */
	public Date getBunkerSupplyDate() {
		return (Date) getValue(KEY_BUNKER_SUPPLY_DATE);
	}

	/**
	 * RΏβϋϊΜέθ
	 * 
	 * @param bunkerSupplyDate RΏβϋϊ
	 */
	public void setBunkerSupplyDate(Date bunkerSupplyDate) {
		setValue(KEY_BUNKER_SUPPLY_DATE, bunkerSupplyDate);
	}

	/**
	 * RΏβϋζΜζΎ
	 * 
	 * @return bunkerSupplier RΏβϋζ
	 */
	public String getBunkerSupplierCode() {
		return (String) getValue(KEY_BUNKER_SUPPLIER_CODE);
	}

	/**
	 * RΏβϋζΜέθ
	 * 
	 * @param bunkerSupplierCode RΏβϋζ
	 */
	public void setBunkerSupplierCode(String bunkerSupplierCode) {
		setValue(KEY_BUNKER_SUPPLIER_CODE, bunkerSupplierCode);
	}

	/**
	 * qCUIDΜζΎ
	 * 
	 * @return voyUID qCUID
	 */
	public String getVoyUID() {
		return (String) getValue(KEY_VOY_UID);
	}

	/**
	 * qCUIDΜέθ
	 * 
	 * @param voyUID qCUID
	 */
	public void setVoyUID(String voyUID) {
		setValue(KEY_VOY_UID, voyUID);
	}

}
