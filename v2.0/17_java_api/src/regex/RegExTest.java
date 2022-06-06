package regex;

import java.util.regex.*;

public class RegExTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "010-1234-5678";
		String data2 = "02-123-4567";
		String regEx = "\\d{2,3}[-]\\d{3,4}[-]\\d{4}";
//		String s = "\\";
		
		boolean res1 = Pattern.matches(regEx, data1);
		System.out.println(res1);
		boolean res2 = Pattern.matches(regEx, data2);
		System.out.println(res2);
		boolean res3 = Pattern.matches(regEx, "0001-00000000-000");
		System.out.println(res3);
		
		data1 = "qwer@gmail.com";
		data2 = "abc@naver.co.kr";
		regEx = "\\w+[@]\\w+[.]\\w+([.]\\w+)?";
		res1 = Pattern.matches(regEx, data1);
		System.out.println(res1);
		res2 = Pattern.matches(regEx, data2);
		System.out.println(res2);
		res3 = Pattern.matches(regEx, "abc@naver");
		System.out.println(res3);
		
		data1 = "¼­¿ïÆ¯º°½Ã ±¸·Î±¸ ±¸·Îµ¿ 1129-1";
		data2 = "°æ±âµµ ¼ö¿ø½Ã Àå¾È±¸ Àå¾Èµ¿ 1130-2";
		regEx = "([°¡-ÆR]+[µµ] )?[°¡-ÆR]+[½Ã] [°¡-ÆR]+[±¸] [°¡-ÆR]+[µ¿] [0-9]+[-][0-9]+";
		res1 = Pattern.matches(regEx, data1);
		System.out.println(res1);
		res2 = Pattern.matches(regEx, data2);
		System.out.println(res2);
	}

}
