package has_a;

public class Rectangle {
	
	// ��ü�� �ʵ�� ���Ե� �� ���� (���� ����)
	private Point lt; // ���� ���
	private Point rb; // ������ �ϴ�

	// ������
	// ��ü�� �ʵ�ν� �����ϰ� �ִ� Ŭ������
	// �� �����ڿ����� �ش� ��ü�� new ����!
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
