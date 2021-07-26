package chapter11;

public class Computer extends TangibleAsset{
	String makeName;

	// コンストラクタ(重複個所はsuperで親コンストラクタを実行!)
	public Computer (String name, int price, String color, String makeName){
		super(name, price, color);
		this.makeName = makeName;
	}

	// 追加メソッド
	public String getMakeName(){
		return this.makeName;
	}

	public void run(){
		System.out.println("ダッシュで逃げる");
		super.run();
	}

}
