package overview;
// �������̽�
// : Ŭ������ ����� ���ؼ� ������ �ִ� ����
// : ���� ��ü�� ���� ���� ����
// : ����Ʈ TV/������Ե� �ʿ��� ����� ��Ƶ� ���� (���)
// => ������ ���� X, ��ɸ� ���� (�Լ� ����!)

// 1) abstract method (�߻� �޼���) => ������ ������! (�Լ� ������ �ȵǾ�����)
// : abstract keyword ���� ���� (interface����)
// 2) static final (���)
// : static final ���� ���� (interface����)

// �ڹ� 8����
// 3) default method (����Ʈ �޼���) => ������ ������ (�Լ� ������ �Ǿ�����)
// 4) static method (���� �޼ҵ�)

public interface RemoteControl {
	public static final int MAX_VOLUME = 10; // ���
	public int MIN_VOLUME = 0; // ��� (static final ���� ����)
	
	public abstract void RCOn(); // �߻� �޼���
	public void RCOff(); // �߻� �޼��� (abstract ���� ����)
	public void setVolume(int volume); // �߻� �޼���
	public default void a() {
		System.out.println("default method");
	}
	
	public default void setMute(boolean mute) { // ����Ʈ �޼���
		System.out.println(mute ? "����ó��" : "��������");
	}
	
	public static void changeBattery() { // ���� �޼���
		System.out.println("������ ��ü �Ϸ�");
	}
}
