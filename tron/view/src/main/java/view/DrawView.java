package view;

import java.awt.*;
import javax.swing.*;

public class DrawView extends JPanel implements IView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int a;
	public int b;
	public int c;
	public int d;
	public int e;
	public int f;
	public int g;
	public int h;
	public int i;
	public int j;
	public int k;
	public int l;

	public void paintComponent(Graphics g1) {
		g1.setColor(Color.cyan);
		g1.drawLine(a,b,c,d);
		
		g1.setColor(Color.yellow);
		g1.drawLine(e,f,g,h);
		
		g1.setColor(Color.cyan);
		g1.drawRect(i,j,k,l);
	}
}
