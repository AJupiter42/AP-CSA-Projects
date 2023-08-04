
import java.util.Scanner; 

public class Problem18 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of asterisks per side: ");
		int entry = input.nextInt();
		
		squareOfAsterisks(entry);
		
	} 
	
	public static void squareOfAsterisks(int num) {
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}
