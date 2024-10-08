package jp.co.ais.trans2.model.slip;

import java.math.*;
import java.util.*;

import jp.co.ais.trans2.common.ledger.*;

/**
 * `[ [tb^[
 * 
 * @author AIS
 */
public class SlipBookFooter extends LedgerSheetFooter {

	/** ΨϋMέv */
	protected BigDecimal debitAmount = null;

	/** έϋMέv */
	protected BigDecimal creditAmount = null;

	/** ¬_ */
	protected int decimalPoint = 0;

	/** ΨϋOέv */
	protected List<BigDecimal> foreignDebitAmountList = new ArrayList<BigDecimal>();

	/** έϋOέv */
	protected List<BigDecimal> foreignCreditAmountList = new ArrayList<BigDecimal>();

	/** Oέ */
	protected List<String> foreignCurrencyCodeList = new ArrayList<String>();

	/** OέΜ¬_ */
	protected List<Integer> foreignDecimalPointList = new ArrayList<Integer>();

	/** Oέ */
	protected int maxForeignCurrencyCount = 10;

	/**
	 * RXgN^[
	 */
	public SlipBookFooter() {
		for (int i = 0; i < getMaxForeignCurrencyCount(); i++) {
			foreignDebitAmountList.add(null);
			foreignCreditAmountList.add(null);
			foreignCurrencyCodeList.add(null);
			foreignDecimalPointList.add(0);
		}
	}

	/**
	 * ΨϋMέvΜζΎ
	 * 
	 * @return debitAmount ΨϋMέv
	 */
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}

	/**
	 * ΨϋMέvΜέθ
	 * 
	 * @param debitAmount ΨϋMέv
	 */
	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}

	/**
	 * έϋMέvΜζΎ
	 * 
	 * @return creditAmount έϋMέv
	 */
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	/**
	 * έϋMέvΜέθ
	 * 
	 * @param creditAmount έϋMέv
	 */
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	/**
	 * ¬_ΜζΎ
	 * 
	 * @return decimalPoint ¬_
	 */
	public int getDecimalPoint() {
		return decimalPoint;
	}

	/**
	 * ¬_Μέθ
	 * 
	 * @param decimalPoint ¬_
	 */
	public void setDecimalPoint(int decimalPoint) {
		this.decimalPoint = decimalPoint;
	}

	/**
	 * ΨϋOέ1vΜζΎ
	 * 
	 * @return foreignDebitAmount1 ΨϋOέ1v
	 */
	public BigDecimal getForeignDebitAmount1() {
		return getForeignDebitAmount(0);
	}

	/**
	 * ΨϋOέ1vΜέθ
	 * 
	 * @param foreignDebitAmount1 ΨϋOέ1v
	 */
	public void setForeignDebitAmount1(BigDecimal foreignDebitAmount1) {
		setForeignDebitAmount(0, foreignDebitAmount1);
	}

	/**
	 * έϋOέ1vΜζΎ
	 * 
	 * @return foreignCreditAmount1 έϋOέ1v
	 */
	public BigDecimal getForeignCreditAmount1() {
		return getForeignCreditAmount(0);
	}

	/**
	 * έϋOέ1vΜέθ
	 * 
	 * @param foreignCreditAmount1 έϋOέ1v
	 */
	public void setForeignCreditAmount1(BigDecimal foreignCreditAmount1) {
		setForeignCreditAmount(0, foreignCreditAmount1);
	}

	/**
	 * Oέ1ΜζΎ
	 * 
	 * @return foreignCurrencyCode1 Oέ1
	 */
	public String getForeignCurrencyCode1() {
		return getForeignCurrencyCode(0);
	}

	/**
	 * Oέ1Μέθ
	 * 
	 * @param foreignCurrencyCode1 Oέ1
	 */
	public void setForeignCurrencyCode1(String foreignCurrencyCode1) {
		setForeignCurrencyCode(0, foreignCurrencyCode1);
	}

	/**
	 * Oέ1Μ¬_ΜζΎ
	 * 
	 * @return foreignDecimalPoint1 Oέ1Μ¬_
	 */
	public int getForeignDecimalPoint1() {
		return getForeignDecimalPoint(0);
	}

	/**
	 * Oέ1Μ¬_Μέθ
	 * 
	 * @param foreignDecimalPoint1 Oέ1Μ¬_
	 */
	public void setForeignDecimalPoint1(int foreignDecimalPoint1) {
		setForeignDecimalPoint(0, foreignDecimalPoint1);
	}

	/**
	 * ΨϋOέ2vΜζΎ
	 * 
	 * @return foreignDebitAmount2 ΨϋOέ2v
	 */
	public BigDecimal getForeignDebitAmount2() {
		return getForeignDebitAmount(1);
	}

	/**
	 * ΨϋOέ2vΜέθ
	 * 
	 * @param foreignDebitAmount2 ΨϋOέ2v
	 */
	public void setForeignDebitAmount2(BigDecimal foreignDebitAmount2) {
		setForeignDebitAmount(1, foreignDebitAmount2);
	}

	/**
	 * έϋOέ2vΜζΎ
	 * 
	 * @return foreignCreditAmount2 έϋOέ2v
	 */
	public BigDecimal getForeignCreditAmount2() {
		return getForeignCreditAmount(1);
	}

	/**
	 * έϋOέ2vΜέθ
	 * 
	 * @param foreignCreditAmount2 έϋOέ2v
	 */
	public void setForeignCreditAmount2(BigDecimal foreignCreditAmount2) {
		setForeignCreditAmount(1, foreignCreditAmount2);
	}

	/**
	 * Oέ2ΜζΎ
	 * 
	 * @return foreignCurrencyCode2 Oέ2
	 */
	public String getForeignCurrencyCode2() {
		return getForeignCurrencyCode(1);
	}

	/**
	 * Oέ2Μέθ
	 * 
	 * @param foreignCurrencyCode2 Oέ2
	 */
	public void setForeignCurrencyCode2(String foreignCurrencyCode2) {
		setForeignCurrencyCode(1, foreignCurrencyCode2);
	}

	/**
	 * Oέ2Μ¬_ΜζΎ
	 * 
	 * @return foreignDecimalPoint2 Oέ2Μ¬_
	 */
	public int getForeignDecimalPoint2() {
		return getForeignDecimalPoint(1);
	}

	/**
	 * Oέ2Μ¬_Μέθ
	 * 
	 * @param foreignDecimalPoint2 Oέ2Μ¬_
	 */
	public void setForeignDecimalPoint2(int foreignDecimalPoint2) {
		setForeignDecimalPoint(1, foreignDecimalPoint2);
	}

	/**
	 * ΨϋOέindexvΜζΎ
	 * 
	 * @param index
	 * @return foreignDebitAmount ΨϋOέindexv
	 */
	public BigDecimal getForeignDebitAmount(int index) {
		return foreignDebitAmountList.get(index);
	}

	/**
	 * ΨϋOέindexvΜέθ
	 * 
	 * @param index
	 * @param foreignDebitAmount ΨϋOέindexv
	 */
	public void setForeignDebitAmount(int index, BigDecimal foreignDebitAmount) {
		this.foreignDebitAmountList.set(index, foreignDebitAmount);
	}

	/**
	 * έϋOέindexvΜζΎ
	 * 
	 * @param index
	 * @return foreignCreditAmount έϋOέindexv
	 */
	public BigDecimal getForeignCreditAmount(int index) {
		return foreignCreditAmountList.get(index);
	}

	/**
	 * έϋOέindexvΜέθ
	 * 
	 * @param index
	 * @param foreignCreditAmount έϋOέindexv
	 */
	public void setForeignCreditAmount(int index, BigDecimal foreignCreditAmount) {
		this.foreignCreditAmountList.set(index, foreignCreditAmount);
	}

	/**
	 * OέΜζΎ
	 * 
	 * @param index
	 * @return foreignCurrencyCode Oέ
	 */
	public String getForeignCurrencyCode(int index) {
		return foreignCurrencyCodeList.get(index);
	}

	/**
	 * OέΜέθ
	 * 
	 * @param index
	 * @param foreignCurrencyCode Oέ
	 */
	public void setForeignCurrencyCode(int index, String foreignCurrencyCode) {
		this.foreignCurrencyCodeList.set(index, foreignCurrencyCode);
	}

	/**
	 * OέΜ¬_ΜζΎ
	 * 
	 * @param index
	 * @return foreignDecimalPoint2 OέΜ¬_
	 */
	public int getForeignDecimalPoint(int index) {
		return foreignDecimalPointList.get(index);
	}

	/**
	 * OέΜ¬_Μέθ
	 * 
	 * @param index
	 * @param foreignDecimalPoint OέΜ¬_
	 */
	public void setForeignDecimalPoint(int index, int foreignDecimalPoint) {
		this.foreignDecimalPointList.set(index, foreignDecimalPoint);
	}

	/**
	 * ΨϋOέvΜζΎ
	 * 
	 * @return foreignDebitAmountList ΨϋOέv
	 */
	public List<BigDecimal> getForeignDebitAmountList() {
		return foreignDebitAmountList;
	}

	/**
	 * ΨϋOέvΜέθ
	 * 
	 * @param foreignDebitAmountList ΨϋOέv
	 */
	public void setForeignDebitAmountList(List<BigDecimal> foreignDebitAmountList) {
		this.foreignDebitAmountList = foreignDebitAmountList;
	}

	/**
	 * έϋOέvΜζΎ
	 * 
	 * @return foreignCreditAmountList έϋOέv
	 */
	public List<BigDecimal> getForeignCreditAmountList() {
		return foreignCreditAmountList;
	}

	/**
	 * έϋOέvΜέθ
	 * 
	 * @param foreignCreditAmountList έϋOέv
	 */
	public void setForeignCreditAmountList(List<BigDecimal> foreignCreditAmountList) {
		this.foreignCreditAmountList = foreignCreditAmountList;
	}

	/**
	 * OέΜζΎ
	 * 
	 * @return foreignCurrencyCodeList Oέ
	 */
	public List<String> getForeignCurrencyCodeList() {
		return foreignCurrencyCodeList;
	}

	/**
	 * OέΜέθ
	 * 
	 * @param foreignCurrencyCodeList Oέ
	 */
	public void setForeignCurrencyCodeList(List<String> foreignCurrencyCodeList) {
		this.foreignCurrencyCodeList = foreignCurrencyCodeList;
	}

	/**
	 * OέΜ¬_ΜζΎ
	 * 
	 * @return foreignDecimalPointList OέΜ¬_
	 */
	public List<Integer> getForeignDecimalPointList() {
		return foreignDecimalPointList;
	}

	/**
	 * OέΜ¬_Μέθ
	 * 
	 * @param foreignDecimalPointList OέΜ¬_
	 */
	public void setForeignDecimalPointList(List<Integer> foreignDecimalPointList) {
		this.foreignDecimalPointList = foreignDecimalPointList;
	}

	/**
	 * OέΜζΎ
	 * 
	 * @return maxForeignCurrencyCount Oέ
	 */
	public int getMaxForeignCurrencyCount() {
		return maxForeignCurrencyCount;
	}

	/**
	 * OέΜέθ
	 * 
	 * @param maxForeignCurrencyCount Oέ
	 */
	public void setMaxForeignCurrencyCount(int maxForeignCurrencyCount) {
		this.maxForeignCurrencyCount = maxForeignCurrencyCount;
	}

}