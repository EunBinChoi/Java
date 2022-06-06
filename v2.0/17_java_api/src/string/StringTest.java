package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1 == str2); // 주소값 공유 O (String Pool)
		// String Pool에서는 의도적으로 주소값 공유를 함! (메모리 관리 차원)
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3 == str4); // 주소값 공유 X
		
		char c = str1.charAt(2);
		boolean t = str1.equals(str2);
		String ss1 = str1.substring(1); // 인덱스 1부터 끝까지
		String ss2 = str1.substring(1, 3); // 인덱스 1 <=  < 3 
		// for(int i = beginIndex; i < endIndex; i++)
		
		String rep = str1.replace('h', 'H'); // 새로운 문자열 리턴
		String tr = "         seoul     ".trim(); // 앞 뒤 공백 제거
		System.out.println(tr);
		// trim: 다듬다
		// when? 웹 상에서 데이터를 받을 때
		
		String str = "123,223,323,423";
		String[] strSp = str.split(","); // ,를 기준으로 문자열 자르기
		for(String s : strSp) {
			System.out.println(s);
		}
		
		str = "abc def";
		strSp = str.split(" "); // 공백을 기준으로 문자열 자르기
		for(String s : strSp) {
			System.out.println(s);
		}
		
		// Sally의 오픈채팅방 문제
		String changedStr = "";
		for(String s : strSp) {
			for(int i = 0; i < s.length(); i++) {
				if(i == 0) changedStr += Character.toLowerCase(s.charAt(i));
				else changedStr += Character.toUpperCase(s.charAt(i));
			}	
			changedStr += " ";
		}
		System.out.println(changedStr);
		
		// join
		str = "abc def";
		strSp = str.split(" "); // String[] strSp = {"abc", "def"};
		String strJoin = String.join(" ", strSp); // split된 문자열을 다시 결합 (join)
		System.out.println(strJoin);
		
		
		str = "abc    ,  def";
		strSp = str.split(",");
		for(int i = 0; i < strSp.length; i++) {
			strSp[i] = strSp[i].trim();
		}
		
		str = "     abc,def      ";
//		str.trim();
		strSp = str.trim().split(","); // function chaining
		
		
		
		// valueOf
		String s = String.valueOf(30); // 30 -> "30"
		System.out.println(s);
		
		s = 30 + "";
		System.out.println(s);
		
		
		// indexOf
		String email = "qwer@gmail.com";
		int index = email.indexOf('@'); // 문자열 내에서 @의 인덱스 반환
		System.out.println(index);
		
		if(index != -1) System.out.println("정상 이메일!");
		else System.out.println("비정상 이메일!");
		
		index = email.indexOf('!');
		System.out.println(index); // 문자열 내에서 해당 문자가 없으면 -1을 반환
		
		
		
		// strip
		String strStrip = "     aaaaa     ".stripLeading(); // 왼쪽 공백 제거
		System.out.println(strStrip);
		
		strStrip = "     aaaaa     ".stripTrailing(); // 오른쪽 공백 제거
		System.out.println(strStrip);
		
		
		strStrip = "     aaaaa     ".strip(); // 양쪽 공백 제거
		System.out.println(strStrip);
		
//		str1.charAt(0) = 'H'; // 변경 불가능 (상수적 특징)
		
		
		// compareTo
		// s1.compareTo(s2)
		// s1 < s2: 음수 (-1)
		// s1 == s2: 0
		// s1 > s2: 양수 (1)
		
		// contains
		String strContains = "오늘 점심 메뉴는?";
		System.out.println(strContains.contains("오늘")); // true
		System.out.println(strContains.contains("내일")); // false
		
		// concat, isEmpty, isBlank, length
		
		// startsWith
		System.out.println(strContains.startsWith("오늘")); // true
		System.out.println(strContains.startsWith("오늘 점심 메뉴")); // true
		System.out.println(strContains.startsWith(" 오늘 점심")); // false
		
		// endsWith
		System.out.println(strContains.endsWith("?")); // true
		System.out.println(strContains.endsWith("점심 메뉴는? ")); // false
	}

}
