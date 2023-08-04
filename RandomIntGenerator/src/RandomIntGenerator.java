
import java.util.Random;

public class RandomIntGenerator {
	
	public static void main(String[] args) {
		
		int num = 0; 
		Random Rand = new Random();
		
		
		while (num != 9 && num != 10 && num != 15 && num != 19) {
			
		num = Rand.nextInt(20);
			
		} 
		
		System.out.printf("Generated Number Is: %d", num);

	}

} 
