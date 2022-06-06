package overview;

/* 객체지향 프로그래밍 3대 특징
 * 1) (필드의) 캡슐화 (정보 은닉) + setter, getter
 * 2) 상속
 * 3) 다형성
 * */

public class Car {
	// protected
	// : 상속 관계에 있는 클래스에게
	// 접근 권한을 주겠다! (오픈하겠다!)
	protected int id;
	protected String model;
	protected String color;
	protected int speed;
	
	public Car() {}
	
	// 중복 정의 일까요? 
	// 중복 정의 아님 (매개 변수 이름은 중요하지 않음)
	// 완전히 동일한 메서드!
	public Car(int id) {
		this.id = id;
	}
//	public Car(int id2) {
//		this.id = id2;
//	}
	
	public Car(int id, String model, String color, int speed) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return String.format("id = %d, model = %s, "
				+ "color = %s, speed = %d", id, model, color, speed);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.id == ((Car)o).id &&
				this.model.equals(((Car)o).model) &&
				this.color.equals(((Car)o).color) &&
				this.speed == ((Car)o).speed) return true;
		else return false;
	}
	
}
