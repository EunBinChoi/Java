package object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import image_duplicate_copy.ImageDuplicateCopyTest;
import object_stream.Student.Gender;
import object_stream.Student.Grade;

public class WriteObjectStreamTest {
	public static void main(String[] args) {
		
		/* ��ü �����
		 * - ��ü�� ���ڰ� �ƴϱ� ������ ����Ʈ ��� ��Ʈ������ ���
		 * - ��ü�� �ʵ���� �� ������ �� 
		 * - ����ȭ (serialization)
		 * : ��ü�� �ʵ���� �Ϸķ� �� ������ �������� ����Ʈ�� ����
		 * 
		 * - ������ȭ (deserialization)
		 * : �������� ����Ʈ�� �ٽ� ��ü�� �����ϴ� ��
		 * */
		
		// .dat: data file (binary ����)
		OutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(".\\students.dat");
			oos = new ObjectOutputStream(fos);
			
			Student s1 
			= new Student("Sally", Gender.FEMALE, Grade.SENIOR);
			Student s2 
			= new Student("Kain", Gender.MALE, Grade.JUNIOR);
			Student s3 
			= new Student("Jun", Gender.MALE, Grade.SENIOR);
			 
			List<Student> students 
			= Arrays.asList(s1, s2, s3);
			oos.writeObject(students);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			ImageDuplicateCopyTest.close(oos);
			ImageDuplicateCopyTest.close(fos);
		}
		
	}
}
