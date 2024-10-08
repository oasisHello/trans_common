package jp.co.ais.trans2.model.bs;

import java.util.*;

import jp.co.ais.trans.common.except.*;
import jp.co.ais.trans2.model.slip.*;

/**
 * B/S¨èÁ}l[W
 */
public interface BSEraseManager {

	/**
	 * r¼ð|¯é
	 * 
	 * @param condition ÎÛBS¨è(ð)
	 * @throws TException r¼¸s
	 */
	public void lock(BSEraseCondition condition) throws TException;

	/**
	 * r¼ð
	 * 
	 * @param condition ÎÛBS¨è(ð)
	 * @throws TException r¼¸s
	 */
	public void unlock(BSEraseCondition condition) throws TException;

	/**
	 * B/S¨èf[^Ìæ¾
	 * 
	 * @param condition ð
	 * @return List f[^
	 * @throws TException æ¾¸s
	 */
	public List<SWK_DTL> get(BSEraseCondition condition) throws TException;

	/**
	 * B/S¨èÁÌ³
	 * 
	 * @param condition ð(ïÐR[h, `[Ô)
	 * @throws TRuntimeException ³¸s
	 */
	public void restoreBsBalance(SlipCondition condition);

	/**
	 * B/S¨èÁÌXV
	 * 
	 * @param slip `[
	 */
	public void updateBsBalance(Slip slip);

}