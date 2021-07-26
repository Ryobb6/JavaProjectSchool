package ensyu6;
/**
 * ＜フィールド＞
 *・ノートに書かれた内容
 *＜コンストラクタ＞
・ページ数と価格を設定する
＜メソッド＞
・ノートに内容を追加書き込みする
・ページ数、価格、内容を表示する
 * @author 210525AM
 *
 */
public class NoteBook extends Book{
	String sntc = "";

	public NoteBook(int notePage, int noteValue){
		super(notePage, noteValue);
	}

	// メソッド
	public void addSntc(String sntc){
		this.sntc += sntc;
	}

	public void viewInfo(){
		System.out.println("ページ数 : " + this.ttlPage);
		System.out.println("価格 : " + this.value);
		System.out.println("内容 : " + this.sntc);
	}

}
