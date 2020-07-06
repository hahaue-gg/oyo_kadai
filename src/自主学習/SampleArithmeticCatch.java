package 自主学習;


public class SampleArithmeticCatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		int c;

		try {
			c = a / b;
			System.out.println("a ÷ b = " + c);
		} catch(RuntimeException re) {
			//ArithmeticExceptionをキャッチすることができる。
			System.out.println("ArithmeticExceptionをキャッチしました");

			//System.out.println(re);
			//re.printStackTrace();
		}


	}

}
