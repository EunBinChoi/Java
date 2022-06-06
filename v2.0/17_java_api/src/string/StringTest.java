package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1 == str2); // �ּҰ� ���� O (String Pool)
		// String Pool������ �ǵ������� �ּҰ� ������ ��! (�޸� ���� ����)
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3 == str4); // �ּҰ� ���� X
		
		char c = str1.charAt(2);
		boolean t = str1.equals(str2);
		String ss1 = str1.substring(1); // �ε��� 1���� ������
		String ss2 = str1.substring(1, 3); // �ε��� 1 <=  < 3 
		// for(int i = beginIndex; i < endIndex; i++)
		
		String rep = str1.replace('h', 'H'); // ���ο� ���ڿ� ����
		String tr = "         seoul     ".trim(); // �� �� ���� ����
		System.out.println(tr);
		// trim: �ٵ��
		// when? �� �󿡼� �����͸� ���� ��
		
		String str = "123,223,323,423";
		String[] strSp = str.split(","); // ,�� �������� ���ڿ� �ڸ���
		for(String s : strSp) {
			System.out.println(s);
		}
		
		str = "abc def";
		strSp = str.split(" "); // ������ �������� ���ڿ� �ڸ���
		for(String s : strSp) {
			System.out.println(s);
		}
		
		// Sally�� ����ä�ù� ����
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
		String strJoin = String.join(" ", strSp); // split�� ���ڿ��� �ٽ� ���� (join)
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
		int index = email.indexOf('@'); // ���ڿ� ������ @�� �ε��� ��ȯ
		System.out.println(index);
		
		if(index != -1) System.out.println("���� �̸���!");
		else System.out.println("������ �̸���!");
		
		index = email.indexOf('!');
		System.out.println(index); // ���ڿ� ������ �ش� ���ڰ� ������ -1�� ��ȯ
		
		
		
		// strip
		String strStrip = "     aaaaa     ".stripLeading(); // ���� ���� ����
		System.out.println(strStrip);
		
		strStrip = "     aaaaa     ".stripTrailing(); // ������ ���� ����
		System.out.println(strStrip);
		
		
		strStrip = "     aaaaa     ".strip(); // ���� ���� ����
		System.out.println(strStrip);
		
//		str1.charAt(0) = 'H'; // ���� �Ұ��� (����� Ư¡)
		
		
		// compareTo
		// s1.compareTo(s2)
		// s1 < s2: ���� (-1)
		// s1 == s2: 0
		// s1 > s2: ��� (1)
		
		// contains
		String strContains = "���� ���� �޴���?";
		System.out.println(strContains.contains("����")); // true
		System.out.println(strContains.contains("����")); // false
		
		// concat, isEmpty, isBlank, length
		
		// startsWith
		System.out.println(strContains.startsWith("����")); // true
		System.out.println(strContains.startsWith("���� ���� �޴�")); // true
		System.out.println(strContains.startsWith(" ���� ����")); // false
		
		// endsWith
		System.out.println(strContains.endsWith("?")); // true
		System.out.println(strContains.endsWith("���� �޴���? ")); // false
	}

}
