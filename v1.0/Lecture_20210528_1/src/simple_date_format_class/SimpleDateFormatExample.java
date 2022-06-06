package simple_date_format_class;

//import java.text.SimpleDateFormat;
import java.text.*;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sd 
		= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sd.format(now));
		
		sd = new SimpleDateFormat
				("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sd.format(now));
		
		sd = new SimpleDateFormat("Eø‰¿œ");
		System.out.println(sd.format(now));
	}

}
