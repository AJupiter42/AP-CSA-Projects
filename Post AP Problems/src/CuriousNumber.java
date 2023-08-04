 
public class CuriousNumber {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == fact(i))
				System.out.println(i);
			
		}
		
		for (int i = 10; i < 100; i++) {
			
			if (i == fact(i / 10) + fact(i % 10))
				System.out.println(i); 
		
		}
		
		for (int i = 100; i < 1000; i++) {
			
			if (i == fact(i / 100) + fact((((i - (i % 10)) % 100)) / 10) + fact(i % 10))
				System.out.println(i); 
		
		}
		
	}
	
	public static int fact(int n) {
		
		if (n <= 1) 
			return 1; 
		
		else 
			return n*fact(n-1); 
		
	}

}
