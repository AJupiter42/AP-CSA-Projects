
import java.util.Scanner; 

public class DateTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1 for Format: DD/MM/YYYY, Enter 2 for Format: Month Day, Year, Enter 3 for Format: DDD YYYY: ");
		int format = input.nextInt(); 
		
		if (format == 1) {
			
			int DD = 0; 
			int MM = 0; 
			int YYYY = 0; 
			
			System.out.print("Enter DD: "); 
			DD = input.nextInt(); 
			
			System.out.print("Enter MM: "); 
			MM = input.nextInt(); 
			
			System.out.print("Enter YYYY: "); 
			YYYY = input.nextInt(); 
			
			Date date1 = new Date(DD, MM, YYYY); 
			
			date1.displayFormat1(); 
			date1.convertFormat1to2(); 
			date1.convertFormat1to3(); 
			
		}
		
		if (format == 2) {
			
			String month; 
			int day = 0; 
			int year = 0; 
			
			System.out.print("Enter Month: "); 
			month = input.next(); 
			
			System.out.print("Enter Day: "); 
			day = input.nextInt(); 
			
			System.out.print("Enter YYYY: "); 
			year = input.nextInt(); 
			
			Date date2 = new Date(month, day, year); 

			date2.convertFormat2to1(); 
			date2.displayFormat2(); 
			date2.convertFormat2to3(); 
			
		}
		
		if (format == 3) {
			
			int DDD = 0; 
			int YYYY = 0; 
			
			System.out.print("Enter DDD: "); 
			DDD = input.nextInt(); 
			
			System.out.print("Enter YYYY: "); 
			YYYY = input.nextInt(); 
			
			Date date3 = new Date(DDD, YYYY); 
		
			date3.convertFormat3to1(); 
			date3.convertFormat3to2(); 
			date3.displayFormat3(); 
			
		}
			
	}

} 
