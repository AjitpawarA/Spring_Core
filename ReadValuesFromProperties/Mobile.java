package ReadValuesFromProperties;

public class Mobile {
	private String name;
	private int price;
	
	
	public Mobile(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void displayMobile() {
		System.out.println("Name :" + name);
		System.out.println("Price :" + price);
	}
}
