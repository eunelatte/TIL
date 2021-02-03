package my.shop;

public class Customer {
	private String name;
	private int custN;
	private String address;
	
	public void calcPoint() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//유효성 검사
		this.name = name;
	}
	public int getCustN() {
		return custN;
	}
	public void setCustN(int custN) {
		//유효성 검사
		this.custN = custN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		//유효성 검사
		this.address = address;
	}
	
	
}
