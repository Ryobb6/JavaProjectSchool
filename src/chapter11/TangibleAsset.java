package chapter11;

public abstract class TangibleAsset extends Asset implements Thing{
	// 有形資産は色、重さを持つので、colorをweightを追加
	String color;
	double weight;

	// コンストラクタ(重複個所はsuperで親コンストラクタを実行!)
	// 親コンストラクタはアブストラクトでも呼び出せる
	public TangibleAsset(String name,int price, String color){
		super(name, price);
		this.color = color;
	}

	// 追加メソッド(Asset,Thingで定義したメソッドはオーバライドしない)
	public String getColor(){
		return this.color;
	}

	// 有形資産は重さを持つので、オーバライドして確定
	public double getWeight() {
		return this.weight;
	}

	// 有形資産は重さを持つので、オーバライドして確定
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/** <注意> 引数の型や戻り値が変われば、まったく別のメソッドです。</br></n>
	 * 継承先で、runメソッドの内容を変えて実装してみます
	 *
	 */

	public void run(){
		System.out.println("とことこ逃げる");

	}
}
