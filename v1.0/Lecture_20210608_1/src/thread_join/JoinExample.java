package thread_join;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * join(): �ٸ� �������� ���Ḧ ��ٸ�
		 * 
		 * why?
		 * ��� �۾��� �ϴ� �����尡 ���� ���ǵǾ����� ���,
		 * ����� ������� �޾� ���� ������ (ȣ���� ������)
		 * ���� �̿��ϴ� ���
		 *  
		 * */
		
		PIThread piThread = new PIThread();
		piThread.start();
		
//		try {
//			piThread.join();
//		}
//		catch(InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println("PI = " + piThread.getPI());
	}

}
