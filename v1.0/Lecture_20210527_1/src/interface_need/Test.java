package interface_need;


/* �������̽� (interface)
 * 
 * ��ü�� ��ü ���̿� ��ȣ�ۿ��� ��Ÿ��
 * ��ü�� �ʿ��� �͵��� �����س� Ÿ��
 * 
 * �������̽��� �� �� �ִ� �� (2���� + 2����)
 * - ���
 * - �߻� �޼ҵ� (abstract): �������̽����� ������ �ȵǾ����� (����)
 * abstract void method();
 * �������̽��� implements ���� Ŭ�������� ������ �������ؾ���
 * 
 * - ����Ʈ �޼ҵ� (default): �������̽����� ������ �Ǿ�����
 * �������̽��� implements ���� Ŭ�������� ������ ����
 * 
 * - ���� �޼ҵ� (static)
 * 
 * �������̽��� ����
 * : ���� �ڵ带 �������� �ʰ� ����ϴ� ��ü�� ������ �� �ְ� �ϱ� ���ؼ�
 * 
 * */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Drawable interface
		// Circle, Triangle, Rectangle implements
		
		Drawable[] array = new Drawable[3];
		array[0] = new Circle();
		array[1] = new Triangle();
		array[2] = new Rectangle();
		
		array[0] = new Triangle(); // ��ü�� ����
		
		for(int i = 0; i < array.length; i ++) {
			array[i].draw();
		}
		

	}

}
