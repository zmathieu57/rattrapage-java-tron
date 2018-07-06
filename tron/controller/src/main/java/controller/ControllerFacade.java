package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import model.element.IMove;
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
