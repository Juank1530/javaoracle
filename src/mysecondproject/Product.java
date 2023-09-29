package mysecondproject;

public class Product {
	
	//Instance field declarations
	private String name;
	private double price;
	private int quantity;
	private String id;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity, String id) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.id = id;
	}
	
	public String toString(){
		String s1 = "";
		s1 = "Produc ID: " + getId() + "\n"
		  +  "Name: " + getName() + "\n"
		  +  "Quantity in stock: " + getQuantity() +"\n"
		  +  "Price: " + getPrice() + "\n";
		return s1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	

}
