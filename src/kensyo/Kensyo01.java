package kensyo;

public class Kensyo01 {
	/*
	* 参照型の変数をメソッドの引数に使った場合に
	* どのような挙動になるかのテスト。
	*
	* 仮引数には実引数のコピーが渡されていること、
	* 仮引数のスコープはどこなのか を思い出しながら見て欲しい。
	* 内部的なメモリの動きをイメージしながら結果を予想するといいかも。
	*/
	public static void main(String[] args) {
	Kensyo01 kensyo = new Kensyo01();
	// 参照型である配列を用意し、インデックス0の要素に文字列代入
	String[] array = new String[10];
	String[] array2 = new String[10];
	array[0] = "Java";
	// メソッド内で変数arrayの上書き処理を実施する

	//array = kensyo.overwrite(array);

	// 感覚的には出力結果は「Unity」と予想されるが・・・
	// 結果は「Java」になる
	System.out.println(array[0]);
	}

	// 上書きするためのメソッド
	// 仮引数に新たなメモリ領域を当て、インデックス0の要素に新たな文字列を代入する
	public void overwrite(String[] array){
	// 新たなメモリ領域を割り当て
	array = new String[10]; // 仮にこの行を削除すると、結果が変わる
	// インデックス0の要素に新たな文字列を代入
	array[0] = "Unity";
	//返すarrayは新たに充てられたメモリ領域にある参照情報を返す。
	//return array;

	}
}

