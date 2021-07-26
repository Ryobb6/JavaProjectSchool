package ensyu8;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Pool pool = new Pool();
		// Scannerクラスのインスタンスを生成 (sc : 実行時に使用)
				Scanner sc = new Scanner(System.in);
				 // 給水の開始を選択する際に用いる変数mを用意
				int m = 0;
				    while(m!= 4){
				    	printHedder();
				    	m = sc.nextInt();
						switch(m){
						case 1 :
							System.out.println("給水する水量を入力して下さい");
							double fdWater = sc.nextDouble();
							pool.feedWater(fdWater);
							break;
						case 2 :
							System.out.println("排水する水量を入力して下さい");
							double dnWater = sc.nextDouble();
							pool.drainWater(dnWater);
							break;
						case 3 :
							pool.display();
							break;
						case 4:
							break;
						}
				    }
				    sc.close();
				    System.out.println("アプリケーションを終了します。");
				}



	public static void printHedder(){
		System.out.println("----------------------------------------------------");
		System.out.println("1.給水  / 2.排水  / 3.表示  / 4.終了");
	}

}
