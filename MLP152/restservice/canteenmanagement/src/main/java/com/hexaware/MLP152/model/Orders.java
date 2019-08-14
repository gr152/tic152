package com.hexaware.MLP152.model;
import java.util.Objects;
/**
 *  class used to display orders information.
 * @author hexware
 */
public class Orders {
/**
 * ordersId to store orderId.
 */
  private int ordersId;
/**
 * foodId to store foodId.
 */
  private int foodId;
/**
  * employeeId to store employeeID.
  */
  private int employeeId;
/**
  * vendorId to store vendorId.
  */
  private int vendorId;
/**
  * orders status to store orders status.
  */
  private String ordersStatus;
/**
  * order date to store order date.
  */
  private String ordersDate;
/**
  * quantity to store quantity.
  */
  private int quantity;
/**
  * totalAmount to store totalAmount.
  */
  private int totalAmount;
/**
  * estimatedTime to store estimatedTime.
  */
  private String estimatedTime;
/**
  * cancelTime to store cancelTime.
  */
  private String cancelTime;
  /**
   * Default Constructor.
   */
  public Orders() {

  }
/**
 * @param argOrdersId to initialize orderID.
 * used to get details through constructor.
 */
  public Orders(final int argOrdersId) {
    this.ordersId = argOrdersId;
  }
/**
 * @param argOrdersId to initialize ordersId.
 * @param argFoodId to initialize foodId.
 * @param argEmployeeId to initialize employeeId.
 * @param argVendorId to initialize vendorId.
 * @param argOrdersStatus to initialize ordersStatus.
 * @param argOrdersDate to initialize ordersDate.
 * @param argQuantity to initialize quantity.
 * @param argTotalAmount to initialize totalAmount.
 * @param argEstimatedTime to initialize estimatedTime.
 * @param argCancelTime to initialize cancelTime.
 * used to get details through constructor.
 */
  public Orders(final int argOrdersId, final int argFoodId, final int argEmployeeId, final int argVendorId, final String argOrdersStatus,
                final String argOrdersDate, final int argQuantity, final int argTotalAmount, final String argEstimatedTime,
                final String argCancelTime) {
    this.ordersId = argOrdersId;
    this.foodId = argFoodId;
    this.employeeId = argEmployeeId;
    this.vendorId = argVendorId;
    this.ordersStatus = argOrdersStatus;
    this.ordersDate = argOrdersDate;
    this.quantity = argQuantity;
    this.totalAmount = argTotalAmount;
    this.estimatedTime = argEstimatedTime;
    this.cancelTime = argCancelTime;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Orders orders = (Orders) obj;
    if (Objects.equals(ordersId, orders.ordersId)
        && Objects.equals(foodId, orders.foodId)
        && Objects.equals(employeeId, orders.employeeId)
        && Objects.equals(vendorId, orders.vendorId)
        && Objects.equals(ordersStatus, orders.ordersStatus)
        && Objects.equals(ordersDate, orders.ordersDate)
        && Objects.equals(quantity, orders.quantity)
        && Objects.equals(totalAmount, orders.totalAmount)
        && Objects.equals(estimatedTime, orders.estimatedTime)
        && Objects.equals(cancelTime, orders.cancelTime)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(ordersId, foodId, employeeId, vendorId, ordersStatus, ordersDate, quantity, totalAmount, estimatedTime, cancelTime);
  }
    /**
     * @return this ordersId.
     */
  public final int getOrdersId() {
    return ordersId;
  }
    /**
     * @param argOrdersId gets the ordersId.
     */
  public final void setOrdersId(final int argOrdersId) {
    this.ordersId = argOrdersId;
  }
    /**
     * @return this foodID.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
     * @param argFoodId gets the foodid.
     */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
    /**
     * @return this employeeId.
     */
  public final int getEmployeeId() {
    return employeeId;
  }
    /**
     * @param argEmployeeId gets the employeeId.
     */
  public final void setEmployeeId(final int argEmployeeId) {
    this.employeeId = argEmployeeId;
  }
    /**
     * @return this vendorId.
     */
  public final int getVendorId() {
    return vendorId;
  }
    /**
     * @param argVendorId gets the vendorId.
     */
  public final void setVendorId(final int argVendorId) {
    this.vendorId = argVendorId;
  }
    /**
     * @return this ordersStatus.
     */
  public final String getOrdersStatus() {
    return ordersStatus;
  }
    /**
     * @param argOrdersStatus gets the ordersStatus.
     */
  public final void setOrdersStatus(final String argOrdersStatus) {
    this.ordersStatus = argOrdersStatus;
  }
    /**
     * @return this ordersDate.
     */
  public final String getOrdersDate() {
    return ordersDate;
  }
    /**
     * @param argOrdersDate gets the ordersDate.
     */
  public final void setOrdersDate(final String argOrdersDate) {
    this.ordersDate = argOrdersDate;
  }
    /**
     * @return this quantity.
     */
  public final int getQuantity() {
    return quantity;
  }
    /**
     * @param argQuantity gets the quantity.
     */
  public final void setQuantity(final int argQuantity) {
    this.quantity = argQuantity;
  }
    /**
     * @return this totalAmount.
     */
  public final int getTotalAmount() {
    return totalAmount;
  }
    /**
     * @param argTotalAmount gets the totalAmount.
     */
  public final void setTotalAmount(final int argTotalAmount) {
    this.totalAmount = argTotalAmount;
  }
    /**
     * @return this estimatedTime.
     */
  public final String getEstimatedTime() {
    return estimatedTime;
  }
    /**
     * @param argEstimatedTime gets the estimatedTime.
     */
  public final void setEstimatedTime(final String argEstimatedTime) {
    this.estimatedTime = argEstimatedTime;
  }
    /**
     * @return this cancelTime.
     */
  public final String getCancelTime() {
    return cancelTime;
  }
    /**
     * @param argCancelTime gets the cancelTime.
     */
  public final void setCancelTime(final String argCancelTime) {
    this.cancelTime = argCancelTime;
  }
}


