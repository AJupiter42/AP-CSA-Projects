
public class PersonTest {

	public static void main(String[] args) {
		
		Person P1 = new Person("John", "Smith");
		Person P2 = new Person("John", "Smith");
		Person P3 = new Person("John", "Smith");
		Person P4 = new Person("John", "Smith");
		Person P5 = new Person("John", "Smith");
		
		Person[] array = {P1, P2, P3, P4, P5}; 
		
		for (int i = 0; i < 5; i++) 
			array[i].Display();
		
	}
	
} 
