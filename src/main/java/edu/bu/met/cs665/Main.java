/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: Main.java
 * Description: The Main class provides a main method to run the program and create an
 * email for different customers.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.emails.EmailFactory;
import edu.bu.met.cs665.emails.EmailGenerationFactory;

public class Main {
  
  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    Main m = new Main();
    EmailFactory emailFactory = new EmailGenerationFactory();
    
    Customer businessCustomer = emailFactory.createBusinessCustomer("Giri Co.");
    System.out.println(businessCustomer.getEmailText());
    
    Customer returningCustomer = emailFactory.createReturningCustomer("Giri");
    System.out.println(returningCustomer.getEmailText());
    
    Customer frequentCustomer = emailFactory.createFrequentCustomer("Girish");
    System.out.println(frequentCustomer.getEmailText());
    
    Customer newCustomer = emailFactory.createNewCustomer("Girish M.");
    System.out.println(newCustomer.getEmailText());
    
    Customer vipCustomer = emailFactory.createVipCustomer("Girish Madnani");
    System.out.println(vipCustomer.getEmailText());
  }
  
}
