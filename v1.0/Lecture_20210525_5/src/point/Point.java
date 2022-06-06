package point;

import interface_review.Graphic;

public class Point implements Graphic {
	protected int x, y; // 기준점을 저장
	
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
	
	@Override
	public String toString() {
		return String.format("x = %2d, y = %2d", x, y);
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		this.x += dx;
		this.y += dy;
		
		System.out.printf("point moved as much (%d, %d)\n", dx, dy);
	}

	@Override
	public void printOriginal() {
		System.out.printf("(original point) "
				+ "x = %2d, y = %2d\n", x, y);
	}

	
}
