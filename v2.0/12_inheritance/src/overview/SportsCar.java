package overview;

public class SportsCar extends Car {
	// Car: 부모 클래스
	// SportsCar: 자식 클래스
	private int turbo;
	
	// 생성자
	public SportsCar() {}
	public SportsCar(int id) {
//		super(id); // 부모 생성자 호출
//		this.id = id;
		
		this(id, null, null, 0, 0); // 자신 클래스 생성자 호출
	}
	public SportsCar
	(int id, String model, String color,
			int speed, int turbo) {
		super(id, model, color, speed);
		this.turbo = turbo;
	}
	
	// Car c 객체는 SportsCar 객체를 
	// 생성하기 위해 사용되고 있음 (사용 관계)
	public SportsCar(Car c, int turbo) {
		super(c.id, c.model, 
				c.color, c.speed);
		this.turbo = turbo;
	}
	
	public int getTurbo() {
		return turbo;
	}
	public void setTurbo(int turbo) {
		this.turbo = turbo;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ String.format(", turbo = %d", turbo);
	}
	
	@Override
	public boolean equals(Object o) {
//		if(super.equals(o)) {
//			if(this.turbo == ((SportsCar)o).turbo) {
//				return true;
//			}
//		}
//		return false;
		
		return super.equals(o) 
				&& this.turbo == ((SportsCar)o).turbo;
	}
	
}
