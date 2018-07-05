package model.element;

import java.awt.*;

public class Bike {
	
	private Permeability permeability;
	private Direction direction;
	private boolean alive = true;
	private int position_x;
	private int position_y;
	private Color color_z;
	
	public Bike (Permeability permeability, Direction direction, int position_x, int position_y, Color color_z, boolean alive ) {
		this.setPermeability(permeability);
		this.direction = direction;
		this.position_x = position_x;
		this.position_y = position_y;
		this.color_z = color_z;
		this.alive = alive;
	}
	
	protected void die() {
		
	}
		
	public void moveUp(Graphics Up, int x, int y, Color z) {
		x = this.position_x;
		y = this.position_y;
		z = this.color_z;
		Up.setColor(z);
		Up.drawLine(x,y,x,y+10);
	}
	
	public void moveDown(Graphics Down, int x, int y, Color z) {
		x = this.position_x;
		y = this.position_y;
		z = this.color_z;
		Down.setColor(z);
		Down.drawLine(x,y,x,y-10);
	}
	
	public void moveLeft(Graphics Left, int x, int y, Color z) {
		x = this.position_x;
		y = this.position_y;
		z = this.color_z;
		Left.setColor(z);
		Left.drawLine(x,y,x-10,y);
	}
	
	public void moveRight(Graphics Right, int x, int y, Color z) {
		x = this.position_x;
		y = this.position_y;
		z = this.color_z;
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
