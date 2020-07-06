

public class SampleThread extends Thread {

	public void run(){
		for(int i = 0 ; i < 20 ; i++){
			System.out.println("2つ目のスレッド:" + i);
		}
	}
}

