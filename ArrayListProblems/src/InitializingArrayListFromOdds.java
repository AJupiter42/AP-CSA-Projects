
import java.util.ArrayList; 

public class InitializingArrayListFromOdds {

	public static void main(String[] args) {
		
		int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int sum = 0; 
		
		ArrayList<Integer> odds = new ArrayList<Integer>(); 
		
		for (int i = 0; i < ints.length; i++) {
			
			if (ints[i] % 2 != 0)
				odds.add(ints[i]); 
			
		}
		
		for (int i = 0; i < odds.size(); i++) {
			
			sum += odds.get(i); 
			
		}
		
		for (int i = 0; i < odds.size(); i++) {
			
			System.out.print(odds.get(i) + " ");
			
		}
		
		System.out.printf("Sum: %d", sum); 

	}

} 
