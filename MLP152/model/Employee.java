package com.hexaware.MLP152.model;
import java.util.Objects;

/**
 * employee class used to display employee information.
 * @author hexware
 */
public class Employee {
/**
 * employeeId to store employee id.
 */
  private int employeeId;
  /**
 * employeeName to store employee name.
 */
  private String employeeName;
  /**
 *  employeeUsername to store employee username.
 */
  private String employeeUsername;
  /**
 * employeePassword to store employee password.
 */
  private String employeePassword;
  /**
 * employeeWalletbalance to store employee walletbalance.
 */
  private int employeeWalletbalance;
  /**
  /**
 * employeeEmail to store employee email.
 */
  private String employeeEmail;
  /**
  /**
 * employeeAddress to store employee address.
 */
  private String employeeAddress;
  /**
  /**
 * employeeContact to store employee contact.
 */
  private int employeeContact;
  /**
   * Default Constructor.
   */
  public Employee() {

  }
/**
 * @param argEmployeeId to initialize employee id.
 * used to get details through constructor.
 */
  public Employee(final int argEmployeeId) {
    this.employeeId = argEmployeeId;
  }
/**
  * @param argEmployeeId to initialize employee id.
  * @param argEmployeeName to initialize employee name.
  * @param argEmployeeUsername to initialize employee username.
  * @param argEmployeePassword to initialize employee password.
  * @param argEmployeeWalletbalance to initialize employee walletbalance.
  * @param argEmployeeEmail to initialize employee email.
  * @param argEmployeeAddress to initialize employee address.
  * @param argEmployeeContact to initialize employee contact.
  * used to get details through constructor.
 */

  public Employee(final int argEmployeeId, final String argEmployeeName, final String argEmployeeUsername, final String argEmployeePassword,
      final int argEmployeeWalletbalance, final String argEmployeeEmail, final String argEmployeeAddress, final int argEmployeeContact) {
    this.employeeId = argEmployeeId;
    this.employeeName = argEmployeeName;
    this.employeeUsername = argEmployeeUsername;
    this.employeePassword = argEmployeePassword;
    this.employeeWalletbalance = argEmployeeWalletbalance;
    this.employeeEmail = argEmployeeEmail;
    this.employeeAddress = argEmployeeAddress;
    this.employeeContact = argEmployeeContact;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee employee = (Employee) obj;
    if (Objects.equals(employeeId, employee.employeeId)
        && Objects.equals(employeeName, employee.employeeName)
        && Objects.equals(employeeUsername, employee.employeeUsername)
        && Objects.equals(employeePassword, employee.employeePassword)
        && Objects.equals(employeeWalletbalance, employee.employeeWalletbalance)
        && Objects.equals(employeeEmail, employee.employeeEmail)
        && Objects.equals(employeeAddress, employee.employeeAddress)
        && Objects.equals(employeeContact, employee.employeeContact)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(employeeId, employeeName, employeeUsername, employeePassword,
    employeeWalletbalance, employeeEmail, employeeAddress, employeeContact);
  }
    /**
     * @return this employee id.
     */
  public final int getEmployeeId() {
    return employeeId;
  }
    /**
     * @param argEmployeeId gets the employee id.
     */
  public final void setEmployeeId(final int argEmployeeId) {
    this.employeeId = argEmployeeId;
  }
    /**
     * @return this employee name.
     */
  public final String getEmployeeName() {
    return employeeName;
  }
    /**
     * @param argEmployeeName gets the employee name.
     */
  public final void setEmployeeName(final String argEmployeeName) {
    this.employeeName = argEmployeeName;
  }
    /**
     * @return this employee username.
     */
  public final String getEmployeeUsername() {
    return employeeUsername;
  }
    /**
     * @param argEmployeeUsername gets the employee username.
     */
  public final void setEmployeeUsername(final String argEmployeeUsername) {
    this.employeeUsername = argEmployeeUsername;
  }
    /**
     * @return this employee password.
     */
  public final String getEmployeePassword() {
    return employeePassword;
  }
    /**
     * @param argEmployeePassword gets the employee password.
     */
  public final void setEmployeePassword(final String argEmployeePassword) {
    this.employeePassword = argEmployeePassword;
  }
    /**
     * @return this employee walletbalance.
     */
  public final int getEmployeeWalletbalance() {
    return employeeWalletbalance;
  }
    /**
     * @param argEmployeeWalletbalance gets the employee walletbalance.
     */
  public final void setEmployeeWalletbalance(final int argEmployeeWalletbalance) {
    this.employeeWalletbalance = argEmployeeWalletbalance;
  }
    /**
     * @return this employee email.
     */
  public final String getEmployeeEmail() {
    return employeeEmail;
  }
    /**
     * @param argEmployeeEmail gets the employee email.
     */
  public final void setEmployeeEmail(final String argEmployeeEmail) {
    this.employeeEmail = argEmployeeEmail;
  }
    /**
     * @return this Employee address.
     */
  public final String getEmployeeAddress() {
    return employeeAddress;
  }
    /**
     * @param argEmployeeAddress gets the employee address.
     */
  public final void setEmployeeAddress(final String argEmployeeAddress) {
    this.employeeAddress = argEmployeeAddress;
  }
    /**
     * @return this Employee contact.
     */
  public final int getEmployeeContact() {
    return employeeContact;
  }
    /**
     * @param argEmployeeContact gets the employee contact.
     */
  public final void setEmployeeContact(final int argEmployeeContact) {
    this.employeeContact = argEmployeeContact;
  }
}
