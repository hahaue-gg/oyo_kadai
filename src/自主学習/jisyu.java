package 自主学習;

public class jisyu {

	public static void main(String[] args) {
		human h = new human();

		h.name = "田中";
		h.money = 20000;

		h.showinfo();

		human h2 = new human("高橋",29,"ピアノ",10000);

		h.showinfo();
		h2.showinfo();

		h.getmoney(7777);

		h.showinfo();
	}

}
