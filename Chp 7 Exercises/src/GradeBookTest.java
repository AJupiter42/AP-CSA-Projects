
import java.util.Scanner; 

public class GradeBookTest {

	public static void main(String[] args) {
		
		String[] names = new String[5]; 
		int[][] grades = new int[5][3];
		
		Scanner input = new Scanner(System.in); 
		
		for (int i = 0; i < 5; i++) { 
			
			System.out.printf("Enter Name of Student %d: ", i+1); 
			names[i] = input.nextLine(); 
			
		} 
		
		for (int i = 0; i < 5; i++) {
			 
			System.out.printf("Enter HW Grade for Student %d: ", i+1);
			grades[i][0] = input.nextInt();
			System.out.printf("Enter Quiz Grade for Student %d: ", i+1);
			grades[i][1] = input.nextInt(); 
			System.out.printf("Enter Test Grade for Student %d: ", i+1);
			grades[i][2] = input.nextInt();
			
		}
		
		GradeBook theGradeBook = new GradeBook(names, grades); 
		
		theGradeBook.outputGrades(); 
		
	}

} 
