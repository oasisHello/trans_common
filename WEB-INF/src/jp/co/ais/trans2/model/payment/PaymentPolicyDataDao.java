package jp.co.ais.trans2.model.payment;

import jp.co.ais.trans.common.except.*;

/**
 * x¥ûjf[^oDao
 */
public interface PaymentPolicyDataDao {

	/**
	 * x¥ûj}X^ÌFBf[^oÍæõ
	 * 
	 * @return x¥ûj}X^FBf[^oÍæîñ
	 * @throws TException
	 */
	public PaymentPolicy getFolderPass() throws TException;

	/**
	 * x¥ûj}X^Ìõ
	 * 
	 * @return x¥ûj}X^îñ
	 * @throws TException
	 */
	public PaymentPolicy get() throws TException;
}