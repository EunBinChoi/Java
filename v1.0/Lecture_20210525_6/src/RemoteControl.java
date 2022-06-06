
/* 인터페이스 (interface)
 * : 일종의 추상 클래스, 추상 클래스보다 더 추상화 정도 높음
 * : 실제로 구현된 것이 없는 설계도
 * : 상수, 추상메서드 
 * : 상수: public static final ==> 생략 가능
 * : 추상 메서드: public abstract ==> 생략 가능
 * 
 * : Java 8 이후로 부터
 * : - default 메서드: 재정의할 필요 없음 (must x)
 * 재정의를 하지 않는다면 기본적으로 정의된 메서드 그대로 출력
 * 재정의를 한다면 재정의된 메서드대로 출력
 * 
 * : - static 메서드: 객체에 종속되지 않고 인터페이스 하나에
 * 하나만 존재 (공유)하는 메서드
 * 
 * : 클래스를 만들기 위해서 도움을 줄 목적
 * */
public interface RemoteControl {
	public int MAX_VOLUME = 10; // 상수 정의
	public int MIN_VOLUME = 0; // 상수 정의
	
	public abstract void turnOn(); // 추상 메서드 정의
	public abstract void turnOff(); // 추상 메서드 정의
	public void setVolume(int volume); // 추상 메서드 정의
	
	// 디폴트 메서드 정의
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}
		else {
			System.out.println("무음 해제");
		}
	}
	
	// 정적 메서드
	public static void changeBattery() {
		System.out.println("건전지 교체");
	}

}
