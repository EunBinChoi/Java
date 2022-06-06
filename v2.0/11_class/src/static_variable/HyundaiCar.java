package static_variable;

public class HyundaiCar {
	
	// 클래스 변수 (static 변수)
	// 모든 객체가 공유하는 변수
	private static String model = "hyundai";
	
	// static 변수를 많이 쓰는 예제
	public static int count = 0; // 객체 수 카운트
	
	// 필드 (데이터)
	private String id;
	private String color;
	private int price;
	
	// 생성자 (constructor, 객체를 생성할 때 호출하는 함수)
	// 접근 제어자 + 클래스 이름 (반환값 정의가 없음)
	// 만약 생성자가 아무것도 정의되어있지 않으면 
	// 빈 생성자 (디폴트 생성자)는 자동 생성
	// 만약 생성자가 하나라도 정의되어있으면
	// 빈 생성자 (디폴트 생성자)는 자동 생성 X
	// -> 직접 디폴트 생성자를 생성해줘야 함
	
	public HyundaiCar() { // 빈 생성자 (디폴트 생성자)
//		this.id = null;
//		this.color = null;
//		this.price = 0;
		count++; // 객체 수를 카운트하는 변수
	}
	public HyundaiCar(String id) {
		this.id = id;
//		this.color = null;
//		this.price = 0;
		count++;
	}
	public HyundaiCar(String id,
			String color,
			int price) {
		this.id = id;
		this.color = color;
		this.price = price;
		count++;
	}
	
	// 함수 (기능/동작)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	// static 변수를 접근하는 함수도
	// static으로 정의 (static 메소드)
	public static String getModel() {
		return model;
	}
//	public void setModel(String model) {
//		this.model = model;
//	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 0) {
			this.price = price;
		}
		else {
			System.out.println("[ERROR] 유효하지 않은 데이터");
		}
	}
	
	@Override // 어노테이션 (인용), toString()의 오타를 잡아줌
	public String toString() {
		return String.format
				("id: %s, model: %s, color: %s, price: %d", 
						id, model, color, price);
	}
	
	@Override
	public boolean equals(Object c) {
		if(this.id.equals(((HyundaiCar)c).id) && 
				this.model.equals(((HyundaiCar)c).model) &&
				this.color.equals(((HyundaiCar)c).color) &&
				this.price == ((HyundaiCar)c).price) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
