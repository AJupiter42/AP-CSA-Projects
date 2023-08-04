
import java.util.Scanner;

public class DCDSTest {

	public static void main(String[] args) {
		
		DCDS lower = new DCDS(400); 
		DCDS middle = new DCDS(500); 
		DCDS upper = new DCDS(600); 
		upper.setTotal(1500); 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first name of first new student: "); 
		String fname1 = input.next();
		System.out.print("Enter last name of first new student: "); 
		String lname1 = input.next();
		System.out.print("Enter grade of first new student: "); 
		int grade1 = input.nextInt();
		
		if (grade1 >= 1 && grade1 <= 5) 
			lower.enrollStudent(); 
		
		if (grade1 >= 6 && grade1 <= 8) 
			middle.enrollStudent(); 
			
		if (grade1 >= 9 && grade1 <= 12) 
			upper.enrollStudent(); 
		
		Student NewStudent1 = new Student(fname1, lname1, grade1); 
		
		System.out.print("Enter first name of second new student: "); 
		String fname2 = input.next();
		System.out.print("Enter last name of second new student: "); 
		String lname2 = input.next();
		System.out.print("Enter grade of second new student: "); 
		int grade2 = input.nextInt();
		
		if (grade2 >= 1 && grade2 <= 5) 
			lower.enrollStudent(); 
		
		if (grade2 >= 6 && grade2 <= 8) 
			middle.enrollStudent(); 
			
		if (grade2 >= 9 && grade2 <= 12) 
			upper.enrollStudent(); 
		
		Student NewStudent2 = new Student(fname2, lname2, grade2); 
		
		System.out.print("Enter first name of third new student: "); 
		String fname3 = input.next();
		System.out.print("Enter last name of third new student: "); 
		String lname3 = input.next();
		System.out.print("Enter grade of third new student: "); 
		int grade3 = input.nextInt();
		
		if (grade3 >= 1 && grade3 <= 5) 
			lower.enrollStudent(); 
		
		if (grade3 >= 6 && grade3 <= 8) 
			middle.enrollStudent(); 
			
		if (grade3 >= 9 && grade3 <= 12) 
			upper.enrollStudent(); 
		
		Student NewStudent3 = new Student(fname3, lname3, grade3); 
		
		System.out.println(); 
		
		System.out.printf("New Student 1: %s %s (Grade %d)\n", NewStudent1.DisplayFname(), NewStudent1.DisplayLname(), 
				NewStudent1.DisplayGrade()); 
		System.out.printf("New Student 2: %s %s (Grade %d)\n", NewStudent2.DisplayFname(), NewStudent2.DisplayLname(), 
				NewStudent2.DisplayGrade()); 
		System.out.printf("New Student 3: %s %s (Grade %d)\n", NewStudent3.DisplayFname(), NewStudent3.DisplayLname(), 
				NewStudent3.DisplayGrade()); 
		
		System.out.println(); 
		
		System.out.printf("Students in lower school: %d\n", lower.displayStudents()); 
		System.out.printf("Students in middle school: %d\n", middle.displayStudents()); 
		System.out.printf("Students in upper school: %d\n", upper.displayStudents()); 
		System.out.printf("Total DCDS Students: %d\n", upper.displayTotal()); 
		
	}

}
