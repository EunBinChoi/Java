package line;

import point.Point;

public class Curve extends Line{
	private int curveDeg; // °î¼±ÀÇ Á¤µµ
	public Curve() {
		super();
	}
	
	public Curve(int x, int y, int curveDeg) {
		super(x, y);
		this.curveDeg = curveDeg;
	}
	public Curve(Point p, int curveDeg) {
//		super(p.getX(), p.getY());
//		this.curveDeg = curveDeg;
		
		this(p.getX(), p.getY(), curveDeg);
	}
	
	
	public int getCurveDeg() {
		return curveDeg;
	}

	public void setCurveDeg(int curveDeg) {
		this.curveDeg = curveDeg;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ String.format(", curveDeg = %2d", curveDeg);
	}
	@Override
	public void printInfo() {
		System.out.println("This is Curve");
		
	}
}
