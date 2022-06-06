package simple_date_format;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		System.out.println(now); // 영문으로 날짜 출력
		
		/*
		 *  y: 년
			M: 월
			H: 시 (0~23)
			h: 시 (1~12)
			d: 일
			E: 요일
			a: 오전/오후
			K: 시 (0~11)
			k: 시 (1~24)
			m: 분
			s: 초
			S: 밀리세컨드 (1/1000초)*/
		
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss E요일");
		System.out.println(sdf.format(now));
	}

}
