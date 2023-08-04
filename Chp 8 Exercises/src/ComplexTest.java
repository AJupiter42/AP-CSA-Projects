
public class ComplexTest {

	public static void main(String[] args) {
		
		Complex complexNum1 = new Complex(52, (float)Math.sqrt(53)); 
		Complex complexNum2 = new Complex(38, (float)Math.sqrt(47)); 
		
		System.out.print("Complex Num 1: ");
		complexNum1.printComplex();
		System.out.println(); 
		
		System.out.print("Complex Num 2: ");
		complexNum2.printComplex();
		System.out.println(); 
		
		System.out.print("Complex Num 1 + Complex Num 2 = ");
		complexNum1.addComplex(complexNum1.getRealPart(), complexNum1.getImaginaryPart(), complexNum2.getRealPart(), 
				complexNum2.getImaginaryPart()); 
		System.out.println(); 
		
		System.out.print("Complex Num 1 - Complex Num 2 = ");
		complexNum1.subtractComplex(complexNum1.getRealPart(), complexNum1.getImaginaryPart(), complexNum2.getRealPart(), 
				complexNum2.getImaginaryPart()); 
		System.out.println(); 

	}

} 
