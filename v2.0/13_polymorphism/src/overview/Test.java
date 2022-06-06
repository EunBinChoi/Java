package overview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.draw();
		
		Rectangle r = new Rectangle();
		r.draw(); // 자식 클래스에서 재정의된 메소드 호출
		
		Shape ss1 = new Shape();
		Shape ss2 = new Shape();
		Point p = new Point();
		System.out.println(ss1.equals(ss2));
		
		System.out.println(ss1.equals(r));
		// if(!(o instanceof Shape)) return false;
		// Rectangle 객체는 부모의 형을 가질 수 있기 때문
		// Shape s = new Rectangle();
		
		System.out.println(ss1.equals(p));
		
		/* 다형성
		 * : 데이터 형을 다양하게 할 수 있는 성질
		 * : 객체에서의 다형성: 상속 관계에서 나타나는 성질 (**)
		 * => 부모 형을 가지는 객체 변수에 자식 객체가 들어올 수  있음
		 * => 부모 클래스 s = new 자식 클래스();
		 * 1) 부모 필드에 접근하려면 s.부모 필드 (o)
		 * 2) 자식 필드에 접근하려면 s.자식 필드 (x) -> ((자식 클래스)s).자식 필드
		 * 
		 * ex) 생성자
		 * 생성자 (int x, int y)
		 * 생성자 (double x, double y)
		 * 
		 * */
		
		Shape s2 = new Rectangle();
		
		// s2: p (o)
		System.out.println(s2.getP()); 
//		System.out.println(s2.p);
		// protected (상속 관계, 패키지 동일할 때 접근 가능)
		System.out.println(((Rectangle)s2).getWidth());
		System.out.println(((Rectangle)s2).getHeight());
		// 부모 변수에서 자식 클래스에만 있는 필드를 접근할 때
		// 명시적인 형변환 (type casting)을 통해 접근할 수 있음
		
		// 부모가 만들어논 틀 (변수)에 자식 객체가 할당될 수 있음
		s2 = new Circle();
		s2.draw(); // Circle 클래스에 정의된 함수 호출
		
		s2 = new Triangle();
		s2.draw(); // Triangle 클래스에 정의된 함수 호출
		
		s2 = new Rectangle();
		s2.draw(); // Rectangle 클래스에 정의된 함수 호출
		// 어떻게 형 변환이 없이 함수가 호출될 수 있었을까?
		// => Shape 클래스 안에 draw() 정의
		// => 자식 클래스에 draw() 재정의
		
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle();
		shapes[1] = new Triangle();
		shapes[2] = new Rectangle();
		
		for(int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
			// 실제 어떤 자식이 부모에 들어가있는지에 따라 
			// 자식의 메소드를 호출할 수 있음
			// => shapes[i] (Shape형) -> Circle, Triangle, Rectangle draw();
		}
		
//		Rectangle r2 = new Shape();
		// 반대는 안된다 ...! (구현상의 이유로 막아둠)
		// r2: p, width (x), height (x)
	}

}
