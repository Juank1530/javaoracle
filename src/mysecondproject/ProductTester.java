package mysecondproject;

public class ProductTester {

	public static void main(String[] args) {
		Product prod1 = new Product();
		prod1.setId("JK001");
		prod1.setName("Printer");
		prod1.setPrice(450000);
		prod1.setQuantity(844);
		Product prod2 = new Product();
		prod2.setId("JK002");
		prod2.setName("Headset");
		prod2.setPrice(500000);
		prod2.setQuantity(784);
		Product prod3 = new Product("CPU", 85000, 854, "JK003");
		Product prod4 = new Product("Display", 350000, 988, "JK004");
		Product prod5 = new Product("Mouse", 20000, 741, "JK005");
		Product prod6 = new Product("Keyboard", 25000, 658, "JK006");
		
		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
		System.out.println(prod3.toString());
		System.out.println(prod4.toString()); 
		System.out.println(prod5.toString());
		System.out.println(prod6.toString());
		
		
		
		
		
		
	}

}
