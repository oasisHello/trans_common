package jp.co.ais.trans2.master.excel;

import java.util.*;

import javax.swing.*;

import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans.common.util.*;
import jp.co.ais.trans2.common.excel.*;
import jp.co.ais.trans2.define.*;
import jp.co.ais.trans2.model.payment.*;

/**
 * x¥ðGNZ(COü¯)
 */
public class PaymentSettingGlobalExcel extends TExcel {

	/**
	 * RXgN^
	 * 
	 * @param lang ¾êR[h
	 */
	public PaymentSettingGlobalExcel(String lang) {
		super(lang);
	}

	/**
	 * êðGNZÅÔ·
	 * 
	 * @param list EvXg
	 * @return GNZ
	 * @throws TException
	 */
	public byte[] getExcel(List<PaymentSetting> list) throws TException {

		try {
			createReport(list);
			return getBinary();

		} catch (Exception e) {
			throw new TException(e);
		}
	}

	/**
	 * GNZðoÍ·é
	 * 
	 * @param list
	 */
	public void createReport(List<PaymentSetting> list) {

		// V[gÇÁ
		TExcelSheet sheet = addSheet(getWord("C02325"));

		// JÝè
		sheet.addColumn(getWord("C00786"), 5000); // æøæR[h
		sheet.addColumn(getWord("C00787"), 8000); // æøæªÌ
		sheet.addColumn(getWord("C00788"), 5000); // æøæðR[h
		sheet.addColumn(getWord("C02057"), 5000); // x¥ð÷ú
		sheet.addColumn(getWord("C02058"), 5000); // x¥ð÷ã
		sheet.addColumn(getWord("C02059"), 5000); // x¥ðx¥ú
		sheet.addColumn(getWord("C00682"), 3000); // x¥æª
		sheet.addColumn(getWord("C00233"), 4000); // x¥û@
		sheet.addColumn(getWord("C00792"), 6000); // UUoâsR[h
		sheet.addColumn(getWord("C00779"), 4000); // âsR[h
		sheet.addColumn(getWord("C00781"), 7000); // âs¼Ì
		sheet.addColumn(getWord("C02055"), 4000); // xXR[h
		sheet.addColumn(getWord("C02060"), 7000); // xX¼Ì
		sheet.addColumn(getWord("C01326"), 6000); // aàíÚ
		sheet.addColumn(getWord("C11423"), 6000); // oN`[Wæª
		sheet.addColumn(getWord("C02056"), 6000); // Uè¿æª
		sheet.addColumn(getWord("C10224"), 6000); // è¿æª
		sheet.addColumn(getWord("C00794"), 5000); // ûÀÔ
		sheet.addColumn(getWord("C11418"), 6000); // âsSWIFTR[h
		sheet.addColumn(getWord("C00795"), 8000); // p¶âs¼
		sheet.addColumn(getWord("C00796"), 8000); // p¶xX¼
		sheet.addColumn(getWord("C11417"), 5000); // âsR[h
		sheet.addColumn(getWord("C00797"), 10000); // p¶âsZ
		sheet.addColumn(getWord("C01068"), 8000); // ûÀ¼`Ji
		sheet.addColumn(getWord("C02037"), 4000); // àÚI¼
		sheet.addColumn(getWord("C11422"), 6000); // oRâsSWIFTR[h
		sheet.addColumn(getWord("C00802"), 8000); // oRâs¼
		sheet.addColumn(getWord("C00803"), 8000); // oRxX¼
		sheet.addColumn(getWord("C11421"), 5000); // oRâsR[h
		sheet.addColumn(getWord("C00804"), 10000); // oRâsZ
		sheet.addColumn(getWord("C11416"), 6000); // óælR[h
		sheet.addColumn(getWord("C00805"), 10000); // óælZ
		sheet.addColumn(getWord("C00055"), 4000); // JnNú
		sheet.addColumn(getWord("C00261"), 4000); // I¹Nú

		int center = SwingConstants.CENTER;

		// ¾×`æ
		for (PaymentSetting s1 : list) {

			TExcelRow newRow = sheet.addRow();

			newRow.addCell(s1.getCustomer().getCode());
			newRow.addCell(s1.getCustomer().getNames());
			newRow.addCell(s1.getCode());
			newRow.addCell(DecimalUtil.toBigDecimal(s1.getCloseDay()));
			newRow.addCell(DecimalUtil.toBigDecimal(s1.getNextMonth()));
			newRow.addCell(DecimalUtil.toBigDecimal(s1.getCashDay()));
			newRow.addCell(getWord(PaymentDateType.getPaymentDateTypeName(s1.getPaymentDateType())), center);

			// x¥û@
			if (s1.getPaymentMethod() == null) {
				newRow.addCell("");
			} else {
				newRow.addCell(s1.getPaymentMethod().getName(), center);
			}

			// UUoâsR[h
			if (s1.getBankAccount() == null) {
				newRow.addCell("");
			} else {
				newRow.addCell(s1.getBankAccount().getCode());
			}

			newRow.addCell(s1.getBankCode());
			newRow.addCell(s1.getBankName());
			newRow.addCell(s1.getBranchCode());
			newRow.addCell(s1.getBranchName());
			newRow.addCell(getWord(DepositKind.getDepositKindName(s1.getDepositKind())), center);

			// oN`[Wæª
			if (s1.getBankChargeType() == null) {
				newRow.addCell("");
			} else {
				newRow.addCell(s1.getBankChargeType().toString(), center);
			}

			// üàè¿æª
			newRow.addCell(getWord(CashInFeeType.getCashInFeeTypeName(s1.getCashInFeeType())), center);
			// è¿x¥æª
			newRow.addCell(getWord(CommissionPaymentType.getName(s1.getCommissionPaymentType())), center);

			newRow.addCell(s1.getAccountNo()); // ûÀÔ
			newRow.addCell(s1.getBankSwiftCode());
			newRow.addCell(s1.getSendBankName());
			newRow.addCell(s1.getSendBranchName());

			if (s1.getBankCountry() == null) {
				newRow.addCell("");
			} else {
				newRow.addCell(s1.getBankCountry().getCode());
			}

			newRow.addCell(s1.getAccountName());
			newRow.addCell(s1.getAccountNameKana()); // ûÀ¼`Ji

			if (s1.getRemittancePurpose() != null) {
				newRow.addCell(s1.getRemittancePurpose().getName()); // àÚI¼
			} else {
				newRow.addCell("");
			}

			newRow.addCell(s1.getViaBankSwiftCode());
			newRow.addCell(s1.getViaBankName());
			newRow.addCell(s1.getViaBranchName());

			if (s1.getViaBankCountry() == null) {
				newRow.addCell("");
			} else {
				newRow.addCell(s1.getViaBankCountry().getCode());
			}

			newRow.addCell(s1.getViaBankAddress());

			if (s1.getRecipientCountry() == null) {
				newRow.addCell("");
			} else {
				newRow.addCell(s1.getRecipientCountry().getCode());
			}

			newRow.addCell(s1.getReceiverAddress());
			newRow.addCell(DateUtil.toYMDString(s1.getDateFrom()), center);
			newRow.addCell(DateUtil.toYMDString(s1.getDateTo()), center);
		}
	}
}
