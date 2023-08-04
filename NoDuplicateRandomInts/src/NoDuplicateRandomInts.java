
import java.util.Random;

public class NoDuplicateRandomInts {
	
	public static void main(String[] args) {
		
		int[] noduplicates = new int[6]; 
		
		Random Rand = new Random();
		
		for(int i = 0; i < 6; i++)
			noduplicates[i] = Rand.nextInt(6) + 1; 
		
		while (noduplicates[1] == noduplicates[0])
			noduplicates[1] = Rand.nextInt(6) + 1; 
		
		while (noduplicates[2] == noduplicates[1] || noduplicates[2] == noduplicates[0])
			noduplicates[2] = Rand.nextInt(6) + 1; 
		
		while (noduplicates[3] == noduplicates[2] || noduplicates[3] == noduplicates[1] || noduplicates[3] == noduplicates[0])
			noduplicates[3] = Rand.nextInt(6) + 1; 
		
		while (noduplicates[4] == noduplicates[3] || noduplicates[4] == noduplicates[3] || noduplicates[4] == noduplicates[1] ||
				noduplicates[4] == noduplicates[0])
			noduplicates[4] = Rand.nextInt(6) + 1; 
		
		while (noduplicates[5] == noduplicates[4] || noduplicates[5] == noduplicates[3] || noduplicates[5] == noduplicates[2] ||
				noduplicates[5] == noduplicates[1] || noduplicates[5] == noduplicates[0])
			noduplicates[5] = Rand.nextInt(6) + 1; 
		
		for (int x : noduplicates)
			System.out.print(x + " "); 
		
	}

} 
