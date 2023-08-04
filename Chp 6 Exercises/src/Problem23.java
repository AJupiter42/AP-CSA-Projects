
import java.util.Scanner;

public class Problem23 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first float: ");
		float num1 = input.nextFloat(); 
		
		System.out.print("Enter second float: ");
		float num2 = input.nextFloat(); 
		
		System.out.print("Enter third float: ");
		float num3 = input.nextFloat(); 
		
		System.out.printf("The min is %f", minimum3(num1, num2, num3)); 
		
	}
	
	public static float minimum3(float num1, float num2, float num3) {
		
		double min = Math.min((double)num1, Math.min((double)num2, (double)num3)); 
		return (float) min; 
		
	}

}
