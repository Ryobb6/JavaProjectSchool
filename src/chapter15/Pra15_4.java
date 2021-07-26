package chapter15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pra15_4 {
	public static void main(String[] args) {
		// 現在の日付をDate型で取得する
		Date now = new Date();

		// 取得した日時情報をカレンダーにセット
		Calendar cl = Calendar.getInstance();
		cl.setTime(now);

		// Calenderから日の情報を取得します。
		int day = cl.get(Calendar.DAY_OF_MONTH);

		// 取得した値に100を足した値をCalendarの「日」にセットします。
		cl.set(Calendar.DAY_OF_MONTH, (day + 100));

		// Calendarの日時情報をDate型に変換します。（getTime : Date型のインスタンスを返すメソッド）
		Date d = cl.getTime();

		// SimpleDateFormat を用いて、指定された形式でDateインスタンスの内容を表示します
		SimpleDateFormat fmt = new SimpleDateFormat("西暦yyyy年/MM月/dd日");
		String s = fmt.format(d);
		System.out.println(s);

	}

}
