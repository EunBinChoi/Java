package overview;

public class SportsCar extends Car {
	// Car: �θ� Ŭ����
	// SportsCar: �ڽ� Ŭ����
	private int turbo;
	
	// ������
	public SportsCar() {}
	public SportsCar(int id) {
//		super(id); // �θ� ������ ȣ��
//		this.id = id;
		
		this(id, null, null, 0, 0); // �ڽ� Ŭ���� ������ ȣ��
	}
	public SportsCar
	(int id, String model, String color,
			int speed, int turbo) {
		super(id, model, color, speed);
		this.turbo = turbo;
	}
	
	// Car c ��ü�� SportsCar ��ü�� 
	// �����ϱ� ���� ���ǰ� ���� (��� ����)
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
