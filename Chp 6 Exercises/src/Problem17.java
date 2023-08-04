
import java.util.Scanner; 

public class Problem17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Enter an integer: ");
			int entry = input.nextInt(); 
			
			if (isEven(entry) == true)
				System.out.println("The integer is even"); 
			else 
				System.out.println("The integer is odd");
			
		System.out.println(); 
			
		}
		
	}

	public static boolean isEven(int num) {
	
		if (num % 2 == 0)
			return true; 
		else
			return false; 
	
	} 

}
