
public class Complex {
	
	private float realPart; 
	private float imaginaryPart;
	
	public Complex(float realPart, float imaginaryPart) {
		
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
		
	} 
	
//	public Complex(float realPart) {
//		
//		this.realPart = realPart;
//		imaginaryPart = 0; 
//		
//	} 
//	
//	public Complex(float imaginaryPart) {
//		
//		realPart = 0; 
//		this.imaginaryPart = imaginaryPart;
//		
//	} 
	
	public void addComplex(float realPart1, float imaginaryPart1, float realPart2, float imaginaryPart2) {
		
		float newReal = realPart1 + realPart2; 
		float newImaginary = imaginaryPart1 + imaginaryPart2; 
		System.out.printf("%f + %fi", newReal, newImaginary); 
		
	}
	
	public void subtractComplex(float realPart1, float imaginaryPart1, float realPart2, float imaginaryPart2) {
		
		float newReal = realPart1 - realPart2; 
		float newImaginary = imaginaryPart1 - imaginaryPart2; 
		System.out.printf("%f - %fi", newReal, newImaginary); 
	
	}
	
	public void printComplex() {
		
		System.out.printf("%f + %fi", realPart, imaginaryPart); 
		
	}
	
	public float getRealPart() {
		
		return realPart; 
		
	}
	
	public float getImaginaryPart() {
		
		return imaginaryPart; 
		
	}

}
