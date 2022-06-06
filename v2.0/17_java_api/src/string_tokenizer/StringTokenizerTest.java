package string_tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "홍홍/박박/김김";
//		String[] textSp = text.split("/");
//		for(String t : textSp) {
//			System.out.println(t);
//		}
		
		StringTokenizer st = new StringTokenizer(text, "/");
		// "/": 구분자 (splitter, delimiter, seperator)
		// token: 잘린 조각들
//		int count = st.countTokens(); // for ~
//		
//		for(int i = 0; i < count; i++) {
//			String token = st.nextToken();
//			System.out.println(token);
//		}
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
