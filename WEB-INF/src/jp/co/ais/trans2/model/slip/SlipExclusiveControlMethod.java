package jp.co.ais.trans2.model.slip;

import java.util.*;

import jp.co.ais.trans.common.client.*;
import jp.co.ais.trans.common.except.TException;
import jp.co.ais.trans2.common.client.TController;
import jp.co.ais.trans2.model.security.*;

/**
 * 伝票の排他制御
 * 
 * @author AIS
 */
public class SlipExclusiveControlMethod extends TController implements TExclusiveControlMethod {

	/** 伝票種別リスト */
	protected List<String> slipTypeList = new ArrayList<String>();

	/**
	 * コンストラクタ.
	 * 
	 * @param prgInfo
	 * @param slipType
	 */
	public SlipExclusiveControlMethod(TClientProgramInfo prgInfo, String... slipType) {
		for (int i = 0; i < slipType.length; i++) {
			this.slipTypeList.add(slipType[i]);
		}

		this.setProgramInfo(prgInfo);

	}

	public void exclude() throws TException {
		request(SlipExclusiveManager.class, "unLockAll", slipTypeList);
	}

	public void cancelExclude() throws TException {
		request(SlipExclusiveManager.class, "unLockAll", slipTypeList);
	}

}
