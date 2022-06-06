package generic_method;

public interface Util {
	// Box<String>
	// Box<Integer>
	// Box<SmartPhone>
	
	// 인자로 들어오는 객체를 Box 클래스에 박싱시켜서 반환
	// 함수의 반환값이 제너릭 타입인 경우 (Box<T>) or 인자로 들어오는 객체가 제너릭 타입인 경우 (T t)
	// 매개변수 또는 반환형에 쓰이는 타입 파라미터를 같이 써줘야 함 (<T>)
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
