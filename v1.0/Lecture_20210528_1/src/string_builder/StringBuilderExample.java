package string_builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Java ");
		
		// ���ڿ� �߰�
		sb.append("Programming Study");
		System.out.println(sb);
		System.out.println();
		
		sb.insert(4, "2");	
		System.out.println(sb);
		System.out.println();
		
		// ���ڿ� ����
		sb.setCharAt(4, '3');
		System.out.println(sb);
		System.out.println();
		
		// �ε��� 6 ~ 17-1 �ش��ϴ� ���ڿ��� "Book"���� ��ü
		//sb.replace(6, 17, "Book");
		sb.replace(6, "Programming".length() + 6, "Book");
		System.out.println(sb);
		System.out.println();
		
		// ���ڿ� ����
		sb.delete(4, 5); // �ε��� 4���� �ε��� 5������ ����
		System.out.println(sb);
		System.out.println();
		
		// ���ڿ��� ����
		int len = sb.length();
		System.out.println(len);
		System.out.println();
		
		// ���ۿ� �ִ� ��ü�� String Ÿ������ ��ȯ
		String res = sb.toString();
		System.out.println(res);
		
		
	}

}
