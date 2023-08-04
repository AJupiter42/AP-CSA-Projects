import java.util.Scanner;

public class Problem26 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		int num1; 
		int num2;
		
		System.out.print("Enter first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = input.nextInt();
		
		if(num2 % num1 == 0)
			System.out.printf("%d is a multiple of %d", num1, num2);
		
		if(num2 % num1 != 0)
			System.out.printf("%d is not a multiple of %d", num1, num2);
		
	}

}