package ensyu8special;

public class Game {
	String name; // ゲーム名
	int sales; // 売上
	String salesDate; // 発売日
	String hdd; // ハード名
	int rank; // ハード毎の順位

	// コンストラクタ HDDごとの順位以外は、引数にて初期化
	public Game(String name, String sales, String salesDate, String hdd){
		this.name = name; // 2 : インデックス

		// Sales(売上)のint型の値への変換
		int x =  sales.indexOf("本");// 5
		String str1 = sales.substring(0,x);
		int y = str1.indexOf("万");
		String str2 = str1.substring(0, y);
		String str3 = str1.substring(y+1);

		this.sales = Integer.parseInt(str2 + str3);

		this.salesDate = salesDate; // 4
		this.hdd = hdd; // 1
	}
	// 表示用
	public void showGame(){
		System.out.println("HDD名："+this.hdd +"\tゲーム名："+ this.name+"\t順位:" + this.rank + "\t売上:"+ this.sales +"\t発売日:" + this.salesDate);
	}
}
