package object_class_thinclone;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] grade = {10, 20, 30};
//		Person ori = new Person("ȫ�浿", 35, 
//				"Male", grade);
//		
		
		// ���� ��ü
		Person ori = new Person("ȫ�浿", 35, 
				"Male", new int[] {10, 20, 30});
		
		// ���� ��ü
		Person cloned = ori.getPerson();
		cloned.scores[0] = 30;
		
		System.out.println("[���� ��ü]");
		System.out.println(ori);
		System.out.println();
		
		System.out.println("[���� ��ü]");
		System.out.println(cloned);
		
	}

}
