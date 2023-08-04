import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("N/A", "N/A", 0);
		Employee employee2 = new Employee("N/A", "N/A", 0);
		
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for Employee 1 and 2 info and set values in employee objects
		System.out.print("Enter Employee 1's First Name: ");
		String fname1 = input.nextLine();
		employee1.setFirstName(fname1);
		
		System.out.print("Enter Employee 1's Last Name: ");
		String lname1 = input.nextLine();
		employee1.setLastName(lname1);
		
		System.out.print("Enter Employee 1's monthly salary: ");
		double salary1 = input.nextDouble();
		employee1.setMonthlySalary(salary1);
		
		
		System.out.print("Enter Employee 2's First Name: ");
		String fname2 = input.nextLine();
		employee2.setFirstName(fname2);
		
		System.out.print("Enter Employee 2's Last Name: ");
		String lname2 = input.nextLine();
		employee2.setLastName(lname2);
		
		System.out.print("Enter Employee 2's monthly salary: ");
		double salary2 = input.nextDouble();
		employee2.setMonthlySalary(salary2);
		
		// display employee salaries
		System.out.printf("Employee %s %s's yearly salary is: $%.2f%n", employee1.getFirstName(), 
			employee1.getLastName(), employee1.getMonthlySalary()*12);
		System.out.printf("Employee %s %s's yearly salary is: $%.2f%n", employee2.getFirstName(), 
			employee2.getLastName(), employee2.getMonthlySalary()*12);
		
		// prompt user for raise percentage
		System.out.print("Enter Employee 1 salary raise percentage: ");
		int raise1 = input.nextInt();
		System.out.print("Enter Employee 2 salary raise percentage: ");
		int raise2 = input.nextInt();
		
		// display new salaries
		System.out.printf("Employee %s %s's new yearly salary is: $%.2f%n", employee1.getFirstName(), 
			employee1.getLastName(), employee1.getMonthlySalary()*12*(100+raise1));
		System.out.printf("Employee %s %s's new yearly salary is: $%.2f%n", employee2.getFirstName(), 
			employee2.getLastName(), employee2.getMonthlySalary()*12*(100+raise2));
		
	}
	
}
