
public class QuadTest {

	public static void main(String[] args) {

		Trapezoid trap1 = new Trapezoid(-2,8, 3,8, -4,-1, 5,-1); 
		System.out.println(trap1.toString());
				
		Parallelogram pgram1 = new Parallelogram(-7,5, 6,5, -9,-2, 4,-2);
		System.out.printf("The Area of the Parallelogram is: %.2f\n", pgram1.calculateArea()); 
		
		Rectangle rect1 = new Rectangle(-3,3, 3,3, -3, -2, 3,-2); 
		System.out.printf("The Area of the Rectangle is: %.2f\n", rect1.calculateArea()); 
		
		Square square1 = new Square(-2,2, 2,2, -2,-2, 2,-2); 
		System.out.printf("The Area of the Square is: %.2f\n", square1.calculateArea()); 

	} 

} 
