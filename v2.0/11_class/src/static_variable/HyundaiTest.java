package static_variable;

public class HyundaiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체가 만들어지기 전에도 static 메소드를 호출할 수 있을까?
		// 호출 가능 (클래스가 생성되면 static 변수, 메소드는 같이 생성됨)
		// 객체 생성 시점이 상관없음
		System.out.println(HyundaiCar.getModel()); // public
//		System.out.println(HyundaiCar.model); // private
		
		System.out.println(HyundaiCar.count);
		
		HyundaiCar hc1 = new HyundaiCar();
		System.out.println(hc1);
		System.out.println(HyundaiCar.count);
		// static 메소드는 객체와 관련이 없기 때문에
		// 객체이름.메소드이름 (X)
		// 클래스이름.메소드이름 (O)
//		System.out.println(hc1.getModel()); 
		System.out.println(HyundaiCar.getModel());
		
		HyundaiCar hc2 = new HyundaiCar("1");
		System.out.println(hc2);
		System.out.println(HyundaiCar.count);
		
		HyundaiCar hc3 = new HyundaiCar
				("2", "red", 3500);
		

		
	}

}
