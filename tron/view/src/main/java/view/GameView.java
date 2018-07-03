package view;

import java.awt.*;
import javax.swing.*;

public class GameView extends JFrame{
	
	public GameView()  {
		JFrame game = new JFrame();
		game.setTitle("Tron : Game");
		game.setSize(600,400);
		game.setLocationRelativeTo(null);
		game.setBackground(Color.darkGray);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		game.setContentPane(new DrawView());
		
		game.setVisible(true);
		
	}

}
