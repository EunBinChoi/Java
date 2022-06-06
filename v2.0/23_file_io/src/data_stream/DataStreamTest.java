package data_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import image_duplicate_copy.ImageDuplicateCopyTest;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutputStream fos = null;
		DataOutputStream dos = null;
		InputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream("input.dat"); // 이진 파일
			dos = new DataOutputStream(fos);
			
			dos.writeUTF("김자바");
			dos.writeInt(30);
			dos.writeDouble(12.34);	
			
			//////////////////////////////////////////////////
			fis = new FileInputStream("input.dat"); // 이진 파일
			dis = new DataInputStream(fis);
			
			String name = dis.readUTF();
			int age = dis.readInt();
			double weight = dis.readDouble();	
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(weight);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(dos);
			ImageDuplicateCopyTest.close(fos);
			
			ImageDuplicateCopyTest.close(dis);
			ImageDuplicateCopyTest.close(fis);
		}
		
	}

}
