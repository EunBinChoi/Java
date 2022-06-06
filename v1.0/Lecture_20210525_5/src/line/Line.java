package line;

import point.Point;

public abstract class Line {
	protected Point p; // 기준점 (시작점)
	
	// new Line();
	public Line() {
		p = new Point();
	}
	
	// new Line(3, 5);
	public Line(int x, int y) {
		p = new Point(x, y);
	}
	
	// new Line(new Point(3, 5));
	public Line(Point p) {
		this(p.getX(), p.getY());
		
//		this.p = new Point();
//		
//		this.p.setX(p.getX());
//		this.p.setY(p.getY());
	}
	
	
	
	public Point getPoint() {
		return p;
	}
	
	public void setPoint(Point p) {
		this.p.setX(p.getX());
		this.p.setY(p.getY());
	}
	
	@Override
	public String toString() {
		return p.toString();
	}
	
	public abstract void printInfo();
}
