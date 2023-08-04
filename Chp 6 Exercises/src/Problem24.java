
public class Problem24 {
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 1000; i++) {
			
			if (isPerfect(i) == true) 
				System.out.printf("%d is a perfect number\n", i);
			
		}
		
	} 
	
	public static boolean isPerfect(int num) {
		
		boolean state = false;  
		int sum = 0; 
		String factors = "The factors are "; 
		
		for(int i = 1; i < num; i++) {
			
			if(num % i == 0) { 
				
				sum += i; 
				factors += String.valueOf(i + " "); 
				
			}
			
		}
		
		if (sum == num) {
			
			state = true; 
			System.out.println(factors);
		
		}
		
		return state; 
		
	}

}
