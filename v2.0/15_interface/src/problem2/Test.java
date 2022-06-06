package problem2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Shape();
		// Shape 클래스는 추상 클래스여서 객체 생성 불가!
		// instance: 객체
		// instantiate: 객체화하다
		
		// 상속에서의 다형성
		Shape[] shapes = new Shape[3];
		shapes[0] = new Triangle(3, 5, 4, 6);
		shapes[1] = new Rectangle(10, 20, 4, 6);
		shapes[2] = new Circle(50, 60, 3);
		// Q1. shapes[0]을 통해 getBase()
		((Triangle)shapes[0]).getBase();
		// 자식한테만 있는 메서드를 접근할 때는 형변환해야함!
		shapes[0].draw();
		shapes[0].getP();
		
		// 인터페이스에서의 다형성
		GraphicControl[] graphics = new GraphicControl[3];
		graphics[0] = new Triangle(3, 5, 4, 6);
		graphics[1] = new Rectangle(10, 20, 4, 6);
		graphics[2] = new Circle(50, 60, 3);	
		// Q2. gc[0]을 통해 getBase()
		((Triangle)graphics[0]).getBase();
		graphics[0].draw();
		((Triangle)graphics[0]).getP(); 
		
		// Triangle, Rectangle, Circle 클래스는
		// GraphicControl 인터페이스를 구현하고 있음
		// => GraphicControl 객체변수 = new 구현 클래스();
		
		
		for(int i = 0; i < graphics.length; i++) {
			System.out.println(graphics[i]);
		}
		System.out.println();
		
		/////////////////////////////////////////////////
		// Q1. Triangle의 중점을 (1, 2)만큼 이동
		((Triangle)graphics[0]).getP().moveOriginal(1, 2);
		// protected: 자식 클래스 / 같은 package 공개
		System.out.println(graphics[0]); // 중점 이동이 잘 되었는지 확인
		
		System.out.println(((Triangle)graphics[0]).getBase()); // private
		System.out.println(((Triangle)graphics[0]).getHeight()); // private
		
		// Q1-1. Rectangle의 중점을 (1, 2)만큼 이동
		((Rectangle)graphics[1]).getP().moveOriginal(1, 2);
		// Q1-2. Circle의 중점을 (1, 2)만큼 이동
		((Circle)graphics[2]).getP().moveOriginal(1, 2);

		for(int i = 0; i < graphics.length; i++) {
			((Shape)graphics[i]).getP().moveOriginal(1, 2);
		}
		
		// Q2. Triangle, Rectangle, Circle의 현재 면적 계산
		for(int i = 0; i < graphics.length; i++) {
			System.out.println(graphics[i].calcArea());
		}
		// Q3. Triangle, Rectangle, Circle의 draw() 호출
		for(int i = 0; i < graphics.length; i++) {
			graphics[i].draw();
		}
	}

}
