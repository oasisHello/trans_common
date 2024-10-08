package jp.co.ais.trans2.model.exclusive;

import java.util.*;

import jp.co.ais.trans.common.except.*;

/**
 * 排他明細検索を制御するクラス
 */
public interface ExclusiveDetailManager {

	/**
	 * 排他明細を検索する.
	 * 
	 * @return 排他明細一覧
	 * @throws TException
	 */
	public List<ExclusiveDetail> get() throws TException;

	/**
	 * 排他明細一覧(エクセル)を返す
	 * 
	 * @return 排他明細一覧
	 * @throws TException
	 */
	public byte[] getExcel() throws TException;

}
