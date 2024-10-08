package jp.co.ais.trans2.common.model.ui;

import java.awt.*;

import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans.common.gui.*;
import jp.co.ais.trans.common.message.*;
import jp.co.ais.trans.common.util.*;
import jp.co.ais.trans2.common.model.format.*;
import jp.co.ais.trans2.define.*;
import jp.co.ais.trans2.model.slip.*;

/**
 * h_Ewb_[AP
 * 
 * @author AIS
 */
public class TDrillDownHeaderAP extends TDrillDownHeader {

	/** x₯ζR[h */
	public TLabelField txTriCode;

	/** x₯ζͺΜ */
	public TLabelField txTriNames;

	/** x₯ϊ */
	public TLabelField txSihaDate;

	/** uθvoruΥv */
	public TLabelField txSihaKbn;

	/** x₯βs */
	public TLabelField txHisimukeBnk;

	/** x₯ϋ@R[h */
	public TLabelField txHohCode;

	/** x₯ϋ@ͺΜ */
	public TLabelField txHohName;

	/** [g */
	public TLabelField txRate;

	/** x₯ΰz(Oέ) */
	public TLabelField txSihaInKin;

	/** x₯Κέ */
	public TLabelField txCurCode;

	/** x₯ΰz(ξ²Κέ) */
	public TLabelField txSihaKin;

	/** ψβsϋΐ */
	public TLabelField txSimukeBnk;

	/**
	 * RXgN^
	 * 
	 * @param lang ΎκR[h
	 */
	public TDrillDownHeaderAP(String lang) {
		super(lang);
	}

	/**
	 * R|[lgΜϊέθ
	 */
	@Override
	public void initComponents() {
		super.initComponents();
		txTriCode = new TLabelField();
		txTriNames = new TLabelField();
		txSihaDate = new TLabelField();
		txSihaKbn = new TLabelField();
		txHisimukeBnk = new TLabelField();
		txHohCode = new TLabelField();
		txHohName = new TLabelField();
		txRate = new TLabelField();
		txSihaInKin = new TLabelField();
		txCurCode = new TLabelField();
		txSihaKin = new TLabelField();
		txSimukeBnk = new TLabelField();
	}

	/**
	 * R|[lgΜzuπs’ά·B
	 */
	@Override
	public void allocateComponents() {
		super.allocateComponents();
		int x = 10;
		int y = txRemarkCode.getY() + txRemarkCode.getHeight() + 10;

		setMaximumSize(new Dimension(0, 175));
		setMinimumSize(new Dimension(0, 175));
		setPreferredSize(new Dimension(0, 175));

		// x₯ζ(R[h)
		txTriCode.setEditable(false);
		txTriCode.setLabelSize(65);
		txTriCode.setFieldSize(80);
		txTriCode.setLangMessageID("C01690");
		txTriCode.setLocation(x, y);
		add(txTriCode);

		// x₯ζ(ͺΜ)
		txTriNames.setEditable(false);
		txTriNames.setLabelSize(0);
		txTriNames.setFieldSize(220);
		txTriNames.setLocation(x + txTriCode.getWidth() - 5, y);
		add(txTriNames);

		// x₯ϊ
		txSihaDate.setEditable(false);
		txSihaDate.setFieldSize(75);
		txSihaDate.setLabelSize(85);
		txSihaDate.setLangMessageID("C01098");
		txSihaDate.getField().setHorizontalAlignment(0);
		txSihaDate.setLocation(txTriNames.getX() + txTriNames.getWidth() + 70, y);
		add(txSihaDate);

		// x₯ζͺ
		txSihaKbn.setEditable(false);
		txSihaKbn.setLabelSize(0);
		txSihaKbn.setFieldSize(40);
		txSihaKbn.getField().setHorizontalAlignment(0);
		txSihaKbn.setLocation(txSihaDate.getX() + txSihaDate.getWidth() - 5, y);
		add(txSihaKbn);

		// x₯βs
		txHisimukeBnk.setEditable(false);
		txHisimukeBnk.setFieldSize(300);
		txHisimukeBnk.setLabelSize(65);
		txHisimukeBnk.setLangMessageID("C01637");
		txHisimukeBnk.setLocation(x, y + txTriCode.getHeight() + 1);
		add(txHisimukeBnk);

		// x₯ϋ@(R[h)
		txHohCode.setEditable(false);
		txHohCode.setFieldSize(25);
		txHohCode.setLabelSize(85);
		txHohCode.setLangMessageID("C00233");
		txHohCode.setLocation(txSihaDate.getX(), y + txSihaDate.getHeight() + 1);
		add(txHohCode);

		// x₯ϋ@ͺΜ
		txHohName.setEditable(false);
		txHohName.setLabelSize(0);
		txHohName.setFieldSize(200);
		txHohName.setLocation(txHohCode.getX() + txHohCode.getWidth() - 5, y + txSihaDate.getHeight() + 1);
		add(txHohName);

		// x₯ΰz([g)
		txRate.setEditable(false);
		txRate.setFieldSize(100);
		txRate.setLabelSize(65);
		txRate.getField().setHorizontalAlignment(4);
		txRate.setLangMessageID("C00229");
		txRate.setLocation(x, txHisimukeBnk.getY() + txHisimukeBnk.getHeight() + 1);
		add(txRate);

		// x₯ΰz(Oέ)
		txSihaInKin.setEditable(false);
		txSihaInKin.setFieldSize(100);
		txSihaInKin.setLabelSize(0);
		txSihaInKin.getField().setHorizontalAlignment(4);
		txSihaInKin.setLocation(txRate.getX() + txRate.getWidth() - 5, txHisimukeBnk.getY() + txHisimukeBnk.getHeight()
			+ 1);
		add(txSihaInKin);

		// x₯ΰz(ξ²Κέ)
		txSihaKin.setEditable(false);
		txSihaKin.setFieldSize(100);
		txSihaKin.setLabelSize(0);
		txSihaKin.getField().setHorizontalAlignment(4);
		txSihaKin.setLocation(txSihaInKin.getX() + txSihaInKin.getWidth() - 5,
			txHisimukeBnk.getY() + txHisimukeBnk.getHeight() + 1);
		add(txSihaKin);

		// x₯ΰz(Κέ)
		txCurCode.setEditable(false);
		txCurCode.setFieldSize(60);
		txCurCode.setLabelSize(0);
		txCurCode.getField().setHorizontalAlignment(0);
		txCurCode.setLocation(txSihaKin.getX() + txSihaKin.getWidth() - 5,
			txHisimukeBnk.getY() + txHisimukeBnk.getHeight() + 1);
		add(txCurCode);

		// Uoβsϋΐ
		txSimukeBnk.setEditable(false);
		txSimukeBnk.setLangMessageID("C00475");
		txSimukeBnk.setLabelSize(85);
		txSimukeBnk.setFieldSize(225);
		txSimukeBnk.setLocation(txHohCode.getX(), txHohCode.getY() + txHohCode.getHeight() + 1);
		add(txSimukeBnk);

		// §ί«πZbg
		txTriCode.setOpaque(false);
		txTriNames.setOpaque(false);
		txSihaDate.setOpaque(false);
		txSihaKbn.setOpaque(false);
		txSNo.setOpaque(false);
		txHisimukeBnk.setOpaque(false);
		txHohCode.setOpaque(false);
		txHohName.setOpaque(false);
		txRate.setOpaque(false);
		txSihaInKin.setOpaque(false);
		txSihaKin.setOpaque(false);
		txCurCode.setOpaque(false);
		txSimukeBnk.setOpaque(false);

	}

	/**
	 * `[wb_[πZbg΅ά·B
	 * 
	 * @param slip
	 */
	@Override
	public void setSlipHeader(Slip slip) throws TException {
		super.setSlipHeader(slip);
		// x₯ζR[h
		txTriCode.setValue(Util.avoidNull(slip.getHeader().getSWK_TRI_CODE()));
		// x₯ζͺΜ
		txTriNames.setValue(Util.avoidNull(slip.getHeader().getSWK_TRI_NAME_S()));
		// x₯ϊ
		txSihaDate.setValue(DateUtil.toYMDString(slip.getHeader().getSWK_SIHA_DATE()));
		// x₯ζͺ
		txSihaKbn.setValue(MessageUtil.getWord(lang, PaymentDateType.getPaymentDateTypeName(Util.avoidNull(slip.getHeader().getSWK_SIHA_KBN()))));
		// x₯βs
		txHisimukeBnk.setValue(Util.avoidNull(slip.getHeader().getSWK_TJK_BNK_NAME_S()) + " "
			+ Util.avoidNull(slip.getHeader().getSWK_TJK_BNK_STN_NAME_S()) + " "
			+ TModelUIUtil.getWord(DepositKind.getDepositKindName(Util.avoidNullAsInt(slip.getHeader().getSWK_TJK_YKN_KBN()))) + " "
			+ Util.avoidNull(slip.getHeader().getSWK_TJK_YKN_NO()));
		// x₯ϋ@R[h
		txHohCode.setValue(Util.avoidNull(slip.getHeader().getSWK_HOH_CODE()));
		// x₯ϋ@ͺΜ
		txHohName.setValue(Util.avoidNull(slip.getHeader().getSWK_HOH_NAME()));
		// x₯ΰz([g)
		txRate.setValue(FormatUtil.rateFormat(slip.getHeader().getKEY_CUR_CODE(), slip.getHeader().getSWK_CUR_CODE(),
			slip.getHeader().getSWK_CUR_RATE()));
		// x₯ΰz(Oέ)
		txSihaInKin.setValue(FormatUtil.foreingAmountFormat(slip.getHeader().getKEY_CUR_CODE(), slip.getHeader()
			.getSWK_CUR_CODE(), slip.getHeader().getSWK_IN_SIHA_KIN(), slip.getHeader().getSWK_CUR_DEC_KETA()));
		// x₯ΰz(ξ²Κέ)
		txSihaKin.setValue(NumberFormatUtil.formatNumber(slip.getHeader().getSWK_SIHA_KIN(), slip.getHeader()
			.getKEY_CUR_DEC_KETA()));
		// x₯Κέ
		txCurCode.setValue(Util.avoidNull(slip.getHeader().getSWK_CUR_CODE()));
		// ψβsϋΐ
		txSimukeBnk.setValue(Util.avoidNull(slip.getHeader().getSWK_CBK_NAME()));
	}
}
