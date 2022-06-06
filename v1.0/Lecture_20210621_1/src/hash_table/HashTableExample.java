package hash_table;

import java.awt.Toolkit;
import java.util.*;
public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<>();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// Ű���� ���̵� ����
		// �� (value)���� ��й�ȣ ����
		map.put("abcd", "1234"); // 1
		map.put("abcd", "5678"); // 2 (1���� ������ ���)
		map.put("eunbin544", "1111");
		map.put("qwertyuiop", "2222");
		
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("[�α��� ������]");
			System.out.print("���̵� : ");
			String id = sc.next(); 
			
			System.out.print("��й�ȣ : ");
			String pass = sc.next();
			
			if(map.containsKey(id)) {
				
				if(map.get(id).equals(pass)) {
					System.out.println("�α��� ���� !");
					break;
				}
				else {
					System.out.printf("��й�ȣ ����ġ (%d ȸ) \n", cnt);
					System.out.println("5ȸ�� 5�� ��� !");
					toolkit.beep();
					
					if (cnt == 5) {
						while(cnt > 0) {
							System.out.printf("%d�� \n", cnt);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							cnt --;
						}				
					}
					cnt ++;
				}	
			}
			else {
				System.out.println("�Է��Ͻ� ���̵� �����ϴ� !");
			}
			
			// 1. ���̵� �����ϴ��� Ȯ�� 
			// 2. ���̵� �����Ѵٸ� ��й�ȣ�� �� 
			// 3. �α��� ����
			
			// - "��й�ȣ ����ġ"
			// - "���̵� ��ü�� �������� ���� ���"
			
			// - 5ȸ Ʋ���� (cnt) 5�� ��� (Thread.sleep())
			// - java.awt.*;
			// - Toolkit toolkit = Toolkit.getDefaultToolkit();
			// toolkit.beep() // �����
			
		}
	}

}
