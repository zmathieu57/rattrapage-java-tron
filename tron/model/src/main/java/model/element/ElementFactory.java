package model.element;

import java.awt.*;

public class ElementFactory {
	
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Bike bike1;
	private Bike bike2;

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
	public Wall getWall1() {
		return wall1;
	}

	public void setWall1(Wall wall1) {
		this.wall1 = wall1;
	}

	public Wall getWall2() {
		return wall2;
	}

	public void setWall2(Wall wall2) {
		this.wall2 = wall2;
	}

	public Wall getWall3() {
		return wall3;
	}

	public void setWall3(Wall wall3) {
		this.wall3 = wall3;
	}
	
	public Wall getWall4() {
		return wall4;
	}

	public void setWall4(Wall wall4) {
		this.wall4 = wall4;
	}

	public Bike getBike1() {
		return bike1;
	}

	public void setBike1(Bike bike1) {
		this.bike1 = bike1;
	}

	
	public Bike getBike2() {
		return bike2;
	}

	public void setBike2(Bike bike2) {
		this.bike2 = bike2;
	}
	

}
