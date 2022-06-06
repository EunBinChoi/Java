import java.util.Scanner;
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		// ������ �ڷ���
		// ������: int, double, char, float, boolean ....
		// ������: �迭, ��Ʈ��, Ŭ����
		
		// String: ���ڿ��� ���� �� �ִ� �ڷ���
		// 'a': ���� �ϳ� (char)
		// "a": ���ڿ� (String)
		
		// 0: ����
		// 0.0: �Ǽ�
		
		// a vs 'a' vs "a"
		// 'a': ���� �ϳ� (������, ���ͷ�)
		// "a": ���ڿ� (������, ���ͷ�)
		//   a: ���� (�����͸� ��� ����)
		
		// ���� (����) = ������ (������, ���ͷ�)
		// 1 = a (x)
		// a = 1 (o)
		
		// b = a (o)
		
		// 'abc123' (X)
		// 'abc' (X)
		// '123' (X)
 		
		// "asdasdasbasdasd123"
		// "123"
		// "abc"
		
		// ���ڿ��� �����ϴ� ��� (2����)
		String str1 = "Hello"; // string pool
		String str2 = "Hello"; // string pool
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		// �ּҰ� ��
		System.out.println(str1 == str2); // true
		System.out.println(str3 == str4); // false
		
		// ���빰 ��
		System.out.println(str1.equals(str2)); // true
		System.out.println(str3.equals(str4)); // true
		
		// equals() �Լ� ���� ���� 
		// (boolean isEquals(String s1, String s2))
		// 1. �� ���ڿ��� ���̰� ����
		// 2. �� ���ڿ��� ���빰�� ����
		
		System.out.println(isEquals(str1, str2) ?
				"�����ϴ�" : "�ٸ��ϴ�");
		System.out.println(isEquals(str3, str4) ?
				"�����ϴ�" : "�ٸ��ϴ�");
		
		
//		String s1 = new String("Hello");
//		String s2 = new String("Hllo");
//		String s3 = "Hello";
//		String s4 = "Hello";
//		
//		// String (��������)���� '=='�� �ּҰ��� �� 
//		// ���빰�� �� X
//		System.out.println(s1 == s2);
//		System.out.println(s3 == s4);
//		
//		s3 = "Hi";
//		System.out.println(s3 == s4);
//		System.out.println(); // enter
//		
//		// String���� ���빰�� �񱳴� ��� �ϳ���?
//		// equals() �Լ� �̿�
//		System.out.println(s1.equals(s2));
//		System.out.println(s3.equals(s4));
//		
//		
//		
//		
//		// equals �Լ�
//		// 1. �� ���ڿ��� ���̰� ���ƾ� ��
//		// 2. �� ���ڿ��� ���ڰ� ��� ���ƾ� ��
//		
//		
//		
//		boolean check = true;
//		if(s1.length() != s2.length()) {
//			check = false;
//		}
//		else {
//			for(int i = 0; i < s1.length(); i++) {
//				if(s1.charAt(i) != s2.charAt(i)) {
//					check = false;
//					break;
//				}
//			}
//		}
//		System.out.println((check == true)? "�����ϴ�" : "�ٸ��ϴ�");
//		
//		// s1[0] -> s1.charAt(0)
//		// s1 = "Hello";
//		// s1[0] = 'h'; (x)
//		// s1 = "hello";
//		
//		// String: ���ڵ��� �迭
//		char[] str1 = {'H', 'e', 'l', 'l', 'o'};
//		String str2 = new String("Hello");
//		String str3 = "hello";
//		
//		str1[0] = 'h';
//		str2 = "hello";
//		
//		System.out.println(str2 == str3);
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println('\u0000');
		
		// ����ڿ��� String�� �Է¹��� ��
//		String str3;
//		Scanner input = new Scanner(System.in);
		
		/*
		 * input.next(): space ���� X (Hello)
		 * input.nextLine(): space ���� O (Hello World)
		 * 
		 * Hello World
		 * 
		 * */
//		
//		System.out.println("Hello" + " World");
//		String s1 = "Hello";
//		String s2 = " World";
//		String s3 = s1 + s2;
//		System.out.println(s3);
		// "Hello" + 1 => "Hello" + "1" => "Hello1"
		// 1 + 1.0 => 2.0
//		
//		int x = 20;
//		System.out.println("������� " + x);
//		// 20 --> "20"
//		
//		String s4 = "Hello";
//		// s4.charAt(0) = 'h'; (X)
//		// s4[0] = 'h'; (X)
//		System.out.println(s4.charAt(0));
//		s4 = "hello";
		
		// ������
		// == : �ּҰ� ��
		// equals(): ���빰 ��
		
		// �⺻��
		// int a = 1
		// int b = 1
		// a == b: ���빰 ��
		
		// String: Ŭ���� (������ (�ʵ�) + �Լ�)
		
		// ex) "abcd" => length(): 4
		// ex) "abcd".charAt(i): i => 0 ~ 3
		
		// length(): ���ڿ��� ���� ��ȯ
		// charAt(i): ���ڿ����� i��° ���� ��ȯ
		
		// ���ڿ� -> ���� (int)
		// Integer.parseInt("123")
		// "123" -> 123
		
		// ���� �ڷ���: int (4 byte), long (8 byte), 
		//         float, double, boolean, char
		// ���� Ŭ���� (wrapping class)
		// Integer, Long, Float, Double, Boolean, Character
		
		String str = "test";
		// char charAt(int index): ������ �ε����� ���� ��ȯ
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		
		// int compareTo(String str)
		// �� ���ڿ��� ������ ������ ���ڿ��� ��
		// �տ� ������ -1, ������ 0, �ڿ� ������ 1 ��ȯ
		System.out.println(str.compareTo("test2"));
		// "a" vs "aa" : -1
		// "a" vs "a1" : -1
		
		
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("���ڿ��� ���� : " + proverb.length());
		
		// ���ڿ��� ���� (concatenation)
		s1 = proverb + " never bites!";
		s1 = proverb.concat(" never bites!");
		
		// ���ڿ����� �ε����� ���� ���ڸ� �����ؼ� ������ �� ����
		String strTest = "test";
		//strTest[0] = 'T';
		strTest = "Test";

		
		// ���� �ٲ� (replace)
		s2 = proverb.replace('b', 'B');
		// replace(�ٲ� ����, ��ü ����)
		
		// �κ� ���ڿ� ���� (substring)
		s3 = proverb.substring(2, 5);
		// �ε��� 2 ~ 5-1�� �ִ� ���ڿ� ����
		
		// �빮�ڷ� ��ȯ
		s4 = proverb.toUpperCase();
		
		// �ҹ��ڷ� ��ȯ
		String s5 = proverb.toLowerCase();
		
		// ������ �ε����� ���ڸ� ��ȯ
		char ch = proverb.charAt(0);
		
		// ���빰�� ��
		String s6, s7;
		s6 = "Sally";
		s7 = "Saly";
		boolean check = s6.equals(s7);
		// "s".equals("S") // false
		
		s6 = "sally";
		s7 = "SALLY";
		check = s6.equalsIgnoreCase(s7); // ��ҹ��� ����
		// "s".equalsIgnoreCase("S") // true

		
		
		// ���ڿ��� ���̰� 0���� Ȯ��
		String s8 = "";
		boolean isEmp = s8.isEmpty();
		
		// ���ڿ��� ����ְų� ���鹮�� (space, enter)���� �ƴ��� Ȯ��
		String s9 = " ";
		boolean isBl = s9.isBlank();
		
		// ������ ������ ���ڿ� ��
		// ���� �տ� ������ -1
		// ������ 0
		// �ڿ� ������ 1
		String s10 = "abcd";
		String s11 = "abc";
		int comp = s10.compareTo(s11);
		System.out.println(comp);

		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		// ���ڿ� --> ����
		
		// ���� Ŭ���� (wrapper class)
		// int, double, float, char, boolean (���� �ڷ���)
		// Integer, Double, Float, Character, Boolean (Ŭ����)
		
		// why? Ŭ���� (������ + �Լ�)
		// ���� �ڷ����� �Լ��� ������ �� ���� ������
		// ���� �ڷ����� ���δ� (�����ϴ�) Ŭ������ �����
		// �ʿ��� �Լ��� �����ϱ� ����
		
		String s12 = "123";
		int i = Integer.parseInt(s12);
		
		String s13 = "3.14";
		double d = Double.parseDouble(s13);
		
		System.out.println(i);
		System.out.println(d);
		
		// String �迭
		String[] strArr1 = new String[5];
		String[] strArr2 
		= {"����", "����", "��ȸ", "����", "����"};
		
		System.out.println(strArr2[0]);
		System.out.println(strArr2[3]);
		//System.out.println(strArr2[5]); // 
				
		
	}
	public static boolean isEquals
	(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		//"abcd" "abc"
		
		//
		// "abcd" "abbd"
		// �� ���ڿ��� ���̰� ����
		for(int i = 0; i < s1.length(); i ++) {
			if(s1.charAt(i) != s1.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}

}
