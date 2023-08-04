
public class Problem25 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 10000; i++)
			if (isPrime(i))
				System.out.println(i + " is prime");

	}

	public static boolean isPrime(int num) {
		
		boolean state = true; 
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0)
				state = false; 
			
		}
		
		return state; 
		
	}
	
} 
