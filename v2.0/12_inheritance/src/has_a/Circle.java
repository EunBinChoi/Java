package has_a;

public class Circle {
	
	// ��ü�� �ʵ�� ���Ե� �� ���� (���� ����)
	private Point p; // ����
	private int r; // ������
	
	// ������
	// ��ü�� �ʵ�ν� �����ϰ� �ִ� Ŭ������
	// �� �����ڿ����� �ش� ��ü�� new ����!
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
