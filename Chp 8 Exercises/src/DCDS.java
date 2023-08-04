
public class DCDS {
	
	private static int totalstudents; 
	private int students; 

	public DCDS(int students) { 
		
		this.students = students;

	}
	
	public void setTotal(int Total) {
		
		totalstudents = Total; 
		
	}
	
	public void enrollStudent() {
		
		students++;
		totalstudents++;
	
	}
	
	public int displayTotal() {
		
		return totalstudents; 
		
	}
	
	public int displayStudents() {
		
		return students; 
		
	}
	
} 
