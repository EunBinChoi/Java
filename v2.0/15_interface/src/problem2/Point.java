package problem2;

public class Point implements OriginalPointControl {
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// toString
	@Override
	public String toString() {
		return String.format("p(%d, %d)", x, y);
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Point)) return false;
		return this.x == ((Point)o).x &&
				this.y == ((Point)o).y;
	}
	@Override
	public void moveOriginal(int dx, int dy) {
		// TODO Auto-generated method stub
		this.x += dx;
		this.y += dy;
	}

}
