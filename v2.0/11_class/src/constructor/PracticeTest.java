package constructor;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1. Car
		// String id (일련번호)
		// String model (모델이름)
		// String color (색상)
		// int price (가격) (음수가 될 수 없음)
		
//		int[] arr1 = new int[5];
//		arr1[0] = 10;
//		
//		int[] arr2 = {10, 20, 30, 40, 50};
		
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setId("1");
		c1.setModel("GRANDEUR");
		c1.setColor("red");
		c1.setPrice(3500);
		
		c2.setId("1");
		c2.setModel("GRANDEUR");
		c2.setColor("red");
		c2.setPrice(3500);
		c2.setPrice(-1000);
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 참조형 변수를 출력할 때 주소값이 아니라
		// 필드값이 출력되고 싶다면 ..?
		// toString()를 정의하면 된다!
		
		System.out.println(c1.equals(c2));
		
		// 함수호출
		// 1. 함수명 동일 (Car())
		// 2. 매개변수 타입, 순서, 개수
		// ex)  순서
		// String, String, int != int, String, String
		Car c3 = new Car("2");
		System.out.println(c3);
		
		Car c4 = new Car("3", "BMW");
		System.out.println(c4);
		
		Car c5 = new Car("4", "BMW", "White", 10000);
		System.out.println(c5);
		
		c5.setColor("Black");
		System.out.println(c5);
	}

}
