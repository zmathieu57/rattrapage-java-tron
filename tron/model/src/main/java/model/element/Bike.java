package model.element;

import java.awt.*;

/**
 * 
 * @author mathi
 *
 */
public class Bike extends Element implements IMove {
	
	private Direction direction;
	private boolean alive = true;
	private int position_x;
	private int position_y;
	
	/**
	 * @author mathi
	 * @param permeability
	 * @param color
	 * @param direction
	 * @param position_x
	 * @param position_y
	 * @param alive
	 */
	public Bike (Permeability permeability, Color color, Direction direction, int position_x, int position_y, boolean alive) {
		super(permeability, color);
		this.direction = direction;
		this.position_x = position_x;
		this.position_y = position_y;
		this.alive = alive;
	}
	
	/**
	 * @author mathi
	 */
	protected void die() {
		
	}
	
	/**
	 * @author mathi
	 */
	public void moveUp(Graphics Up, int x, int y) {
		x = this.position_x;
		y = this.position_y;
		Up.setColor(this.getColor());
		Up.drawLine(x,y,x,y+10);
	}
	
	/**
	 * @author mathi
	 */
	public void moveDown(Graphics Down, int x, int y) {
		x = this.position_x;
		y = this.position_y;
		Down.setColor(this.getColor());
		Down.drawLine(x,y,x,y-10);
	}
	
	/**
	 * @author mathi
	 */
	public void moveLeft(Graphics Left, int x, int y) {
		x = this.position_x;
		y = this.position_y;
		Left.setColor(this.getColor());
		Left.drawLine(x,y,x-10,y);
	}
	
	/**
	 * @author mathi
	 */
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
