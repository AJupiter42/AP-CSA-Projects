
public class DisplayEvenNumbers {
	
	public static void main(String[] args) {
		
		int num = 50;
		
		while (num >= 30) {
			
			if(num == 36 || num == 46) {
				
				num = num - 2;
				continue;
				
			}
			
			System.out.println(num);
			num = num - 2;
					
		}
		
	}
	
}