package shape;

import point.Point;

public class Circle extends Shape{
	private static final double PI = 3.14;
	// Math.PI;
	private int r;
	
	public Circle() {
		super();
	}
	
	public Circle(Point p, int r) {
//		super(p);
//		this.r = r;
//		
		this(p.getX(), p.getY(), r);
	}
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	
	public static double getPi() {
		return PI;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ String.format(", r = %d", r);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
	@Override
	public void printInfo() {
		System.out.println("This is Circle");
		
	}
}
