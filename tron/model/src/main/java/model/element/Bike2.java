package model.element;

import java.awt.Color;

public class Bike2 extends Bike{

	public Bike2(Permeability permeability, Direction direction, int position_x, int position_y, Color color_z, boolean alive) {
		super(permeability.BIKE, direction.DOWN, 570, 20, Color.yellow, alive);
	}
}
