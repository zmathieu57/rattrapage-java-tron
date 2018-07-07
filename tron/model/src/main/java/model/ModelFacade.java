package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {

    /**
     * @author mathi
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getinsertWinner(final String Winner) throws SQLException {
        return ExampleDAO.getinsertWinner(Winner);
    }
    
    @Override
    public Example getinsertUser(final String userone, final String usertwo) throws SQLException {
        return ExampleDAO.getinsertUser(userone, usertwo);
    }
}
