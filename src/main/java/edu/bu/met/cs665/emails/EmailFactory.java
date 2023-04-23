/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: EmailFactory.interface
 * Description: The EmailFactory interface contains all the customer creation functions.
 */

package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;

public interface EmailFactory {
  BusinessCustomer createBusinessCustomer(String name);
  
  ReturningCustomer createReturningCustomer(String name);
  
  FrequentCustomer createFrequentCustomer(String name);
  
  NewCustomer createNewCustomer(String name);
  
  VipCustomer createVipCustomer(String name);
}
