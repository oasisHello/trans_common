package jp.co.ais.trans2.model.security;

import jp.co.ais.trans.common.except.TException;

/**
 * ログに関するDao
 * @author AIS
 *
 */
public interface LogDao {

	/**
	 * ログを登録する
	 * @param log
	 * @throws TException
	 */
	public void entry(Log log) throws TException;

}
