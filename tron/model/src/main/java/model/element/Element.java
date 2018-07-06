package model.element;

import java.awt.Color;

/**
 * 
 * @author mathi
 *
 */
public class Element implements IElement {
	
	private Permeability permeability;
	private Color color;

	/**
	 * @author mathi
	 * @param permeability
	 * @param color
	 */
	public Element(Permeability permeability, Color color) {
		this.setPermeability(permeability);
		this.setColor(color);
	}
	
	
	/*Getter and Setter*/
	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
}
