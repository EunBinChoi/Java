package interface_review;

import line.*;
import point.Point;
import shape.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape - Rectangle, Circle, Triangle
		
		// ������: ���� �پ��ϰ� �ϴ� ����
		
		
		// Shape
		// int x, y;
		
		// Rectangle extends Shape
		// int w, h;
		
		// �ڽ� ��ü -> �θ� ��ü ���� (O)
		// ex) Shape s = new Rectangle();
		// ��? �ڽ� ��ü�� �θ� ��ü ������ 
		// ������ �� �ִ� ��� �ʵ�/�Լ��� ������ �� �ֱ� ����
		// s.getX(), s.getY();
		// ((Rectangle)s).getW(); // ����ȯ
		// (Rectangle)(s.getW()); // x
		// ((Rectangle)s).getW(); // O
		
		// ((Rectangle)s).getH(); // ����ȯ
		
		
		// �θ� ��ü -> �ڽ� ��ü ���� (X)
		// ex) Rectangle r = new Shape();
		// r.getW(), r.getH(); (X)
		
		// ��ü ���� �Ұ�
		//Shape shape = new Shape(new Point(1, 2));
		
		//Point point = new Point(1, 2);
		Shape[] shape = new Shape[3];
		
		shape[0] = new Rectangle
				(new Point(1, 2), 4, 6);
		shape[1] = new Circle
				(new Point(15, 20), 3);
		shape[2] = new Triangle
				(new Point(30, 40), 4, 6);	
		
		// Line - StraightLine, LineSeg, Curve
		// ��ü ���� �Ұ�
		//Line line = new Line(new Point(1, 2));
		
		Line[] line = new Line[3];
		line[0] = new StraightLine
				(new Point(10, 20), 10);
		line[1] = new LineSeg
				(new Point(50, 60), new Point(70, 80));
		line[2] = new Curve
				(new Point(3, 4), 50);
		
		for(int i = 0; i < shape.length; i ++) {
			System.out.println("[" + shape[i].getClass().getName() + "] : "
					+ "" + shape[i]);
			System.out.println("Area :" + shape[i].getArea());
			shape[i].printInfo();
			shape[i].getPoint().printOriginal();
			shape[i].getPoint().move(3, 5);
			shape[i].getPoint().printOriginal();
			System.out.println();
			System.out.println();
		}
		
		//System.out.println("[    Shape   ] : " + shape);
//		System.out.println("[  Rectangle ] : " + rect);
//		System.out.println("Area :" + rect.getArea());
//		rect.printInfo();
//		rect.getPoint().printOriginal();
//		rect.getPoint().move(3, 5);
//		rect.getPoint().printOriginal();
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("[   Circle   ] : " + circle);
//		System.out.println("Area :" + circle.getArea());
//		circle.printInfo();
//		circle.getPoint().printOriginal();
//		circle.getPoint().move(3, 5);
//		circle.getPoint().printOriginal();
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("[  Triangle  ] : " + triangle);
//		System.out.println("Area :" + triangle.getArea());
//		triangle.printInfo();
//		triangle.getPoint().printOriginal();
//		triangle.getPoint().move(3, 5);
//		triangle.getPoint().printOriginal();
//		System.out.println();
//		System.out.println();
		
		for(int i = 0; i < line.length; i ++) {
			System.out.println("[" + line[i]
					.getClass().getName() + "] : "
					+ line[i]);
			
			// (LineSeg)line[i]
			// getDistance() �Լ��� 
			// �ڽ� Ŭ���� LineSeg Ŭ���������� ���ǵǾ��ֱ� ����
			// �θ� Ŭ������ ��ü���� (line[i])�� ���� �Ұ���
			if(line[i] instanceof LineSeg) {
				System.out.println("Distance : " 
						+ ((LineSeg)line[i]).getDistance());
			}
			
	
			line[i].printInfo();
			line[i].getPoint().printOriginal();
			line[i].getPoint().move(3, 5);
			line[i].getPoint().printOriginal();
			System.out.println();
			System.out.println();
		}
		
		//System.out.println("[     Line   ] : " + line);
//		System.out.println("[StraightLine] : " + stLine);
//		stLine.printInfo();
//		stLine.getPoint().printOriginal();
//		stLine.getPoint().move(3, 5);
//		stLine.getPoint().printOriginal();
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("[Line Segment] : " + lineSeg);
//		System.out.println("Distance :" + lineSeg.getDistance());
//		lineSeg.printInfo();
//		lineSeg.getPoint().printOriginal();
//		lineSeg.getPoint().move(3, 5);
//		lineSeg.getPoint().printOriginal();
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("[    Curve   ] : " + curve);
//		curve.printInfo();
//		curve.getPoint().printOriginal();
//		curve.getPoint().move(3, 5);
//		curve.getPoint().printOriginal();
//		System.out.println();
		
	}

}
