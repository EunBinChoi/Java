package overview;
// 인터페이스
// : 클래스를 만들기 위해서 도움을 주는 목적
// : 실제 객체를 만들 수는 없음
// : 스마트 TV/냉장고에게도 필요한 기능을 모아둔 공간 (기능)
// => 데이터 저장 X, 기능만 저장 (함수 정의!)

// 1) abstract method (추상 메서드) => 무조건 재정의! (함수 구현이 안되어있음)
// : abstract keyword 생략 가능 (interface에서)
// 2) static final (상수)
// : static final 생략 가능 (interface에서)

// 자바 8부터
// 3) default method (디폴트 메서드) => 재정의 선택적 (함수 구현이 되어있음)
// 4) static method (정적 메소드)

public interface RemoteControl {
	public static final int MAX_VOLUME = 10; // 상수
	public int MIN_VOLUME = 0; // 상수 (static final 생략 가능)
	
	public abstract void RCOn(); // 추상 메서드
	public void RCOff(); // 추상 메서드 (abstract 생략 가능)
	public void setVolume(int volume); // 추상 메서드
	public default void a() {
		System.out.println("default method");
	}
	
	public default void setMute(boolean mute) { // 디폴트 메서드
		System.out.println(mute ? "무음처리" : "무음해제");
	}
	
	public static void changeBattery() { // 정적 메서드
		System.out.println("건전지 교체 완료");
	}
}
