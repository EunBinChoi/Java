package assignment6_3.shape;

public class Rectangle extends Shape {
	private int height;
	private int width;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public Rectangle(Point p, int height, int width) {
		super(p);
		this.height = height;
		this.width = width;
	}
	public Rectangle(int x, int y, int height, int width) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return String.format("%s, height = %d, width = %d", 
				p, height, width);
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Rectangle)) return false;
		return this.p.equals(o) && 
				this.height == ((Rectangle)o).height &&
						this.width == ((Rectangle)o).width;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect Draw");
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return height * width;
	}
	
}
