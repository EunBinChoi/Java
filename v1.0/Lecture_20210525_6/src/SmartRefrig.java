
public class SmartRefrig implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ ����� ��");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ ����� ��");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume == RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume == RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� ����Ʈ ����� ����: " + this.volume);
	}

}
