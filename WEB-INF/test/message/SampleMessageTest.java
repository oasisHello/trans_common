package message;

/**
 * sample
 */
public class SampleMessageTest extends MessageTestUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printlnMessages("I00088", new Object[] { "1111" + "-" + "22222" });

		printlnMessages("I00144");

		printlnMessages("I00096", "C02829");// 処理区分を選択してください。

		printlnWord("C01698");

		printlnMessages("W00150", null, "C03988", "0");// 数量 > 0にしてください。

	}

}
