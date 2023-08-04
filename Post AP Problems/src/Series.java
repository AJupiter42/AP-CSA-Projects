
import java.util.Scanner;

public class Series {
		
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in); 
			
		System.out.print("Enter Decimal: ");
		int d = input.nextInt(); 
			
		System.out.printf("Longest Series of 0s in Binary: %d", longestSeriesOf0s(d)); 
			
	} 
	
	public static int longestSeriesOf0s(int d) {
        
        int series = 0; 
        int temp = 0; 
        
        while (d > 0) {
    
            if (d % 2 == 0) {
            	
            	temp++;
            	
            }
            
            else if (d % 2 == 1) {
            	
            	series = Math.max(temp, series); 
            	temp = 0; 
            	
            }
            
           	d /= 2; 
          
        }
        
        return series; 
        
    }
	
}
