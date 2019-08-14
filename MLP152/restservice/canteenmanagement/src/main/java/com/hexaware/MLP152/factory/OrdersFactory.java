package com.hexaware.MLP152.factory;
import com.hexaware.MLP152.persistence.OrdersDAO;
import com.hexaware.MLP152.persistence.DbConnection;
import com.hexaware.MLP152.model.Orders;
import java.util.List;

/**
* OrdersFactory class used to fetch orders data from database.
* @author hexware
*/
public class OrdersFactory {
/**
*protected constructor.
*/
/**
*call the data base connection.
*/
  protected OrdersFactory() {
  }
/**
*call the data base connection.
*@return the Connection object.
*/
  private static
      OrdersDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(OrdersDAO.class);
  }

/**
*call the data base connection.
*@return array of menu object.
*/

  public static
      Orders[] showHistory() {
    List<Orders> vendor = dao().show();
    return vendor.toArray(new Orders[vendor.size()]);
  }
}
