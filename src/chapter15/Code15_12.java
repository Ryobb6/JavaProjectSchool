package chapter15;
import java.util.Calendar;
import java.util.Date;

public class Code15_12 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		Date d = c.getTime();
		System.out.println(d);
		int month = c.get(Calendar.MONTH);
		System.out.println(month+1); // getで取得およびセットできる値は、実際のとひと月ずれる(0から数えられている)

		c.set(Calendar.MONTH,12);
		d = c.getTime();
		System.out.println(d);

	}
}
