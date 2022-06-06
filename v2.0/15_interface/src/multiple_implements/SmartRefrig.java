package multiple_implements;


// C extends A, B (X) => Ŭ�������� ���� ��� �Ұ�
public class SmartRefrig 
implements RemoteControl, PhoneControl {
	private int volume;

	@Override
	public void RCOn() {
		// TODO Auto-generated method stub
		System.out.println("[������] ����Ʈ ����� On");
	}

	@Override
	public void RCOff() {
		// TODO Auto-generated method stub
		System.out.println("[������] ����Ʈ ����� Off");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public void PCOn() {
		// TODO Auto-generated method stub
		System.out.println("[�ڵ���] ����Ʈ ����� On");
	}

	@Override
	public void PCOff() {
		// TODO Auto-generated method stub
		System.out.println("[�ڵ���] ����Ʈ ����� Off");
	}
}
