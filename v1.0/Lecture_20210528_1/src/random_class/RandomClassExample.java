package random_class;

import java.util.Random;
import java.util.Arrays;

public class RandomClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] selectNumber = new int[6];
		Random random1 = new Random(3);
		System.out.print("���� ��ȣ : ");
		
		for(int i = 0; i < selectNumber.length; i ++) {
			selectNumber[i] = random1.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[] winnerNumber = new int[6];
		Random random2 = new Random(3);
		System.out.print("��÷ ��ȣ : ");
		
		for(int i = 0; i < winnerNumber.length; i ++) {
			winnerNumber[i] = random2.nextInt(45) + 1;
			System.out.print(winnerNumber[i] + " ");
		}
		System.out.println();
		
		// �������� ����
		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		
		boolean res = Arrays.equals(selectNumber, winnerNumber);
		// ������ �迭�� ���밪�� �񱳸� �Ϸ��� deepEquals() ���
		
		if(res) {
			System.out.println("1�� ��÷ !");
		}
		else {
			System.out.println("�� !");
		}

	}

}



//package random_class;
//
//import java.util.Random;
//import java.util.Arrays;
//
//public class RandomClassExample {
//
//   public static void main(String[] args) {
//      // TODO Auto-generated method stub
//      
//      int[] selectNumber = new int [6];
//      Random random = new Random(3);
//      System.out.print("���� ��ȣ : ");
//      
//      for ( int i = 0 ; i < selectNumber.length ; i++) {
//         selectNumber[i] = random.nextInt(45) + 1;
//         System.out.print(selectNumber[i] + " ");
//      }
//      System.out.println();
//      
//      int[] winnerNumber = new int [6];
//      random = new Random(3);
//      System.out.print("��÷ ��ȣ : ");
//      
//      for ( int i = 0 ; i < winnerNumber.length ; i++) {
//    	  winnerNumber[i] = random.nextInt(45) + 1;
//         System.out.print(winnerNumber[i] + " ");
//      }
//      System.out.println();
//      
//      Arrays.sort(selectNumber);
//      Arrays.sort(winnerNumber);
//      boolean res = Arrays.equals(selectNumber, winnerNumber);
//      
//      if(res) {
//         System.out.println("1�� ��÷ !");
//      }
//      else {
//         System.out.println("�� !");
//      }
//      
//   }
//
//}