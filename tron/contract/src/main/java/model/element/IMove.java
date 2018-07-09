package model.element;

import java.awt.*;

/**
 * 
 * @author mathi
 *
 */
public interface IMove {
	
	public void moveUp(Graphics Up, int x, int y);
	
	public void moveDown(Graphics Down, int x, int y);
	
	public void moveLeft(Graphics Left, int x, int y);
	
	public void moveRight(Graphics Right, int x, int y);
	
	public void go(Direction direction, Graphics go, int x, int y);
	
	public Direction getDirection();
	
	public boolean isAlive();

}
