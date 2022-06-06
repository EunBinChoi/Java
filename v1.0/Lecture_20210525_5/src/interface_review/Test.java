package interface_review;

import line.*;
import point.Point;
import shape.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape - Rectangle, Circle, Triangle
		
		
		
		// 按眉 积己 阂啊
		//Shape shape = new Shape(new Point(1, 2));
		
		Point point = new Point(1, 2);
		Rectangle rect = new Rectangle
				(point, 4, 6);
		
		Circle circle = new Circle
				(new Point(15, 20), 3);
		Triangle triangle = new Triangle
				(new Point(30, 40), 4, 6);
		
		// Line - StraightLine, LineSeg, Curve
		// 按眉 积己 阂啊
		//Line line = new Line(new Point(1, 2));
		StraightLine stLine = new StraightLine
				(new Point(10, 20), 10);
		LineSeg lineSeg = new LineSeg
				(new Point(50, 60), new Point(70, 80));
		Curve curve = new Curve
				(new Point(3, 4), 50);
		
		//System.out.println("[    Shape   ] : " + shape);
		System.out.println("[  Rectangle ] : " + rect);
		System.out.println("Area :" + rect.getArea());
		rect.printInfo();
		rect.getPoint().printOriginal();
		rect.getPoint().move(3, 5);
		rect.getPoint().printOriginal();
		
		System.out.println();
		System.out.println();
		
		System.out.println("[   Circle   ] : " + circle);
		System.out.println("Area :" + circle.getArea());
		circle.printInfo();
		circle.getPoint().printOriginal();
		circle.getPoint().move(3, 5);
		circle.getPoint().printOriginal();
		System.out.println();
		System.out.println();
		
		System.out.println("[  Triangle  ] : " + triangle);
		System.out.println("Area :" + triangle.getArea());
		triangle.printInfo();
		triangle.getPoint().printOriginal();
		triangle.getPoint().move(3, 5);
		triangle.getPoint().printOriginal();
		System.out.println();
		System.out.println();
		
		
		//System.out.println("[     Line   ] : " + line);
		System.out.println("[StraightLine] : " + stLine);
		stLine.printInfo();
		stLine.getPoint().printOriginal();
		stLine.getPoint().move(3, 5);
		stLine.getPoint().printOriginal();
		System.out.println();
		System.out.println();
		
		System.out.println("[Line Segment] : " + lineSeg);
		System.out.println("Distance :" + lineSeg.getDistance());
		lineSeg.printInfo();
		lineSeg.getPoint().printOriginal();
		lineSeg.getPoint().move(3, 5);
		lineSeg.getPoint().printOriginal();
		System.out.println();
		System.out.println();
		
		System.out.println("[    Curve   ] : " + curve);
		curve.printInfo();
		curve.getPoint().printOriginal();
		curve.getPoint().move(3, 5);
		curve.getPoint().printOriginal();
		System.out.println();
		
	}

}
