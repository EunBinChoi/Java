package line;

import point.Point;

public class StraightLine extends Line{
	private int slope; // ±â¿ï±â
	
	public StraightLine() {
		super();
	}
	public StraightLine(int x, int y, int slope) {
		super(x, y);
		this.slope = slope;
	}
	
	public StraightLine(Point p, int slope) {
//		super(p.getX(), p.getY());
		
		this(p.getX(), p.getY(), slope);
		
	}
	
	public int getSlope() {
		return slope;
	}
	
	public void setSlope(int slope) {
		this.slope = slope;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ String.format(", slope = %2d", slope);
	}
	@Override
	public void printInfo() {
		System.out.println("This is Straight Line");
		
	}
}
