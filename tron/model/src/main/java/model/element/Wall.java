package model.element;

import java.awt.*;

public class Wall extends Element{
	
	/**
	 * @author mathi
	 * @param permeability
	 * @param color
	 * @param wall
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Wall(Permeability permeability, Color color, Graphics wall, int x1, int y1, int x2, int y2) {
		super(permeability, color);
		
		wall.setColor(this.getColor());
		wall.drawLine(x1,y1,x2,y2);
	}
}
