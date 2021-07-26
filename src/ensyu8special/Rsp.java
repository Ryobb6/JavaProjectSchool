package ensyu8special;

public class Rsp {
	// フィールド
	private String myHand;
	private String pcHand;
	private int winCount;
	private int loseCount;

	// ファーストヘッダー
	public void firstHedder(){
		System.out.println("-------------------------------------");
		System.out.println("ジャンケンゲーム！");
	}

	//フッター
	public void footer(){
		System.out.println("-------------------------------------");
	}

	// ヘッダー
	public void printHedder(){
		System.out.println("何を出す！？1:グー、2:チョキ、3:パー、4：終了");
	}

	// カウントの表示
	public void dispWinLose(){
		System.out.println("win" + this.winCount);
		System.out.println("lose" + this.loseCount);
	}

	// 勝った際に表示するメソッド
	public void dispWin(){
		System.out.println("あなたの勝ち");
	}
	// 負けた際に表示するメソッド
	public void dispLose(){
		System.out.println("あなたの負け");
	}

	// ドローの時に表示するメソッド
	public void dispDraw(){
		System.out.println("あいこです");
	}
	public void myHand(){
		System.out.println("あなたは" + this.getMyHand());
	}

	public void pcHand(){
		System.out.println("PCは" + this.getPcHand());
	}


	public String getMyHand() {
		return myHand;
	}
	public void setMyHand(String myHand) {
		this.myHand = myHand;
	}
	public String getPcHand() {
		return pcHand;
	}
	public void setPcHand(String pcHand) {
		this.pcHand = pcHand;
	}

	public int getWinCount() {
		return winCount;
	}

	// +1してセットします
	public void setWinCount(int winCount) {
		this.winCount += winCount;
	}

	public int getLoseCount() {
		return loseCount;
	}

	// +1してセットします
	public void setLoseCount(int loseCount) {
		this.loseCount += loseCount;
	}

	// メソッド


}
