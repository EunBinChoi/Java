package line;

import point.Point;

public class LineSeg extends Line{
	Point ep; // 끝점
	
	public LineSeg() {
		super();
		ep = new Point();
	}
	public LineSeg(int x1, int y1, 
			int x2, int y2) {
		super(x1, y1); // 시작점 설정
		ep = new Point(x2, y2); // 끝점 설정
//		ep.setX(x2);
//		ep.setY(y2);
	}
	
	public LineSeg(Point p1, Point p2) {
		this(p1.getX(), p1.getY(),
				p2.getX(), p2.getY());
		
		
//		super(p1.getX(), p1.getY());
//		ep = new Point();
//		ep.setX(p2.getX());
//		ep.setY(p2.getY());
	}
	
	
	public Point getEp() {
		return ep;
	}
	public void setEp(Point ep) {
		this.ep = ep;
	}
	public double getDistance() {
		return Math.sqrt(Math.pow(ep.getX() - p.getX(), 2) 
				+ Math.pow(ep.getY() - p.getY(), 2));
	}
	
	@Override
	public String toString() {
		return String.format(""
				+ "(start point) x = %2d, y = %2d, \n \t \t"
				+ "(end point) x = %2d, y = %2d", 
				p.getX(), p.getY(), 
				ep.getX(), ep.getY());
	}
	
	@Override
	public void printInfo() {
		System.out.println("This is Line Segment");
		
	}
}
