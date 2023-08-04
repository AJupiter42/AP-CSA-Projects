
import java.util.Random;

public class RandomMultipleof9 {
	
	public static void main(String[] args) {
		
		int num = -1; 
		Random Rand = new Random();
		
		
		while (num % 9 != 0 && num != 0) {
			
		num = Rand.nextInt(82); 
			
		}
		
		System.out.printf("Generated Multiple of 9 is: %d", num);
		
	} 

} 
