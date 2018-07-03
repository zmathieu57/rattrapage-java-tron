package view;

import java.awt.*;
import javax.swing.*;

public class GameView extends JFrame{
	
	public GameView()  {
		JFrame game = new JFrame();
		game.setTitle("Tron : Game");
		game.setSize(600,400);
		game.setLocationRelativeTo(null);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.darkGray);
		game.setContentPane(panel2);
		
		game.setVisible(true);
		
	}

}
