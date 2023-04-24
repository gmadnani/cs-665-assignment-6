/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: FrequentCustomer.java
 * Description: The FrequentCustomer class provides the frequent customer name
 * and the return string for the frequent customer email.
 */

package edu.bu.met.cs665.customers;

public class FrequentCustomer extends Customer {
  
  public FrequentCustomer(String name) {
    super(name, CustomerType.FREQUENT);
  }
  
  @Override
  public String getEmailText() {
    return formatEmailText("This is a custom email specifically for frequent customers.");
  }
}
