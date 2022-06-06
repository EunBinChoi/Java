package review;

public class Car {
	
	// ���� ������
	// public: ��� Ŭ���� ���� ����
	// protected: ��� ���踸 ���� ����
	// private: ���� Ŭ���������� ���� ����
	
	private static int carNum = 0;
	
	// �Ӽ� (�ʵ�)
	private int id; // getter
	private String color; // setter, getter
	private String navi; // setter, getter
	private boolean heat; // setter, getter
	private boolean fan; // setter, getter
	
	
//	// ����Ʈ ������
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
		if(navi.equals("īī���׺�") ||
				navi.equals("T ��")) {
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
