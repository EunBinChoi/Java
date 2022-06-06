package serializable;

import java.io.Serializable;


// Serializable �������̽��� 
// ����� ���� Ŭ�������� �ʵ���� ����ȭ�� �� �ְ� ����
// ��� �ʵ���� ����Ʈ�� ��ȯ�ص� ���ٴ� ǥ��!

public class Student implements Serializable {
	
	// serialVersionUID �ʵ�: Ŭ������ �ĺ���
	// �ڹ� �ڵ� ����
	// ����ȭ�ߴ� Ŭ���� UID  �ʵ尪 == ������ȭ Ŭ���� UID �ʵ尪
	// Ŭ���� �̸��� ������ UID ���� ����
	// Ŭ���� �̸��� ���Ƶ� Ŭ������ ������ ����Ǹ� UID ����� �� ����
	
	// Ŭ������ ������ ����Ǵ��� UID ���� �����Ǿ������� ���� �߻� X
	// ��������� UID ����
	static final long serialVersionUID = 1234;
	
	// ����ȭ���� ����
	// Ű���带 static
	String name; // �� ����
	String id; // �� ����
	static String pass; // ������ ����
	// �н����� (��������) ����ȭ �������� ����
	// �ʵ�� ������ ������ ���� null�� ����
}
