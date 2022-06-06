package pattern_class;

import java.util.regex.Pattern;

public class PatternClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "010-1234-5678";
		String data2 = "02-123-4567";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		boolean res1 = Pattern.matches(regExp, data1);
		System.out.println(res1);
		boolean res2 = Pattern.matches(regExp, data2);
		System.out.println(res2);

		data1 = "qwertyuiop7823@gmail.com";
		data2 = "abc@naver.co.kr";
		regExp = "\\w+@\\w+.\\w+(.\\w+)?";
		res1 = Pattern.matches(regExp, data1);
		System.out.println(res1);
		res2 = Pattern.matches(regExp, data2);
		System.out.println(res2);

		data1 = "��⵵ ���� ��ⱸ ��⵿, 11-1, 1004ȣ";
		data2 = "����Ư���� ���ﱸ ���ﵿ, 11-1";
		regExp = "([��-�R]+��)? [��-�R]+�� [��-�R]+�� "
				+ "[��-�R]+��, [0-9]+-[0-9]+(, [0-9]+ȣ)?";
		res1 = Pattern.matches(regExp, data1);
		System.out.println(res1);
	}

}
