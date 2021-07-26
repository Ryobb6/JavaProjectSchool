package chapter3;
//トイレの空きを待つ繰り返し処理+無限ループを抜ける処理
public class Code3_2 {
	public static void main(String[] args) {
		boolean doorClose = true;
		int count = 0;
		while (doorClose == true){
			System.out.println("ノックする");
			System.out.println("一分待つ");

			// 追加部　カウントが10を超える場合はdoorCloseをfalseにする
			// カウントはif分の外側に書かなければ、if文が実行されない限り、増えないのでダメ
			count++;
			if (count > 10 ){
				System.out.println("すごく待ったので、ドアを開けます。");
				doorClose = false;
			}

		}
	}

}
