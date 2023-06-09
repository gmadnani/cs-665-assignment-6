/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Customer.java
 * Description: The Customer class is an abstract class that provides
 * the customer name and the email function.
 */

package edu.bu.met.cs665.customers;

public abstract class Customer {
  protected String name;
  protected CustomerType type;
  
  public Customer(String name, CustomerType type) {
    this.name = name;
    this.type = type;
  }
  
  public abstract String getEmailText();
  
  protected String formatEmailText(String text) {
    return String.format("Dear %s,\n%s", name, text);
  }
}

