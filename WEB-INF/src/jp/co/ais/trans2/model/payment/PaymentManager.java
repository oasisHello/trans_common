package jp.co.ais.trans2.model.payment;

import java.util.*;
import jp.co.ais.trans2.define.*;

/**
 * x¥}l[W[
 * 
 * @author AIS
 */
public interface PaymentManager {

	/**
	 * x¥Â\ú©Ç¤©
	 * 
	 * @param paymentDateType x¥æª
	 * @param payDate x¥ú
	 * @return trueFx¥Â\ú
	 */
	public boolean isPaymentDate(PaymentDateType paymentDateType, Date payDate);

	/**
	 * x¥úÌæ¾
	 * 
	 * @param bean x¥ð}X^
	 * @param baseDate îú
	 * @return x¥ú
	 */
	public Date getPaymentDate(PaymentSetting bean, Date baseDate);

}
