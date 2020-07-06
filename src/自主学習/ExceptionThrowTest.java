package 自主学習;

public class ExceptionThrowTest {

	public static void main(String[] args) {

		//例外クラスのインスタンスの生成
		RuntimeException e = new RuntimeException("例外発生！！");

		//例外を発生！
		throw e;

	}

}
