package jp.co.ais.trans2.model.tag;

import java.util.*;

import jp.co.ais.trans.common.except.*;

/**
 * MG0460TagMaster - tâ³}X^ - Interface Class
 * 
 * @author AIS
 */
public interface TagManager {

	/**
	 * îñõ (SELECT)
	 * 
	 * @param condition õğ
	 * @return Tag tâ³}X^
	 * @throws TException
	 */
	public List<Tag> get(TagSearchCondition condition) throws TException;

	/**
	 * îño^ (INSERT)
	 * 
	 * @param bean üÍîñ
	 * @throws TException
	 */
	public void entry(Tag bean) throws TException;

	/**
	 * îñC³ (UPDATE)
	 * 
	 * @param bean üÍîñ
	 * @throws TException
	 */
	public void modify(Tag bean) throws TException;

	/**
	 * îñí (DELETE)
	 * 
	 * @param bean Iğîñ
	 * @throws TException
	 */
	public void delete(Tag bean) throws TException;
}