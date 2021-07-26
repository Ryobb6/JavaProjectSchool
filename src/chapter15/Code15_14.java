package chapter15;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Code15_14 {
	public static void main(String[] args) {
		// Instant クラスのインスタンスの生成
		// 戻り値として、システム・クロックを使用する現在のインスタント(エポックからの経過時間のナノ秒)
		Instant i1 = Instant.now();
		System.out.println(i1);

		// Instantとlong値との相互互換
		Instant i2 = Instant.ofEpochMilli(160070542827L);
		System.out.println(i2);

		long l = i2.toEpochMilli(); // 戻り値 long型 : エポック1970-01-01T00:00:00Zからのミリ秒数

		// ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		// InstantとZonedDateTimeの相互互換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		// ZonedDateTimeの利用方法
		System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth() );

		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l1);

	}
}
