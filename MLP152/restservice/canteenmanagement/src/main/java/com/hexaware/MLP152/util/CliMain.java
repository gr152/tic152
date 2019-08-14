package com.hexaware.MLP152.util;
import java.util.Scanner;
import com.hexaware.MLP152.factory.VendorFactory;
import com.hexaware.MLP152.factory.OrdersFactory;
import com.hexaware.MLP152.model.Vendor;
import com.hexaware.MLP152.model.Orders;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 * @param venId is employeeid
 */
class CliMain {
  private int venId;
  //private String ePass;
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Employee login");
    System.out.println("2. vendor login");
    System.out.println("3. Exit");
    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          // employeelogIn();
          break;
        case 2:
          vendorlogin();
          break;
        case 3:
          Runtime.getRuntime().halt(0);
          break;
        default:
          System.out.println("Invalid input");
          System.out.println("Choose either 1, 2 or 3");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
  /**
* showFullMenu method display the menu item stored in database.
*/
  // private void showFullMenu() {
  //   Menu[] menu = MenuFactory.showMenu();
  //   System.out.printf("%4d %-15d %-3d %n", "Menu_Id", "Menu_name", "Price");
  //   for (Menu m : menu) {
  //     System.out.printf("%4d %-15d %-3d %n", m.getFoodId(), m.getFoodName(), m.getFoodPrice());
  //   }
  // }
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
    System.out.println("3. Place order");
    System.out.println("4. Exit");
    mainVendordetails();
  }
  /**
 * mainvendoreDetails method process the option selected from vendor menu.
 */

  private void mainVendordetails() {

    try {
      System.out.println("Enter your choice:");
      int customerOption = option.nextInt();
      switch (customerOption) {
        case 1:
          vendorInformation();
          break;
        case 2:
          vendorOrderhistory();
          break;
        case 3:
          //
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
    System.out.println("ID          Name          Username       Password         Email           Address");
    for (Vendor v : vendor) {
      System.out.println(v.getvendorId() + "       " + v.getvendorName()
          +     "       " + v.getvendorUsername() + "       " + v.getvendorPassword() + "       "
          + v.getvendorEmail() + "        " + v.getvendorAddress());
    }
    return 0;
  }
  private void vendorOrderhistory() {
    Orders[] orders = OrdersFactory.showHistory();
    System.out.println("VENDOR ORDER HISTORY");
    System.out.println("OID    FID     EID     VID    OSTATUS    ODATE   OQUANTITY   OTOTALAMOUNT   OESTIMATEDTIME   OCANCELTIME");
    for (Orders o : orders) {
      System.out.println(o.getOrdersId() + "       " + o.getFoodId()
          +     "       " + o.getEmployeeId() + "       " + o.getVendorId() + "       "
          + o.getOrdersStatus() + "         " + o.getOrdersDate() + "        " + o.getQuantity() + "       " + o.getTotalAmount()
          + "       " + o.getEstimatedTime() + "      " + o.getCancelTime());
    }
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
