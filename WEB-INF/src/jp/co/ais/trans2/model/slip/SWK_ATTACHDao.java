package jp.co.ais.trans2.model.slip;

/**
 * `[YtDao<br>
 * SQLp~
 */
@Deprecated
public interface SWK_ATTACHDao {

	/** BEAN */
	public Class BEAN = SWK_ATTACH.class;

	/**
	 * VKì¬
	 * 
	 * @param entity
	 * @return 
	 */
	public int insert(SWK_ATTACH entity);

	/** ø */
	public String delete_ARGS = "kAI_CODE, sWK_DEN_NO, sEQ";

	/**
	 * õ
	 * 
	 * @param kAI_CODE ïÐR[h
	 * @param sWK_DEN_NO `[Ô
	 * @param sEQ sÔ
	 * @return 
	 */
	public int delete(String kAI_CODE, String sWK_DEN_NO, Integer sEQ);

	/** ø */
	public String updateSeq_ARGS = "kAI_CODE, sWK_DEN_NO";

	/**
	 * SEQXV
	 * 
	 * @param kAI_CODE ïÐR[h
	 * @param sWK_DEN_NO `[Ô
	 * @return 
	 */
	public int updateSeq(String kAI_CODE, String sWK_DEN_NO);
}
