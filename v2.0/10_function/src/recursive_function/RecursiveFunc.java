package recursive_function;

public class RecursiveFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��ȯ/��� �Լ� (�ڱ� ȣ�� �Լ�,  recursive function)
		// : �Լ� ������ �����θ� ȣ���ϴ� �Լ�
		
		// ex) �Ǻ���ġ (0��° �� -> 0, 1��° �� -> 1 (������))
		// index: 0 1 2 3 4 5 6 7        .........98 99 100 
		// value: 0 1 1 2 3 5 8 13
		
		// �ε��� n�� ���� �Ǻ���ġ ��?
		System.out.println(fibo_for(4));
		System.out.println(fibo_recur(4));
	}
	public static int fibo_for(int n) {
		int[] values = new int[n+1];
		values[0] = 0;
		values[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			values[i] = values[i-2] + values[i-1];
		}
		// �ε��� n
		return values[n];
	}
	
	// ��� �Լ�: ���� �ӵ��� ���� (�ߺ��Ǵ� �� ��� ����), �������� ����
	public static int fibo_recur(int n) {
		// ���� ����
		if(n == 0) return 0;
		else if(n == 1) return 1;
		
		// ��� ����
		// n >= 2
		return fibo_recur(n-2) + fibo_recur(n-1);
	}

}
