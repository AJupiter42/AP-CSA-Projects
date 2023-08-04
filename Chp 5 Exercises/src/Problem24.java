
public class Problem24 {
	
	public static void main(String[] args) {
		
		int spacecount = 4; 
		int astcount = 1; 
		
		// top half of diamond
		
		for (int i = 0; i < 5; i++) {
		
			for (int j = 0; j < spacecount; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int k = 0; k < astcount; k++) {
				
				System.out.print("*");
				
			}
			
			astcount += 2; 
			
			for (int n = 0; n < spacecount; n++) {
				
				System.out.print(" ");
				
			}
			
			spacecount--; 
			
			System.out.println();
			
		}
		
		// bottom half of diamond
		
		spacecount = 1; 
		astcount = 7; 
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < spacecount; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int k = 0; k < astcount; k++) {
				
				System.out.print("*");
				
			}
			
			astcount -= 2; 
			
			for (int n = 0; n < spacecount; n++) {
				
				System.out.print(" ");
				
			}
			
			spacecount++; 
			
			System.out.println();
			
		}
		
	}
} 
