package Bike;

import model.Direction;
import model.Permeability;

public class Bike1 extends Bike {

	public Bike1(Permeability permeability, Direction direction, boolean alive) {
		super(permeability.BIKE, direction.UP, alive);
	}
}
