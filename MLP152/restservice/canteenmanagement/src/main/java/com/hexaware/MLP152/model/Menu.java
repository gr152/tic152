// package com.hexaware.MLP152.model;
// import java.util.Objects;
// /**
//  * Menu class used to display menu information.
//  * @author hexware
//  */
// public class Menu {
// /**
//  * foodId to store foodId.
//  */
//   private int foodId;
// /**
//  * foodName to store foodName.
//  */
//   private String foodName;
// /**
//  * foodPrice to store foodPrice.
//  */
//   private int foodPrice;
// /**
//  * vendorId to store vendorId.
//  */
//   private int vendorId;
//   /**
//    * Default Constructor.
//    */
//   public Menu() {
//   }
// /**
//  * @param argFoodId to initialize food id.
//  * used to get details through constructor.
//  */
//   public Menu(final int argFoodId) {
//     this.foodId = argFoodId;
//   }
//   /**
//  * @param argFoodId to initialize food id.
//  * @param argFoodName to initialize food name.
//  * @param argFoodPrice to initialize food price.
//  * @param argVendorId to initialize vendor id.
//  * used to get details through constructor.
//  */
//   public Menu(final int argFoodId, final String argFoodName, final int argFoodPrice, final int argVendorId) {
//     this.foodId = argFoodId;
//     this.foodName = argFoodName;
//     this.foodPrice = argFoodPrice;
//     this.vendorId = argVendorId;
//   }
//   @Override
//     public final boolean equals(final Object obj) {
//     if (obj == null) {
//       return false;
//     }
//     if (getClass() != obj.getClass()) {
//       return false;
//     }
//     Menu menu = (Menu) obj;
//     if (Objects.equals(foodId, menu.foodId)
//         && Objects.equals(foodName, menu.foodName)
//         && Objects.equals(foodPrice, menu.foodPrice)
//         && Objects.equals(vendorId, menu.vendorId)) {
//       return true;
//     }
//     return false;
//   }
//   @Override
//     public final int hashCode() {
//     return Objects.hash(foodId, foodName, foodPrice, vendorId);
//   }
//     /**
//      * @return this food ID.
//      */
//   public final int getFoodId() {
//     return foodId;
//   }
//     /**
//      * @param argFoodId gets the food id.
//      */
//   public final void setFoodId(final int argFoodId) {
//     this.foodId = argFoodId;
//   }
//     /**
//      * @return this food Name.
//      */
//   public final String getFoodName() {
//     return foodName;
//   }
//     /**
//      * @param argFoodName gets the foodname.
//      */
//   public final void setFoodName(final String argFoodName) {
//     this.foodName = argFoodName;
//   }
//    /**
//      * @return this food Price.
//      */
//   public final int getFoodPrice() {
//     return foodPrice;
//   }
//     /**
//      * @param argFoodPrice gets the food price.
//      */
//   public final void setFoodPrice(final int argFoodPrice) {
//     this.foodPrice = argFoodPrice;
//   }
//    /**
//      * @return this vendor ID.
//      */
//   public final int getVendorId() {
//     return vendorId;
//   }
//     /**
//      * @param argVendorId gets the vendor id.
//      */
//   public final void setVendorId(final int argVendorId) {
//     this.vendorId = argVendorId;
//   }
// }
