package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, ActionListener {

	JFrame window1 = window("Tron : Main", 275, 175, Color.gray);
	JFrame window2 = window("Tron : Game", 600, 400, Color.darkGray);
	JPanel zonedraw = draw(Color.white);
	JLabel text1 = text("Enter an ID before launching the game");
	JTextField seizure1 = seizure(15);
	JLabel text2 = text("Player 1");
	JTextField seizure2 = seizure(15);
	JLabel text3 = text("Player 2");
	JButton button1 = button("Play Game");
	JButton button2 = button("Quit Game");
	
    /**
     * @author mathi
     * Instantiates a new view facade.
     */
    public ViewFacade() {    	
    	main();
    }
    
    /**
     * @author mathi
     */
    public void main() {
    	button1.addActionListener(this);
    	button2.addActionListener(this);

		zonedraw.add(text1);
		zonedraw.add(seizure1);
		zonedraw.add(text2);
		zonedraw.add(seizure2);
		zonedraw.add(text3);
		zonedraw.add(button1);
		zonedraw.add(button2);
		window1.add(zonedraw);
		window1.setVisible(true);
    }
    
    /**
     * @author mathi
     */
    public void game() {
    	window2.setVisible(true);
    }
    
    /**
     * @author mathi
     */
    public JFrame window( String r, int t, int u, Color v) {    	
    	JFrame window = new JFrame();
		window.setTitle(r);
		window.setSize(t,u);
		window.setBackground(v);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return window;
    }
    
    /**
     * @author mathi
     * 
     */
    public JPanel draw(Color s) {
    	JPanel draw = new JPanel();
    	draw.setBackground(s);
    	return draw;
    }
    
    /**
     * @author mathi
     */
    public JLabel text(String x) {
		JLabel write = new JLabel(x);
		return write;
	}
	
    /**
     * @author mathi
     */
	public JTextField seizure(int y) {		
		JTextField entrer = new JTextField();
		entrer.setColumns(y);
		return entrer;
	}
	
	/**
	 * @author mathi
	 */
	public JButton button(String z) {		
		JButton bouton = new JButton(z);
		return bouton;
	}
	
	/**
	 * @author mathi
	 */
	public void showWindow() {
		main();		
	}
	
	/**
	 * @author mathi
	 */
	public  void    actionPerformed(ActionEvent e)
    {
        Object  source=e.getSource();
        
        if  (source==button1) {
        	game();
        	window1.dispose();
        }
        else if (source==button2) {
        	System.exit(0);
        }
            
    }

}
