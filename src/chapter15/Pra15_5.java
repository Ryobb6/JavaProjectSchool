package chapter15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pra15_5 {
	public static void main(String[] args) {
		// 現在日時インスタンスを生成
		LocalDateTime ld = LocalDateTime.now();

		// ldが持っている日のフィールドに100を足す
		LocalDateTime ld2 = ld.plusDays(100L);

		// フォーマットの用意
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

		// ld2インスタンスが持つインスタンスメソッドである、formatメソッドを使用して、formatに指定した通り、年月日の取得
		String s = ld2.format(fmt);
		System.out.println(s);



	}

}
