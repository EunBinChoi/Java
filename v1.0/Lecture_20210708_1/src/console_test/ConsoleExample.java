package console_test;

import java.io.*;

public class ConsoleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console console = System.console();
		
		System.out.print("���̵� : ");
		String id = console.readLine(); 
		// �ܼ� ���
		
		System.out.print("�н����� : ");
		char[] charPass = console.readPassword(); 
		// �ܼ� ��� X
		
		// char[] -> String
		String strPass = new String(charPass);
		
		System.out.println(id);
		System.out.println(strPass);
		
	}

}
