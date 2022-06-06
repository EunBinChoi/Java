package thread_join;

public class ThreadJoinTest {

	public static void main(String[] args) 
	throws InterruptedException{
		// TODO Auto-generated method stub
		/*
		 * 조인 (join)
		 * : 하나의 스레드가 다른 스레드의 종료를 기다리는 메소드
		 * 
		 * */
		
		// 메인 스레드에 sumThread가 조인
		// 메인 스레드는 sumThread가 끝날 때까지 기다림
		
		// 1. SumThread()
		// 2. FactThread() // 1 ~ 100까지 다 곱함
		
		//SumThread s = new SumThread();
		//s.start();
		FactThread f = new FactThread();
		f.start();
		//System.out.println(f.fact);
	}

}
