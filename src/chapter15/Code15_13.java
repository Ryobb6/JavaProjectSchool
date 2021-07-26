package chapter15;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Code15_13 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 文字列からDateインスタンスを作成
		Date d = f.parse("2020/09/02 01:23:45");
		System.out.println(d);

		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("あ"));
	}

}
