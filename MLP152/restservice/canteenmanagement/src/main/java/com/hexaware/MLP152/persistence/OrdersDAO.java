package com.hexaware.MLP152.persistence;

import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.util.List;
import com.hexaware.MLP152.model.Orders;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
* ordersDAO class used to fetch data from data base.
* @author hexware
*/

public interface OrdersDAO {

/**
* @return the all the orders record.
*/
  @SqlQuery("Select * from Orders")
  @Mapper(OrdersMapper.class)
List<Orders> show();
}
