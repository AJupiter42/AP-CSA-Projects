
import java.util.Scanner; 

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Int: ");
		int n = input.nextInt(); 
		int factorial = fact(n); 
		System.out.printf("%d! = %d", n, factorial); 
		
	}
	
	public static int fact(int n) {
		
		if (n <= 1) 
			return 1; 
		
		else 
			return n*fact(n-1); 
		
	}

} 
