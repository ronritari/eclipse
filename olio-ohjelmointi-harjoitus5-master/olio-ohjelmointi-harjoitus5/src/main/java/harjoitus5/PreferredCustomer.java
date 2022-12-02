package harjoitus5;

import java.util.ArrayList;

//peri luokasta Customer
public class PreferredCustomer extends Customer{
	//lisää purchases
	private double purchases;
	//toteuta metodi calculateBonus(), joka palauttaa doublen
	//Jos ostot ovat 500 – 1000 (tuhat mukaanlukien), niin bonusta kertyy 2 % ostojen
	//määrästä, ja jos ostot ovat yli 1000, niin bonus on 5 % ostojen määrästä.

	//add customers ArrayList
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public PreferredCustomer(double purchases) {
		this.purchases=purchases;
	}
	
	public double getPurchases() {
		return purchases;
	}

	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}
	
	public double calculateBonus() {
		int bonus=0;
		if(purchases>=500&&purchases<=1000) {
			bonus=2;
		}
		else if(purchases>1000) {
			bonus=5;
		}
		return bonus;
	}

	//method setCustomers to add arraylist of customers 
	public void setCustomers(ArrayList<Customer> newCustomers) {
		customers=newCustomers;
	}
	
	public String listCustomers() {
		StringBuilder sb = new StringBuilder();
		for(Customer cust:customers) {
			sb.append(cust.toString());
		}
		return sb.toString();
	}
	
	public String listPreferredCustomers() {
		StringBuilder sb = new StringBuilder();
		for(Customer cust:customers) {
			if(cust instanceof PreferredCustomer) {
				sb.append(cust.toString());
			}
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "Preferred " +super.toString() +" [purchases=" + purchases + ", calculateBonus()=" + calculateBonus() + "]\n";
	}
}
