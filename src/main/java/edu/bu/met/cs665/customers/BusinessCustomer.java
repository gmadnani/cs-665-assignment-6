/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: BusinessCustomer.java
 * Description: The BusinessCustomer class provides the business customer name
 * and the return string for the business customer email.
 */

package edu.bu.met.cs665.customers;

public class BusinessCustomer extends Customer {
  
  public BusinessCustomer(String name) {
    super(name, CustomerType.BUSINESS);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "This is a custom email specifically for business customers", name);
  }
}
