package generic_type;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object Ŭ������ ���� ���ʸ��� �����ϸ�
		// getData() �Լ��� ��ȯ���� ����ȯ�������
		// (Object (�θ�) -> Ư�� ������Ÿ�� (�ڽ�))
		
		// Ÿ�� �Ķ���� T�� ���� ���ʸ��� �����ϸ�
		// ����ȯ�� �ʿ����
		
		Box<String> box1 = new Box<>();
		box1.setData("ȫ�浿");
		String name = box1.getData();
		
		// 1. int�� (Integer)�� �����͸� �ִ� Box ��ü box2
		Box<Integer> box2 = new Box<>();
		box2.setData(100);
		int nums = box2.getData();
		
		// 2. Fruit���� �����͸� �ִ� Box ��ü box3
		Box<Fruit> box3 = new Box<>();
		//Fruit fs = ;
		box3.setData(new Fruit());
		// Fruit data = new Fruit();
		Fruit f = box3.getData();
		
	}

}
