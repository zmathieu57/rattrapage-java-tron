package view;

import java.awt.*;
import javax.swing.*;


public class MainView extends JFrame implements IMainView {

	private static final long serialVersionUID = 1L;

	public MainView()  {
		JFrame menu = new JFrame();
		menu.setTitle("Tron : Menu");
		menu.setSize(275,175);
		menu.setLocationRelativeTo(null);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GRAY);
		menu.setContentPane(panel1);
		
		JLabel text1 = text("Enter an ID before launching the game");
		JTextField seizure1 = seizure(15);
		JLabel text2 = text("Player 1");
		JTextField seizure2 = seizure(15);
		JLabel text3 = text("Player 3");
		JButton button1 = button("Play Game");
		JButton button2 = button("Quit Game");
		
		menu.add(text1);
		menu.add(seizure1);
		menu.add(text2);
		menu.add(seizure2);
		menu.add(text3);
		menu.add(button1);
		menu.add(button2);
		
		menu.setVisible(true);
		
	}
	
	public JLabel text(String f) {
		JLabel write = new JLabel(f);
		return write;
	}
	
	public JTextField seizure(int g) {
		JTextField entrer = new JTextField();
		entrer.setColumns(g);
		return entrer;
	}
	
	public JButton button(String h) {
		JButton bouton = new JButton(h);
		return bouton;
	}
}
