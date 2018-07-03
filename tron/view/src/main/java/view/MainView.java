package view;

import java.awt.*;
import javax.swing.*;


public class MainView extends JFrame {
	
	public MainView()  {
		JFrame menu = new JFrame();
		menu.setTitle("Tron : Menu");
		menu.setSize(275,175);
		menu.setLocationRelativeTo(null);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GRAY);
		menu.setContentPane(panel1);
		
		JLabel texte0 = new JLabel("Enter an ID before launching the game");
		menu.add(texte0);
		
		JTextField saisie1 = new JTextField();
		saisie1.setColumns(15);
		menu.add(saisie1);
		
		JLabel texte1 = new JLabel("User 1");
		menu.add(texte1);
		
		JTextField saisie2 = new JTextField();
		saisie2.setColumns(15);
		menu.add(saisie2);
		
		JLabel texte2 = new JLabel("User 2");
		menu.add(texte2);
		
		JButton bouton1 = new JButton("Play Game");
		menu.add(bouton1);
		
		JButton bouton2 = new JButton("Quit Game");
		menu.add(bouton2);
		
		menu.setVisible(true);
		
	}

}
