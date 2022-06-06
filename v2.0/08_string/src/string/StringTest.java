package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// null�� ������ ������ �ʱ�ȭ�� ���� ���
//		int a = null; // �Ϲ� ������ ����, ����
		int[] arr = null;
		String str = null; // �� �޸� ������ ���� ���������� ���� (String ���� �ʱ�ȭ)
		
		// ���ڿ� ���� ���
		int[] arr1 = {10, 20, 30};
		char[] arr2 = {'c', 'h', 'o'};
		arr2[0] = 'C';
		String str1 = "hello"; // �� �޸� �ȿ� �ִ� string pool�� ������ �������� �ּ� ����Ŵ
		String str3 = "hello"; // // �� �޸� �ȿ� �ִ� string pool�� ������ �������� �ּ� ����Ŵ
		System.out.println(str1 == str3); // �ּҰ� �������� Ȯ��
		System.out.println(str1.equals(str3)); // �����Ͱ� �������� Ȯ��
		System.out.println(str1.toString()); // ������ ����, �����͸� ����ϱ� ���ؼ� toString()
		System.out.println(arr1); // ������ ����, �ּҰ�
		System.out.println(arr2); // ������ ����, �����͸� ����ϱ� ���ؼ� toString()
		System.out.println();
		
		String str2 = new String("hello"); // �� �޸𸮿� �ּ� ���Ӱ� �Ҵ�
		String str4 = new String("hello"); // �� �޸𸮿� �ּ� ���Ӱ� �Ҵ�
		System.out.println(str2 == str4); // �ּҰ� �������� Ȯ��
		System.out.println(str2.equals(str4)); // �����Ͱ� �������� Ȯ��
		System.out.println(str2);
		
		
		// char[] vs String
		char[] str5 = {'h', 'e', 'l', 'l', 'o'}; // �Ϻθ� ���� ����
		String str6 = "hello"; // ���ڿ� ��� (�Ϻθ� ���� �Ұ�)
		
		str5[0] = 'H';
//		str6.charAt(0) = 'H';
		str6 = "Hello"; // �Ϻθ� ������ �Ұ����ؼ� �ٽ� ������ ����
		// String���� �Ϻθ� ������ �ϰ� �ʹٸ� ..?
		char[] str6CharArr = str6.toCharArray(); // String -> char[]
		str6CharArr[0] = 'H'; // char[]���� �Ϻθ� ����
		str6 = new String(str6CharArr); // String���� ��ȯ
		System.out.println("dddd: " + str6);
		
		// ���ڿ� (String) Ŭ���� �ȿ�
		// �Ϻ� ���� ����
		str6 = "hhh";
		String str7 = str6.replace('h', 'H'); // String (str6) -> char[] -> 'h'-> 'H' -> String (str7)
		System.out.println(str6); // ���� ������ �ƴϰ�
		System.out.println(str7); // ���ο� String�� ����
		
		// �Ϻ� ���� ��ȯ
		str6 = "hello";
		System.out.println(str6.charAt(1));
		
		// ���ڿ� ���� ��ȯ
		System.out.println(str6.length());
		
		// ���ڿ� + ���ڿ�: ���ڿ� ����
		System.out.println("h" + "ello");
		
		// ���ڿ� ���� concat (concatenation)
		System.out.println("h".concat("ello"));
		
		// ���ڿ� ���� �Ϻ� ����(��) ��ȯ
		str6 = "hello"; // ���ڿ� ����: 5, �ε���: 0 ~ 4
		String str8 = str6.substring(1, 4); // ���� �ε����� ����, �� �ε����� ������ (1 <=   < 4)
		System.out.println(str8);
		
		// String str = "hello";
		// String newStr = ""; // substring�� ��� ������ ����
		// int si;
		// int ei;
//		for(int i = si; i < ei; i ++) {
//			newStr += str.charAt(i);
//		}
//		for(int i = 1; i < 4; i++) {}
		
		// "ello"
		str8 = str6.substring(1); // 1 <=    < str6.length()
		System.out.println(str8);
		
//		for(int i = 1; i < str6.length(); i++) {}
		
		// �빮�ڷ� ��ȯ
		String str9 = str6.toUpperCase();
		
		// �ҹ��ڷ� ��ȯ
		String str10 = str6.toLowerCase();
		
		// ��ҹ��� ���� ���� ���ڿ� ��
		String str11 = "HeLLo";
		String str12 = "hello";
		System.out.println(str11.equalsIgnoreCase(str12)); // true ("h" "H"�� ����)
		System.out.println(str11.equals(str12)); // false ("h" "H"�� �ٸ�)
		
		// ���ڿ��� ���̰� 0���� Ȯ��
		String str13 = "";
		System.out.println(str13.isEmpty());
		
		// ���ڿ��� ����ְų� ���鹮�� (whitespace: enter, space, tab)���� Ȯ��
		String str14 = "      				\t\t\t\t\t\t\n";
		System.out.println(str14.isBlank());
		
		// ���ڿ� ������ ��
		// s1�� s2���� �տ� ������ -1 (����)
		//           ������ 0
		//           �ڿ� ������ 1 (���)
		// s1.compareTo(s2)
		System.out.println("a".compareTo("aa")); // 'a' 'aa' ������ �� -1
		System.out.println("c".compareTo("ca")); // 'a' - 'c': -2
		System.out.println("a".compareTo("ab")); // 'a' 'aa' ������ �� -1
		System.out.println("a".compareTo("c")); // 'a' - 'c': -2
		System.out.println("a".compareTo("A")); // 'a' - 'A': 32
		System.out.println("A".compareTo("a")); // 'A' - 'a': -32
		System.out.println("a".compareTo("b")); // 'a' - 'b': -1
		System.out.println("a".compareTo("c")); // 'a' - 'c': -2
		System.out.println("a".compareTo("a")); // 'a' - 'a': 0
		System.out.println("BB".compareTo("B")); // 'BB' 'B' ������ ��
		
		// ���ڿ� -> ���� (Integer.parseInt(���ڿ�))
		// ���ڿ� -> �Ǽ� (Double.parseDouble(���ڿ�))
		// ���� �ڷ���: int, double, float, char, boolean (�Լ��� ������ �� ����)
		// ���� Ŭ����: Integer, Double, Float, Character, Boolean
		// ���� Ŭ���� (wrapper class): ���� �ڷ������� ���ΰ� �ִ� Ŭ���� 
		// why? ���� �ڷ����� �Լ��� ������ �� ���� ������ �ʿ��� �Լ��� �����ϱ� ���� ����
		
		String s1 = "1234";
		int s1_int = Integer.parseInt(s1);
		
		String s2 = "12.34";
		double s2_double = Double.parseDouble(s2);
		

	}
	
}
