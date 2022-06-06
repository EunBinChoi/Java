package shape;

import point.Point;

public class Triangle extends Shape{
	private int b, h; // 밑변, 높이
	
	public Triangle() {
		super();
	}
	
	public Triangle(Point p, int b, int h) {
//		super(p);
//		this.b = b;
//		this.h = h;
		
		this(p.getX(), p.getY(), b, h);
	}
	
	public Triangle(int x, int y, int b, int h) {
		super(x, y);
		this.b = b;
		this.h = h;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
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
				+ String.format(", b = %2d, "
						+ "h = %2d", b, h);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * b * h;
		//return 1/2.0 * b * h; //와 차이점 비교하기
	}

	@Override
	public void printInfo() {
		System.out.println("This is Triangle");
		
	}
	
}
