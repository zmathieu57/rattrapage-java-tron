package Bike;

import model.Direction;
import model.Permeability;

public class Bike2 extends Bike{

	public Bike2(Permeability permeability, Direction direction, boolean alive) {
		super(permeability.BIKE, direction.DOWN, alive);
	}
}
