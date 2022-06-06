package multiple_implements;

public class SmartTV 
implements RemoteControl, PhoneControl {
	// RemoteControl �������̽��� �ִ�
	// �߻�ȭ �޼ҵ带 ����������� ��!
	private int volume;
	
	@Override
	public void RCOn() {
		// TODO Auto-generated method stub
		System.out.println("[������] ����Ʈ Ƽ�� On");
	}

	@Override
	public void RCOff() {
		// TODO Auto-generated method stub
		System.out.println("[������] ����Ʈ Ƽ�� Off");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	@Override
	public void setMute(boolean mute) { // ����Ʈ �޼��� ������
		System.out.println(mute ? 
				"����Ʈ Ƽ�� ����ó��" : "����Ʈ Ƽ�� ��������");
	}

	@Override
	public void PCOn() {
		// TODO Auto-generated method stub
		System.out.println("[�ڵ���] ����Ʈ Ƽ�� On");
	}

	@Override
	public void PCOff() {
		// TODO Auto-generated method stub
		System.out.println("[�ڵ���] ����Ʈ Ƽ�� Off");
	}
}
