package ensyu8special;

import java.util.Scanner;
/**
 * 勇者２人・マタンゴを２体newして<br>
 * プレイヤーに入力をしてもらいゲームをしてもらう<br>
 * マタンゴの行動は乱数を発生させて<br>
 * 3/4の確率で攻撃<br>
 * 1/4の確率で防御<br>
 * @author R.Tsuji
 *
 */
public class RpgGame {
	public static void main(String[] args) {
		//　2体だけなので、要素2の配列を作ってそれぞれインスタンス化した
		// インデックスの数を増やせば、勇者、マタンゴの数を増やせます。
		Hero[] hero = new Hero[2];
		hero[0]  = new Hero("勇者A");
		hero[1]  = new Hero("勇者B");

		Matango[] matango = new Matango[2];
		matango[0] = new Matango("マタンゴA");
		matango[1] = new Matango("マタンゴB");

		Scanner sc = new Scanner(System.in);
		// 最初の一文
		System.out.println("マタンゴが2体現れた!!");

		while(hero[0].getHp() >= 0 && hero[1].getHp() >= 0){
			// インデックスが大きくなれば、ループを検討
			// 勇者とマタンゴの現在のHPとMPを表示
			System.out.print(hero[0].getName() + ": HP" + hero[0].getHp() + "  MP" + hero[0].getHp() + "       ");
			System.out.println(hero[1].getName() + ": HP" + hero[1].getHp() + "  MP" + hero[1].getHp());
			System.out.print(matango[0].getName() + ":HP" + matango[0].getHp() + "   ");
			System.out.println(matango[0].getName() + ":HP" + matango[0].getHp());

			// 勇者のコマンド選択 コマンドを二次元配列で用意
			int[][] command = new int[2][2];
			for(int i = 0; i < hero.length; i++){
				System.out.println(hero[i].getName() + "のコマンド");
				System.out.print("１、攻撃　　２、SP攻撃　　３、防御");
				command[i][0] = sc.nextInt();
				System.out.println("誰に?");
				System.out.print("１、" + matango[0].getName() + "　　　２、" + matango[1].getName() + ">");
				command[i][1] = sc.nextInt();
			}

			// 勇者ターン
			for(int i = 0; i < hero.length; i++){
					switch(command[i][0]){
					case 1:
						hero[i].attack(matango[command[i][1] - 1]);
						break;
					case 2:
						hero[i].spAttack(matango[command[i][1] - 1]);
						break;
					case 3:
						hero[i].defense();
						break;
				}
			}






			if(matango[0].getHp() <= 0 && matango[0].getHp() <= 0){
				System.out.println("勝利した!");
				break;
			}


			break;
		}




	}

}
