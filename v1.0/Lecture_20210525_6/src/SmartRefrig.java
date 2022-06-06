
public class SmartRefrig implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("½º¸¶Æ® ³ÃÀå°í ÄÔ");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("½º¸¶Æ® ³ÃÀå°í ²û");
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
		System.out.println("ÇöÀç ½º¸¶Æ® ³ÃÀå°í º¼·ý: " + this.volume);
	}

}
