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
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.customers.CustomerType;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;

public class EmailGenerationFactory implements EmailFactory {
  public Customer createCustomer(String name, CustomerType type) {
    switch (type) {
      case BUSINESS:
        return new BusinessCustomer(name);
      case RETURNING:
        return new ReturningCustomer(name);
      case FREQUENT:
        return new FrequentCustomer(name);
      case NEW:
        return new NewCustomer(name);
      case VIP:
        return new VipCustomer(name);
      default:
        throw new IllegalArgumentException("Invalid customer type");
    }
  }
}
