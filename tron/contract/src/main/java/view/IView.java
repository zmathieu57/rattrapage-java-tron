package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

	JFrame window( String r, int t, int u, Color v);
	
	JLabel text(String x);
	
	JTextField seizure(int y);
		
	JButton button(String z);
    
}
