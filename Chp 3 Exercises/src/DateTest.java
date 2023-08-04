import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		
		Date date1 = new Date(0, 0, 0);
		
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for date info and set values in date object
		System.out.print("Enter month: ");
		int month = input.nextInt();
		date1.setMonth(month);
		
		System.out.print("Enter day: ");
		int day = input.nextInt();
		date1.setDay(day);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		date1.setYear(year);
		
		date1.displayDate(date1.getMonth(), date1.getDay(), date1.getYear());
		
	}
	
}
