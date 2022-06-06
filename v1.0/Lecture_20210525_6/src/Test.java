
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		SmartRefrig s1 = new SmartRefrig();
		SmartTV s2 = new SmartTV();
		
		s1.turnOn(); // abstract
		s1.setMute(true); // default
		s1.setVolume(3); // abstract
		s1.setVolume(RemoteControl.MAX_VOLUME); // abstract
		s1.setMute(false); // default
		s1.turnOff(); // abstract
		
		
		System.out.println();
		s2.turnOn(); // abstract
		s2.setVolume(5); // abstract
		s2.setVolume(RemoteControl.MIN_VOLUME); // abstract
		s2.turnOff(); // abstract
		
		System.out.println();
		RemoteControl.changeBattery(); // static
	}

}
