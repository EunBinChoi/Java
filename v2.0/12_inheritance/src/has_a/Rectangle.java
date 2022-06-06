package has_a;

public class Rectangle {
	
	// 객체가 필드로 포함될 수 있음 (포함 관계)
	private Point lt; // 왼쪽 상단
	private Point rb; // 오른쪽 하단

	// 생성자
	// 객체를 필드로써 포함하고 있는 클래스는
	// 빈 생성자에서도 해당 객체를 new 하자!
	public Rectangle() {
		this.lt = new Point(0, 0);
		this.rb = new Point(0, 0);
	}
	public Rectangle(Point lt, Point rb) {
		this.lt = lt;
		this.rb = rb;
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.lt = new Point(x1, y1);
		this.rb = new Point(x2, y2);
	}
	
	// setter, getter
	public Point getLt() {
		return lt;
	}
	public void setLt(Point lt) {
		this.lt = lt;
	}
	public Point getRb() {
		return rb;
	}
	public void setRb(Point rb) {
		this.rb = rb;
	}
	
	// toString
	@Override
	public String toString() {
		return String.format("LeftTop: %s, RightBottom: %s", lt, rb);
	}
	// equals
	
//	((double)3.5f)
	@Override
	public boolean equals(Object o) {
		return this.lt.equals(((Rectangle)o).lt) &&
				this.rb.equals(((Rectangle)o).rb);
		
//		return this.lt.getX() == ((Rectangle)o).lt.getX() &&
//				this.lt.getY() == ((Rectangle)o).lt.getY() &&
//						this.rb.getX() == ((Rectangle)o).rb.getX() &&
//								this.rb.getY() == ((Rectangle)o).rb.getY();
	}
	
}
