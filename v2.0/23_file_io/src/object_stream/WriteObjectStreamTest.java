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
		
		/* 객체 입출력
		 * - 객체는 문자가 아니기 때문에 바이트 기반 스트림으로 출력
		 * - 객체의 필드들을 줄 세워야 함 
		 * - 직렬화 (serialization)
		 * : 객체의 필드들이 일렬로 줄 세워서 연속적인 바이트로 변경
		 * 
		 * - 역직렬화 (deserialization)
		 * : 연속적인 바이트를 다시 객체로 복원하는 것
		 * */
		
		// .dat: data file (binary 형식)
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
