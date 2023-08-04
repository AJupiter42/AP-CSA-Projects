import java.util.Scanner;

public class Power {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Int: ");
		int n = input.nextInt(); 
		int answer = power(n); 
		System.out.printf("2^%d = %d", n, answer); 
		
	}
	
	public static int power(int n) {
		
		if (n == 0) 
			return 1;
		
		else if (n == 1)
			return 2; 
		
		else 
			return 2*power(n-1); 
		
	}

} 
