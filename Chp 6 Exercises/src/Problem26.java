
import java.util.Scanner; 

public class Problem26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		System.out.printf("The reverse is %d", reverseDigits(num)); 
		
	}
	
	public static int reverseDigits(int num) {
		
		int reverse = 0; 
		
		while (num != 0) {
			
			int remainder = num % 10;
			reverse = reverse * 10 + remainder; 
			num /= 10;
			
		}
		
		return reverse; 
	
	}
	
} 
