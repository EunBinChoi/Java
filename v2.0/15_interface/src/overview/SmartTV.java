package overview;

public class SmartTV implements RemoteControl {
	// RemoteControl 인터페이스에 있는
	// 추상화 메소드를 재정의해줘야 함!
	private int volume;
	
	@Override
	public void RCOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트 티비 On");
	}

	@Override
	public void RCOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트 티비 Off");
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
	public void setMute(boolean mute) { // 디폴트 메서드 재정의
		System.out.println(mute ? 
				"스마트 티비 무음처리" : "스마트 티비 무음해제");
	}
}
