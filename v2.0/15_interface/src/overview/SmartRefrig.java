package overview;

public class SmartRefrig implements RemoteControl {
	private int volume;

	@Override
	public void RCOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트 냉장고 On");
	}

	@Override
	public void RCOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트 냉장고 Off");
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
}
