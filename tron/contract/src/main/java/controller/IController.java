package controller;

import java.awt.Graphics;

import model.element.Direction;
import model.element.Permeability;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {
	
	public void Move1(Graphics move1, int x1, int y1, Direction direction1, Permeability permeability1, int key1);
	
	public void Move2(Graphics move2, int x2, int y2, Direction direction2, Permeability permeability2, int key2);

}
