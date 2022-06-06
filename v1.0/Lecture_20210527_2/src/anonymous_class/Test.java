package anonymous_class;

/*
 * �͸� Ŭ���� (anonymous class)
 * : �̸��� ���� ��ȸ�� Ŭ����
 * : ��ü�� ����� Ŭ���� ������ ���ÿ� �� �� ����
 * : �ѹ��� ����� ����
 * 
 * : GUI (Graphical User Interface) ������ ���
 * 
 * */


import java.awt.*;
import java.awt.event.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Action Performed!");
			}
		});

	}

}
