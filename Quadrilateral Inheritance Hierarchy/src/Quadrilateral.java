
public class Quadrilateral {
	
	private Point A; 
	private Point B; 
	private Point C; 
	private Point D;
	
	public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		Point A = new Point(x1, y1); 
		Point B = new Point(x2, y2); 
		Point C = new Point(x3, y3); 
		Point D = new Point(x4, y4); 
		
		this.A = A; 
		this.B = B; 
		this.C = C; 
		this.D = D; 
		
	} 

	public Point getA() {
		
		return A;
		
	}

	public void setA(Point a) {
		
		A = a;
		
	}

	public Point getB() {
		
		return B;
		
	}

	public void setB(Point b) {
		
		B = b;
		
	}

	public Point getC() {
		
		return C;
		
	}

	public void setC(Point c) {
		
		C = c;
		
	}

	public Point getD() {
		
		return D;
		
	}

	public void setD(Point d) {
		
		D = d;
		
	}
	
} 
