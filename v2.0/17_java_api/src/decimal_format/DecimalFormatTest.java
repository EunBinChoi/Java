package decimal_format;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num = 123456.789;
		
		DecimalFormat df1 = new DecimalFormat("00000000.000");
		System.out.println(df1.format(num)); // ���ڸ��� 0���� ä��
		
		DecimalFormat df2 = new DecimalFormat("########.###");
		System.out.println(df2.format(num)); // ���ڸ��� 0���� ä���� ����
		
		// 123,456.789
		DecimalFormat df3 = new DecimalFormat("##,###,###.###");
		System.out.println(df3.format(num)); 
		
		// 123456.789%
		DecimalFormat df4 = new DecimalFormat("########.###%");
		System.out.println(df4.format(num)); // 100�� ���� �Ŀ� % ���ڸ� ����
		// 123456.789 -> 12345678.9%
	}

}
