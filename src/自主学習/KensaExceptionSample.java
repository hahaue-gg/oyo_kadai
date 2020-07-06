package 自主学習;


public class KensaExceptionSample {

	public static void main(String[] args) {

		try {

			for(int i = 0 ; i < 10 ; i++ ){
				System.out.println( i + "回目の表示");
				Thread.sleep(3000);//3秒間(3000ミリ秒)処理を停止
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
