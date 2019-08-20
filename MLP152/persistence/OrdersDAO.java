package com.hexaware.MLP152.persistence;

import java.util.List;

import com.hexaware.MLP152.model.Orders;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 * OrdersDAO class used to fetch data from data base.
 *
 * @author hexware
 */
public interface OrdersDAO {
  /**
   * @return the all the Menu record.
   */

  @SqlQuery("Select * from Orders;")
  @Mapper (OrdersMapper.class)
List<Orders> show();

  /**
   * Insert into the orders table.
   * @param foodId to send foodId
   * @param eid to send employeeId
   * @param venId to send vendorId
   * @param formattedDate to send the date
   * @param quantity to send the food quantity
   * @param total to send the total cost to the db
   */
  @SqlUpdate("INSERT INTO ORDERS(F_ID, E_ID, V_ID, O_STATUS, O_DATE, O_QUANTITY, O_TOTAL_AMOUNT)"
              + "VALUES(:F_ID, :E_ID, :V_ID, 'PENDING', :O_DATE, :O_QUANTITY, :O_TOTAL_AMOUNT)")
  @Mapper (OrdersMapper.class)
void insertOrders(
      @Bind("F_ID") int foodId,
      @Bind("E_ID") int eid,
      @Bind("V_ID") int venId,
      @Bind("O_DATE") String formattedDate,
      @Bind("O_QUANTITY") int quantity,
      @Bind("O_TOTAL_AMOUNT") int total);
}
