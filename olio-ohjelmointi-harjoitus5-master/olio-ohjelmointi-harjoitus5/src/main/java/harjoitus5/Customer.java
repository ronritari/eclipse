package harjoitus5;

public class Customer {
	//lisää attribuutit, konstruktori ja getterit ja setterit ja toString
	private int customerNumber;
	//name, address String
	//tee attribuuteille setterit ja geetterit
	private String name, address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [number=" + customerNumber + ", name=" + name + ", address=" + address + "]";
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

}
