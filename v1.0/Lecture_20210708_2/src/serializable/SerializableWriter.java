package serializable;

import java.io.*;

public class SerializableWriter {

	public static void main(String[] args) 
			throws Exception {
		// TODO Auto-generated method stub

		// ������
		FileOutputStream fos = new FileOutputStream
				(".\\src\\serializable\\data.dat");
		ObjectOutputStream oos = 
				new ObjectOutputStream(fos);
		
		Student s = new Student();
		s.id = "1";
		s.name = "ȫ�浿";
		Student.pass = "1111"; // static ����ȭ ���� X
		oos.writeObject(s);
		// flush, close
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
		
		
	}

}
