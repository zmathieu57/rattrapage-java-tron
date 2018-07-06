package model.element;

import java.awt.*;

public class ElementFactory {
	
	private static Wall wall1;
	private static Wall wall2;
	private static Wall wall3;
	private static Wall wall4;
	private static Bike bike1;
	private static Bike bike2;

	/**
	 * @author mathi
	 * @param g
	 */
	public void paintComponent(Graphics g) {
		
		setWall1(new Wall(Permeability.WALL, Color.cyan, g,10, 10, 590, 10));
		setWall2(new Wall(Permeability.WALL, Color.cyan, g,10, 10, 10, 390));
		setWall3(new Wall(Permeability.WALL, Color.cyan, g,590, 10, 590, 390));
		setWall4(new Wall(Permeability.WALL, Color.cyan, g,10, 390, 590, 390));
		
		setBike1(new Bike(Permeability.BIKE, Color.cyan, Direction.UP, 20, 380, true));
		setBike2(new Bike(Permeability.BIKE, Color.yellow, Direction.DOWN, 580, 20, true));
	}

	
	/*Getter and Setter*/
	public static Wall getWall1() {
		return wall1;
	}

	public void setWall1(Wall wall1) {
		ElementFactory.wall1 = wall1;
	}

	public static Wall getWall2() {
		return wall2;
	}

	public void setWall2(Wall wall2) {
		ElementFactory.wall2 = wall2;
	}

	public static Wall getWall3() {
		return wall3;
	}

	public void setWall3(Wall wall3) {
		ElementFactory.wall3 = wall3;
	}
	
	public static Wall getWall4() {
		return wall4;
	}

	public void setWall4(Wall wall4) {
		ElementFactory.wall4 = wall4;
	}

	public static Bike getBike1() {
		return bike1;
	}

	public void setBike1(Bike bike1) {
		ElementFactory.bike1 = bike1;
	}

	
	public static Bike getBike2() {
		return bike2;
	}

	public void setBike2(Bike bike2) {
		ElementFactory.bike2 = bike2;
	}
	

}
