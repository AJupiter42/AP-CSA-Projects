
import java.util.Scanner;

public class Problem27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer 1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter integer 2: ");
		int num2 = input.nextInt();
		
		System.out.printf("The GCD is %d", calculateGCD(num1, num2));
		
	}
	
	public static int calculateGCD(int num1, int num2) {
		
		int GCD = 1; 
		int temp; 
		
		temp = num1 % num2; 
		num1 -= temp;
		num2 = temp; 
		
		while (num1 != 0 && num2 != 0) { 
		
			temp = num1 % num2; 
			num1 = num2; 
			num2 = temp; 
			
		}
		
		if (num1 == 0) 
			GCD = num2; 
		
		if (num2 == 0)
			GCD = num1; 
		
		return GCD; 
		
	}

}
