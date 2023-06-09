/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: ReturningCustomer.java
 * Description: The ReturningCustomer class provides the returning customer name
 * and the return string for the returning customer email.
 */

package edu.bu.met.cs665.customers;

public class ReturningCustomer extends Customer {
  
  public ReturningCustomer(String name) {
    super(name, CustomerType.RETURNING);
  }
  
  @Override
  public String getEmailText() {
    return formatEmailText("This is a custom email specifically for returning customers.");
  }
}
