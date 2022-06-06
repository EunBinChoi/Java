package string_tokenizer;


import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * StringTokenizer Ŭ������ ������
		 * ù ��° �Ű�����: ��ü ���ڿ�
		 * �� ��° �Ű�����: ������
		 * 
		 * StringTokenizer st 
		 * = new StringTokenizer("��ü ���ڿ�", "������");
		 * 
		 * ex) "ȫ�浿,ȫ���" --> "ȫ�浿", "ȫ���"
		 * ��ū (tokens): �����ڿ� ���� �߷��� ���ڿ�
		 * 
		 * �޼ҵ�
		 * int countTokens(): �����ִ� ��ū ��
		 * boolean hasMoreTokens(): �����ִ� ��ū�� �ִ��� ����
		 * String nextToken(): ��ū�� �ϳ��� ������
		 * -> �� �̻� ������ ��ū�� ������ ���� �߻�
		 * (����: java.util.NoSuchElementException)
		 * -> nextToken() ����ϱ� ���� hasMoreTokens()���� 
		 * ������ ��ū�� �ִ��� Ȯ����!
		 * 
		 * */
		
		// how1: ��ü ��ū ���� ��� for�� 
		
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text, "/");
		int count = st.countTokens();
		
		for(int i = 0; i < count; i ++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		// how2: �����ִ� ��ū�� Ȯ���ϰ� while��
		st = new StringTokenizer(text, "/");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		// "ȫ�浿/�̼�ȫ/�ڿ���"
	}

}
