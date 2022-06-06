package datatype;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ Ÿ�� (�ڷ���)
		/*
		 * ����: byte (1byte), short (2byte), int (4byte), long (8byte)
		 * �Ǽ�: float (4byte), double (8byte)
		 * ����: char (2byte)
		 * ���ڿ�: String
		 * �Ҹ�: boolean (1byte)
		 * 
		 * */
		
		// Q1.
//		byte b = -129; // underflow
//		byte bb = 128; // overflow
		// 1byte == 8bit (-2^7 (-128) ~ 2^7-1 (127))
		// overflow�� ���� ������ ��!
		
		float f = (float)3e6; // 3e6f, 3e6F (3x10^6)
		double d = 3E6;
		double dd = 3E-6; // 3x10^(-6)
		System.out.println(d);
		System.out.println(dd);
		
		// Q2. �Ʒ��� �ڵ忡�� float ff�� �� ��Ȯ���� ������ �����Ͻÿ�.
		float fff = 0.8488608f;
		System.out.println(fff);
		
		float ff = 312.25789112f; // 3.1225789112x10^2
		double ddd = 312.25789112; // 3.1225789112x10^2
		System.out.println(ff);
		System.out.printf("%.8f\n", ff); 
		// �Ҽ��� �ؿ� 8�ڸ������� ���
		System.out.println(ddd);
		System.out.printf("%.8f\n", ddd); 
		// �Ҽ��� �ؿ� 8�ڸ������� ���
		
		// ���� ǥ������ ���ϴ� ���� ���ؼ��� ��� ǥ���ұ��?
		// "" (String)
//		
		
		// ����: 10���� (���), 2���� (��ǻ��), 
		// 8���� (2^3), 16���� (2^4)
		int d1 = 10; // 10����
		int d2 = 012; // 8���� => 1*8^1 + 2*8^0 == 10(10)
		int d3 = 0XA; // 16���� => 10*16^0 == 10(10)
		
		// %d => decimal (10����)
		System.out.printf("%d \n", d1); 
		System.out.printf("%d \n", d2);
		System.out.printf("%d \n", d3);
		
		// %o => octal (8����)
		System.out.printf("%o \n", d1); 
		System.out.printf("%o \n", d2);
		System.out.printf("%o \n", d3);
		
		// %x => hexa (16����)
		System.out.printf("%X \n", d1); 
		System.out.printf("%X \n", d2);
		System.out.printf("%x \n", d3);
				
	}

}
