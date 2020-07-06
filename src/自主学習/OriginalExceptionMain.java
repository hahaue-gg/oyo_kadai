package 自主学習;

import java.util.Random;

public class OriginalExceptionMain {

	public static void main(String[] args) {
		Random rnd = new Random();

		//0～4までの乱数を生成
		int num = rnd.nextInt(5);

		try{
			//生成した乱数が2未満であれば例外発生
			if(num < 2){
				//例外発生
				throw new OriginalException("数値が2未満です");
			}
			System.out.println("数値：" + num);
		} catch (OriginalException oe){
			//例外発生時の処理
			System.out.println("数値が2未満のためプログラムを終了します");
		}


	}

}
