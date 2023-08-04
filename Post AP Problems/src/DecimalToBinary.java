
import java.util.Scanner; 

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Decimal: ");
		int d = input.nextInt(); 
		
		System.out.printf("In Binary: %s", decimalToBinary(d)); 
		
	} 
	
	public static String decimalToBinary(int d) {
	
		int[] binaryArr = new int[100];
        
        int i = 0; 
        
        for (i = 0; d > 0; i++) {
    
            binaryArr[i] = d % 2;
            d /= 2;
            
        }
        
        String binaryNum = ""; 
   
        for (int j = i-1; j > 0; j--)
        	binaryNum += binaryArr[j]; 
            
        return binaryNum; 
        
    }

} 
