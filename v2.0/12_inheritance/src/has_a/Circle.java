package has_a;

public class Circle {
	
	// 객체가 필드로 포함될 수 있음 (포함 관계)
	private Point p; // 원점
	private int r; // 반지름
	
	// 생성자
	// 객체를 필드로써 포함하고 있는 클래스는
	// 빈 생성자에서도 해당 객체를 new 하자!
	public Circle() {
		this.p = new Point(0, 0);
		this.r = 0;
	}
	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}
	public Circle(int x, int y, int r) {
		this.p = new Point(x, y);
		this.r = r;
	}
	// setter, getter
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	// toString
	@Override	
	public String toString() {
		return String.format("%s, r = %d", p, r);
	}
	
	// equals
	@Override
	public boolean equals(Object o) {
		return this.p.equals(((Circle)o).p) &&
				this.r == ((Circle)o).r;
	}
}
