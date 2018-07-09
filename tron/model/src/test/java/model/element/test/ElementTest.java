package model.element.test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import model.element.Permeability;
import model.element.Element;


public class ElementTest {
	
	@Test
	public final void testgetpermeability() {
		Element element = new Element(Permeability.WALL, Color.red);
		element.setPermeability(Permeability.WALL);
		assertTrue(element.getPermeability() == Permeability.WALL);
		}
	
	@Test
	public final void testsetpermeability() {
		Element element = new Element(Permeability.WALL, Color.red);
		element.setPermeability(Permeability.WALL);
		assertTrue(element.getPermeability() == Permeability.WALL);
		}

	@Test
	public final void testgetcolor() {
		Element element = new Element(Permeability.WALL, Color.red);
		element.setColor(Color.red);
		assertTrue(element.getColor() == Color.red);
		}
	
	@Test
	public final void testsetcolor() {
		Element element = new Element(Permeability.WALL, Color.red);
		element.setColor(Color.red);
		assertTrue(element.getColor() == Color.red);
		}
}
