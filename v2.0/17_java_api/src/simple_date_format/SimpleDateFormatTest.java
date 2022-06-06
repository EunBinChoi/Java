package simple_date_format;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		System.out.println(now); // �������� ��¥ ���
		
		/*
		 *  y: ��
			M: ��
			H: �� (0~23)
			h: �� (1~12)
			d: ��
			E: ����
			a: ����/����
			K: �� (0~11)
			k: �� (1~24)
			m: ��
			s: ��
			S: �и������� (1/1000��)*/
		
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss E����");
		System.out.println(sdf.format(now));
	}

}
