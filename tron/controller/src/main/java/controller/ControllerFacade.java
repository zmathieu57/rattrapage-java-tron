package controller;

import java.awt.Graphics;
import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import model.element.IMove;
import model.element.Permeability;
import model.element.Direction;
import model.element.IElement;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    
    private final IMove move;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     * @param move
     */
    public ControllerFacade(final IView view, final IModel model, final IMove move) {
        super();
        this.view = view;
        this.model = model;
        this.move = move;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        this.getView().showWindow();
		this.getModel().getinsertUser(this.getView().getUser1(), this.getView().getUser2());

    }

    private Boolean collision (Graphics colision, int somethink_x, int somethink_y, Direction direction_somethink, Permeability permeability_somethink, int Stackkey  ) {
		int local_x = 0;
		int local_y = 0; 
        switch (Stackkey) {
            case 113: /*Q*/
    			local_x = local_x + 0 ; 
    			local_y = local_y - 1;
break;
            case 100:/*D*/
    			local_x = local_x + 0; 
    			local_y = local_y + 1 ;
            	
break;
            case 52:/*4*/
    			local_x = local_x + 1 ; 
    			local_y = local_y + 0;
break;
            case 54:/*6*/
    			local_x = local_x - 1  ; 
    			local_y = local_y + 0 ;
break;
        }
        
    if (permeability_somethink == Permeability.BIKE) 
    	{
    			switch(getModel().getTabMapXY(somethink_x + local_x, somethink_y + local_y).getPermeability())  
    			{
    			
    			case Permeability.WALL:
    				this.getMove().go(colision, somethink_x, somethink_y);
    				return true;
    			break;
    			
    			case Permeability.DEAD:
    				Bike d = (Bike) this.getModel().go(somethink_x, somethink_y) ;
    				d.setAlive(false);
    				return true;
    			break;
    			} 
    	}
}
    
    public void Move1(Graphics move1, int x1, int y1, Direction direction1, Permeability permeability1, int key1)
	{
		if (key1 != 32) {
			
		if (collision(move1, x1, y1, direction1, permeability1, key1) == false && this.getMove().isAlive() == true) {
            
			switch (key1) {
            case 113: /*Q*/
            	if(direction1 == Direction.UP) {
            		this.getMove().moveLeft(move1, x1, y1);
            	}
            	else if (direction1 == Direction.LEFT) {
            		this.getMove().moveDown(move1, x1, y1);
            	}
            	else if (direction1 == Direction.DOWN) {
            		this.getMove().moveRight(move1, x1, y1);
            	}
            	else if (direction1 == Direction.RIGHT) {
            		this.getMove().moveUp(move1, x1, y1);
            	}
                break;
            case 100:/*D*/
            	if(direction1 == Direction.UP) {
            		this.getMove().moveRight(move1, x1, y1);
            	}
            	else if (direction1 == Direction.RIGHT) {
            		this.getMove().moveDown(move1, x1, y1);
            	}
            	else if (direction1 == Direction.DOWN) {
            		this.getMove().moveLeft(move1, x1, y1);
            	}
            	else if (direction1 == Direction.LEFT) {
            		this.getMove().moveUp(move1, x1, y1);
            	}
            	break;
            default:
            	if(direction1 == Direction.UP) {
            		this.getMove().moveUp(move1, x1, y1);
            	}
            	else if (direction1 == Direction.LEFT) {
            		this.getMove().moveLeft(move1, x1, y1);
            	}
            	else if (direction1 == Direction.DOWN) {
            		this.getMove().moveDown(move1, x1, y1);
            	}
            	else if (direction1 == Direction.RIGHT) {
            		this.getMove().moveRight(move1, x1, y1);
            	}
                break;
            }
            key1 = 0; 
		}
		return;
	}
}
    
    public void Move2(Graphics move2, int x2, int y2, Direction direction2, Permeability permeability2, int key2)
	{
		if (key2 != 32) {
			
		if (collision(move2, x2, y2, direction2, permeability2, key2) == false && this.getMove().isAlive() == true) {
            
			switch (key2) {
            case 52:/*4*/
            	if(direction2 == Direction.UP) {
            		this.getMove().moveLeft(move2, x2, y2);
            	}
            	else if (direction2 == Direction.LEFT) {
            		this.getMove().moveDown(move2, x2, y2);
            	}
            	else if (direction2 == Direction.DOWN) {
            		this.getMove().moveRight(move2, x2, y2);
            	}
            	else if (direction2 == Direction.RIGHT) {
            		this.getMove().moveUp(move2, x2, y2);
            	}
            	break;
            case 54:/*6*/
            	if(direction2 == Direction.UP) {
            		this.getMove().moveRight(move2, x2, y2);
            	}
            	else if (direction2 == Direction.RIGHT) {
            		this.getMove().moveDown(move2, x2, y2);
            	}
            	else if (direction2 == Direction.DOWN) {
            		this.getMove().moveLeft(move2, x2, y2);
            	}
            	else if (direction2 == Direction.LEFT) {
            		this.getMove().moveUp(move2, x2, y2);
            	}
            	break;  
            default:
            	if(direction2 == Direction.UP) {
            		this.getMove().moveUp(move2, x2, y2);
            	}
            	else if (direction2 == Direction.LEFT) {
            		this.getMove().moveLeft(move2, x2, y2);
            	}
            	else if (direction2 == Direction.DOWN) {
            		this.getMove().moveDown(move2, x2, y2);
            	}
            	else if (direction2 == Direction.RIGHT) {
            		this.getMove().moveRight(move2, x2, y2);
            	}
                break;
            }
            key2 = 0; 
		}
		return;
	}
}
       
    public IView getView() {
        return this.view;
    }

    public IModel getModel() {
        return this.model;
    }

	public IMove getMove() {
		return move;
	}
}
