package model.element.test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import model.element.Direction;
import model.element.Permeability;
import model.element.Bike;

public class BikeTest {
	
	@Test
	public final void testdie() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testmoveup() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testmovedown() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testmoveleft() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testmoveright() {
		fail("Not yet implemented");
	}

	@Test
	public final void testgo() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testgetdirection() {
		Bike bike = new Bike(Permeability.WALL, Color.red, Direction.UP, 10, 20, false);
		bike.setDirection(Direction.UP);
		assertTrue(bike.getDirection() == Direction.UP);
		}
	
	@Test
	public final void testsetdirection() {
		Bike bike = new Bike(Permeability.WALL, Color.red, Direction.UP, 10, 20, false);
		bike.setDirection(Direction.UP);
		assertTrue(bike.getDirection() == Direction.UP);
		}
	
	@Test
	public final void testisalive() {
		Bike bike = new Bike(Permeability.WALL, Color.red, Direction.UP, 10, 20, false);
		bike.setAlive(false);
		assertTrue(bike.isAlive() == false);
		}
	
	@Test
	public final void testsetalive() {
		Bike bike = new Bike(Permeability.WALL, Color.red, Direction.UP, 10, 20, false);
		bike.setAlive(false);
		assertTrue(bike.isAlive() == false);
		}
}
