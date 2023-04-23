package edu.bu.met.cs665;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;
import org.junit.Assert;
import org.junit.Test;
public class TestEmail {
  @Test
  public void testBusinessCustomer() {
    Customer customer = new BusinessCustomer("Girish Co.");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish Co.,\nThis is a custom email specifically for business customers", email);
  }
  
  @Test
  public void testReturningCustomer() {
    Customer customer = new ReturningCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThis is a custom email specifically for returning customers", email);
  }
  
  @Test
  public void testFrequentCustomer() {
    Customer customer = new FrequentCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThis is a custom email specifically for frequent customers", email);
  }
  
  @Test
  public void testNewCustomer() {
    Customer customer = new NewCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThis is a custom email specifically for new customers", email);
  }
  
  @Test
  public void testVipCustomer() {
    Customer customer = new VipCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThis is a custom email specifically for vip customers", email);
  }
  
}
