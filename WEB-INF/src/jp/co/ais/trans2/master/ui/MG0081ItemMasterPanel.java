package jp.co.ais.trans2.master.ui;

import javax.swing.*;

import jp.co.ais.trans2.common.config.*;
import jp.co.ais.trans2.common.gui.*;
import jp.co.ais.trans2.model.company.*;

/**
 * ΘΪ}X^Μw¦ζΚ<br>
 * qCϋxvZtOΗΑΕ
 */
public class MG0081ItemMasterPanel extends MG0080ItemMasterPanel {

	/**
	 * κΜJθ`
	 */
	public enum SC {
		/** ΘΪR[h */
		code,
		/** ΘΪΌΜ */
		name,
		/** ΘΪͺΜ */
		names,
		/** ΘΪυΌΜ */
		namek,
		/** Wvζͺ */
		sumkbn,
		/** ΘΪνΚ */
		kmkshu,
		/** έΨζͺ */
		dckbn,
		/** βζͺ */
		hkmkbn,
		/** ΕθεΊ°Δή */
		koteidepcode,
		/** ΑοΕR[h */
		zeicode,
		/** GLΘΪ§δζͺ */
		cntgl,
		/** APΘΪ§δζͺ */
		cntap,
		/** ARΘΪ§δζͺ */
		cntar,
		/** BGΘΪ§δζͺ */
		cntbg,
		/** ζψζόΝtO */
		tricodeflg,
		/** EΘΪ§δζͺ */
		cntsousai,
		/** BS¨θΑζͺ */
		kasikbn,
		/** ]ΏΦΞΫtO */
		excflg,
		/** όΰ`[όΝtO */
		glflg1,
		/** oΰ`[όΝtO */
		glflg2,
		/** UΦ`[όΝtO */
		glflg3,
		/** oοΈZ`[όΝtO */
		apflg1,
		/** Β±vγ`[όΝtO */
		apflg2,
		/** Β vγ`[όΝtO */
		arflg1,
		/** Β Α`[όΝtO */
		arflg2,
		/** Yvγ`[όΝtO */
		faflg1,
		/** x₯Λ`[όΝtO */
		faflg2,
		/** ½ΚέόΝtO */
		mcrflg,
		/** ΠυόΝtO */
		empcodeflg,
		/** ΗPόΝtO */
		knrflg1,
		/** ΗQόΝtO */
		knrflg2,
		/** ΗRόΝtO */
		knrflg3,
		/** ΗSόΝtO */
		knrflg4,
		/** ΗTόΝtO */
		knrflg5,
		/** ΗUόΝtO */
		knrflg6,
		/** ροvPόΝtO */
		hmflg1,
		/** ροvQόΝtO */
		hmflg2,
		/** ροvRόΝtO */
		hmflg3,
		/** γΫΕόΝtO */
		urizeiflg,
		/** dόΫΕόΝtO */
		sirzeiflg,
		/** qCϋxvZtO */
		voyageflg,
		/** ­ΆϊtO */
		occurDateflg,
		/** JnNϊ */
		dateFrom,
		/** IΉNϊ */
		dateTo
	}

	/**
	 * RXgN^.
	 * 
	 * @param company
	 */
	public MG0081ItemMasterPanel(Company company) {
		super(company);
	}

	/**
	 * R|[lgΜϊ»
	 */
	@Override
	public void initComponents() {
		super.initComponents();

		tbl = new TTable();
		tbl.addColumn(SC.code, "C00572", 100, SwingConstants.LEFT);
		tbl.addColumn(SC.name, "C00700", 200, SwingConstants.LEFT);
		tbl.addColumn(SC.names, "C00730", 130, SwingConstants.LEFT);
		tbl.addColumn(SC.namek, "C00731", 200, SwingConstants.LEFT);
		tbl.addColumn(SC.sumkbn, "C01148", 80, SwingConstants.CENTER);
		tbl.addColumn(SC.kmkshu, "C01007", 130, SwingConstants.CENTER);
		tbl.addColumn(SC.dckbn, "C01226", 80, SwingConstants.CENTER);
		tbl.addColumn(SC.hkmkbn, "C01314", 80, SwingConstants.CENTER);
		tbl.addColumn(SC.koteidepcode, "C02066", 100, SwingConstants.LEFT);
		tbl.addColumn(SC.zeicode, "C00573", 100, SwingConstants.LEFT);
		tbl.addColumn(SC.cntgl, "C00968", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.cntap, "C00959", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.cntar, "C00960", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.cntbg, "C00962", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.tricodeflg, "C01134", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.cntsousai, "C01217", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.kasikbn, "C02078", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.excflg, "C00453", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.glflg1, "C02067", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.glflg2, "C02068", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.glflg3, "C02321", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.apflg1, "C01049", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.apflg2, "C01083", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.arflg1, "C02071", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.arflg2, "C02072", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.faflg1, "C02073", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.faflg2, "C02074", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.mcrflg, "C01223", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.empcodeflg, "C01120", 100, SwingConstants.CENTER);

		if (company.getAccountConfig().getManagement1Name() != null) {
			tbl.addColumn(SC.knrflg1, company.getAccountConfig().getManagement1Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.knrflg1, "C01026", 100, SwingConstants.CENTER);
		}

		if (company.getAccountConfig().getManagement2Name() != null) {
			tbl.addColumn(SC.knrflg2, company.getAccountConfig().getManagement2Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.knrflg2, "C01028", 100, SwingConstants.CENTER);
		}
		if (company.getAccountConfig().getManagement3Name() != null) {
			tbl.addColumn(SC.knrflg3, company.getAccountConfig().getManagement3Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.knrflg3, "C01030", 100, SwingConstants.CENTER);
		}
		if (company.getAccountConfig().getManagement4Name() != null) {
			tbl.addColumn(SC.knrflg4, company.getAccountConfig().getManagement4Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.knrflg4, "C01032", 100, SwingConstants.CENTER);
		}
		if (company.getAccountConfig().getManagement5Name() != null) {
			tbl.addColumn(SC.knrflg5, company.getAccountConfig().getManagement5Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.knrflg5, "C01034", 100, SwingConstants.CENTER);
		}
		if (company.getAccountConfig().getManagement6Name() != null) {
			tbl.addColumn(SC.knrflg6, company.getAccountConfig().getManagement6Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.knrflg6, "C01036", 100, SwingConstants.CENTER);
		}
		if (company.getAccountConfig().getNonAccounting1Name() != null) {
			tbl.addColumn(SC.hmflg1, company.getAccountConfig().getNonAccounting1Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.hmflg1, "C01288", 100, SwingConstants.CENTER);
		}
		if (company.getAccountConfig().getNonAccounting2Name() != null) {
			tbl.addColumn(SC.hmflg2, company.getAccountConfig().getNonAccounting2Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.hmflg2, "C01289", 100, SwingConstants.CENTER);
		}
		if (company.getAccountConfig().getNonAccounting3Name() != null) {
			tbl.addColumn(SC.hmflg3, company.getAccountConfig().getNonAccounting3Name() + getWord("C02386"), 100,
				SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.hmflg3, "C01290", 100, SwingConstants.CENTER);
		}
		tbl.addColumn(SC.urizeiflg, "C01282", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.sirzeiflg, "C01088", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.voyageflg, "C11602", 100, SwingConstants.CENTER); // qCϋxvZtO

		if (ClientConfig.isFlagOn("trans.MG0080.use.occurdate")) {
			tbl.addColumn(SC.occurDateflg, "C11619", 100, SwingConstants.CENTER);
		} else {
			tbl.addColumn(SC.occurDateflg, "C11619", -1, SwingConstants.CENTER);
		}

		tbl.addColumn(SC.dateFrom, "C00055", 100, SwingConstants.CENTER);
		tbl.addColumn(SC.dateTo, "C00261", 100, SwingConstants.CENTER);

	}

}