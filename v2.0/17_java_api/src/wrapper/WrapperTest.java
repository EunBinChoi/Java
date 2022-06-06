package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wrapper 클래스
		// : 기초 자료형을 감싸고 있는 클래스
		// : 기초 자료형에 필요한 메서드를 정의하기 위해
		
		Integer i1 = new Integer(10); // 권장하지 않음, Boxing
		Integer i2 = 10;			  // Boxing
		Integer i3 = 10;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		// -128 ~ 127는 사용 빈도가 높아서 이미 메모리에 저장 (주소 공유)
		System.out.println(i2 == i3); // 주소값 
		System.out.println(i2.equals(i3)); // 내용값
		
		// 300은 이미 메모리에 저장되어있지 않음 (주소 공유 X)
		Integer i4 = 300; // new Integer(300);
		Integer i5 = 300; // new Integer(300);
		System.out.println(i4 == i5); // 주소값
		System.out.println(i4.equals(i5)); // 내용값
		
		int i6 = i1.intValue(); // Unboxing
		int i7 = i2;
		
		
		/////////////////////////////////////////////////
		// String -> int, float, double
		String s = "300";
		int si = Integer.parseInt(s); // "300" -> 300
		s = "3.14";
		double sd = Double.parseDouble(s); // "3.14" -> 3.14
		float sf = Float.parseFloat(s); // "3.14" -> 3.14f
	}

}
