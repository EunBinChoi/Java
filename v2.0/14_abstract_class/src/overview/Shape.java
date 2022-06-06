package overview;

public abstract class Shape { 	
	// �߻� Ŭ���� (abstract class)
	// : ���� �����ϴ� ��ü�� ����⿡�� �߻�ȭ�Ǿ��ִ� Ŭ���� (new �߻� Ŭ���� (x))
	// : �θ� Ŭ������ ���� �ڽ� Ŭ������ ����/���� or �ʵ�/�Լ��� �����ϱ� ���� ����
	
	protected Point p; // ����
	
	public Shape() {
		this.p = new Point(0, 0);
	}
	public Shape(int x, int y) {
		this.p = new Point(x, y);
	}
	public Shape(Point p) {
		this.p = p;
	}
	public abstract void draw(); 
	// �߻� �޼���, Shape Ŭ������ ��� �׷����� �� ��....
	// : ������ �� �Ǿ��ִ� �޼ҵ�
	// : �Լ� �̸��� ���ǵǾ�����
	// : �߻� �޼��带 �ϳ��� ������ �ִ� Ŭ������ �߻� Ŭ������ ����
	// : �θ� Ŭ������ ��ӹް� �ִ� �ڽ� Ŭ�������� ������ �������ؾ� �� (**)
	
//	{
//		System.out.println("Shape Draw");
//	}
	
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return String.format("%s", p);
	}
	
	@Override
	public boolean equals(Object o) {
		// Shape s1 = new Shape();
		// Shape s2 = new Shape();
		// s1.equals(s2);
		
		// Object o = s2;
		
		// ��ü�� Ÿ�� Ȯ��
		if(!(o instanceof Shape)) return false;
		
		// ��ü�� ���빰 Ȯ��
		return this.p.equals(((Shape)o).p);
	}
	
}
