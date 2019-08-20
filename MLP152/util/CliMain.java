package com.hexaware.MLP152.util;

import java.util.Scanner;
import com.hexaware.MLP152.factory.MenuFactory;
import com.hexaware.MLP152.factory.OrdersFactory;
import com.hexaware.MLP152.model.Menu;
import com.hexaware.MLP152.factory.VendorFactory;
import com.hexaware.MLP152.model.Vendor;
import com.hexaware.MLP152.factory.EmployeeFactory;
import com.hexaware.MLP152.model.Employee;
import com.hexaware.MLP152.model.Orders;
/**
 * CliMain used as Client interface for java coding.
 *
 * @author hexware
 * @param empId is employeeid
 */
class CliMain {
  private int empId;
  private int venId;
  private Scanner option = new Scanner(System.in, "UTF-8");

/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Employee");
    System.out.println("2. Vendor");
    System.out.println("3. Exit");
    mainMenudetails();
  }

  /**
   * mainMenuDetails method process the option selected from main menu.
   */
  private void mainMenudetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          employeelogIn();
          break;
        case 2:
          vendorlogin();
          break;
        case 3:
          Runtime.getRuntime().halt(0);
          break;
        default:
          System.out.println("Invalid input");
          System.out.println("Choose either 1,2 or 3");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
   /**
 * employeelogInDetails method process the option selected from employee menu.
 */
  private void employeelogIn() {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Employee ID : ");
    empId = input1.nextInt();
    System.out.println("Password : ");
    String ePass = input1.next();
    Employee employee = EmployeeFactory.emplogin(empId, ePass);
    try {
      if (employee.getEmployeeId() == (empId) && employee.getEmployeePassword().equals(ePass)) {
        System.out.println("-------------------------");
        System.out.println("Your access was granted ");
        System.out.println("-------------------------");
        mainEmployee();
      }
    } catch (Exception e) {
      System.out.println("-----------------------");
      System.out.println("Invalid credentials!!!");
      System.out.println("-----------------------");
      employeelogIn();
    }
  }
  private void mainEmployee() {
    System.out.println("Employee Details");
    System.out.println("-----------------------");
    System.out.println("1. Employee Information");
    System.out.println("2. Order history");
    System.out.println("3. Place order");
    System.out.println("4. Exit");
    mainEmployeedetails();
  }

  /**
   * mainemployeeDetails method process the option selected from employee menu.
   */
  private void mainEmployeedetails() {
    try {
      System.out.println("Enter your choice:");
      int customerOption = option.nextInt();
      switch (customerOption) {
        case 1:
          showempDetails();
          mainEmployee();
          break;
        case 2:
          employeeOrderhistory();
          mainEmployee();
          break;
        case 3:
          employeePlaceorder();
          mainEmployee();
          break;
        case 4:
          Runtime.getRuntime().halt(0);
          break;
        default:
          System.out.println("Invalid input");
          System.out.println("Choose either 1,2 or 3");
      }
    } catch (Exception e) {
      //e.printStackTrace();
      System.out.println("Enter a valid value");
    }
    option.nextLine();
    mainEmployee();
  }
   /**
 * EmployeeDetails method  display the employee Information.
 * @return returns integer
 */
  public int showempDetails() {
    Employee[] employee = EmployeeFactory.showemp(empId);
    System.out.println("Employee Details");
    System.out.println("ID          Name          Username       Password        WalletBalance              Email                 Address");
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    for (Employee e : employee) {
      System.out.println(e.getEmployeeId() + "      " + e.getEmployeeName()
          +     "   " + e.getEmployeeUsername() + "   " + e.getEmployeePassword() + "        "
          + e.getEmployeeWalletbalance() + "         " + e.getEmployeeEmail() + "           " + e.getEmployeeAddress());
    }
    return 0;
  }
  private void employeeOrderhistory() {
    Orders[] orders = OrdersFactory.showHistory();
    System.out.println("EMPLOYEE ORDER HISTORY");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    System.out.println("OID     FID       EID       VID      OSTATUS      ODATE        OQUANTITY     OTOTALAMOUNT     OESTIMATEDTIME  OCANCELTIME");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
    for (Orders o : orders) {
      System.out.println(o.getOrdersId() + "       " + o.getFoodId()
          +     "      " + o.getEmployeeId() + "     " + o.getVendorId() + "     "
          + o.getOrdersStatus() + "       " + o.getOrdersDate() + "      " + o.getQuantity() + "           " + o.getTotalAmount()
          + "               " + o.getEstimatedTime() + "              " + o.getCancelTime());
    }
  }
/**
   * showFullMenu method display the menu item stored in database.
   */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("Menu Id" + "\t\t" + "Price" + "\t\t" + "Menu Name");
    for (Menu m : menu) {
      System.out.println(m.getFoodId() + "\t\t" + m.getFoodPrice() + "\t\t" + m.getFoodName());
    }
  }

  private int foodId;
  private int quantity;
  private int eid;

  private void employeePlaceorder() {
    showFullMenu();
    Scanner ordIn = new Scanner(System.in);
    System.out.println("Enter employee id:");
    eid = ordIn.nextInt();
    System.out.println("Enter food id:");
    foodId = ordIn.nextInt();
    System.out.println("Enter quantity:");
    quantity = ordIn.nextInt();
    String status = OrdersFactory.checkWallet(eid, foodId, quantity);
    System.out.println(status);
  }
  /**
 * vendorlogIn method  display the Vendor item stored in database.
 */
  private void vendorlogin() {
    Scanner input1 = new Scanner(System.in);
    System.out.println("vendor id : ");
    venId = input1.nextInt();
    System.out.println("Password : ");
    String vPass = input1.next();
    Vendor vendor = VendorFactory.venlogin(venId, vPass);
    try {
      if (vendor.getvendorId() == (venId) && vendor.getvendorPassword().equals(vPass)) {
        System.out.println("your access was granted :");
        mainVendor();
      }
    } catch (Exception e) {
      System.out.println("invalid credentials!!!");
      vendorlogin();
    }
  }
  private void mainVendor() {
    System.out.println("Vendor Details");
    System.out.println("-----------------------");
    System.out.println("1. Vendor Information");
    System.out.println("2. Order history");
    System.out.println("3. Order Status");
    System.out.println("4. Exit");
    mainVendordetails();
  }
  /**
 * mainvendoreDetails method process the option selected from vendor menu.
 */

  private void mainVendordetails() {

    try {
      System.out.println("Enter your choice:");
      int vendorOption = option.nextInt();
      switch (vendorOption) {
        case 1:
          vendorInformation();
          mainVendor();
          break;
        case 2:
          vendorOrderhistory();
          mainVendor();
          break;
        case 3:
          vendorOrderstatus();
          mainVendor();
          break;
        case 4:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Invalid input");
          System.out.println("Choose either 1,2,3 or 4");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Enter a valid value");
    }
    option.nextLine();
    mainVendor();
  }
  /**
 * VendorDetails method  display the vendor Information.
 * @return returns integer
 */
  public int vendorInformation() {
    Vendor[] vendor = VendorFactory.showven(venId);
    System.out.println("Vendor Details");
    System.out.println("ID          Name          Username       Password             Email                  Address");
    System.out.println("--------------------------------------------------------------------------------------------");
    for (Vendor v : vendor) {
      System.out.println(v.getvendorId() + "       " + v.getvendorName()
          +     "       " + v.getvendorUsername() + "          " + v.getvendorPassword() + "       "
          + v.getvendorEmail() + "        " + v.getvendorAddress());
    }
    return 0;
  }
  private void vendorOrderhistory() {
    Orders[] orders = OrdersFactory.showHistory();
    System.out.println("Vendor Order History");
    System.out.println("OID    FID       EID       VID      OSTATUS      ODATE     OQUANTITY     OTOTALAMOUNT     OESTIMATEDTIME    OCANCELTIME");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    for (Orders o : orders) {
      System.out.println(o.getOrdersId() + "       " + o.getFoodId()
          +     "      " + o.getEmployeeId() + "     " + o.getVendorId() + "     "
          + o.getOrdersStatus() + "       " + o.getOrdersDate() + "      " + o.getQuantity() + "           " + o.getTotalAmount()
          + "               " + o.getEstimatedTime() + "              " + o.getCancelTime());
    }
  }

  private void vendorOrderstatus() {

  }
  /**
* main method is the basic entry point for the application.
* @param args used to get the user input.
*/
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
