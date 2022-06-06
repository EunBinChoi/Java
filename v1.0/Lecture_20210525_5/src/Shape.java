/*
 * �߻� Ŭ���� (abstract class)
 * : Ŭ������ �ϼ��� ���赵��� �ϸ�
 * '�̿ϼ� ���赵'
 * 
 * : �߻� �޼��带 �����ϰ� �ִ� Ŭ����
 * (�߻� �޼���: ���� �Ǿ��ְ� �������� ���� �޼���)
 * 
 * */
public abstract class Shape {
	int x, y;
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
}
