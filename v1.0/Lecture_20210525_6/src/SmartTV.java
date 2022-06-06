
public class SmartTV implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트 티비 켬");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트 티비 끔");
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
		
		System.out.println("현재 스마트 티비 볼륨: " + this.volume);
	}
}
