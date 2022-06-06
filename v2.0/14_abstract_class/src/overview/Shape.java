package overview;

public abstract class Shape { 	
	// 추상 클래스 (abstract class)
	// : 아직 실존하는 객체를 만들기에는 추상화되어있는 클래스 (new 추상 클래스 (x))
	// : 부모 클래스로 만들어서 자식 클래스를 관리/감독 or 필드/함수를 제공하기 위해 만듦
	
	protected Point p; // 중점
	
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
	// 추상 메서드, Shape 클래스를 어떻게 그려야할 지 모름....
	// : 구현이 덜 되어있는 메소드
	// : 함수 이름만 정의되어있음
	// : 추상 메서드를 하나라도 가지고 있는 클래스는 추상 클래스로 정의
	// : 부모 클래스를 상속받고 있는 자식 클래스에서 무조건 재정의해야 함 (**)
	
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
		
		// 객체의 타입 확인
		if(!(o instanceof Shape)) return false;
		
		// 객체의 내용물 확인
		return this.p.equals(((Shape)o).p);
	}
	
}
