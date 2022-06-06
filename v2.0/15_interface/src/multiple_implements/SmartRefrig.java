package multiple_implements;


// C extends A, B (X) => 클래스에서 다중 상속 불가
public class SmartRefrig 
implements RemoteControl, PhoneControl {
	private int volume;

	@Override
	public void RCOn() {
		// TODO Auto-generated method stub
		System.out.println("[리모콘] 스마트 냉장고 On");
	}

	@Override
	public void RCOff() {
		// TODO Auto-generated method stub
		System.out.println("[리모콘] 스마트 냉장고 Off");
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
		System.out.println("[핸드폰] 스마트 냉장고 On");
	}

	@Override
	public void PCOff() {
		// TODO Auto-generated method stub
		System.out.println("[핸드폰] 스마트 냉장고 Off");
	}
}
