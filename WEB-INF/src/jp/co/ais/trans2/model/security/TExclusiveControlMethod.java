package jp.co.ais.trans2.model.security;

import jp.co.ais.trans.common.except.TException;

/**
 * 排他制御方法
 * @author AIS
 *
 */
public interface TExclusiveControlMethod {

	/**
	 * 排他する
	 * @throws TException
	 */
	public void exclude() throws TException;

	/**
	 * 排他を解除する
	 * @throws TException
	 */
	public void cancelExclude() throws TException;

}
