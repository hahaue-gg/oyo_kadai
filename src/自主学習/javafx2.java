package 自主学習;

import org.omg.Messaging.SyncScopeHelper;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class javafx2 extends Application{
	static Button button2;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {


		primaryStage.setWidth(300);
		primaryStage.setHeight(400);

		primaryStage.show();
		//アンカーペインインスタンスの生成
		AnchorPane root = new AnchorPane();
		//Sceneの生成
		Scene scene = new Scene(root);

		primaryStage.setScene(scene);
		//ボタンの生成
		Button button1 = new Button("ボタン１");
		button1.setOnAction(event->System.out.println("ボタンが押されたよ"));

		button2 = new Button("ボタン２");
		button2.setOnAction(event->System.out.println("ボタン２が押されたよ"));

		Button button3 = new Button("ボタン３");
		button2.setOnAction(event->buttonpless2());

		FlowPane subpane = new FlowPane();

		Button button4 = new Button("ボタン４");
		Button button5 = new Button("ボタン５");

		//flowpaneにボタンを追加
		subpane.getChildren().addAll(button4,button5);
		//flowpaneのアンカーの指定
		AnchorPane.setTopAnchor(subpane, 100.0);
		AnchorPane.setLeftAnchor(subpane, 100.0);

		//アンカーペインの貼る位置の設定
		AnchorPane.setTopAnchor(button1, 30.0);
		AnchorPane.setLeftAnchor(button1, 50.0);
		AnchorPane.setTopAnchor(button2,100.0);
		AnchorPane.setLeftAnchor(button2, 70.0);
		AnchorPane.setTopAnchor(button3, 20.0);
		AnchorPane.setLeftAnchor(button3, 260.0);
		AnchorPane.setBottomAnchor(button3, 40.0);
		AnchorPane.setRightAnchor(button3, 40.0);
		//ペインにボタンを追加

		root.getChildren().addAll(button1,button2,button3);


	}
	public static void buttonpless2(){
		for(int i=0;i<10;i++){
			System.out.println("aaa");
		}
		button2.setText("aaa");
		button2.setStyle("-fx-backgrround-color:#FF0000");
		button2.setDisable(true);
	}

}
