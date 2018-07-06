package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
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

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The winner column index. */
    private static int    winnerColumnIndex  = 2;

    /**
     * 
     * @param winner
     * @return
     * @throws SQLException
     */
    public static Example getinsertWinner(final String winner) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlinsertWinner);
        Example example = null;
        callStatement.setString(2, winner);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(winnerColumnIndex));
            }
            result.close();
        }
        return example;
    }
}