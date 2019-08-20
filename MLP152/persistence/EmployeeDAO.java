package com.hexaware.MLP152.persistence;
import com.hexaware.MLP152.model.Employee;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;

/**
 * CustomerDAO class used to fetch data from data base.
 * @author hexware
 */
public interface EmployeeDAO {
  /**
     * @return the all the Customer record
     */

  @SqlQuery("Select * from Employee")
    @Mapper(EmployeeMapper.class)
    List<Employee> show();
  /**
    * @return the partcular customer record.
    * @param empId to send customerId to display the particular record
    */
  @SqlQuery("Select * from Employee where E_ID = :E_ID")
    @Mapper(EmployeeMapper.class)
    Employee checkBalanceById(@Bind("E_ID")int empId);

/**
 * @return the E_ID and password.
 * @param employeeId Employee id.
 *@param employeePassword Employee password.
 */
  @SqlQuery("SELECT * FROM Employee where E_ID =:E_ID AND E_PASSWORD =:E_PASSWORD")
  @Mapper(EmployeeMapper.class)
 Employee emplogin(@Bind("E_ID") int employeeId, @Bind("E_PASSWORD") String employeePassword);

 /**
 * @return specific Employee details.
 * @param empId parameter.
 */
  @SqlQuery("Select * from Employee WHERE E_ID=:E_ID")
  @Mapper(EmployeeMapper.class)
  List<Employee> showemp(@Bind("E_ID")int empId);
}
