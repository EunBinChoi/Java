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
		// RemoteControl ���ǵ� ����Ʈ �޼��尡 ����Ʈ Ƽ�� Ŭ�������� ������
		stv.RCOff();
		RemoteControl.changeBattery();
		System.out.println();
		
		srf.RCOn();
		srf.setMute(true); // RemoteControl ���ǵ� ����Ʈ �޼���
		srf.RCOff();
		System.out.println();
		
		// �������̽��� ������
		// 1) rc ������ setMute()�� ȣ���� �� �־�� ��
		// => RemoteControl �������̽��� setMute()�� ����
		// 2) rc = new ���� Ŭ����();
		// => setMute()�� ���� Ŭ������ �����ǵǾ������� �ش� �޼��� ȣ��
		RemoteControl rc = new SmartTV();
		rc.setMute(false);
		
		rc = new SmartRefrig();
		rc.setMute(false);
		// => rc�� � ���� Ŭ������ ���������� ���� 
		// setMute()�� ����� �޶���
		
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new SmartTV();
		rcArr[1] = new SmartRefrig();
		
		for(int i = 0; i < rcArr.length; i++) {
			rcArr[i].setMute(false);
		}
	}

}
