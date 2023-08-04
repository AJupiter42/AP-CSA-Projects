
import java.util.Scanner; 

public class Problem12 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
		int[] allints = new int[5]; 
		int[] norepeats = new int[5]; 
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Enter Integer Between 10-100: ");
			allints[i] = input.nextInt(); 
			
		}
		
		norepeats[0] = allints[0]; 
		
		for(int i = 0; i < 5; i++) {
			
			if(allints[i] != norepeats[0] && allints[i] != norepeats[1] && allints[i] != norepeats[2] && allints[i] != norepeats[3] && allints[i] != norepeats[4])
				norepeats[i] = allints[i]; 
			
		} 
		

		for(int i = 0; i < 5; i++) {
			
			if (norepeats[i] != 0)
				System.out.print(norepeats[i] + " ");
			
		}
			
	}

} 