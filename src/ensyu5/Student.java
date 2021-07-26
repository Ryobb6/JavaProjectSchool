package ensyu5;

public class Student {
	String name;
	int[] scores;

	public Student(String s , int x, int y , int z){
		this.name = s;
		this.scores = new int[] {x, y, z};
		//StringBufferのインスタンスの初期値は、個人の名前+":"を入れる
	}

	public int calcTotal(){
		int sum = 0;
		for(int i = 0; i < this.scores.length;i++){
			sum += this.scores[i];
		}
		return sum;
	}


	public String makePrintData(){
		// 個人のbfに点数をbf内の文字列データとして追加していく(,を追加)
		StringBuffer bf = new StringBuffer(this.name);
		bf.append(":");
		for(int i = 0; i < this.scores.length;i++){
			bf.append(this.scores[i]);
			bf.append(",");
		}
		// 最終的に合計点をbfデータとして追加
		bf.append("合計点は");
		bf.append(calcTotal());
		// String型にして返す
		return bf.toString();
	}



}
