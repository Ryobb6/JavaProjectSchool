package ensyu5;

public class Car {
	double gasoline; // ガソリン残量
	double nenpi;
	double gasolineMax; // ガソリン(タンク)容量

	public Car(double gasoline, double nenpi, double gasolineMax){
		this.gasoline = gasoline;
		this.nenpi = nenpi;
		this.gasolineMax = gasolineMax;
	}

	public void displayGasoline(){
		System.out.println("現在の燃料は" + this.gasoline + "です。");
	}


	/**＜給油メソッド＞</br></n>
	 * 内容 : 入力された給油量をガソリン残量へ追加 / 条件として、ガソリンタンクの容量を超えない事。</br></n>
	 * 結果 : 1.フィールドのガソリン残量の更新 /  2.実際に給油する量と給油後の燃料を表示。</br></n>
	 * 計算方法(確認用) : </br></n>
	 * ① ガソリン残量 + 給油したい量(引数) = 給油後のガソリン量 ←ただしキャパーオーバーとなる可能性もある</br></n>
	 * 　　→給油後のガソリン量を一度tmpに入れて、ガソリン容量をオーバーしてないか検査(②)</br></n>
	 * ② 検査 : tmpとgasolinMaxの比較 **容量(gasolineMax)より、tmpが大きい場合は、容量自体が給油後のガソリン量**</br></n>
	 * ③ 実際に注ぐ量を "addGasoline = 給油後のガソリン量 - ガソリン残量"　とする。</br></n>
	 * ④ ③の計算後に、フィールドのガソリン量を給油後のガソリン量に変更(代入)。</br></n>
	 * ⑤ 給油量と、給油後のガソリン残量を表示</br></n>
	 * @param gasoline : 給油したい量（入力値）
	 * @return : 無し
	 * @author R.Tsuji
	 */

	public void addGasoline(double gasoline){
		double tmp = this.gasoline + gasoline; // ①
		double ttlGasoline = Math.min(tmp, this.gasolineMax); // ②
		double addGasoline = ttlGasoline - this.gasoline; // ③
		this.gasoline = ttlGasoline; // ④
		// ⑤
		System.out.println(addGasoline + "リットル給油します。");
		System.out.println("現在の燃料は" +this.gasoline + "リットルです");
	}

	public void run(double distance){
		// ガソリン使用料
		double useGasoline = distance/this.nenpi;
		if(useGasoline <= this.gasoline){
			System.out.println(distance + "キロ走行します");
			this.gasoline = this.gasoline - useGasoline;
		}else{
			System.out.println("ガソリンが足りません");
		}

	}


}
