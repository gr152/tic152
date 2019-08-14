package com.hexaware.MLP152.persistence;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hexaware.MLP152.model.Orders;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

/**
* MenuMapper class used to fetch menu data from database.
* @author hexware
*/
public class OrdersMapper implements ResultSetMapper<Orders> {
/**
* @param idx the index
* @param rs the resultset
* @param ctx the context
* @return the mapped vendor object
* @throws SQLException in case there is an error in fetching data from the resultset
*/
  public final Orders map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
/**
* @return vendor History
*/
    return new Orders(rs.getInt("O_ID"), rs.getInt("F_ID"), rs.getInt("E_ID"), rs.getInt("V_ID "), rs.getString("O_STATUS"), rs.getString("O_DATE"),
    rs.getInt("O_QUANTITY"), rs.getInt("O_TOTAL_AMOUNT"), rs.getString("O_ESTIMATED_TIME"), rs.getString("O_CANCEL_TIME"));
  }
}
