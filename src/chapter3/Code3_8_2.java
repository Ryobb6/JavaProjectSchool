package chapter3;
// 複雑なfor文
public class Code3_8_2 {
	public static void main(String[] args) {
		// ループ変数を1からスタートする
		for(int i = 1; i < 10; i++){
			System.out.println(i);
		}
		// ループ変数を2ずつ増やす
		for(int i = 0; i < 10; i += 2){
			System.out.println(i);
		}
		// ループ変数を10から1ずつ1まで減らしていく
		for(int i = 10; i > 0; i--){
			System.out.println(i);
		}
		// ループ変数を初期化しない → エラーとなるので、for文の前で変数iを初期化する
		int i = 0;
		for(; i < 10; i++){
			System.out.println("あ");
		}
		// 繰り返し時の処理を行わない(無限ループとなるので、forのブロック内でj++をする)
		for (int j = 0; j < 10;){
			System.out.println(1);
			j++;
		}
	}

}
