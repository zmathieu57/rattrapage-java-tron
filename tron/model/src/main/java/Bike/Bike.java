package Bike;

import java.awt.*;

import model.Direction;
import model.Permeability;

public class Bike {
	
	private Permeability permeability;
	private Direction direction;
	private boolean alive = true;
	
	public Bike (Permeability permeability, Direction direction, boolean alive) {
		this.setPermeability(permeability);
		this.direction = direction;
		this.alive = alive;
	}
	
	protected void die() {
		
	}
		
	public void moveUp(Graphics Up, int x, int y, Color z) {
		Up.setColor(z);
		Up.drawLine(x,y,x,y+10);
	}
	
	public void moveDown(Graphics Down, int x, int y, Color z) {
		Down.setColor(z);
		Down.drawLine(x,y,x,y-10);
	}
	
	public void moveLeft(Graphics Left, int x, int y, Color z) {
		Left.setColor(z);
		Left.drawLine(x,y,x-10,y);
	}
	
	public void moveRight(Graphics Right, int x, int y, Color z) {
		Right.setColor(z);
		Right.drawLine(x,y,x+10,y);
	}
	
	/* Getter and Setter*/
	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	

}
