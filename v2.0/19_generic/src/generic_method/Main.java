package generic_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Boxing item";
		Box<String> sboxing = Util.boxing(s);
		System.out.println(sboxing);
		
		SmartPhone sp = new SmartPhone();
		Box<SmartPhone> spboxing = Util.boxing(sp);
		System.out.println(spboxing);
	}

}
