
public class Student {
	
	private String Fname; 
	private String Lname; 
	private int grade; 
	
	public Student(String Fname, String Lname, int grade) { 
		
		this.Fname = Fname;
		this.Lname = Lname;  
		this.grade = grade; 

	} 
	
	public String DisplayFname() {
		
		return Fname; 
		
	}
	
	public String DisplayLname() {
		
		return Lname; 
		
	}
	
	public int DisplayGrade() {
		
		return grade; 
		
	}

} 
