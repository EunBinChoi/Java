import java.util.Calendar;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ (Enum, enumerate)
		 * : ���� ���Ǵ� ����� �̸��� ���� ��
		 * 
		 * */
		
		Week today = Week.THURSDAY;
		System.out.println(today);
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)); // ��
		System.out.println(now.get(Calendar.MONTH) + 1); // ��
		// 1 ~ 12
		// 0 ~ 11
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); // ��
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // ����
		// 0
		// ��: 1
		// ��: 2
		// ȭ: 3
		// ��: 4
		// ��: 5
		System.out.println(now.get(Calendar.HOUR)); // �ð�
		System.out.println(now.get(Calendar.MINUTE)); // ��
		System.out.println(now.get(Calendar.SECOND)); // ��
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("���� ���� : " + today);
		// final double PI = 3.14;
	}
}
