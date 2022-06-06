package datatype;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 데이터 타입 (자료형)
		/*
		 * 정수: byte (1byte), short (2byte), int (4byte), long (8byte)
		 * 실수: float (4byte), double (8byte)
		 * 문자: char (2byte)
		 * 문자열: String
		 * 불린: boolean (1byte)
		 * 
		 * */
		
		// Q1.
//		byte b = -129; // underflow
//		byte bb = 128; // overflow
		// 1byte == 8bit (-2^7 (-128) ~ 2^7-1 (127))
		// overflow가 나서 오류가 남!
		
		float f = (float)3e6; // 3e6f, 3e6F (3x10^6)
		double d = 3E6;
		double dd = 3E-6; // 3x10^(-6)
		System.out.println(d);
		System.out.println(dd);
		
		// Q2. 아래의 코드에서 float ff가 왜 정확하지 않은지 설명하시오.
		float fff = 0.8488608f;
		System.out.println(fff);
		
		float ff = 312.25789112f; // 3.1225789112x10^2
		double ddd = 312.25789112; // 3.1225789112x10^2
		System.out.println(ff);
		System.out.printf("%.8f\n", ff); 
		// 소수점 밑에 8자리까지만 출력
		System.out.println(ddd);
		System.out.printf("%.8f\n", ddd); 
		// 소수점 밑에 8자리까지만 출력
		
		// 더블도 표현하지 못하는 수에 대해서는 어떻게 표현할까요?
		// "" (String)
//		
		
		// 정수: 10진수 (사람), 2진수 (컴퓨터), 
		// 8진수 (2^3), 16진수 (2^4)
		int d1 = 10; // 10진수
		int d2 = 012; // 8진수 => 1*8^1 + 2*8^0 == 10(10)
		int d3 = 0XA; // 16진수 => 10*16^0 == 10(10)
		
		// %d => decimal (10진법)
		System.out.printf("%d \n", d1); 
		System.out.printf("%d \n", d2);
		System.out.printf("%d \n", d3);
		
		// %o => octal (8진법)
		System.out.printf("%o \n", d1); 
		System.out.printf("%o \n", d2);
		System.out.printf("%o \n", d3);
		
		// %x => hexa (16진법)
		System.out.printf("%X \n", d1); 
		System.out.printf("%X \n", d2);
		System.out.printf("%x \n", d3);
				
	}

}
