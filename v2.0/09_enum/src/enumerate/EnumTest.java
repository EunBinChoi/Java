package enumerate;

import java.util.Calendar;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.FRI;
		System.out.println(today);
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)); // ��
		System.out.println(now.get(Calendar.MONTH)); // ��
		// �ε���: 0 ~ 11
		// ���� ��: 1 ~ 12
		
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); // ��
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // ����
		// ��: 0
		// ��: 1
		// ��: 2
		// ȭ: 3
		// ��: 4
		// ��: 5
		// ��: 6
		System.out.println(now.get(Calendar.HOUR)); // �ð�
		System.out.println(now.get(Calendar.MINUTE)); // ��
		System.out.println(now.get(Calendar.SECOND)); // ��
	}

}
