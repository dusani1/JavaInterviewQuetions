package JavaPractice.Two;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateAndTimeInDifferentFormat {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSSS");
		Date date  = new Date();
		String formatedDate = sdf.format(date);
		System.out.println(formatedDate);
	}
}
