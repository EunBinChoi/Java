package date_calendar;

import java.util.Calendar;
import java.util.Date;

public class DataCalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		
//		Calendar c = new Calendar(); // �߻� Ŭ�������� ������ ȣ�� X
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH); // 0 ~ 11
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		switch(week) {
		case Calendar.MONDAY:
			System.out.println("������");
			break;
		case Calendar.TUESDAY:
			System.out.println("ȭ����");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("������");
			break;
		case Calendar.THURSDAY:
			System.out.println("�����");
			break;
		case Calendar.FRIDAY:
			System.out.println("�ݿ���");
			break;
		case Calendar.SATURDAY:
			System.out.println("�����");
			break;
		case Calendar.SUNDAY:
			System.out.println("�Ͽ���");
			break;
		}
		
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
	}

}
