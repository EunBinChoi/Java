package string_class_trim;

public class TrimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr1 = "           �ڹ� ���α׷���            ";
		String newStr1 = oldStr1.trim();
		
		System.out.println(oldStr1);
		System.out.println(newStr1);
		System.out.println();
		
		String oldStr2 = "�ڹ� ���α׷���            ";
		String newStr2 = oldStr2.trim();
		
		System.out.println(oldStr2);
		System.out.println(newStr2);
		System.out.println();
		
		String oldStr3 = "        �ڹ� ���α׷���";
		String newStr3 = oldStr3.trim();
		
		System.out.println(oldStr3);
		System.out.println(newStr3);
		System.out.println();
	}

}
