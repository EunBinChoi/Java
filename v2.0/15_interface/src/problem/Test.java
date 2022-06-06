package problem;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicControl[] gc = new GraphicControl[3];
		gc[0] = new Triangle(3, 5, 4, 6);
		gc[1] = new Rectangle(10, 20, 4, 6);
		gc[2] = new Circle(50, 60, 3);
		// Triangle, Rectangle, Circle Ŭ������
		// GraphicControl �������̽��� �����ϰ� ����
		// => GraphicControl ��ü���� = new ���� Ŭ����();
		
		for(int i = 0; i < gc.length; i++) {
			System.out.println(gc[i]);
		}
		System.out.println();
		
		/////////////////////////////////////////////////
		// Q1. Triangle�� ������ (1, 2)��ŭ �̵�
		((Triangle)gc[0]).getP().moveOriginal(1, 2);
		// protected: �ڽ� Ŭ���� / ���� package ����
		System.out.println(gc[0]); // ���� �̵��� �� �Ǿ����� Ȯ��
		
		System.out.println(((Triangle)gc[0]).getBase()); // private
		System.out.println(((Triangle)gc[0]).getHeight()); // private
		
		// Q1-1. Rectangle�� ������ (1, 2)��ŭ �̵�
		((Rectangle)gc[1]).getP().moveOriginal(1, 2);
		// Q1-2. Circle�� ������ (1, 2)��ŭ �̵�
		((Circle)gc[2]).getP().moveOriginal(1, 2);
		
		for(int i = 0; i < gc.length; i++) {
			((Shape)gc[i]).getP().moveOriginal(1, 2);
		}
		
		// Q2. Triangle, Rectangle, Circle�� ���� ���� ���
		for(int i = 0; i < gc.length; i++) {
			System.out.println(gc[i].calcArea());
		}
		// Q3. Triangle, Rectangle, Circle�� draw() ȣ��
		for(int i = 0; i < gc.length; i++) {
			gc[i].draw();
		}
	}

}
