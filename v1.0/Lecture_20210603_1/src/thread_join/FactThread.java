package thread_join;

public class FactThread extends Thread{
	long fact = 1; 
	// 0으로 초기화를 안해준 이유?
	// SumThread t = new SumThread();
	// new 연산자를 이용해서 객체 생성하면
	// 0, null 초기화
	
	SumThread s = new SumThread();
	
	@Override
	public void run() {	
		s.start();
		
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 1부터 100까지 sum에 저장하는 코드
		for(int i = 1; i <= 10; i ++) {
			fact *= i; // sum = sum + i
			//System.out.println(fact);
		}
		System.out.println(fact);
		
	}

}
