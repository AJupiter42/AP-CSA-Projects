
import java.util.Scanner; 

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Series: "); 
		String series = input.next(); 
		
		System.out.printf("The Longest Palindrome in the Series is: %s", longestPalindrome(series)); 
		
	}
	
	public static String longestPalindrome(String series) {
		
		String longest; 
		
		if (isPalindrome(series) == true)
			return series; 
		
		else {
			
			int low = 0; 
			int high = series.length() - 1; 
			
			while (low < high && series.charAt(low) != series.charAt(high)) {
				
	            low++;
	            high--;
	            
	        }
			
			return series.substring(low, high + 1);  
			
		}
		
	}
	
	public static boolean isPalindrome(String series) {
        
		boolean result; 
		
		if (series.length() == 1)
			return true; 
		
		else {
			
			result = true; 
			
			series = series.toLowerCase();
			
			int i = 0;
			int j = series.length() - 1; 
			
			while (i < j) {
				
				if (series.charAt(i) != series.charAt(j))
					result = false; 
				
				i++; 
				j--; 
			
			}
			
			return result; 
			
		}
        
    }
	
}
