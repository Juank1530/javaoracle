package mysecondproject;

public class PersonTester {

	public static void main(String[] args) {
		
		Person per1 = new Person("Anna", 37);
		Person per2 = new Person("Juank", 37);
		
		if (per1.getAge() == per2.getAge()) {
			System.out.println(per1.getName()+ " is the same age as " + per2.getName());
		}
		else {
			System.out.println(per1.getName()+ " is NOT same age as " + per2.getName());
		}
	}
}
