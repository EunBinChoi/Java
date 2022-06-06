package problem2;

public class Circle extends Shape {
	private int r;
	private static final double PI = 3.14; // 상수 정의
	
	public Circle() {
		super();
	}
	public Circle(int r) {
		super();
		this.r = r;
	}
	public Circle(Point p, int r) {
		super(p);
		this.r = r;
	}
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, radius = %d", p, r);
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Circle)) return false;
		return this.p.equals(o) && this.r == ((Circle)o).r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Draw");
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return r * r * PI;
	}
}
