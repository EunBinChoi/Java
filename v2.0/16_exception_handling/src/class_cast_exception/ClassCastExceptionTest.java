package class_cast_exception;

public class ClassCastExceptionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Object o = new Integer(3); // 다형성
			System.out.println((String) o); // Class Cast Exception (클래스 변환 불가)
			// 실제 객체는 Integer형이기 때문에 String으로 형변환이 불가능
			
			// 15_interface problem package
			Shape s = new Circle(); // 다형성
			Rectangle r = (Rectangle)s;
			// 실제 객체는 Circle형이기 때문에 Rectangle으로 형변환 불가능
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
