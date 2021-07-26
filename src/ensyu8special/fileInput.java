package ensyu8special;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class fileInput {
	public static void main(String[] args) {
	    // 実験1 : CSVにて読み込み
	    String filename = "C:\\Users\\210525AM\\Desktop\\ゲームデータ.csv";
	    File file = new File(filename);
	    String[][] dates = new String[31][6];
	    Game[] games= new Game[31];

	    try {
	      FileInputStream fis = new FileInputStream(file);
	      InputStreamReader isr = new InputStreamReader(fis); // fileのストリームの読み込み
	      BufferedReader br = new BufferedReader(isr); // テキストの行の読み込みに使用
	      String line; // 1行の確認用
	      ArrayList<String[]> csvData = new ArrayList<String[]>();
	      // テキスト行を読み込み。
	      // 1行の終端は、改行('\n')か、復帰('\r')、または復帰とそれに続く改行のいずれかで認識
	      // 読み込んだもの(br.readLine)を String型のlineに格納する。
	      // 行がなかったら(nullだったら終了)
	      while ( ( line = br.readLine()) != null ) {
	        String cols[] = line.split(",");
	        csvData.add(cols);
	      }

	      // CSVデータの要素をストリング型の二次元配列へ挿入
	      int countD = 0;
	      for(String[] data : csvData){
	    	  int count = 0;
	    	  for(String value : data){
	    		  System.out.print(value + " ");
	    		  dates[countD][count] = value;
	    		  count++;
	    	  }
	    	  countD++;
	    	  System.out.println("");
	      }
	      // Game型配列にデータを入れてインスタンス化
	      for(int i = 0; i < games.length; i++){
	    	  games[i] = new Game(dates[i][2], dates[i][5], dates[i][4], dates[i][1]);
	    	  //確認用
	    	  games[i].showGame();
			}

	      // 検証 2次元配列のデータの中身
	      /*
	      for(int i = 0; i < dates.length; i++){
	    	  for(int j = 0; j < dates[i].length; j++){
	    		  System.out.print(dates[i][j]);
	    	  }
	    	  System.out.println("");
	      }*/
	      // 検証 2次元配列のデータの中身
	      /*
	      for(int i = 0; i < dates.length; i++){
	    	  for(int j = 0; j < dates[i].length; j++){
	    		  System.out.print(dates[i][j]);
	    	  }
	    	  System.out.println("");
	      }*/
	      //エラーのキャッチ
	    } catch(Exception e) {
	      e.printStackTrace();
	    }


	    // 実験2: txtにて読み込み
	    /*
	    try {
	    	File file1 = new File("C:\\Users\\210525AM\\Desktop\\ゲームデータ.txt");
	    	FileReader fr = new FileReader(file1);
	    	String str = "";
	    	while (true) {
	    		int c = fr.read();
	    		if (c==-1) {
	    			break;
	    		}
	    		str += (char)c;
	    	}
	    	System.out.println(str);
	    	fr.close();
	    } catch (IOException e) {
	    	System.out.println(e);
	    }*/

	}

}
