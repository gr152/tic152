package com.hexaware.MLP152.factory;

import com.hexaware.MLP152.model.Menu;
import com.hexaware.MLP152.model.Orders;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.hexaware.MLP152.model.Employee;
import com.hexaware.MLP152.persistence.OrdersDAO;
import com.hexaware.MLP152.persistence.DbConnection;

/**
 * OrderFactory class used to fetch order data from database.
 * @author hexware
 */
public class OrdersFactory {
  /**
   *  Protected constructor.
   */
  protected OrdersFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static int foodPrice;
  private static int total;
  private static int check;
  private static int venId;
  private static OrdersDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(OrdersDAO.class);
  }
  /**
   * validate the wallet balance.
   * @param eid will use to get the customer details.
   * @param foodId will use to get the food details.
   * @param quantity will use to get the quantity.
   * @return the array of the menu items.
   */
  public static String checkWallet(final int eid, final int foodId, final int quantity) {
    Menu menu = MenuFactory.showMenuById(foodId);
    foodPrice = menu.getFoodPrice();
    total = foodPrice * quantity;
    System.out.println("Total price:" + total);
    Employee ord = EmployeeFactory.checkBalance(eid);
    check = ord.getEmployeeWalletbalance();
    System.out.println("Wallet Balance:" + check);
    if (check >= total) {
      String stat = OrdersFactory.placingOrder(foodId, quantity, eid);
      return stat;
    } else {
      System.out.println("Insufficient Wallet Balance");
      return "Its not placed";
    }
  }
  /**
   * validate the wallet balance.
   * @param eid will use to get the customer details.
   * @param foodId will use to get the food details.
   * @param quantity will use to get the quantity.
   * @return the array of the menu items.
   */
  public static String placingOrder(final int foodId, final int quantity, final int eid) {
    Menu menu = MenuFactory.showMenuById(foodId);
    //Orders order = OrdersFactory.ordVenId(foodId);
    venId = menu.getVendorId();
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatDateObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = myDateObj.format(myFormatDateObj);
    dao().insertOrders(foodId, eid, venId, formattedDate, quantity, total);
    return "Order placed successfully";
  }
  /**
*call the data base connection.
*@return array of menu object.
*/
  public static Orders[] showHistory() {
    List<Orders> vendor = dao().show();
    return vendor.toArray(new Orders[vendor.size()]);
  }
}
