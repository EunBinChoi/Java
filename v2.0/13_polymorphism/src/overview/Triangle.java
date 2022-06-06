package overview;

public class Triangle extends Shape {
	private int base; // �غ��� ����
	private int height; // ����
	
	public Triangle() {
		super(); // �θ� ������ ȣ��
	}
	public Triangle(int base, int height) {
		super(); // �θ� ������ ȣ��
		this.base = base;
		this.height = height;
	}
	public Triangle(Point p, int base, int height) {
		super(p); // �θ� ������ ȣ��
		this.base = base;
		this.height = height;
	}
	public Triangle(int x, int y, int base, int height) {
		super(x, y); // �θ� ������ ȣ��
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("Triangle Draw");
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s, base = %d, height = %d", 
				p, base, height);
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Triangle)) return false;
		return this.p.equals(o) 
				&& this.base == ((Triangle)o).base
				&& this.height == ((Triangle)o).height;
	}
}
