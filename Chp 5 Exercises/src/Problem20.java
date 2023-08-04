
public class Problem20 {
	
	public static void main(String[] args) {
		
		double pi = 4.0; 
		int denom = 3; 
		int terms = 1; 
		
		for (terms = 1; terms <= 200000; terms++) {
			
			pi -= 4.0/denom; 	
			denom += 2; 
			pi += 4.0/denom; 
			denom += 2; 
	
		}
		
		System.out.printf("Pi = %f", pi);
		
	} 

} 
