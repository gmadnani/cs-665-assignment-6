/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: EmailFactory.Interface
 * Description: The EmailFactory interface contains all the customer creation functions.
 */

package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.customers.CustomerType;

public interface EmailFactory {
  Customer createCustomer(String name, CustomerType type);
}
