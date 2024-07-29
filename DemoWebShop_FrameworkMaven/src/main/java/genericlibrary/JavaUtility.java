package genericlibrary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {

	public  static int getRandNumber() {
		Random r = new Random();
		return r.nextInt(5000);
	}
	
	public static String getTimeStamp() {
		LocalDateTime l = LocalDateTime.now();
		String date = l.toString().replace(":", "-");
		return date;
	}
}
