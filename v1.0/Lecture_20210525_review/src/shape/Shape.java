package shape;

import point.Point;


public abstract class Shape {
	protected Point p;
	
	// new Shape();
	public Shape() {
		p = new Point();
	}
	
	// new Shape(3, 5);
	public Shape(int x, int y) {
		p = new Point(x, y);
	}
	
	// new Shape(new Point(3, 5));
	public Shape(Point p) {
		this(p.getX(), p.getY());
		
		
//		this.p = new Point();
//		this.p.setX(p.getX());
//		this.p.setY(p.getY());
	}
	
	@Override
	public String toString() {
		return p.toString();
	}
	public Point getPoint() {
		return p;
	}
	public void setPoint(Point p) {
		this.p.setX(p.getX());
		this.p.setY(p.getY());
	}

	public abstract void printInfo();
	public abstract double getArea();
}
