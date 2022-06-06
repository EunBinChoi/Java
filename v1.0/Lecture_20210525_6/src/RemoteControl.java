
/* �������̽� (interface)
 * : ������ �߻� Ŭ����, �߻� Ŭ�������� �� �߻�ȭ ���� ����
 * : ������ ������ ���� ���� ���赵
 * : ���, �߻�޼��� 
 * : ���: public static final ==> ���� ����
 * : �߻� �޼���: public abstract ==> ���� ����
 * 
 * : Java 8 ���ķ� ����
 * : - default �޼���: �������� �ʿ� ���� (must x)
 * �����Ǹ� ���� �ʴ´ٸ� �⺻������ ���ǵ� �޼��� �״�� ���
 * �����Ǹ� �Ѵٸ� �����ǵ� �޼����� ���
 * 
 * : - static �޼���: ��ü�� ���ӵ��� �ʰ� �������̽� �ϳ���
 * �ϳ��� ���� (����)�ϴ� �޼���
 * 
 * : Ŭ������ ����� ���ؼ� ������ �� ����
 * */
public interface RemoteControl {
	public int MAX_VOLUME = 10; // ��� ����
	public int MIN_VOLUME = 0; // ��� ����
	
	public abstract void turnOn(); // �߻� �޼��� ����
	public abstract void turnOff(); // �߻� �޼��� ����
	public void setVolume(int volume); // �߻� �޼��� ����
	
	// ����Ʈ �޼��� ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
		}
		else {
			System.out.println("���� ����");
		}
	}
	
	// ���� �޼���
	public static void changeBattery() {
		System.out.println("������ ��ü");
	}

}
