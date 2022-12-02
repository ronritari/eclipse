package harjoitus5;

import java.util.ArrayList;

public class CustomerMain {

	public static void main(String[] args) {
		/* Kirjoita main-metodi, jossa on yksi ArrayList-kokoelma kaikille
		asiakastiedoille. Luo sinne muutama asiakasolio, joista osa edustaa
		tavallista asiakasta ja osa etuasikasta. Käy kokoelma läpi ja tulosta
		kaikkien asiakkaiden tiedot. Käy kokoelma läpi ja tulosta etuasiakkaiden
		tiedot ja kertynyt bonus. (Ei tarvitse kysyä tietoja käyttäjältä.)*/
		
		//asiakasArray.add(new PreferredCustomer(....))
		
		//for(Customer c: asiakasArray){...}
		
		
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
		arrayListOfCustomers.add( c);
		PreferredCustomer pc3 = new PreferredCustomer(0);
		pc3.setCustomers(arrayListOfCustomers);
		System.out.println("Preferred:\n==========");
		System.out.println(pc3.listPreferredCustomers());
		System.out.println("All:\n=====");
		System.out.println(pc3.listCustomers());

	}

}
