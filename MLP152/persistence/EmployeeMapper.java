package com.hexaware.MLP152.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP152.model.Employee;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * MenuMapper class used to fetch menu data from database.
 * @author hexware
 */
public class EmployeeMapper implements ResultSetMapper<Employee> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Employee map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Employee
       */
    return new Employee(rs.getInt("E_ID"), rs.getString("E_NAME"), rs.getString("E_USERNAME"), rs.getString("E_PASSWORD"),
                        rs.getInt("E_WALLET_BALANCE"), rs.getString("E_EMAIL"), rs.getString("E_ADDRESS"), rs.getInt("E_CONTACT"));
  }
}
