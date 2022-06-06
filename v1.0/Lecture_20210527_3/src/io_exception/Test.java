package io_exception;

//import java.io.FileWriter;
//import java.io.PrintWriter;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		try {
			int[] list = new int[10];
			
			for(int i = 0; i < list.length; i ++) {
				list[i] = i;
			}
			
			
			out = new PrintWriter
					(new FileWriter("C:\\Users\\goott2\\Desktop\\outfile.txt"));
			for(int i = 0; i <= list.length; i ++) {
				out.println("배열 원소 : " + i + " => " + list[i]);
			}
		} 
		
		// Exception 
		// - ArrayIndexOutOfBoundsException, IOException
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} 
		catch(IOException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		out.close();
//		finally {
//			out.close();
//		}
	}

}
