package mysecondproject;
import java.util.Scanner;

public class Bus {
	
	private int passengers;
	
	public void countPanssenger() {				
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the quantity of passengers: ");
        int passengers = scanner.nextInt();
		int bus = passengers/45;
		int module = passengers % 45;
		System.out.println("Is necessary to send " + bus + " buses and " + module + " studens have to send in suburban" );
	}
	
	public int getCapacity() {
		return passengers;
	}

	public void setCapacity(int capacity) {
		this.passengers = capacity;
	}
		
}
