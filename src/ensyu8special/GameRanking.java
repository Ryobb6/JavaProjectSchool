package ensyu8special;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * GameRankingクラス
	データを作成する<br>

	1.売り上げ順に並び変える<br>
	(ゲームランキングソートクラスを使用。)<br>

	2.データからHDD名を取得する<br>
	(ゲームランキングソートクラスを使用。)<br>
	//すべて表示する
	 * allShow メソッドで全て表示とする
	for (Game game : result) {
	game.showGame();
	}
 * @author 210525AM
 *
 */
public class GameRanking {
	// CSVファイルを2次元配列に読み込み
	 static Game[] games; // game型配列の格納用
	 String fileName;//file名の格納用
	 File file; // 読み込んだfileの格納用
	 static ArrayList<String[]> csvData; //csvDataのArrayList格納用
	 static String[][] dates;

	/**
	 * CSVにて読み込みを行い、フィールドへCSVデータを格納し、CSVDateのArraylistおよび、形式に基づいたランキング表をGame型配列にて作成します。
	 *
	 * @return Game型配列
	 */
	public static Game[] makeData() {
	    // 後で、ArrayListで用意する
	      int countD = 0;
	      for(String[] data : csvData){
	    	  int count = 0;
	    	  //date[] という一次元配列
	    	  for(String value : data){
	    		  //System.out.print(value + " ");
	    		  dates[countD][count] = value;
	    		  count++;
	    	  }
	    	  countD++;
	      }

	      // Game型配列にデータを入れてインスタンス化
	      for(int i = 1; i < games.length; i++){
	    	  games[i] = new Game(dates[i][2], dates[i][5], dates[i][4], dates[i][1]);
	    	  //確認用
	    	  games[i].showGame();
			}
		return games;
	}
		// CSVにて読み込みんで、Game[]に変換した配列gamesを返す...
	/**
	 *  CSVDATAのArrayListを返す。
	 * @param fileName
	 * @return
	 */
	public ArrayList<String[]> makeCsv(String fileName){
	    this.fileName = fileName;
	    this.file = new File(this.fileName);
	    // 後で、ArrayListで用意する
	    //
	    try {
	      FileInputStream fis = new FileInputStream(this.file);
	      InputStreamReader isr = new InputStreamReader(fis); // fileのストリームの読み込み
	      BufferedReader br = new BufferedReader(isr); // テキストの行の読み込みに使用
	      String line; // 1行の確認用
	      // ArrayListを作成し、フィールドへ格納。
	      // このcsvDataに情報を追加していく
	      this.csvData = new ArrayList<String[]>();
	      // テキスト行を読み込み。
	      // 1行の終端は、改行('\n')か、復帰('\r')、または復帰とそれに続く改行のいずれかで認識
	      // 読み込んだもの(br.readLine)を String型のlineに格納する。
	      // 行がなかったら(nullだったら終了)
	      while (( line = br.readLine()) != null ) {
	        String cols[] = line.split(",");
	        this.csvData.add(cols);
	      }
	      br.close();
	    } catch(IOException e) {
	    	System.out.println("エラーが発生しました");
	    	e.printStackTrace();
	    }
	    int m = (this.csvData.size()) - 1;
	    // Game配列を初期化
	    this.games= new Game[m];
	    String[][] dates = new String[m][7];
	    System.out.println(this.csvData.size());
		return this.csvData;
	}

	//すべて表示する
	public void showAll(Game[] game){
		for (Game result : game) {
			result.showGame();
		}
	}

}
