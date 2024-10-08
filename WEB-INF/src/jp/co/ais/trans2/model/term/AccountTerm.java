package jp.co.ais.trans2.model.term;

import jp.co.ais.trans2.define.*;

/**
 * 会計期
 */
public class AccountTerm {

	/**
	 * @param tukido 1 〜 12
	 * @param term
	 * @return 会計期
	 */
	public static Enum getCurretTerm(int tukido, SettlementTerm term) {

		if (term.equals(SettlementTerm.YEAR)) {
			return Year.getAccountTerm();
		}

		if (term.equals(SettlementTerm.HALF)) {

			return Half.getAccountTerm(tukido);

		}

		if (term.equals(SettlementTerm.QUARTER)) {

			return Quarter.getAccountTerm(tukido);

		}
		if (term.equals(SettlementTerm.MONTH)) {

			return Month.getAccountTerm(tukido);

		}
		return null;
	}

}
