package jp.co.ais.trans2.master.excel;

import java.util.*;

import javax.swing.*;

import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans.common.util.*;
import jp.co.ais.trans2.common.excel.*;
import jp.co.ais.trans2.define.*;
import jp.co.ais.trans2.model.tax.*;

/**
 * ÁïÅêGNZ
 */
public class ConsumptionTaxExcel extends TExcel {

	/** Invoice§x true:gp·é */
	protected boolean isInvoice = false;

	/**
	 * RXgN^.
	 * 
	 * @param lang ¾êR[h
	 * @param condition
	 */
	public ConsumptionTaxExcel(String lang, ConsumptionTaxSearchCondition condition) {
		super(lang);
		isInvoice = condition.isInvoiceFlg();
	}

	/**
	 * ÁïÅ}X^êðGNZÅÔ·
	 * 
	 * @param list ÁïÅXg
	 * @return ÁïÅêGNZ
	 * @throws TException
	 */
	public byte[] getExcel(List<ConsumptionTax> list) throws TException {

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
	public void createReport(List<ConsumptionTax> list) {
		// V[gÇÁ }X^
		TExcelSheet sheet = addSheet(getWord("C02324"));

		// JÝè
		// ÁïÅR[h
		sheet.addColumn(getWord("C00573"), 4000);
		// ÁïÅ¼Ì
		sheet.addColumn(getWord("C00774"), 10000);
		// ÁïÅªÌ
		sheet.addColumn(getWord("C00775"), 10000);
		// ÁïÅõ¼Ì
		sheet.addColumn(getWord("C00828"), 10000);
		// ãdüæª
		sheet.addColumn(getWord("C01283"), 4000);
		// ÁïÅ¦
		sheet.addColumn(getWord("C00777"), 4000);
		// ÁïÅvZoÍ
		sheet.addColumn(getWord("C02045"), 5000);

		if (isInvoice) {
			// ñKi¿­sÆÒ
			sheet.addColumn(getWord("C12197"), 6000);
			// oß[uTÂ\¦
			sheet.addColumn(getWord("C12228"), 4500);
		}

		// JnNú
		sheet.addColumn(getWord("C00055"), 4200);
		// I¹Nú
		sheet.addColumn(getWord("C00261"), 4200);

		// ¾×`æ
		for (ConsumptionTax ct : list) {

			TExcelRow newRow = sheet.addRow();

			newRow.addCell(ct.getCode());
			newRow.addCell(ct.getName());
			newRow.addCell(ct.getNames());
			newRow.addCell(ct.getNamek());
			newRow.addCell(getWord(TaxType.getName(ct.getTaxType())), SwingConstants.CENTER);
			newRow.addCell(ct.getRate(), 1);
			newRow.addCell(ct.isTaxConsumption() ? ct.getOdr() : getWord("C00282"), SwingConstants.RIGHT);

			if (isInvoice) {
				// ñKi¿­sÆÒ
				newRow.addCell(ct.isNO_INV_REG_FLG() ? getWord("C12198") : "", SwingConstants.CENTER);
				// oß[uTÂ\¦
				String rate = "";
				if (!DecimalUtil.isNullOrZero(ct.getKEKA_SOTI_RATE())) {
					rate = NumberFormatUtil.formatNumber(ct.getKEKA_SOTI_RATE(), 0) + "%";
				}
				newRow.addCell(rate, SwingConstants.RIGHT);
			}

			newRow.addCell(DateUtil.toYMDString(ct.getDateFrom()), SwingConstants.CENTER);
			newRow.addCell(DateUtil.toYMDString(ct.getDateTo()), SwingConstants.CENTER);
		}
	}
}
