/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: Customer.java
 * Description: The Customer class is an abstract class that provides
 * the customer name and the email function.
 */

package edu.bu.met.cs665.customers;

public abstract class Customer {
  protected String name;
  
  public Customer(String name) {
    this.name = name;
  }
  
  public abstract String getEmailText();
  
  // new method for formatting email text
  protected String formatEmailText(String text) {
    return String.format("Dear %s,\n%s", name, text);
  }
}

