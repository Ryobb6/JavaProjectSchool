package ensyu8special;

import java.util.Scanner;

public class Genius {
	public static void main(String[] args) {
		GameRanking gameDate = new GameRanking();
		Scanner sc = new Scanner(System.in);
		System.out.println("読み込むデータのパスを入れてください 例 パス + データ名.拡張子");
		String datePass = sc.nextLine();
		// 入力からをパスを読み込んで、fileを探して、データ作成を実行します。
		//gameDate.makeData(datePass);
		gameDate.makeCsv(datePass);
		// ストリームで確保したメモリ領域を解放する
		sc.close();
	}

}
