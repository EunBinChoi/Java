package static_variable;

public class HyundaiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��ü�� ��������� ������ static �޼ҵ带 ȣ���� �� ������?
		// ȣ�� ���� (Ŭ������ �����Ǹ� static ����, �޼ҵ�� ���� ������)
		// ��ü ���� ������ �������
		System.out.println(HyundaiCar.getModel()); // public
//		System.out.println(HyundaiCar.model); // private
		
		System.out.println(HyundaiCar.count);
		
		HyundaiCar hc1 = new HyundaiCar();
		System.out.println(hc1);
		System.out.println(HyundaiCar.count);
		// static �޼ҵ�� ��ü�� ������ ���� ������
		// ��ü�̸�.�޼ҵ��̸� (X)
		// Ŭ�����̸�.�޼ҵ��̸� (O)
//		System.out.println(hc1.getModel()); 
		System.out.println(HyundaiCar.getModel());
		
		HyundaiCar hc2 = new HyundaiCar("1");
		System.out.println(hc2);
		System.out.println(HyundaiCar.count);
		
		HyundaiCar hc3 = new HyundaiCar
				("2", "red", 3500);
		

		
	}

}
