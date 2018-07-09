package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class map extends JPanel {
	
	public void paintComponent(Graphics g) {
    	g.setColor(Color.cyan);
		g.drawLine(10,10,590,10);
		
		g.setColor(Color.cyan);
		g.drawLine(10,10,10,390);
		
		g.setColor(Color.cyan);
		g.drawLine(590,10,590,390);
		
		g.setColor(Color.cyan);
		g.drawLine(10,390,590,390);
		
		g.setColor(Color.cyan);
		g.drawLine(20, 380, 20, 380);
		
		g.setColor(Color.orange);
		g.drawLine(580, 20, 580, 20);
    }

}
