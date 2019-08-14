package com.hexaware.MLP152.factory;
import com.hexaware.MLP152.persistence.VendorDAO;
import com.hexaware.MLP152.persistence.DbConnection;
import com.hexaware.MLP152.model.Vendor;
import java.util.List;
// import com.hexaware.MLP152.model.Orders;

//import com.hexaware.MLP152.persistence.MenuDAO;
//import com.hexaware.MLP152.persistence.DbConnection;

/**
 * VendorFactory class used to fetch vendor data from database.
 * @author hexware
 */
public class VendorFactory {
/**
 * Protected  constructor.
 */
  protected VendorFactory() {

  }
  private static VendorDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }
  /**
   * Call the data base connection.
   * @param venId for employeeId.
   * @return the array of vendor object.
   */
  public static Vendor[] showven(final int venId) {
    List<Vendor> vendor = dao().showven(venId);
    return vendor.toArray(new Vendor[vendor.size()]);
  }
  /**
   * Call the data base connection.
   * @param venId for vendorId.
   * @param vPass for vendor password.
   * @return the password
   */
  public static Vendor venlogin(final int venId, final String vPass) {
    Vendor vendor = dao().venlogin(venId, vPass);
    return vendor;
  }
}
