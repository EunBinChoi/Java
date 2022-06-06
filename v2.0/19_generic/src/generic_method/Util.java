package generic_method;

public interface Util {
	// Box<String>
	// Box<Integer>
	// Box<SmartPhone>
	
	// ���ڷ� ������ ��ü�� Box Ŭ������ �ڽ̽��Ѽ� ��ȯ
	// �Լ��� ��ȯ���� ���ʸ� Ÿ���� ��� (Box<T>) or ���ڷ� ������ ��ü�� ���ʸ� Ÿ���� ��� (T t)
	// �Ű����� �Ǵ� ��ȯ���� ���̴� Ÿ�� �Ķ���͸� ���� ����� �� (<T>)
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setItem(t);
		return box;
	}
	
	public static <T> void print(T t) {
		System.out.println(t);
	}
	
	public static void hello() {
		System.out.println("hello world");
	}
}
