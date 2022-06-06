package problem2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Shape();
		// Shape Ŭ������ �߻� Ŭ�������� ��ü ���� �Ұ�!
		// instance: ��ü
		// instantiate: ��üȭ�ϴ�
		
		// ��ӿ����� ������
		Shape[] shapes = new Shape[3];
		shapes[0] = new Triangle(3, 5, 4, 6);
		shapes[1] = new Rectangle(10, 20, 4, 6);
		shapes[2] = new Circle(50, 60, 3);
		// Q1. shapes[0]�� ���� getBase()
		((Triangle)shapes[0]).getBase();
		// �ڽ����׸� �ִ� �޼��带 ������ ���� ����ȯ�ؾ���!
		shapes[0].draw();
		shapes[0].getP();
		
		// �������̽������� ������
		GraphicControl[] graphics = new GraphicControl[3];
		graphics[0] = new Triangle(3, 5, 4, 6);
		graphics[1] = new Rectangle(10, 20, 4, 6);
		graphics[2] = new Circle(50, 60, 3);	
		// Q2. gc[0]�� ���� getBase()
		((Triangle)graphics[0]).getBase();
		graphics[0].draw();
		((Triangle)graphics[0]).getP(); 
		
		// Triangle, Rectangle, Circle Ŭ������
		// GraphicControl �������̽��� �����ϰ� ����
		// => GraphicControl ��ü���� = new ���� Ŭ����();
		
		
		for(int i = 0; i < graphics.length; i++) {
			System.out.println(graphics[i]);
		}
		System.out.println();
		
		/////////////////////////////////////////////////
		// Q1. Triangle�� ������ (1, 2)��ŭ �̵�
		((Triangle)graphics[0]).getP().moveOriginal(1, 2);
		// protected: �ڽ� Ŭ���� / ���� package ����
		System.out.println(graphics[0]); // ���� �̵��� �� �Ǿ����� Ȯ��
		
		System.out.println(((Triangle)graphics[0]).getBase()); // private
		System.out.println(((Triangle)graphics[0]).getHeight()); // private
		
		// Q1-1. Rectangle�� ������ (1, 2)��ŭ �̵�
		((Rectangle)graphics[1]).getP().moveOriginal(1, 2);
		// Q1-2. Circle�� ������ (1, 2)��ŭ �̵�
		((Circle)graphics[2]).getP().moveOriginal(1, 2);

		for(int i = 0; i < graphics.length; i++) {
			((Shape)graphics[i]).getP().moveOriginal(1, 2);
		}
		
		// Q2. Triangle, Rectangle, Circle�� ���� ���� ���
		for(int i = 0; i < graphics.length; i++) {
			System.out.println(graphics[i].calcArea());
		}
		// Q3. Triangle, Rectangle, Circle�� draw() ȣ��
		for(int i = 0; i < graphics.length; i++) {
			graphics[i].draw();
		}
	}

}
