import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		int entry; 
		
		System.out.print("Enter an integer: ");
		entry = input.nextInt();
		
		if(entry % 2 == 0)
			System.out.print("The integer is even");
		
		if(entry % 2 == 1)
			System.out.print("The integer is odd");
		
	}
	
}