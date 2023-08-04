import java.util.Scanner;

public class Problem24 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int entry1;
		int entry2;
		int entry3;
		int entry4;
		int entry5;
		
		System.out.print("Enter first integer: ");
		entry1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		entry2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		entry3 = input.nextInt();
		 
		System.out.print("Enter fourth integer: ");
		entry4 = input.nextInt();
		
		System.out.print("Enter fifth integer: ");
		entry5 = input.nextInt();
		
		int min = entry1;
		
		if(entry2 < min)
			min = entry2;
		
		if(entry3 < min)
			min = entry3;
		
		if(entry4 < min)
			min = entry4;
		
		if(entry5 < min)
			min = entry5;
		
		System.out.printf("The smallest integer is %d\n", min);
		
		int max = entry1;
		
		if(entry2 > max)
			max = entry2;
		
		if(entry3 > min)
			max = entry3;
		
		if(entry4 > min)
			max = entry4;
		
		if(entry5 > min)
			max = entry5;
		
		System.out.printf("The largest integer is %d\n", max);
		
	}

}