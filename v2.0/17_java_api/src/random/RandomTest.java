package random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Random(): ȣ���� ������ seed�� �ٸ��� ���� (���� �ý��� �ð�)
		// Random(long seed): �Ű������� �־��� seed�� ����
		// * seed (����): ������ �����ϱ� ���� ���� �� (���н��� �̿��ؼ� ������ ����)
		
		int[] selectNumber = new int[6];
		Random random1 = new Random(5);
		for(int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random1.nextInt(45) + 1; // 1 <=   < 46
		}
		System.out.println(Arrays.toString(selectNumber));
		
		int[] winNumber = new int[6];
		Random random2 = new Random(5);
		for(int i = 0; i < winNumber.length; i++) {
			winNumber[i] = random2.nextInt(45) + 1; // 1 <=   < 46
		}
		System.out.println(Arrays.toString(winNumber));
		System.out.println(Arrays.equals(selectNumber, winNumber));
		// ������ �迭���� equals() -> ���Ұ� �� (arr1_1d[i] == arr2_1d[i])
		
		// ������ �迭���� equals() -> �ּҰ� �� (arr1_2d[i] == arr2_2d[i])
		//          deepEquals() -> ���Ұ� �� (arr1_2d[i][j] == arr2_2d[i][j])
	}

}
