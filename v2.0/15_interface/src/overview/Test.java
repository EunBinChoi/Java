package overview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV stv = new SmartTV();
		SmartRefrig srf = new SmartRefrig();
		
		stv.RCOn();
		stv.setVolume(-1);
		System.out.println(stv.getVolume());
		stv.setVolume(20);
		System.out.println(stv.getVolume());
		stv.setMute(true); 
		// RemoteControl 정의된 디폴트 메서드가 스마트 티비 클래스에서 재정의
		stv.RCOff();
		RemoteControl.changeBattery();
		System.out.println();
		
		srf.RCOn();
		srf.setMute(true); // RemoteControl 정의된 디폴트 메서드
		srf.RCOff();
		System.out.println();
		
		// 인터페이스의 다형성
		// 1) rc 변수가 setMute()를 호출할 수 있어야 함
		// => RemoteControl 인터페이스에 setMute()가 정의
		// 2) rc = new 구현 클래스();
		// => setMute()가 구현 클래스에 재정의되어있으면 해당 메서드 호출
		RemoteControl rc = new SmartTV();
		rc.setMute(false);
		
		rc = new SmartRefrig();
		rc.setMute(false);
		// => rc에 어떤 구현 클래스가 들어오는지에 따라서 
		// setMute()의 대상이 달라짐
		
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new SmartTV();
		rcArr[1] = new SmartRefrig();
		
		for(int i = 0; i < rcArr.length; i++) {
			rcArr[i].setMute(false);
		}
	}

}
