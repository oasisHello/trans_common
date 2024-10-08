package jp.co.ais.trans2.model.financial;

import java.math.*;

import jp.co.ais.trans.common.util.*;

/**
 * à±¤ÊÖ
 * 
 * @author AIS YF.CONG
 */
public class FinancialUtil {

	/**
	 * PMTÌvZ<br>
	 * «¿l=0dAftHg:I¹ú
	 * 
	 * @param numRate ¦
	 * @param nPeriod ú
	 * @param numNow »Ý¿l
	 * @return PMT
	 */
	public static double pmt(BigDecimal numRate, int nPeriod, BigDecimal numNow) {
		double rate = DecimalUtil.avoidNull(numRate).doubleValue();
		double now = DecimalUtil.avoidNull(numNow).negate().doubleValue();

		return pmt(rate, nPeriod, now, 0d, true);
	}

	/**
	 * PPMTÌvZ<br>
	 * «¿l=0dAftHg:I¹ú
	 * 
	 * @param numRate ¦
	 * @param period »ÝúÔ
	 * @param nPeriod ú
	 * @param numNow »Ý¿l
	 * @return PPMT
	 */
	public static double ppmt(BigDecimal numRate, int period, int nPeriod, BigDecimal numNow) {
		double rate = DecimalUtil.avoidNull(numRate).doubleValue();
		double now = DecimalUtil.avoidNull(numNow).negate().doubleValue();

		return ppmt(rate, period, nPeriod, now, 0d, true);
	}

	/**
	 * IPMTÌvZ<br>
	 * «¿l=0dAftHg:I¹ú
	 * 
	 * @param numRate ¦
	 * @param period »ÝúÔ
	 * @param nPeriod ú
	 * @param numNow »Ý¿l
	 * @return IPMT
	 */
	public static double ipmt(BigDecimal numRate, int period, int nPeriod, BigDecimal numNow) {
		double rate = DecimalUtil.avoidNull(numRate).doubleValue();
		double now = DecimalUtil.avoidNull(numNow).negate().doubleValue();

		return ipmt(rate, period, nPeriod, now, 0d, true);
	}

	/**
	 * PPMTÌvZ
	 * 
	 * @param rate ¦
	 * @param nPeriod ú
	 * @param periodValue »Ý¿l
	 * @param futureValue «¿l
	 * @param endPeriod true:I¹ú
	 * @return PPMT
	 */
	public static double pmt(double rate, double nPeriod, double periodValue, double futureValue, boolean endPeriod) {
		double num;
		if (nPeriod == 0.0) {
			// error
			return 0.0;
		}
		if (rate == 0.0) {
			return ((-futureValue - periodValue) / nPeriod);
		}
		if (!endPeriod) {
			num = 1.0 + rate;
		} else {
			num = 1.0;
		}
		double x = rate + 1.0;
		double num2 = Math.pow(x, nPeriod);
		return (((-futureValue - (periodValue * num2)) / (num * (num2 - 1.0))) * rate);
	}

	/**
	 * IPMTÌvZ
	 * 
	 * @param rate ¦
	 * @param period »ÝúÔ
	 * @param nPeriod ú
	 * @param periodValue »Ý¿l
	 * @param futureValue «¿l
	 * @param endPeriod true:I¹ú
	 * @return IPMT
	 */
	public static double ipmt(double rate, double period, double nPeriod, double periodValue, double futureValue,
		boolean endPeriod) {
		double num;
		if (!endPeriod) {
			num = 2.0;
		} else {
			num = 1.0;
		}
		if ((period <= 0.0) || (period >= (nPeriod + 1.0))) {
			// error
			return 0.0;
		}
		if ((!endPeriod) && (period == 1.0)) {
			return 0.0;
		}
		double pmt = pmt(rate, nPeriod, periodValue, futureValue, endPeriod);
		if (!endPeriod) {
			periodValue += pmt;
		}
		return (fv(rate, period - num, pmt, periodValue, endPeriod) * rate);
	}

	/**
	 * FVÌvZ
	 * 
	 * @param rate ¦
	 * @param nPeriod ú
	 * @param payment x¥àz
	 * @param periodValue »Ý¿l
	 * @param endPeriod
	 * @return FV
	 */
	public static double fv(double rate, double nPeriod, double payment, double periodValue, boolean endPeriod) {
		double num;
		if (rate == 0.0) {
			return (-periodValue - (payment * nPeriod));
		}
		if (!endPeriod) {
			num = 1.0 + rate;
		} else {
			num = 1.0;
		}
		double x = 1.0 + rate;
		double num2 = Math.pow(x, nPeriod);
		double result = ((-periodValue * num2) - (((payment / rate) * num) * (num2 - 1.0)));

		return result;
	}

	/**
	 * PPMTÌvZ
	 * 
	 * @param rate ¦
	 * @param period »ÝúÔ
	 * @param nPeriod ú
	 * @param periodValue »Ý¿l
	 * @param futureValue «¿l
	 * @param endPeriod true:I¹ú
	 * @return PPMT
	 */
	public static double ppmt(double rate, double period, double nPeriod, double periodValue, double futureValue,
		boolean endPeriod) {
		if ((period <= 0.0) || (period >= (nPeriod + 1.0))) {
			// error
			return 0.0;
		}
		double pmt = pmt(rate, nPeriod, periodValue, futureValue, endPeriod);
		double ipmt = ipmt(rate, period, nPeriod, periodValue, futureValue, endPeriod);
		return (pmt - ipmt);
	}
}
