package generic_overview;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		
		box.setData("ȫ�浿"); 
		// String -> Object (�ڵ� ����ȯ)
		// Object data = "ȫ�浿"
		String name = (String)box.getData();
		// Object -> String (���� ����ȯ)
		
		// "ȫ�浿" + 1
		// 1 -> "1"
		// "ȫ�浿1"
		
		box.setData(100);
		int num = (int)box.getData();
		
		box.setData(new Fruit());
		Fruit f = (Fruit)box.getData();
		
	}

}
