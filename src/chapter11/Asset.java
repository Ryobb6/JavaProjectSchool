package chapter11;

public abstract class Asset  {
	String name;
	int price;

	// コンストラクタ
	public Asset(String name,int price){
		this.name = name;
		this.price = price;
	}

	// 追加メソッド(Thingで定義したメソッドはオーバライドしない)
	public String getName(){
		return this.name;
	}

	public int getPrice(){
		return this.price;
	}


}
