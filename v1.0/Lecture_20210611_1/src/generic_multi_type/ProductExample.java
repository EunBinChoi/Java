package generic_multi_type;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Product1 : TV, "LG ����Ʈ TV"
		Product<TV, String> p1 =
				new Product<>();
		p1.setKind(new TV(1234));
		p1.setModel("LG ����Ʈ TV");
		TV tv = p1.getKind();
		String model1 = p1.getModel();
		System.out.println(tv); // ���� �������� ����
		System.out.println(model1);
		System.out.println(p1);
		System.out.println();
		
		// Product2 : SmartPhone, "������ 12"
		Product<SmartPhone, String> p2 =
				new Product<>();
		p2.setKind(new SmartPhone(1235));
		p2.setModel("������ 12");
		SmartPhone smartphone = p2.getKind();
		String model2 = p2.getModel();
		System.out.println(smartphone); // ���� �������� ����
		System.out.println(model2);
		System.out.println(p2);
	}

}
