package generic_extends;

public class GenericsExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res1 = compare(10, 20);
		System.out.println(res1);
		
		res1 = compare(10.0, 10);
		System.out.println(res1);
		
//		int res2 = compare("ȫ���", "ȫ�浿");
//		System.out.println(res2);	
	}
	// �� ���� ���ϴ� �Լ�
	// t1 < t2 => -1
	// t1 == t2 => 0
	// t1 > t2 => 1
	public static <T extends Number> 
	int compare(T t1, T t2) 
	{
		double v1 = t1.doubleValue(); 
		// Number Ŭ���� �Լ�
		double v2 = t2.doubleValue();
		
		if(v1 < v2) return -1;
		else if(v1 == v2) return 0;
		else return 1;
		
	}
	
}
