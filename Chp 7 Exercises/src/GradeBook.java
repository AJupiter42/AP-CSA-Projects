
public class GradeBook {
	
	private String[] names; 
	private int[][] grades; 
	
	public GradeBook(String[] names, int[][] grades) {
		
		this.names = names; 
		this.grades = grades;
		
	} 
	
	public double getAverage(int[] grades) {
	
	int total = 0;
	 
	for (int grade : grades)
		total += grade;

	return (double) total / 3;
	
	} 
	
	public void outputGrades() {
		
		System.out.print("        "); 
		
		System.out.print("HW     ");
		System.out.print("Quiz     ");
		System.out.print("Test     ");
		System.out.println("Average");
		
		for (int student = 0; student < 5; student++) {
			
			System.out.print(names[student]);
			
			for (int grade : grades[student])
				System.out.printf("%8d", grade); 
			
			double average = getAverage(grades[student]); 
			System.out.printf("%9.2f%n", average); 
			
		}
		
	}
	
} 
