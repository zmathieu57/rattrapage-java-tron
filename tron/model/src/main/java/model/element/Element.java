package model.element;

import java.awt.Color;

public class Element {
	
	private Permeability permeability;
	private Color color;


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
