package review;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static 변수
		// 클래스이름.변수이름
		// 객체 생성없이 호출 가능
		System.out.println("객체 수 : " 
				+ Car.getCarNum());
		
		// 객체 생성
		Car myCar = new Car(1);
		
		System.out.println("객체 수 : " 
				+ Car.getCarNum());
		
		Car yourCar = new Car(2);
		
		System.out.println("객체 수 : " 
				+ Car.getCarNum());
		
		// add vs add()
		// add: 변수 호출
		// add(): 함수 호출
		
		// new 연산자를 통해 객체 생성
		// int: 0
		// String: null, 
		// double: 0.0, 
		// char: '' (\u0000)
		// boolean: false
		
		// myCar: 객체 변수
		// new Car(): 객체를 생성하기 위해 생성자 호출
		// 생성자가 아무것도 정의되어있지 않으면
		// 디폴트 생성자 자동 생성
		
		// 객체의 속성값 초기화
//		myCar.id = -1000;
		//myCar.color = "purple";
		boolean b = myCar.setColor("purple");
		if(b) {
			System.out.println("설정 완료!");
		}
		else {
			System.out.println("유효하지 않은 데이터입니다."
					+ "선택한 색깔을 확인해주세요!");
		}
		
		String c = myCar.getColor();
		System.out.println(c);
		
		myCar.setNavi("아이나비");
		String n = myCar.getNavi();
		System.out.println(n);
		
		myCar.setNavi("카카오네비");
		n = myCar.getNavi();
		System.out.println(n);
		
		myCar.setHeat(true);
		boolean h = myCar.isHeat();
		System.out.println(h);
		
		myCar.setFan(true);
		boolean f = myCar.isFan();
		System.out.println(f);
		
		System.out.println(myCar);
		
		
//		System.out.println(c);
//		myCar.color = "purple";
//		myCar.navi = "아이나비";
//		myCar.heat = true;
//		myCar.fan = false;
		
		// 일련번호 수정 
//		myCar.id = 100;
		// 더이상 제 차를 찾을 수 없음 ...!
		// (보안)을 지켜줘야 함!
		
		
		
	}

}
