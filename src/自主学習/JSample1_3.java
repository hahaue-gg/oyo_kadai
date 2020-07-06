package 自主学習;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JSample1_3{
  public static void main(String args[]){
    JFrame frame = new JFrame("MyTitle");
    frame.setBounds(100, 100, 600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button = new JButton("Push");

    frame.getContentPane().add(button, BorderLayout.NORTH);
    frame.setVisible(true);
  }
}
