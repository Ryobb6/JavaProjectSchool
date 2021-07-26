package ensyu8;

public class Pool {
	//【フィールド】
	private double water;    //現在の水量
	private double maxWater = 600.0;

	//【コンストラクタ】…　水量を0.0立方メートルにしてインスタンスを生成する。
	public Pool(){
		this.water = 0.0;
	}

	//【メソッド】
	/**
	 * …　引数として渡された水量だけ給水する
	 * 　　ただし満水（600.0立方メートル）を超える分は給水しない
	 * @param water
	 */
	public void feedWater(double water){
		if(water < 0){
			System.out.println("給水量は正の値をいれてください。");
		}else if((water + this.water)> this.maxWater){
			double addWater = this.maxWater - this.water;
			this.water = this.maxWater;
			System.out.println(addWater + "立方メートル給水しました");
		}else{
			this.water = water;
			System.out.println(this.water + "立方メートル給水しました");
		}
	}
	/**
	 * …　引数として渡された水量だけ排水する
	 * @param water
	 */
	public void drainWater(double water){
		if(water < 0){
			System.out.println("排水量は正の値をいれてください。");
		}else{
			this.water = this.water - water;
			System.out.println(water + "立方メートル排水しました");
		}
	}
	/**
	 * …　現在の水量を表示する
	 */
	public void display(){
		System.out.println("現在の水量は" + this.water + "立方メートルです。");
	}
}
