/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: ReturningCustomer.java
 * Description: The ReturningCustomer class provides the returning customer name
 * and the return string for the returning customer email.
 */

package edu.bu.met.cs665.customers;

public class ReturningCustomer extends Customer {
  
  public ReturningCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "This is a custom email specifically for returning customers", name);
  }
}
