package string_class_split;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ȫ�浿,ȫ���,ȫ�泲:ȫ���";
		
		String[] names = str.split(",|:"); 
		
		// for-each ����
		for(String name : names) {
			System.out.println(name);
		}
	}

}
