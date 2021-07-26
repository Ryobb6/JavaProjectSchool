package ensyu3;

public class Hitandblow {
	/*【ルール】
	・答えとなる4桁の数字（数はバラバラ）を当てればクリア
	・桁数と数字があっている個数がHit
	・桁数はあっていないが、数字があっている個数がBlow
	（例：入力として"1234"、答えが「1354」の時）
	　1桁目：入力の1が桁数、数字共に答えと同じなのでHit
	　2桁目：入力の2は答えに含まれない、残念！
	　3桁目：入力の3は、答えの2桁目、Blow
	　4桁目：入力の4が桁数、数字共に答えと同じなのでHit
	　よって、Hitが2、Blowが1、となります。*/

	//入力された数字とランダムに与えられた数字でHit か Blowかを判定する judgeメソッド
	public static void judge (int[] array ,int[] randomArray) {
		System.out.println("");
		int hit = 0;
		int blow = 0;
		for(int i = 0;i < array.length; i++){
			System.out.print((i + 1) + "桁目は");
			int count = 0;
			for(int j = 0; j < randomArray.length; j++){
				if(i == j & array[i] == randomArray[j]){
					System.out.println("桁数、数字共に答えと同じなのでHit!");
					hit++;
					break;
				}
				if(i !=j){
					if(array[i] == randomArray[j]){
						System.out.println("入力の" + array[i] + "が、答えの" + (j + 1) + "桁目にあるので、Blow!");
						blow++;
						break;
					}else{
						count++;
					}
				}
			}
			if (count == 3) {
				System.out.println("数字はありませんでした");
			}
		}
		System.out.println("よってヒットが" + hit + "、Blowが" + blow + "、となります。");
	}

	//四桁のバラバラの数字生成メソッド
	public static int[] randomGeneration(){
		int[] randomArray = new int[]{0,1,2,3,4,5,6,7,8,9}; // 0~9までの要素の中身をもった配列を用意
		int[] fourArray = new int[4];


		//4回分 0-9の数字をランダムに入れ替えを行い、バラバラの4桁を作成
		// 先頭(インデックス0の要素の中身)は0が入っているので、先頭は入れ替えにて、必ず0以外の数字になる
		for(int i = 0; i < fourArray.length; i++){
			//ランダムにIndex (0-8)を用意 : randomArrayの要素の指定に使用する。
			// 入れ替えたところは、入れ替えを行たくないので、2週目は、1~9をIndex,3周目は2~9となるように、ランダムのnを設定。
			int n = new java.util.Random().nextInt(9 - i) + i;
			int tmp = randomArray[i];
			randomArray[i] = randomArray[n];
			randomArray[n] = tmp;
		}
		// 先頭のランダムな4つの数字の配列として返す為、fourArrayに全て代入
		for(int i = 0; i < fourArray.length; i++){
			fourArray[i] = randomArray[i];
		}

		// 確認用
		for(int value : fourArray){
			System.out.print(value);
		}
		System.out.println("←確認用");


		return fourArray;
	}


	public static void main(String[] args) {
		System.out.println("Hit&Blow!!");
		System.out.println("~ルール~");
		System.out.println("ヒントを元に4桁の数字（数はバラバラ）を当てましょう。");
		System.out.println("短いターンで推理して高得点を目指せ！");

		//randomGenerationメソッドで作成した配列をrandomArray配列に代入して定義
		int [] randomArray = randomGeneration();

		//whileループで使用する配列の用意
		int [] array = new int[4];
		// 四桁の数字の入力
		do{
			System.out.println("4桁の数字を入力してください");
			int m = new java.util.Scanner(System.in).nextInt();

			// 各桁の数字を配列に振り分ける
			int n = m/1000; // 一桁目の数字
			int l = (m - (n * 1000))/100; // 二桁目の数字
			int o = (m - (n * 1000) - (l * 100)) / 10; // 三桁目の数字
			int p = (m - (n * 1000) - (l * 100) - (o * 10)) ; //四桁目の数字
			array[0] = n;
			array[1] = l;
			array[2] = o;
			array[3] = p;
			for (int value : array){
			System.out.print(value);
			}

			// judgeメソッドで判定
			judge(array, randomArray);
		}while (randomArray[0] != array[0] | randomArray[1] != array[1] | randomArray[2] != array[2] | randomArray[3] != array[3]);
		System.out.println("おめでとうございます！");
	}
}
