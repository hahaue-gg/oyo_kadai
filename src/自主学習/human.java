package 自主学習;

public class human {
	String name;
	int age;
	String hobby;
	int money;

	public human(){
		name = "名無し";
		age = 0;
		hobby = "なし";
		money = 0;
	}

	public human(String name, int age, String hobby, int money){
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.money = money;
	}
	public void showinfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(money);
		System.out.println(hobby);

	}

	public void getmoney(int i) {
		// TODO 自動生成されたメソッド・スタブ
		money += i;
	}

}
