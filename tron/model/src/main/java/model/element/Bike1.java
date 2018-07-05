package model.element;

import java.awt.Color;

public class Bike1 extends Bike {

	public Bike1(Permeability permeability, Direction direction, int position_x, int position_y, Color color_z, boolean alive ) {
		super(permeability.BIKE, direction.UP, 20, 370, Color.cyan, alive);
	}
}
