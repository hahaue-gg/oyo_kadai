package Oya;



public class yu {
	static int array[][] =

				{{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,2,1,2,0,0},
				{0,0,0,1,2,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0}};


	static int a,b;
	static int c = 0;
	static int d = 0;
	static boolean black = true;
	static boolean white = true;
	static int e = 0;

	public static void main(String[] args) {
		rule();

		method();//盤面つくり

		while(true) {//オセロを始める
			method1();//自分プレイヤー黒
			count();//数える
			System.out.println("黒："+ a);
			System.out.println("白："+ b);
			System.out.println();
			if(white == false) {
				break;
			} else if(e == 1) {
				break;
			} else if(a+b == 64){
				break;
			}
			method2();//相手プレイヤー白
			count();//数える
			System.out.println("黒："+ a);
			System.out.println("白："+ b);
			System.out.println();
			if(black == false) {
				break;
			} else if(e == 1) {
				break;
			} else if(a+b == 64){
				break;
			}
		}

		shohai();
	}
	//ルール説明
	public static void rule() {
		System.out.println("【ルール説明】");
		System.out.println("1.xが横軸、ｙが縦軸;");
		System.out.println("2.置くところがないときはx,yに「555」を入力,スキップします;");
		System.out.println("3.盤面が全部埋まるか先に全部取ったほうが勝ち;");
		System.out.println("4.終了したいときは「999」を入力;");
		System.out.println();
	}
	//勝敗
	public static void shohai() {
		System.out.println("黒："+ a);
		System.out.println("白："+ b);
		if(black == false) {
			System.out.println("白の勝ち！");
		}else if(white == false) {
			System.out.println("黒の勝ち！");
		} else {
			if(a > b) {
				System.out.println("黒の勝ち！");
			} else if(a < b){
				System.out.println("白の勝ち！");
			} else if(a == b) {
				System.out.println("引き分け!");
			}
		}
	}
	//盤面
	public static void method() {
		System.out.println();
		System.out.println(" |0 |1 |2 |3 |4 |5 |6 |7 |");
		System.out.println("-+--+--+--+--+--+--+--+--+--");
		for(int i = 0;i<8;i++) {   //盤面づくり
			System.out.print(i+"|");
			for(int j = 0;j<8;j++) {
				if(array[i][j] == 1) {
					System.out.print("●|");
				}else if(array[i][j] == 2) {
					System.out.print("〇|");
				}else {
					System.out.print("  |");
				}

			}
			System.out.print(i);
			System.out.println();
			System.out.println("-+--+--+--+--+--+--+--+--+--");
		}
		System.out.println(" |0 |1 |2 |3 |4 |5 |6 |7 |");

	}
	//method1が黒、method2が白
	public static void method1() {
		int x;
		int y;

		while(true) {
			System.out.println("黒の番");
			System.out.println("xを入力:");
			x = new java.util.Scanner(System.in).nextInt();
			System.out.println("yを入力:");
			y = new java.util.Scanner(System.in).nextInt();
			if(x == 555 && y == 555) {
				System.out.println("スキップしました。");
				break;
			} else if(x == 999 && y == 999) {
				System.out.println("終了しました。");
				e = 1;
				break;
			} else if(x < 0 || 7 < x || y < 0 || 7 < y) {
				System.out.println("そこには置けません。");
				continue;
			}

			if(array[y][x] == 0) {
				count();
				c = a;
				method3(y,x);//右下
				method4(y,x);//右上
				method5(y,x);//左上
				method6(y,x);//左下
				method7(y,x);//←
				method8(y,x);//→
				method9(y,x);//↑
				method10(y,x);//↓
				array[y][x] = 1;
				count();
				d = a;
				if(c+1 == d) {
					System.out.println("そこには置けません。");
					array[y][x] = 0;
					continue;
				}

				array[y][x] = 1;

				break;
			} else {
				System.out.println("そこには置けません。");
			}

		}

		method();

	}

	public static void method2() {

		int x;
		int y;

		while(true) {//成功するまでループ
			System.out.println("白の番");
			System.out.println("xを入力:");
			x = new java.util.Scanner(System.in).nextInt();
			System.out.println("yを入力:");
			y = new java.util.Scanner(System.in).nextInt();
			if(x == 555 && y == 555) {
				System.out.println("スキップしました。");
				break;
			} else if(x == 999 && y == 999) {
				System.out.println("終了しました。");
				e = 1;
				break;
			} else if(x < 0 || 7 < x || y < 0 || 7 < y) {
				System.out.println("そこには置けません。");
				continue;
			}
			if(array[y][x] == 0) {
				count();
				c = b;
				method11(y,x);//右下
				method12(y,x);//右上
				method13(y,x);//左上
				method14(y,x);//左下
				method15(y,x);//←
				method16(y,x);//→
				method17(y,x);//↑
				method18(y,x);//↓
				array[y][x] = 2;
				count();
				d = b;
				if(c+1 == d) {
					System.out.println("そこには置けません。");
					array[y][x] = 0;
					continue;
				}

				array[y][x] = 2;

				break;
			} else {
				System.out.println("そこには置けません。");
			}
		}

		method();
	}
	//黒
	public static int method3(int y,int x) {//→↓
		if(x < 7 && y < 7) {
			if(array[y+1][x+1] == 2) {
				method3(y+1,x+1);
			}
			if(array[y+1][x+1] == 1) {
				array[y+1][x+1] = 1;
			} else if(array[y+1][x+1] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y+1][x+1] == 1) {
				array[y][x] = 1;
				return 0;
			}
		}

		return 0;
	}

	public static int method4(int y,int x) {//→↑
		if(x < 7 && 0 < y) {
			if(array[y-1][x+1] == 2) {
				method4(y-1,x+1);
			}
			if(array[y-1][x+1] == 1) {
				array[y-1][x+1] = 1;
			} else if(array[y-1][x+1] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y-1][x+1] == 1) {
				array[y][x] = 1;
				return 0;
			}
		}

		return 0;
	}

	public static int method5(int y,int x) {//←↑
		if(0 < x && 0 < y) {
			if(array[y-1][x-1] == 2) {
				method5(y-1,x-1);
			}
			if(array[y-1][x-1] == 1) {
				array[y-1][x-1] = 1;
			} else if(array[y-1][x-1] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y-1][x-1] == 1) {
				array[y][x] = 1;
				return 0;
			}
		}
		return 0;
	}

	public static int method6(int y,int x) {//←↓
		if(0 < x && y < 7) {
			if(array[y+1][x-1] == 2) {
				method6(y+1,x-1);
			}
			if(array[y+1][x-1] == 1) {
				array[y+1][x-1] = 1;
			} else if(array[y+1][x-1] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y+1][x-1] == 1) {
				array[y][x] = 1;
				return 0;
			}

		}
		return 0;
	}

	public static int method7(int y,int x) {//←
		if(0 < x) {
			if(array[y][x-1] == 2) {
				method7(y,x-1);
			}
			if(array[y][x-1] == 1) {
				array[y][x-1] = 1;
			} else if(array[y][x-1] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y][x-1] == 1) {
				array[y][x] = 1;
				return 0;
			}

		}
		return 0;
	}

	public static int method8(int y,int x) {//→

		if(x < 7) {
			if(array[y][x+1] == 2) {
				method8(y,x+1);
			}
			if(array[y][x+1] == 1) {
				array[y][x+1] = 1;
			} else if(array[y][x+1] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y][x+1] == 1) {
				array[y][x] = 1;
				return 0;
			}
		}

		return 0;
	}

	public static int method9(int y,int x) {//↑
		if(0 < y) {
			if(array[y-1][x] == 2) {
				method9(y-1,x);
			}
			if(array[y-1][x] == 1) {
				array[y-1][x] = 1;
			} else if(array[y-1][x] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y-1][x] == 1) {
				array[y][x] = 1;
				return 0;
			}

		}
		return 0;
	}

	public static int method10(int y,int x) {//↓
		if(y < 7) {
			if(array[y+1][x] == 2) {
				method10(y+1,x);
			}
			if(array[y+1][x] == 1) {
				array[y+1][x] = 1;
			} else if(array[y+1][x] == 2) {
				array[y][x] = 2;
			} else {
				return 0;
			}
			if(array[y+1][x] == 1) {
				array[y][x] = 1;
				return 0;
			}

		}
		return 0;
	}

	//白
	public static int method11(int y,int x) {//→↓
		if(x < 7 && y < 7) {
			if(array[y+1][x+1] == 1) {
				method11(y+1,x+1);
			}
			if(array[y+1][x+1] == 2) {
				array[y+1][x+1] = 2;
			} else if(array[y+1][x+1] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y+1][x+1] == 2) {
				array[y][x] = 2;
				return 0;
			}
		}

		return 0;
	}

	public static int method12(int y,int x) {//→↑
		if(x < 7 && 0 < y) {
			if(array[y-1][x+1] == 1) {
				method12(y-1,x+1);
			}
			if(array[y-1][x+1] == 2) {
				array[y-1][x+1] = 2;
			} else if(array[y-1][x+1] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y-1][x+1] == 2) {
				array[y][x] = 2;
				return 0;
			}
		}

		return 0;
	}

	public static int method13(int y,int x) {//←↑
		if(0 < x && 0 < y) {
			if(array[y-1][x-1] == 1) {
				method13(y-1,x-1);
			}
			if(array[y-1][x-1] == 2) {
				array[y-1][x-1] = 2;
			} else if(array[y-1][x-1] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y-1][x-1] == 2) {
				array[y][x] = 2;
				return 0;
			}
		}
		return 0;
	}

	public static int method14(int y,int x) {//←↓
		if(0 < x && y < 7) {
			if(array[y+1][x-1] == 1) {
				method14(y+1,x-1);
			}
			if(array[y+1][x-1] == 2) {
				array[y+1][x-1] = 2;
			} else if(array[y+1][x-1] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y+1][x-1] == 2) {
				array[y][x] = 2;
				return 0;
			}

		}
		return 0;
	}

	public static int method15(int y,int x) {//←
		if(0 < x) {
			if(array[y][x-1] == 1) {
				method15(y,x-1);
			}
			if(array[y][x-1] == 2) {
				array[y][x-1] = 2;
			} else if(array[y][x-1] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y][x-1] == 2) {
				array[y][x] = 2;
				return 0;
			}

		}
		return 0;
	}

	public static int method16(int y,int x) {//→

		if(x < 7) {
			if(array[y][x+1] == 1) {
				method16(y,x+1);
			}
			if(array[y][x+1] == 2) {
				array[y][x+1] = 2;
			} else if(array[y][x+1] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y][x+1] == 2) {
				array[y][x] = 2;
				return 0;
			}
		}

		return 0;
	}

	public static int method17(int y,int x) {//↑
		if(0 < y) {
			if(array[y-1][x] == 1) {
				method17(y-1,x);
			}
			if(array[y-1][x] == 2) {
				array[y-1][x] = 2;
			} else if(array[y-1][x] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y-1][x] == 2) {
				array[y][x] = 2;
				return 0;
			}

		}
		return 0;
	}

	public static int method18(int y,int x) {//↓
		if(y < 7) {
			if(array[y+1][x] == 1) {
				method18(y+1,x);
			}
			if(array[y+1][x] == 2) {
				array[y+1][x] = 2;
			} else if(array[y+1][x] == 1) {
				array[y][x] = 1;
			} else {
				return 0;
			}
			if(array[y+1][x] == 2) {
				array[y][x] = 2;
				return 0;
			}

		}
		return 0;
	}
	//数を数える
	public static void count() {
		a = 0;
		b = 0;

		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
				if(array[i][j] == 1) {//黒
					a = a + 1;
				} else if(array[i][j] == 2) {//白
					b = b + 1;
				} else {

				}
			}
		}
		if(a == 0) {
			black = false;
		} else if(b == 0) {
			white = false;
		}
	}
}




