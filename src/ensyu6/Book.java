package ensyu6;

public class Book {
	//＜フィールド＞
	//・ページ数
	//・価格
	int ttlPage;
	int value;
	//＜コンストラクタ＞
	//・ページ数と価格を設定する
		public Book(int ttlPage, int value){
			this.ttlPage = ttlPage;
			this.value = value;
		}

		//＜メソッド＞
	//・ページ数と価格を表示する
		public void viewInfo(){
			System.out.println("ページ数 : " + this.ttlPage);
			System.out.println("価格 : " + this.value);
		}


}
