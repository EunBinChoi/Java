package enumerate;

import java.util.Calendar;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.FRI;
		System.out.println(today);
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)); // 년
		System.out.println(now.get(Calendar.MONTH)); // 월
		// 인덱스: 0 ~ 11
		// 실제 월: 1 ~ 12
		
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 일
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 요일
		// 토: 0
		// 일: 1
		// 월: 2
		// 화: 3
		// 수: 4
		// 목: 5
		// 금: 6
		System.out.println(now.get(Calendar.HOUR)); // 시간
		System.out.println(now.get(Calendar.MINUTE)); // 분
		System.out.println(now.get(Calendar.SECOND)); // 초
	}

}
