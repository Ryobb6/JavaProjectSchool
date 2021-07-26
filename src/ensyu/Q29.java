package ensyu;

public class Q29 {
	public static void main(String[] args) {
		/*
		 * 特別問題Q29
		 *
		 * 入力した年度のカレンダーを出力せよ。
		 * 出力形式はQ28と同じにすること。
		 * うるう年かどうかの判定をすること。(つまり、2/29が存在したり存在しなかったりする)
		 * 第1章～第3章までの学習内容でプログラミングすること。
		 *
		 * ヒント1：
		 * y年m月d日の曜日は次の式で求めることができる。
		 * (d + 26 * (m+1) / 10 + y % 100 + (y % 100) / 4
		 * - 2 * y /100 + y / 400) % 7
		 * ※1月、 2月は前年の13月、14月として計算する
		 * 結果が1の時は日曜日、2の時は月曜日・・・、6の時は金曜日、0の時は土曜日
		 *
		 * ヒント2:
		 * 2100年はうるう年ではない
		 *
		 * ヒント3:
		 * https://quizknock.com/birthday-weekday
		 * https://precious.jp/articles/-/16720
		 */
		System.out.println("取得したいカレンダーの年を入力してください");
		int year = new java.util.Scanner(System.in).nextInt() ;
		final int day = 1;
		final int month = 13;
		int daily = (day + 26 * (month+1) / 10 + (year-1) % 100 + (year-1) % 100 / 4   - 2 * (year-1) /100 + ((year-1) / 400)) % 7;
		System.out.println(daily);

		System.out.println(" 【" + (year) + "年度カレンダー】");
		int countMonth = 0;
		int emptyDay = daily - 1; // 空白日 2021年は5日あるので、初期値を5とする

		// 月のループ
		for(int i = 0; i < 12; i++){
			countMonth++;
			System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝  " + countMonth + "月  ＝＝＝＝＝＝＝＝＝＝＝＝");
			System.out.println("\t\t\t"+"日"+"\t\t\t"+"月"+"\t\t\t"+"火"+"\t\t\t"+"水"+"\t\t\t"+"木"+"\t\t\t"+"金"+"\t\t\t"+"土");
			int countDay = 0;

		// 日のループ
			for (int j = 0; j <= 31 + emptyDay ; j++){
		// カレンダーの始まりの空白日はtabを4ついれる
				if(j < emptyDay){
					System.out.print("\t\t\t\t");
				}
					// 空白日以降は、1日ずつ日付をカウントする
				else if(j > emptyDay){
					countDay++;
					// 日付が一桁の時は四つtabをいれる
					if(countDay < 10){
					System.out.print("\t\t\t" +countDay +"\t" );
					}
					// 日付が一桁の時は三つtabをいれる
					if(countDay >= 10){
						System.out.print("\t\t\t" +countDay);
					}
					// 土曜日(jが7の倍数の時)は改行する
					if( j%7 == 0){
						System.out.println("");
					}
					// (うるう年以外) 2月は28日でループを抜けます
					if(countMonth == 2 & countDay ==28 & (year%4 != 0 | year%4 != 0 & year + 1 % 100 == 0  & year % 400 !=0) ){
						break;
					}
					// (うるう年) 2月は29日でループを抜けます
					if(countMonth == 2 & countDay ==29 & year % 4 == 0 /*| !(year % 4 != 0 & year  % 100 == 0  & year % 400 !=0)*/ ) {
						break;
					}
					// 4,6,9,11月は30日でループを抜けます
					if(countMonth == 4 | countMonth == 6 | countMonth == 9 | countMonth == 11 && countDay ==30){
						break;
					}
				}
			}
			//その日付の数字 変数daily(日曜なら1)をもとめ、次の月のemptyDayへ代入する(emptyDayを更新する)
			int daily1 = 0;
			daily1 = (countDay + emptyDay)%7;
			emptyDay = daily1;
			System.out.println("");
		}

	}
}
