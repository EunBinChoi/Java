package thread_join;

public class SumThread extends Thread{
	long sum = 0; 
	// 0으로 초기화를 안해준 이유?
	// SumThread t = new SumThread();
	// new 연산자를 이용해서 객체 생성하면
	// 0, null 초기화
	
	
	@Override
	public void run() {
		// 1부터 100까지 sum에 저장하는 코드
		for(int i = 1; i <= 10; i ++) {
			sum += i; // sum = sum + i
		}
		System.out.println(sum);
	}
}
