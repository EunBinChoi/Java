package string_builder;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder("자바");
		// not thread-safe (멀티 쓰레드 환경에서 안전하지 않음)
		
		StringBuffer sb = new StringBuffer("자바"); 
		// thread-safe (멀티 쓰레드 환경에서 안전함)
		
		// 문자열 추가
		sb.append("는 객체지향언어다");
		System.out.println(sb);
		
		String s1 = "자바";
		String s2 = "는 객체지향언어다";
		String s3 = s1 + s2;
		
		s1 += s2;
		System.out.println(s1);
		
		// 문자열 수정
		sb.setCharAt(2, '가');
		System.out.println(sb);
		
		// 문자열 replace
		sb.replace(4, sb.length(), "OOP언어다"); // 4 <=  < sb.length()
		System.out.println(sb);
		
		// 문자열 삭제
		sb.delete(0, 3); // 0 <=   < 3
		System.out.println(sb);
		
		// 문자열 길이
		System.out.println(sb.length());
		
		// 버퍼에 있는 객체를 String 변환 (더이상 수정 불가! final 처리!)
		String res = sb.toString();
		System.out.println(res);
	}
}
