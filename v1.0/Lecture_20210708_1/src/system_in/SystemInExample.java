package system_in;

import java.io.*;

/*
 * ���� ����
 * 
 * \n: ���н�/������
 * \r: ��
 * \r\n: ������ (\r: ĳ���� ����, \n: ����)
 * 
 * \r: Ŀ���� ���� ù ��ġ�� ����
 * \n (new line): Ŀ���� ���� �������� ����
 * 
 * */
public class SystemInExample {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		byte[] data = new byte[100];
		
		System.out.print("�̸� : ");
		int nameBytes = is.read(data);
		String name = new String(data, 0, nameBytes-2);
		
		System.out.print("���� : ");
		int genderBytes = is.read(data);
		String gender = new String(data, 0, 
				genderBytes-2);
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + gender);
;
	}

}
