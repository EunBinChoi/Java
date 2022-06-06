package overview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.draw();
		
		Rectangle r = new Rectangle();
		r.draw(); // �ڽ� Ŭ�������� �����ǵ� �޼ҵ� ȣ��
		
		Shape ss1 = new Shape();
		Shape ss2 = new Shape();
		Point p = new Point();
		System.out.println(ss1.equals(ss2));
		
		System.out.println(ss1.equals(r));
		// if(!(o instanceof Shape)) return false;
		// Rectangle ��ü�� �θ��� ���� ���� �� �ֱ� ����
		// Shape s = new Rectangle();
		
		System.out.println(ss1.equals(p));
		
		/* ������
		 * : ������ ���� �پ��ϰ� �� �� �ִ� ����
		 * : ��ü������ ������: ��� ���迡�� ��Ÿ���� ���� (**)
		 * => �θ� ���� ������ ��ü ������ �ڽ� ��ü�� ���� ��  ����
		 * => �θ� Ŭ���� s = new �ڽ� Ŭ����();
		 * 1) �θ� �ʵ忡 �����Ϸ��� s.�θ� �ʵ� (o)
		 * 2) �ڽ� �ʵ忡 �����Ϸ��� s.�ڽ� �ʵ� (x) -> ((�ڽ� Ŭ����)s).�ڽ� �ʵ�
		 * 
		 * ex) ������
		 * ������ (int x, int y)
		 * ������ (double x, double y)
		 * 
		 * */
		
		Shape s2 = new Rectangle();
		
		// s2: p (o)
		System.out.println(s2.getP()); 
//		System.out.println(s2.p);
		// protected (��� ����, ��Ű�� ������ �� ���� ����)
		System.out.println(((Rectangle)s2).getWidth());
		System.out.println(((Rectangle)s2).getHeight());
		// �θ� �������� �ڽ� Ŭ�������� �ִ� �ʵ带 ������ ��
		// ������� ����ȯ (type casting)�� ���� ������ �� ����
		
		// �θ� ������ Ʋ (����)�� �ڽ� ��ü�� �Ҵ�� �� ����
		s2 = new Circle();
		s2.draw(); // Circle Ŭ������ ���ǵ� �Լ� ȣ��
		
		s2 = new Triangle();
		s2.draw(); // Triangle Ŭ������ ���ǵ� �Լ� ȣ��
		
		s2 = new Rectangle();
		s2.draw(); // Rectangle Ŭ������ ���ǵ� �Լ� ȣ��
		// ��� �� ��ȯ�� ���� �Լ��� ȣ��� �� �־�����?
		// => Shape Ŭ���� �ȿ� draw() ����
		// => �ڽ� Ŭ������ draw() ������
		
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle();
		shapes[1] = new Triangle();
		shapes[2] = new Rectangle();
		
		for(int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
			// ���� � �ڽ��� �θ� ���ִ����� ���� 
			// �ڽ��� �޼ҵ带 ȣ���� �� ����
			// => shapes[i] (Shape��) -> Circle, Triangle, Rectangle draw();
		}
		
//		Rectangle r2 = new Shape();
		// �ݴ�� �ȵȴ� ...! (�������� ������ ���Ƶ�)
		// r2: p, width (x), height (x)
	}

}
