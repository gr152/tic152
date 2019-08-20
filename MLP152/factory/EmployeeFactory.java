package com.hexaware.MLP152.factory;

import java.util.List;

import com.hexaware.MLP152.model.Employee;
import com.hexaware.MLP152.persistence.DbConnection;
import com.hexaware.MLP152.persistence.EmployeeDAO;
/**
 * EmployeeFactory class used to fetch employee data from database.
 * @author hexware
 */
public class EmployeeFactory {
  /**
   *  Protected constructor.
   */
  protected EmployeeFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static EmployeeDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of employee object.
   */
  public static Employee[] showMenu() {
    List<Employee> employee = dao().show();
    return employee.toArray(new Employee[employee.size()]);
  }
   /**
   * @return the array of employee object.
   * @param eid to send employee id to display the particular record
   */
  public static Employee checkBalance(final int eid) {
    Employee employee = dao().checkBalanceById(eid);
    return employee;
  }
  /**
  *call the data base connection.
  * @param empId for employeeId.
  *@param ePass for employee Password.
  * @return Employee.
 */
  public static Employee emplogin(final int empId, final String ePass) {
    Employee employee = dao().emplogin(empId, ePass);
    return employee;
  }
/**
 *call the data base connection.
  @param empId for Employee Id.
 *@return Employee.
 */
  public static Employee[] showemp(final int empId) {
    List<Employee> employee = dao().showemp(empId);
    return employee.toArray(new Employee[employee.size()]);
  }
}
