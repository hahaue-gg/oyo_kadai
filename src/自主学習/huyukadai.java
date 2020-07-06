package 自主学習;

public class huyukadai {

	public static void main(String[] args) {
		System.out.println("私はオセロを作ってみました");
		Board b=new Board();
		Piece p=new Piece();

		p.pieceSetting();
		b.putPiece();

		System.out.println("ソースコードはこちら");
		System.out.println("すみませんでした");
	}
}

