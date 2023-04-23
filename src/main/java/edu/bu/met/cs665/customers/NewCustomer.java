/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: NewCustomer.java
 * Description: The NewCustomer class provides the new customer name
 * and the return string for the new customer email.
 */

package edu.bu.met.cs665.customers;

public class NewCustomer extends Customer {
  
  public NewCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "This is a custom email specifically for new customers", name);
  }
}
