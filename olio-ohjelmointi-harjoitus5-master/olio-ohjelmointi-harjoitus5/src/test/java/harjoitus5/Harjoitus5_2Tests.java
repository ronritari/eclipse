package harjoitus5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class Harjoitus5_2Tests {
	
	@Test
	public void testPreferredCustomerBonus() {
		PreferredCustomer pc= new PreferredCustomer(499);
		//if less than 500 return 0
		assertEquals(0, pc.calculateBonus(),0);
		pc.setPurchases(500);
		assertEquals(2, pc.calculateBonus(),0);
		pc.setPurchases(501);
		assertEquals(2, pc.calculateBonus(),0);
		pc.setPurchases(999);
		assertEquals(2, pc.calculateBonus(),0);
		pc.setPurchases(1000);
		assertEquals(2, pc.calculateBonus(),0);
		pc.setPurchases(1001);
		assertEquals(5, pc.calculateBonus(),0);
		pc.setPurchases(0);
		assertEquals(0, pc.calculateBonus(),0);
	}
	
	@Test
	public void testPreferredCustomerListing() {
		//create some customers to test
		Customer pc1= new PreferredCustomer(499);
		pc1.setCustomerNumber(123);
		pc1.setName("UWASA");
		pc1.setAddress("Wolffintie 34");
		
		Customer pc2= new PreferredCustomer(1001);
		pc2.setCustomerNumber(123);
		pc2.setName("VAMK");
		pc2.setAddress("Wolffintie 30");
		
		Customer c = new Customer();
		c.setCustomerNumber(124);
		c.setName("SeAMK");
		c.setAddress("Kampusranta 11");
		
		//create an ArrayList of Customer and add the above customers there
		ArrayList<Customer> arrayListOfCustomers = new ArrayList<Customer>();
		arrayListOfCustomers.add((Customer) pc1);
		arrayListOfCustomers.add((Customer) pc2);
		arrayListOfCustomers.add(c);
		//Add the arraylist to an inctance of PreferredCustomer to list all/preferred customers
		PreferredCustomer pc3 = new PreferredCustomer(0);
		pc3.setCustomers(arrayListOfCustomers);
		
		//test that vamk, seamk, uwasa are included 
		Assert.assertTrue(pc3.listCustomers().toLowerCase().contains("seamk"));
		Assert.assertTrue(pc3.listCustomers().toLowerCase().contains("uwasa"));
		Assert.assertTrue(pc3.listCustomers().toLowerCase().contains("vamk"));
		//test that uwasa (not seamk) is included 
		Assert.assertTrue(pc3.listPreferredCustomers().toLowerCase().contains("uwasa"));
		Assert.assertTrue(pc3.listPreferredCustomers().toLowerCase().contains("vamk"));
		//test that the bonus is correct
		PreferredCustomer pc4 = (PreferredCustomer)arrayListOfCustomers.get(1);
		assertEquals(5, pc4.calculateBonus(),0);
	}
}