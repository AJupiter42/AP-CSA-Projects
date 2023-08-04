
import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Integer Between 0 and 99999: ");
		int num = input.nextInt();
		if (num >= 1 && num <= 99999) 
			displayDigits(num);
		
	}  
	
	public static int calculateQuotient(int num1, int num2) {
		
		int q = num1/num2; 
		return q; 
		
	}
	
	public static double calculateRemainder(int num1, int num2) {
	
		double r = num1 % num2;
		return r; 
		
	}
	
	public static void displayDigits(int num) {
		
		int test = num; 
		int digits = 1;
		int temp; 

		String number = "";
		
		while (test >= 10) {
			
			test /= 10; 
			digits++; 
			
		}
		
		for (int i = 0; i < digits; i++) {
			
			int sub = 1; 
			
			test = calculateQuotient(num, (int)Math.pow(10, digits-sub));
			temp = test % 10; 
			number += temp + "  ";
			test = num; 
			sub++; 

		}
		
		System.out.print(number);
		
	}

} 
