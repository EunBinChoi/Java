package thread_join;

public class ThreadJoinTest {

	public static void main(String[] args) 
	throws InterruptedException{
		// TODO Auto-generated method stub
		/*
		 * ���� (join)
		 * : �ϳ��� �����尡 �ٸ� �������� ���Ḧ ��ٸ��� �޼ҵ�
		 * 
		 * */
		
		// ���� �����忡 sumThread�� ����
		// ���� ������� sumThread�� ���� ������ ��ٸ�
		
		// 1. SumThread()
		// 2. FactThread() // 1 ~ 100���� �� ����
		
		//SumThread s = new SumThread();
		//s.start();
		FactThread f = new FactThread();
		f.start();
		//System.out.println(f.fact);
	}

}
