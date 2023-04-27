/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: VipCustomer.java
 * Description: The VipCustomer class provides the vip customer name
 * and the return string for the vip customer email.
 */

package edu.bu.met.cs665.customers;

public class VipCustomer extends Customer {
  
  public VipCustomer(String name) {
    super(name, CustomerType.VIP);
  }
  
  @Override
  public String getEmailText() {
    return formatEmailText("This is a custom email specifically for VIP customers.");
  }
}
