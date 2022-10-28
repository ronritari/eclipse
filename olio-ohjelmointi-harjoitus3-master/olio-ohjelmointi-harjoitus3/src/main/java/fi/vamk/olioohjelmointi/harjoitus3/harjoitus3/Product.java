package fi.vamk.olioohjelmointi.harjoitus3.harjoitus3;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Scanner;
public class Product {
	private int number;
	private double price;
	
	//luo getterit ja setterit ja kaksi konstrukstoria, tyhjä ja (int, double)
	
	private static HashMap<String, Product> products = new HashMap<String, Product>();
	public static void main(String[] args) {
		//addProducts();
		//askPrice();
		
		/*Product p = new Product();
		p.setNumber(123);
		p.setPrice(12.50);
		p.addProducts();*/
			//assertEquals(12.5, p.getPriceForHashTableProduct("123"));
		
	}
	
	public void addProducts() {
		//TODO lisää tuotteita HashTableen
		
		products.put("123", this );
		
	}

	public Product(int number, double price) {
		super();
		this.number = number;
		this.price = price;
	}

	public Product() {
		super();
	}

	public static void askPrice() {
		//TODO
		//kysy käyttäjältä tuotteen koodia ja käytä getPriceForHashTableProduct(...) hinnan hakemiseen
		String koodi = "123";
		System.out.println(getPriceForHashTableProduct(koodi));
	}
	
	public static double getPriceForHashTableProduct(String findMe) {
		//TODO hae HashTablesta oikea tuote ja palauta sen hinta
		
		return products.get(findMe).getPrice();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
