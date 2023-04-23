/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: EmailGenerationFactory.java
 * Description: The EmailGenerationFactory class implements the EmailFactory interface
 * and defines the functions
 */

package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;

public class EmailGenerationFactory implements EmailFactory {
  public BusinessCustomer createBusinessCustomer(String name) {
    return new BusinessCustomer(name);
  }
  
  public ReturningCustomer createReturningCustomer(String name) {
    return new ReturningCustomer(name);
  }
  
  public FrequentCustomer createFrequentCustomer(String name) {
    return new FrequentCustomer(name);
  }
  
  public NewCustomer createNewCustomer(String name) {
    return new NewCustomer(name);
  }
  
  public VipCustomer createVipCustomer(String name) {
    return new VipCustomer(name);
  }
}
