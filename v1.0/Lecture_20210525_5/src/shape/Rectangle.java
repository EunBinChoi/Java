package shape;

import point.Point;

public class Rectangle extends Shape{

	private int w, h;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Point p, int w, int h) {
//		super(p);
//		this.w = w;
//		this.h = h;
		
		this(p.getX(), p.getY(), w, h);
	}
	
	public Rectangle(int x, int y, int w, int h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ String.format(", w = %2d, h = %2d", w, h);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)w * h;
	}
	
	@Override
	public void printInfo() {
		System.out.println("This is Rectangle");
		
	}
}
