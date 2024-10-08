package jp.co.ais.trans2.model.user;

import java.util.Date;
import jp.co.ais.trans.common.dt.TransferBase;

/**
 * ロール部門開示レベル
 * 
 * @author AIS
 */
public class RoleDepartmentLevel extends TransferBase {

	/** 会社コード */
	protected String companyCode;

	/** ロールコード */
	protected String roleCode;

	/** 部門コード */
	protected String depCode;

	/** 部門区分 */
	protected Integer DepDivision;

	/** 登録日付 */
	protected Date inpDate;

	/** 更新日付 */
	protected Date updDate;

	/** プログラムID */
	protected String prgId;

	/** ユーザーID */
	protected String usrId;

	/**
	 * companyCodeを取得する。
	 * 
	 * @return String companyCode
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * companyCodeを設定する。
	 * 
	 * @param companyCode
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	/**
	 * depCodeを取得する。
	 * 
	 * @return String depCode
	 */
	public String getDepCode() {
		return depCode;
	}

	/**
	 * depCodeを設定する。
	 * 
	 * @param depCode
	 */
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	/**
	 * depDivisionを取得する。
	 * 
	 * @return Integer depDivision
	 */
	public Integer getDepDivision() {
		return DepDivision;
	}

	/**
	 * depDivisionを設定する。
	 * 
	 * @param depDivision
	 */
	public void setDepDivision(Integer depDivision) {
		DepDivision = depDivision;
	}

	/**
	 * inpDateを取得する。
	 * 
	 * @return Date inpDate
	 */
	public Date getInpDate() {
		return inpDate;
	}

	/**
	 * inpDateを設定する。
	 * 
	 * @param inpDate
	 */
	public void setInpDate(Date inpDate) {
		this.inpDate = inpDate;
	}

	/**
	 * prgIdを取得する。
	 * 
	 * @return String prgId
	 */
	public String getPrgId() {
		return prgId;
	}

	/**
	 * prgIdを設定する。
	 * 
	 * @param prgId
	 */
	public void setPrgId(String prgId) {
		this.prgId = prgId;
	}

	/**
	 * roleCodeを取得する。
	 * 
	 * @return String roleCode
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * roleCodeを設定する。
	 * 
	 * @param roleCode
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	/**
	 * updDateを取得する。
	 * 
	 * @return Date updDate
	 */
	public Date getUpdDate() {
		return updDate;
	}

	/**
	 * updDateを設定する。
	 * 
	 * @param updDate
	 */
	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	/**
	 * usrIdを取得する。
	 * 
	 * @return String usrId
	 */
	public String getUsrId() {
		return usrId;
	}

	/**
	 * usrIdを設定する。
	 * 
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

}
