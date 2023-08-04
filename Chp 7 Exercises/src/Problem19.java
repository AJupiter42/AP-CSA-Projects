
// Program to Reserve Plane Seats 
import java.util.Scanner;

public class Problem19 {
	
	public static void main(String[] args) {
		
		boolean[] economy = {false, false, false, false, false};
		boolean[] firstclass = {false, false, false, false, false}; 
		int start = 0; 
		int response = 0; 
		int e = 0;  
		int fc = 0; 
		
		Scanner input = new Scanner(System.in); 
		
		while(start == 0) {
			
			System.out.print("Please type 1 for First Class or 2 for Economy: "); 	
			response = input.nextInt(); 
			start = 1; 
			
		} 
		
		while(start == 1) { 
	
			if(response == 1) {
				
				if(fc < 5) {
				
					firstclass[fc] = true; 
					System.out.printf("Your Assigned Seat %d in First Class\n", fc+1);
					fc++;
					start = 0; 
				
				}
				
				else {
					
					System.out.print("First Class is full, if you would like a seat in Economy, press 1, if not then press 2");
					if(input.nextInt() == 1) {
						
						if(e < 5) {
							
							economy[e] = true; 
							System.out.printf("Your Assigned Seat %d in Economy\n", e+1);
							e++;
							start = 0; 
						
						}
						
						else {
							
							System.out.print("Economy is also full, next flight leaves in 3 hours\n");
							start = 0; 
							
						}
							
					}
					
					if(input.nextInt() == 2) {
						
						System.out.print("Next flight leaves in 3 hours\n");
						start = 0; 
						
					}
				
				}
				
			}
				
			if(response == 2) {
				
				if(e < 5) {
					
					economy[e] = true; 
					System.out.printf("Your Assigned Seat %d in Economy\n", e+1);
					e++;
					start = 0; 
				
				}
				
				else {
					
					System.out.print("Economy is full, if you would like a seat in First Class, press 1, if not then press 2");
					if(input.nextInt() == 1) {
						
						if(fc < 5) {
							
							firstclass[fc] = true; 
							System.out.printf("Your Assigned Seat %d in First Class\n", fc+1);
							fc++;
							start = 0; 
						
						}
						
						else {
							
							System.out.print("First Class is also full, next flight leaves in 3 hours\n");
							start = 0; 
							
						}
							
					}
		
					if(input.nextInt() == 2) {
						
						System.out.print("Next flight leaves in 3 hours\n");
						start = 0; 
						
					}
				
				}
				
			}	
			
		}
				
	}
		
}
