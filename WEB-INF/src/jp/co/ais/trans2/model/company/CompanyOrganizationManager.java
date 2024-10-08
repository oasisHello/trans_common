package jp.co.ais.trans2.model.company;

import java.util.*;

import jp.co.ais.trans.common.except.*;

/**
 * 会社コントロールマスタ
 * 
 * @author AIS
 */
public interface CompanyOrganizationManager {

	/**
	 * 指定条件に該当する会社情報を返す。
	 * 
	 * @param condition 検索条件
	 * @return 指定条件に該当する会社情報
	 * @throws TException
	 */
	public List<Company> get(CompanySearchCondition condition) throws TException;

	/**
	 * 指定条件に該当する会社組織情報を返す
	 * 
	 * @param condition 検索条件
	 * @return 指定条件に該当する会社組織情報
	 * @throws TException
	 */
	public List<CompanyOrganization> getCompanyOrganization(CompanyOrganizationSearchCondition condition)
		throws TException;

	/**
	 * 指定条件に該当する会社組織情報を返す
	 * 
	 * @param condition 検索条件
	 * @return 指定条件に該当する会社組織情報(会社階層マスタ用)
	 * @throws TException
	 */
	public List<CompanyOrganization> getCompanyOrganizationData(CompanyOrganizationSearchCondition condition)
		throws TException;

	/**
	 * 指定条件に該当する会社組織情報を返す
	 * 
	 * @param condition 検索条件
	 * @return 指定条件に該当する会社組織情報(会社階層マスタ用)
	 * @throws TException
	 */
	public CompanyOrganization getCompanyOrganizationName(CompanyOrganizationSearchCondition condition)
		throws TException;

	/**
	 * 会社階層名称を登録する。
	 * 
	 * @param bean
	 * @throws TException
	 */
	public void entryCompanyNameOrganization(CompanyOrganization bean) throws TException;

	/**
	 * 会社階層LEVEL0登録(新規)
	 * 
	 * @param bean
	 * @throws TException
	 */
	public void entryCompanyOrganization(CompanyOrganization bean) throws TException;

	/**
	 * 会社階層削除
	 * 
	 * @param bean
	 * @throws TException
	 */
	public void deleteCompanyOrganization(CompanyOrganization bean) throws TException;

	/**
	 * 会社階層名称一覧をエクセル形式で返す
	 * 
	 * @param condition 検索条件
	 * @return エクセル形式の部門階層一覧
	 * @throws TException
	 */
	public byte[] getCompanyOrganizationNameExcel(CompanyOrganizationSearchCondition condition) throws TException;

	/**
	 * 会社階層を登録する。
	 * 
	 * @param sskCode
	 * @param sskName
	 * @param list 会社階層
	 * @throws TException
	 */
	public void entryCompanyOrganization(String sskCode, String sskName, List<CompanyOrganization> list)
		throws TException;

	/**
	 * 指定条件に該当する会社情報を返す。
	 * 
	 * @param condition 検索条件
	 * @return 指定条件に該当する会社情報
	 * @throws TException
	 */
	public List<String> getCompanyCodeList(CompanyOutputCondition condition) throws TException;

}
