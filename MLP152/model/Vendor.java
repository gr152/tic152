package com.hexaware.MLP152.model;
import java.util.Objects;
/**
 * Vendor class used to display vendor information.
 * @author hexware
 */
public class Vendor {
/**
 * vendorId to store vendorId.
 */
  private int vendorId;
/**
 * vendorName to store vendorName.
 */
  private String vendorName;
/**
 * vendorUsername to store vendorUsername.
 */
  private String vendorUsername;
/**
 * vendorPassword to store vendorPassword.
 */
  private String vendorPassword;
/**
 * vendorContact to store vendorContact.
 */
  private int vendorContact;
/**
 * vendorEmail to store vendorEmail.
 */
  private String vendorEmail;
/**
 * vendorAddress to store vendorAddress.
 */
  private String vendorAddress;
/**
   * Default Constructor.
   */
  public Vendor() {

  }
/**
 * @param argVendorId to initialize vendor Id.
 * @param argVendorName to initialize vendor Name.
 * @param argVendorUsername to initialize vendor Username.
 * @param argVendorPassword to initialize vendor Password.
 * @param argVendorEmail to initialize vendor Email.
 * @param argVendorContact to initialize vendor Contact.
 * @param argVendorAddress to initialize vendor Address.
 * used to get details through constructor.
 */
  public Vendor(final int argVendorId, final String argVendorName, final String argVendorUsername,
      final String argVendorPassword, final int argVendorContact, final String argVendorEmail, final String argVendorAddress) {
    this.vendorId = argVendorId;
    this.vendorName = argVendorName;
    this.vendorUsername = argVendorUsername;
    this.vendorPassword = argVendorPassword;
    this.vendorContact = argVendorContact;
    this.vendorEmail = argVendorEmail;
    this.vendorAddress = argVendorAddress;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Vendor vendor = (Vendor) obj;
    if (Objects.equals(vendorId, vendor.vendorId)
         && Objects.equals(vendorName, vendor.vendorName)
         && Objects.equals(vendorUsername, vendor.vendorUsername)
         && Objects.equals(vendorPassword, vendor.vendorPassword)
         && Objects.equals(vendorEmail, vendor.vendorEmail)
         && Objects.equals(vendorContact, vendor.vendorContact)
         && Objects.equals(vendorAddress, vendor.vendorAddress)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(vendorId, vendorName, vendorUsername, vendorPassword, vendorEmail, vendorContact, vendorAddress);
  }

  /**
     * @return this vendor ID.
     */
  public final int getvendorId() {
    return vendorId;
  }
  /**
     * @param argVendorId gets the vendor Id.
     */
  public final void setvendorId(final int argVendorId) {
    this.vendorId = argVendorId;
  }
  /**
     * @return this vendor Name.
     */
  public final String getvendorName() {
    return vendorName;
  }
  /**
     * @param argVendorName gets the vendor Name.
     */
  public final void setvendorName(final String argVendorName) {
    this.vendorName = argVendorName;
  }
  /**
     * @return this vendor Username.
     */
  public final String getvendorUsername() {
    return vendorUsername;
  }
  /**
     * @param argVendorUsername gets the vendor Username.
     */
  public final void setvendorUsername(final String argVendorUsername) {
    this.vendorUsername = argVendorUsername;
  }
  /**
     * @return this vendor Password.
     */
  public final String getvendorPassword() {
    return vendorPassword;
  }
  /**
     * @param argVendorPassword gets the vendor Password.
     */
  public final void setvendorPassword(final String argVendorPassword) {
    this.vendorPassword = argVendorPassword;
  }
  /**
     * @return this vendor Email.
     */
  public final String getvendorEmail() {
    return vendorEmail;
  }
  /**
     * @param argVendorEmail gets the vendor Email.
     */
  public final void setvendorEmail(final String argVendorEmail) {
    this.vendorEmail = argVendorEmail;
  }
  /**
     * @return this vendor Contact.
     */
  public final int getvendorContact() {
    return vendorContact;
  }
  /**
     * @param argVendorContact gets the vendor Contact.
     */
  public final void setvendorContact(final int argVendorContact) {
    this.vendorContact = argVendorContact;
  }
  /**
     * @return this vendor Address.
     */
  public final String getvendorAddress() {
    return vendorAddress;
  }
  /**
     * @param argVendorAddress gets the vendor Address.
     */
  public final void setvendorAddress(final String argVendorAddress) {
    this.vendorAddress = argVendorAddress;
  }
}
