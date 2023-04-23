/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: VipCustomer.java
 * Description: The VipCustomer class provides the vip customer name
 * and the return string for the vip customer email.
 */

package edu.bu.met.cs665.customers;

public class VipCustomer extends Customer {
  
  public VipCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "This is a custom email specifically for vip customers", name);
  }
}
