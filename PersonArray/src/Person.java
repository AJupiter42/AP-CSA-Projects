
public class Person {
	
	private String Fname; 
	private String Lname; 
	
	public Person(String fname, String lname) {
		
		this.Fname = fname; 
		this.Lname = lname; 
		
	}
	
	public void Display() {
		
		System.out.printf("First Name: %s\nLast Name: %s\n", Fname, Lname); 
		
	}

} 
