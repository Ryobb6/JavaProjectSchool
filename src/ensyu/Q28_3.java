package ensyu;

public class Q28_3 {
	public static void main(String[] args) {
		System.out.println(" 【2021年度カレンダー】");
		int countMonth = 0;
		int emptyDay = 5; // 空白日 2021年は5日あるので、初期値を5とする

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
					// 2月は28日でループを抜けます
					if(countMonth == 2 && countDay ==28){
						break;
					}
					// 4,6,9,11月は30日でループを抜けます
					if(countMonth == 4 | countMonth == 6 | countMonth == 9 | countMonth == 11 && countDay ==30){
						break;
					}
				}
			}
			//その日付の数字 変数daily(日曜なら1)をもとめ、次の月のemptyDayへ代入する(emptyDayを更新する)
			int daily = 0;
			daily = (countDay + emptyDay)%7;
			emptyDay = daily;
			System.out.println("");
		}
	}
}



