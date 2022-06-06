package generic_extends;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone("010-1234-4567", 3, 20);
		String s = "IPHONE13-1234";
		
		Product<SmartPhone, String> p1 = new Product<>(sp, s);
		System.out.println(p1);
		System.out.println(p1.getModelNO());
		System.out.println(p1.getKind().getPhoneNum());
		System.out.println(p1.getKind().getNumOfCameras());
		System.out.println(p1.getKind().getNumOfSensors());
		
		////////////////////////////////////////////////////
		
		SmartTV st = new SmartTV(50);
		String s2 = "LG-OLED-1111";
		Product<SmartTV, String> p2 = new Product<>(st, s2);
		System.out.println(p2);
		System.out.println(p2.getModelNO());
		System.out.println(p2.getKind().getNumOfChannel());
		
		////////////////////////////////////////////////////
		SmartRefrig sr = new SmartRefrig(-1, 15);
		String s3 = "SAMSUNG-BESPOKE-2222";
		Product<SmartRefrig, String> p3 = new Product<>(sr, s3);
		System.out.println(p3);
		System.out.println(p3.getModelNO());
		System.out.println(p3.getKind().getTempOfFreezer());
		System.out.println(p3.getKind().getTempOfFridge());
		
		Product<SmartRefrig, String> p4 = new Product<>(sr, s3);
		System.out.println(p3.equals(p4));
		
		
		
		///////////////////////////////////////////////////
		// 인공지능 스피커 (AISpeaker)
		// 필드: 볼륨 (volume), 위치 (locOfInstall)
		AISpeaker aiSpeaker = new AISpeaker(10, "Living Room");
		String s4 = "KAKAO-MINI-3333";
		Product<AISpeaker, String> p5 = new Product<>(aiSpeaker, s4);
		
		System.out.println(p5);
		System.out.println(p5.getKind().getLocOfInstall());
		System.out.println(p5.getKind().getVolume());
		
//		Product<String, String> p6;
		// String은 Electronics의 자식 클래스가 아니기 때문
		
		Product<Electronics, String> p7;


	}
}
