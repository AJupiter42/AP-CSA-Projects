
public class Search {
	
	public static void main(String[] args) {
		
		int[] numarray = {1, 60, 32, 41, 18, 11, 5, 8, 17, 80, 6, 2};
		
		System.out.printf("(Linear) Index of 5: %d\n", Linear(numarray, 5)); 
		
		System.out.printf("(Binary) Index of 5: %d\n", Linear(numarray, 5)); 
		
	}
		
	public static int Linear(int array[], int n) {
		
		int value = -1; 
		
		for (int index = 0; index < array.length; index++) {
			
			if(array[index] == n) 
				value = index; 
			 
		}
		
		return value; 
		
	}
	
	public static int Binary(int array[], int element) {
				
		int start_index = 0; 
		int end_index = array.length; 
		
		while (0 <= end_index){
			  
			int middle = array.length /2;
		     
		    if (array[middle] == element)
		       return middle;
		     
		    if (array[middle] < element)
		       start_index = middle + 1;
		    else
		       end_index = middle - 1;
		     
		   }
		   
		   return -1;
		   
	}
	
} 
