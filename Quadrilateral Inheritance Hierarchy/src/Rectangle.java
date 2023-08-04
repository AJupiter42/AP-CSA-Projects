
public class Rectangle extends Parallelogram {

	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		super(x1, y1, x2, y2, x3, y3, x4, y4); 
		
	}
	
	@Override
	public double calculateArea() {
		
		double length = this.getD().getX() - this.getC().getX(); 
		double width = this.getA().getY() - this.getC().getY();
		
		double area = length * width;  
		
		return area; 
		
	}
	
	@Override
	public String toString() {
		
		return String.format("The Area of the Trapezoid is: %.2f", this.calculateArea()); 
		
	}
	
} 
