package jp.co.ais.trans2.model.payment;

import java.sql.*;

import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans2.common.db.*;
import jp.co.ais.trans2.model.*;

/**
 * x¥ûjf[^oDaoÀNX
 */
public class PaymentPolicyDataDaoImpl extends TModel implements PaymentPolicyDataDao {

	/**
	 * x¥ûjf[^õ
	 * 
	 * @throws TException
	 */
	public PaymentPolicy getFolderPass() throws TException {

		Connection conn = DBUtil.getConnection();

		PaymentPolicy bean = createPaymentPolicy();

		try {

			SQLCreator s = new SQLCreator();

			// Jª¶Ýµ½ê

			s.add("SELECT ");
			s.add("  KAI_CODE,");
			s.add("  SHH_FB_PATH,");
			s.add("  SHH_REM_PATH,");
			s.add("  SHH_EMP_FB_PATH");
			s.add("FROM AP_SHH_MST");
			s.add("WHERE  KAI_CODE = ?", getCompanyCode());

			Statement statement = DBUtil.getStatement(conn);
			ResultSet rs = DBUtil.select(statement, s);

			while (rs.next()) {
				bean = mappingPaymentMethod(rs);
			}

		} catch (Exception e) {

			bean.setCompanyCode(getCompanyCode());

		} finally {
			DBUtil.close(conn);
		}

		return bean;
	}

	/**
	 * O/R}bsO
	 * 
	 * @param rs
	 * @return GeBeB
	 * @throws Exception
	 */
	protected PaymentPolicy mappingPaymentMethod(ResultSet rs) throws Exception {

		PaymentPolicy bean = createPaymentPolicy();

		bean.setCompanyCode(rs.getString("KAI_CODE"));
		bean.setFbOutputPath(rs.getString("SHH_FB_PATH"));
		bean.setRemmitanceOutputPath(rs.getString("SHH_REM_PATH"));
		bean.setEmployeeFbOutputPath(rs.getString("SHH_EMP_FB_PATH"));

		return bean;
	}

	/**
	 * x¥ûjf[^õ
	 * 
	 * @throws TException
	 */
	public PaymentPolicy get() throws TException {

		Connection conn = DBUtil.getConnection();

		PaymentPolicy bean = createPaymentPolicy();

		try {

			SQLCreator s = new SQLCreator();

			// Jª¶Ýµ½ê

			s.add("SELECT *");
			s.add("FROM AP_SHH_MST");
			s.add("WHERE  KAI_CODE = ?", getCompanyCode());

			Statement statement = DBUtil.getStatement(conn);
			ResultSet rs = DBUtil.select(statement, s);

			while (rs.next()) {
				bean = mapping(rs);
			}

		} catch (Exception e) {

			bean.setCompanyCode(getCompanyCode());

		} finally {
			DBUtil.close(conn);
		}

		return bean;
	}

	/**
	 * O/R}bsO
	 * 
	 * @param rs
	 * @return GeBeB
	 * @throws Exception
	 */
	protected PaymentPolicy mapping(ResultSet rs) throws Exception {

		PaymentPolicy bean = createPaymentPolicy();

		bean.setCompanyCode(rs.getString("KAI_CODE"));

		bean.setSHH_SIHA_1(rs.getInt("SHH_SIHA_1")); // èx¥iPúj
		bean.setSHH_SIHA_5(rs.getInt("SHH_SIHA_5")); // èx¥iTúj
		bean.setSHH_SIHA_10(rs.getInt("SHH_SIHA_10")); // èx¥i10új
		bean.setSHH_SIHA_15(rs.getInt("SHH_SIHA_15")); // èx¥i15új
		bean.setSHH_SIHA_20(rs.getInt("SHH_SIHA_20")); // èx¥i20új
		bean.setSHH_SIHA_25(rs.getInt("SHH_SIHA_25")); // èx¥i25új
		bean.setSHH_SIHA_30(rs.getInt("SHH_SIHA_30")); // èx¥iúj
		bean.setSHH_BNK_KBN_1(rs.getInt("SHH_BNK_KBN_1")); // âsxúæªi1új
		bean.setSHH_BNK_KBN_5(rs.getInt("SHH_BNK_KBN_5")); // âsxúæªi5új
		bean.setSHH_BNK_KBN_10(rs.getInt("SHH_BNK_KBN_10")); // âsxúæªi10új
		bean.setSHH_BNK_KBN_15(rs.getInt("SHH_BNK_KBN_15")); // âsxúæªi15új
		bean.setSHH_BNK_KBN_20(rs.getInt("SHH_BNK_KBN_20")); // âsxúæªi20új
		bean.setSHH_BNK_KBN_25(rs.getInt("SHH_BNK_KBN_25")); // âsxúæªi25új
		bean.setSHH_BNK_KBN_30(rs.getInt("SHH_BNK_KBN_30")); // âsxúæªiúj
		bean.setSHH_SIHA_MIN(rs.getBigDecimal("SHH_SIHA_MIN")); // x¥ºÀz
		bean.setSHH_FURI_MIN(rs.getBigDecimal("SHH_FURI_MIN")); // Uè¿ºÀz
		bean.setSHH_TESU_KMK_CODE(rs.getString("SHH_TESU_KMK_CODE")); // è¿ÈÚR[h
		bean.setSHH_TESU_HKM_CODE(rs.getString("SHH_TESU_HKM_CODE")); // è¿âÈÚR[h
		bean.setSHH_TESU_UKM_CODE(rs.getString("SHH_TESU_UKM_CODE")); // è¿àóÈÚR[h
		bean.setSHH_TESU_DEP_CODE(rs.getString("SHH_TESU_DEP_CODE")); // è¿vãåR[h
		bean.setSHH_TESU_ZEI_CODE(rs.getString("SHH_TESU_ZEI_CODE")); // è¿ÁïÅR[h
		bean.setSHH_GS_PRINT_KBN(rs.getString("SHH_GS_PRINT_KBN")); // Oàì¬tO
		bean.setSHH_SEI_NO_KBN(rs.getString("SHH_SEI_NO_KBN")); // ¿ÔtO

		bean.setFbOutputPath(rs.getString("SHH_FB_PATH"));
		bean.setRemmitanceOutputPath(rs.getString("SHH_REM_PATH"));
		bean.setEmployeeFbOutputPath(rs.getString("SHH_EMP_FB_PATH"));

		return bean;
	}

	/**
	 * @return GeBeB
	 */
	protected PaymentPolicy createPaymentPolicy() {
		return new PaymentPolicy();
	}

}