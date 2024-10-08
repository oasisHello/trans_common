package jp.co.ais.trans.common.gui;

import java.util.*;

import javax.swing.*;

/**
 * 複数InputVerifierを登録する為のクラス
 */
public class TInputVerifierMulti extends TInputVerifier {

	/** 複数InputVerifier */
	public List<InputVerifier> verifiers = new LinkedList<InputVerifier>();

	/**
	 * InputVerifier追加
	 * 
	 * @param verifier 追加Verifier
	 */
	public void add(InputVerifier verifier) {

		if (!verifiers.contains(verifier)) {
			verifiers.add(verifier);
		}
	}

	@Override
	public boolean verifyCommit(JComponent comp) {

		for (InputVerifier verifier : verifiers) {
			if (verifier instanceof TInputVerifier) {
				if (!((TInputVerifier) verifier).verifyCommit(comp)) {
					return false;
				}
			} else {
				if (!verifier.verify(comp)) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * InputVerifyを削除
	 * 
	 * @param inputVerifier InputVerify
	 */
	public void remove(InputVerifier inputVerifier) {
		verifiers.remove(inputVerifier);
	}
}
