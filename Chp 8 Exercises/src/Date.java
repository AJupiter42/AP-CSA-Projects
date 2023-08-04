
public class Date {
	
	private int dd; 
	private int mm; 
	private int yyyy; 
	
	private String month; 
	private int day; 
	private int year; 
	
	private int DDD; 
	private int YYYY;
	
	public Date(int dd, int mm, int yyyy) {
	
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
		
	}

	public Date(String month, int day, int year) {

		this.month = month;
		this.day = day;
		this.year = year;
		
	}

	public Date(int dDD, int yYYY) {
		
		DDD = dDD;
		YYYY = yYYY;
		
	} 
	
	public void displayFormat1() {
		
		System.out.printf("%d/%d/%d", dd, mm, yyyy); 
		
	}
	
	public void displayFormat2() {
		
		System.out.printf("%s %d, %d", day, month, year); 
		
	}
	
	public void displayFormat3() {
		
		System.out.printf("%d %d", DDD, YYYY); 
	
	}
	
	public void convertFormat1to2() {
		
		int day = dd; 
		int year = yyyy; 
		String month; 
		
		if (mm == 1) 
			month = "January"; 
		
		else if (mm == 2)
			month = "Feburary"; 
		
		else if (mm == 3)
			month = "March"; 
		
		else if (mm == 4)
			month = "April"; 
		
		else if (mm == 5)
			month = "May"; 
		
		else if (mm == 6)
			month = "June"; 
		
		else if (mm == 7)
			month = "July"; 
		
		else if (mm == 8)
			month = "August"; 
		
		else if (mm == 9)
			month = "September"; 
		
		else if (mm == 10)
			month = "October"; 
		
		else if (mm == 11)
			month = "November"; 
		
		else
			month = "December"; 
		
		System.out.printf("%s %d, %d", day, month, year); 
		
	}
	
	public void convertFormat1to3() {
		
		int DDD; 
		int YYYY = yyyy;
		
		if (mm == 1) 
			DDD = day; 
		
		else if (mm == 2)
			DDD = 31 + day; 
		
		else if (mm == 3)
			DDD = 59 + day; 
		
		else if (mm == 4)
			DDD = 90 + day; 
		
		else if (mm == 5)
			DDD = 120 + day; 
		
		else if (mm == 6)
			DDD = 151 + day; 
		
		else if (mm == 7)
			DDD = 181 + day; 
		
		else if (mm == 8)
			DDD = 212 + day; 
		
		else if (mm == 9)
			DDD = 243 + day; 
		
		else if (mm == 10)
			DDD = 273 + day; 
		
		else if (mm == 11)
			DDD = 304 + day; 
		
		else
			DDD = 334 + day; 
		
		System.out.printf("%d %d", DDD, YYYY); 
		
	}
	
	public void convertFormat2to1() {
		
		int dd = day;
		int yyyy = year; 
		
		int mm; 
		
		if (month == "January") 
			mm = 1; 
		
		else if (month == "Feburary")
			mm = 2; 
		
		else if (month == "March")
			mm = 3; 
		
		else if (month == "April")
			mm = 4; 
		
		else if (month == "May")
			mm = 5; 
		
		else if (month == "June")
			mm = 6; 
		
		else if (month == "July")
			mm = 7; 
		
		else if (month == "August")
			mm = 8; 
		
		else if (month == "September")
			mm = 9; 
		
		else if (month == "October")
			mm = 10; 
		
		else if (month == "November")
			mm = 11; 
		
		else
			mm = 12; 
		
		System.out.printf("%d/%d/%d", dd, mm, yyyy); 
		
	}
	
	public void convertFormat2to3() {
		
		int DDD; 
		int YYYY = year;
		
		int mm; 
		
		if (month == "January") 
			mm = 1; 
		
		else if (month == "Feburary")
			mm = 2; 
		
		else if (month == "March")
			mm = 3; 
		
		else if (month == "April")
			mm = 4; 
		
		else if (month == "May")
			mm = 5; 
		
		else if (month == "June")
			mm = 6; 
		
		else if (month == "July")
			mm = 7; 
		
		else if (month == "August")
			mm = 8; 
		
		else if (month == "September")
			mm = 9; 
		
		else if (month == "October")
			mm = 10; 
		
		else if (month == "November")
			mm = 11; 
		
		else
			mm = 12; 
		
		if (mm == 1) 
			DDD = day; 
		
		else if (mm == 2)
			DDD = 31 + day; 
		
		else if (mm == 3)
			DDD = 59 + day; 
		
		else if (mm == 4)
			DDD = 90 + day; 
		
		else if (mm == 5)
			DDD = 120 + day; 
		
		else if (mm == 6)
			DDD = 151 + day; 
		
		else if (mm == 7)
			DDD = 181 + day; 
		
		else if (mm == 8)
			DDD = 212 + day; 
		
		else if (mm == 9)
			DDD = 243 + day; 
		
		else if (mm == 10)
			DDD = 273 + day; 
		
		else if (mm == 11)
			DDD = 304 + day; 
		
		else
			DDD = 334 + day; 
		
		System.out.printf("%d %d", DDD, YYYY); 
		
	}
	
	public void convertFormat3to1() {
		
		int dd; 
		int mm; 
		int yyyy = YYYY; 
		
	
		if (DDD > 334) {
			
			mm = 12; 
			dd = DDD - 334; 
			
		}
		
		else if (DDD > 304 && DDD < 334) {
			
			mm = 11; 
			dd = DDD - 304; 
			
		}
		
		else if (DDD > 273 && DDD < 304) {
			
			mm = 10; 
			dd = DDD - 273; 
			
		}
		
		else if (DDD > 243 && DDD < 273) {
			
			mm = 9; 
			dd = DDD - 243; 
			
		}
		
		else if (DDD > 212 && DDD < 243) {
			
			mm = 8; 
			dd = DDD - 212; 
			
		}
		
		else if (DDD > 181 && DDD < 212) {
			
			mm = 7; 
			dd = DDD - 181; 
			
		}
		
		else if (DDD > 151 && DDD < 181) {
			
			mm = 6; 
			dd = DDD - 151; 
			
		}
		
		else if (DDD > 120 && DDD < 151) {
			
			mm = 5; 
			dd = DDD - 120; 
			
		}
		
		else if (DDD > 90 && DDD < 120) {
			
			mm = 4; 
			dd = DDD - 90; 
			
		}
		
		else if (DDD > 59 && DDD < 90) {
			
			mm = 3; 
			dd = DDD - 59; 
			
		}
		
		else if (DDD > 31 && DDD < 59) {
			
			mm = 2; 
			dd = DDD - 212; 
			
		}
		
		else {
			
			mm = 1; 
			dd = DDD; 
			
		}
		
		System.out.printf("%d/%d/%d", dd, mm, yyyy); 
		
	}
	
	public void convertFormat3to2() {
		
		String month; 
		int day; 
		int year = YYYY; 
		
		int mm; 
		
		if (DDD > 334) {
			
			mm = 12; 
			day = DDD - 334; 
			
		}
		
		else if (DDD > 304 && DDD < 334) {
			
			mm = 11; 
			day = DDD - 304; 
			
		}
		
		else if (DDD > 273 && DDD < 304) {
			
			mm = 10; 
			day = DDD - 273; 
			
		}
		
		else if (DDD > 243 && DDD < 273) {
			
			mm = 9; 
			day = DDD - 243; 
			
		}
		
		else if (DDD > 212 && DDD < 243) {
			
			mm = 8; 
			day = DDD - 212; 
			
		}
		
		else if (DDD > 181 && DDD < 212) {
			
			mm = 7; 
			day = DDD - 181; 
			
		}
		
		else if (DDD > 151 && DDD < 181) {
			
			mm = 6; 
			day = DDD - 151; 
			
		}
		
		else if (DDD > 120 && DDD < 151) {
			
			mm = 5; 
			day = DDD - 120; 
			
		}
		
		else if (DDD > 90 && DDD < 120) {
			
			mm = 4; 
			day = DDD - 90; 
			
		}
		
		else if (DDD > 59 && DDD < 90) {
			
			mm = 3; 
			day = DDD - 59; 
			
		}
		
		else if (DDD > 31 && DDD < 59) {
			
			mm = 2; 
			day = DDD - 212; 
			
		}
		
		else {
			
			mm = 1; 
			day = DDD; 
			
		}
		
		if (mm == 1) 
			month = "January"; 
		
		else if (mm == 2)
			month = "Feburary"; 
		
		else if (mm == 3)
			month = "March"; 
		
		else if (mm == 4)
			month = "April"; 
		
		else if (mm == 5)
			month = "May"; 
		
		else if (mm == 6)
			month = "June"; 
		
		else if (mm == 7)
			month = "July"; 
		
		else if (mm == 8)
			month = "August"; 
		
		else if (mm == 9)
			month = "September"; 
		
		else if (mm == 10)
			month = "October"; 
		
		else if (mm == 11)
			month = "November"; 
		
		else
			month = "December"; 
		
		System.out.printf("%s %d, %d", day, month, year); 
		
	}
	
}
