
public class Trapezoid extends Quadrilateral {

	public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		super(x1, y1, x2, y2, x3, y3, x4, y4); 
		
	}
	
	public double calculateArea() {
		
		double base1 = this.getD().getX() - this.getC().getX(); 
		double base2 = this.getB().getX() - this.getA().getX();
		double height = this.getA().getY() - this.getC().getY(); 
		
		double area = 0.5 * height * (base1 ); 
		
		return area; 
		
	} 
	
	@Override
	public String toString() {
		
		return String.format("The Area of the Trapezoid is: %.2f", calculateArea()); 
		
	}
	
} 
