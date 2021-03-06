package com.hexaware.MLP152.factory;

import com.hexaware.MLP152.persistence.MenuDAO;
import com.hexaware.MLP152.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP152.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class MenuFactory {
  /**
   *  Protected constructor.
   */
  protected MenuFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static MenuDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Menu[] showMenu() {
    List<Menu> menu = dao().show();
    return menu.toArray(new Menu[menu.size()]);
  }

  /**
   * @return the food cost
   * @param foodId sends the foodId
   */
  public static Menu showMenuById(final int foodId) {
    Menu foodCost = dao().showById(foodId);
    return foodCost;
  }
}
