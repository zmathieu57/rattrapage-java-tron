package model.element;

import java.awt.*;

public class Bike extends Element {
	
	private Direction direction;
	private boolean alive = true;
	private int position_x;
	private int position_y;
	
	public Bike (Permeability permeability, Color color, Direction direction, int position_x, int position_y, boolean alive) {
		super(permeability, color);
		this.direction = direction;
		this.position_x = position_x;
		this.position_y = position_y;
		this.alive = alive;
	}
	
	protected void die() {
		
	}
		
	public void moveUp(Graphics Up, int x, int y) {
		x = this.position_x;
		y = this.position_y;
		Up.setColor(this.getColor());
		Up.drawLine(x,y,x,y+10);
	}
	
	public void moveDown(Graphics Down, int x, int y) {
		x = this.position_x;
		y = this.position_y;
		Down.setColor(this.getColor());
		Down.drawLine(x,y,x,y-10);
	}
	
	public void moveLeft(Graphics Left, int x, int y) {
		x = this.position_x;
		y = this.position_y;
		Left.setColor(this.getColor());
		Left.drawLine(x,y,x-10,y);
	}
	
	public void moveRight(Graphics Right, int x, int y) {
		x = this.position_x;
		y = this.position_y;
		Right.setColor(this.getColor());
		Right.drawLine(x,y,x+10,y);
	}
	
	/* Getter and Setter*/
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
