
public class ArrayOddSum {

	public static void main(String[] args) {
		
		int[] numarray = {20, 25, 31, 49, 50, 65, 71}; 
		int sum = 0; 
		
		for (int i = 0; i < numarray.length; i++) {
			
			if (numarray[i] % 2 != 0)
				numarray[i] += 3; 
				sum += numarray[i]; 

		}
		
		System.out.printf("The sum of the odd numbers is %d", sum);
		
	}

} 
