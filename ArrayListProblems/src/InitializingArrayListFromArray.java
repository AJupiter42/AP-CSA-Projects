
// Only Add Names with Less than 5 Characters

import java.util.ArrayList; 

public class InitializingArrayListFromArray {
	
	public static void main(String[] args) {
		
		String[] names = {"Kyle", "Liam", "Nishan", "Charlie", "Ares"}; 
		
		ArrayList<String> namelist = new ArrayList<String>(); 
		
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].length() < 5)
				namelist.add(names[i]); 
			
		}
		
		for (int i = 0; i < namelist.size(); i++) {
			
			System.out.print(namelist.get(i) + " ");
			
		}
		
	}

} 
