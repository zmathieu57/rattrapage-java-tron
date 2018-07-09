package model.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql insert winner. */
    private static String sqlinsertWinner   = "{call insertWinner(?)}";

    /** the sql insert user. */
    private static String sqlinsertUser   = "{call insertUser(?,?)}";
    
    /**
     * @author mathi
     * @param winner
     * @return
     * @throws SQLException
     */
    public static Example getinsertWinner(final String winner) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlinsertWinner);
        Example example = null;
        callStatement.setString(1, winner);
        callStatement.execute();
        return example;
    }
    
    /**
     * @author mathi
     * @param userone
     * @param usertwo
     * @return
     * @throws SQLException
     */
    public static Example getinsertUser(final String userone, final String usertwo) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlinsertUser);
        Example example = null;
        callStatement.setString(1, userone);
        callStatement.setString(2, usertwo);
        callStatement.execute();
        return example;
    }
}