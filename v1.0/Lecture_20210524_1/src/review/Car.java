package review;

public class Car {
	
	// 접근 제어자
	// public: 모든 클래스 접근 가능
	// protected: 상속 관계만 접근 가능
	// private: 동일 클래스에서만 접근 가능
	
	private static int carNum = 0;
	
	// 속성 (필드)
	private int id; // getter
	private String color; // setter, getter
	private String navi; // setter, getter
	private boolean heat; // setter, getter
	private boolean fan; // setter, getter
	
	
//	// 디폴트 생성자
//	Car(){
//		
//	}
	Car(int id){
		this.id = id;
		carNum ++;
	}

	public static int getCarNum() {
		return carNum;
	}
	
	public static void setCarNum(int carNum) {
		Car.carNum = carNum;
		
	}

	public String getColor() {
		//System.out.println("hello");
		return color;
	}


	public boolean setColor(String color) {
		if(color.equals("red") ||
				color.equals("black") ||
				color.equals("white")) {
			this.color = color;
			return true;
		}
		else {
			return false;
		}
	}


	public String getNavi() {
		return navi;
	}


	public void setNavi(String navi) {
		if(navi.equals("카카오네비") ||
				navi.equals("T 맵")) {
			this.navi = navi;
		}
	}


	public boolean isHeat() {
		return heat;
	}


	public void setHeat(boolean heat) {
		this.heat = heat;
	}


	public boolean isFan() {
		return fan;
	}


	public void setFan(boolean fan) {
		this.fan = fan;
	}


	public int getId() {
		return id;
	}


	public String toString() {
		return "id :" + id
				+ ", color : " + color
				+ ", navi : " + navi
				+ ", heat : " + heat
				+ ", fan : " + fan;
	}
	
	
}
