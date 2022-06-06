package file_test2;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String original = "dog";
//		final String append = "copy";
//		final String extension = ".jpg";
//		final String separator = File.separator;
//		final String dir = System.getProperty("user.dir") + File.separator

		final String dir_with_bin = FileTest.class.getProtectionDomain().getCodeSource().getLocation()
				.toString();
		final int startIdx = dir_with_bin.indexOf(":");
		final int endIdx = dir_with_bin.lastIndexOf("/bin");
		final String dir = dir_with_bin.substring(startIdx + 1, endIdx);
		System.out.println("dir: " + dir);

//		final String curDir = System.getProperty("user.dir")
//				+ File.separator
//				+ System.getProperty("sun.java.command")
//				.substring(0, System.getProperty("sun.java.command").lastIndexOf("."))
//				.replace(".", File.separator);
//		System.out.println(curDir);

		copyFile(original, dir, File.separator, ".jpg");
		createFile(dir, File.separator, "newFile", ".txt");
		createDirectory(dir, File.separator, "newFolder");

	}

	public static void createDirectory(String dir, String separator, String folder) {
		try {
			File newFolder = new File(dir + separator + folder);

			if (newFolder.mkdirs()) {
				System.out.println("Directory Successfully Created");
			} else {
				System.out.println("Directory Already Exisst!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void createFile(String dir, String separator, String file, String extension) {
		try {
			File newFile = new File(dir + separator + file + extension); // directory

			if (newFile.createNewFile()) {
				System.out.println("File Successfully Created");
			} else {
				System.out.println("File Already Exist!");
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void copyFile(String original, String dir, String separator, String extension) {
		String appendName = "copy";
		String copy = original;
		while (true) {
			copy += "_" + appendName;

			File file = new File(dir + separator + copy + extension);
			if (!file.exists())
				break;
		}
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(dir + separator + original + extension);
			os = new FileOutputStream(dir + separator + copy + extension);

			byte[] readBytes = new byte[256];
			int data;
			while ((data = is.read(readBytes)) != -1) {
				// read()의 반환값: 실제 읽은 바이트 수 (int)
				os.write(readBytes, 0, data);
				// 그림 파일 / 256이 나누어떨어지지 않기 때문에
				// 실제 읽은 바이트 수만큼 써야함
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			close(os);
			close(is);
		}

	}

	public static void close(Closeable c) {
		if (c == null)
			return;
		try {
			// if(c != null) {
			c.close();
			// }
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
