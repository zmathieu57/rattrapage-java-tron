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
    				Bike d = (Bike) this.getModel().getTabMapXY(somethink_x, somethink_y) ;
    				d.setAlive(false);
    				return true;
    			break;
    			} 
    	}
}
    
    public void Move(Graphics move, int x, int y, Direction direction, Permeability permeability, int key)
	{
		if (key != 32) {
			
		if (collision(move, x, y, direction, permeability, key) == false && this.getMove().isAlive() == true) {
            
			switch (key) {
            case 113: /*Q*/
            	if(direction == Direction.UP) {
            		this.getMove().moveLeft(move, x, y);
            	}
            	else if (direction == Direction.LEFT) {
            		this.getMove().moveDown(move, x, y);
            	}
            	else if (direction == Direction.DOWN) {
            		this.getMove().moveRight(move, x, y);
            	}
            	else if (direction == Direction.RIGHT) {
            		this.getMove().moveUp(move, x, y);
            	}
                break;
            case 100:/*D*/
            	if(direction == Direction.UP) {
            		this.getMove().moveRight(move, x, y);
            	}
            	else if (direction == Direction.RIGHT) {
            		this.getMove().moveDown(move, x, y);
            	}
            	else if (direction == Direction.DOWN) {
            		this.getMove().moveLeft(move, x, y);
            	}
            	else if (direction == Direction.LEFT) {
            		this.getMove().moveUp(move, x, y);
            	}
            	break;
            case 52:/*4*/
            	if(direction == Direction.UP) {
            		this.getMove().moveLeft(move, x, y);
            	}
            	else if (direction == Direction.LEFT) {
            		this.getMove().moveDown(move, x, y);
            	}
            	else if (direction == Direction.DOWN) {
            		this.getMove().moveRight(move, x, y);
            	}
            	else if (direction == Direction.RIGHT) {
            		this.getMove().moveUp(move, x, y);
            	}
            	break;
            case 54:/*6*/
            	if(direction == Direction.UP) {
            		this.getMove().moveRight(move, x, y);
            	}
            	else if (direction == Direction.RIGHT) {
            		this.getMove().moveDown(move, x, y);
            	}
            	else if (direction == Direction.DOWN) {
            		this.getMove().moveLeft(move, x, y);
            	}
            	else if (direction == Direction.LEFT) {
            		this.getMove().moveUp(move, x, y);
            	}
            	break;  
            default:
				System.out.println("Not supported order ");
				break;
            }
            key = 0; 
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
