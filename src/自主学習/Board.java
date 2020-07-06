package 自主学習;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board implements ActionListener{

	Piece[][] pButton;

	JFrame frame = new JFrame("オセロ");	//タイトル
	JPanel panel = new JPanel();
	JButton[][] b= new JButton[8][8];

	public Board(){							//メインメソッドの一つ目
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500,1500);			//サイズ
		panel.setLayout(null);				//レイアウト
		panel.setBackground(Color.blue);	//背景
		frame.add(panel);

		pButton = new Piece[8][8];

		for(int i=0;i<64;i++){
			int x=i/8;
			int y=i%8;

			pButton[x][y]=new Piece();
			pButton[x][y].setSize(1000,1000);
			pButton[x][y].setBounds(x*80+10,y*80+10,80,80);
			pButton[x][y].setMargin(new Insets(0,0,0,0));
			pButton[x][y].setBackground(Color.green);
			pButton[x][y].setFont(new Font("MSゴシック",Font.PLAIN,60));
			pButton[x][y].setActionCommand(String.valueOf(i));//ボタン判別に利用
			pButton[x][y].addActionListener(this);
			panel.add(pButton[x][y]);
		}
	}
	public void actionPerformed(ActionEvent e){

		String str = e.getActionCommand();
		System.out.println(str);
		int data = Integer.parseInt(str);		//文字列を数字にするやつ

		int x=data/8;
		int y=data%8;

		if(Piece.p[x+1][y+1]==0 || checkPutPiece()){		//斜め見てるやつ	//ひっくり返すメソッド
			Piece.p[x+1][y+1]=Piece.turn;

			Piece.checkRev(x+1,y+1);
			putPiece();

			if(Piece.turn==Piece.BLACK){
				Piece.turn=Piece.WHITE;
			}else{
				Piece.turn=Piece.BLACK;
			}




		}
	}

	public boolean checkPutPiece(){
		//裏返せるかの判定
		if(true){
			return false;
		}

		return true;
	}

	public void putPiece(){				//二つ目のメソッド
		for(int i=0;i<100;i++){
			int x=i/10;
			int y=i%10;

			if(Piece.p[x][y]==Piece.BLACK){
				pButton[x-1][y-1].setText("●");
			}else if(Piece.p[x][y]==Piece.WHITE){
				pButton[x-1][y-1].setText("○");


			}
		}

	}
	//posの右にひっくり返せる駒があるか判定する
	//posの右下
	//posの下
	//posの左下
	//posの左
	//posの左上
	//posの上
	//posの右上
}
