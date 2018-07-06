package model.element;

import java.awt.Graphics;

public interface IMove {
	
	public void moveUp(Graphics Up, int x, int y);
	
	public void moveDown(Graphics Down, int x, int y);
	
	public void moveLeft(Graphics Left, int x, int y);
	
	public void moveRight(Graphics Right, int x, int y);
	
	public boolean isAlive();

}
