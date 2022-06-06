package system;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 수행시간 확인
		long st = System.currentTimeMillis();
		int[] arr = new int[1000000000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		long et = System.currentTimeMillis();
		System.out.println((et - st) + " millisec");
		System.out.println((et - st) / 1000 + " sec");
		
		System.gc(); // garbage collector 직접 호출
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.version"));
	}

}
