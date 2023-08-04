import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		int sum;
		int product;
		int average;
		
		System.out.print("Enter first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		num3 = input.nextInt();
		
		sum = num1 + num2 + num3;
		average = (num1 + num2 + num3) / 3;
		product = num1 * num2 * num3;
		
		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Average is %d\n", average);
		System.out.printf("Product is %d\n", product);
		
		int min = num1;
		
		if(num2 < min)
		min = num2;
	
		if(num3 < min)
		min = num3;
	
		System.out.printf("The smallest number is %d\n", min);
		
		int max = num1;
		
		if(num2 > max)
		max = num2;
	
		if(num3 > max)
		max = num3;
		
		System.out.printf("The largest number is %d\n", max);
			
	}
	
}