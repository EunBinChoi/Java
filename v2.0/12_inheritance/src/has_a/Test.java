package has_a;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== Circle Test ======");
		Circle c0 = new Circle();
		System.out.println(c0);
		System.out.println(c0.getP());
		c0.getP().setX(3);
		c0.getP().setY(5);
		System.out.println(c0);
		
		Circle c1 = new Circle(3, 5, 2);
		System.out.println(c1);
		
		Circle c2 = new Circle(new Point(3, 5), 2);
		System.out.println(c2);
		
		System.out.println("==: " + (c1 == c2));
		System.out.println("equals(): " + c1.equals(c2));
		
		System.out.println();
		System.out.println("====== Rectangle Test ======");
		Rectangle r0 = new Rectangle();
		System.out.println(r0);
		
		Rectangle r1 = new Rectangle(1, 2, 4, 6);
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(new Point(1, 2), 
				new Point(4, 6));
		System.out.println(r2);
		
		System.out.println("==: " + (r1 == r2));
		System.out.println("equals(): " + r1.equals(r2));
		
	}

}
