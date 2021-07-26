package ensyu7;

import java.util.Scanner;

/**
■■■■■■■■■■■■■■■■■■■■■■■■■■■■<br>
ensyu7 Q02 クラス構成<br>
インタフェース：UsbConnectable<br>
●一般クラス：Mouse(実装：UsbConnectable)<br>
●一般クラス：Memory(実装：UsbConnectable)<br>
●一般クラス：CardReader(実装：UsbConnectable)<br>
■一般クラス：PC<br>
■■■■■■■■■■■■■■■■■■■■■■■■■■■■<br>
*/
public class Q02 {
	public static void main(String[] args) {
		// パソコンをインスタンス化して、メインメソッド内で使えるようにしておく。
		PC pc = new PC();

		// UsbConnectableインターフェースの配列(device配列)を用意して、その要素に各デバイスのインスタンスをいれて一括管理。
		// 後々、配列のインデックスを指定するだけで、デバイスのインスタンスを参照することが可能です。
		UsbConnectable[] devices = new UsbConnectable[3];
		devices[0] = new Mouse();
		devices[1] = new Memory();
		devices[2] = new CardReader();

		// Scannerクラスのインスタンスを生成 (sc : 実行時に使用)
		Scanner sc = new Scanner(System.in);


		 // アプリの開始を選択する際に用いる変数mを用意
		int m = -1;
		    while(m!= 3){
		    	printHedder();
		    	m = sc.nextInt();
				switch(m){
				case 0 : // アプリ実行　　　　(何も接続されていない場合は、まず接続をさせる→この処理はPCクラスで行うのもあり)
					if(pc.getDevice() == null){
						System.out.println("アプリケーションを実行できます。先にUSBを接続して下さい");
					}else{
					pc.execApp();
					}
					break;
				case 1 : // USBデバイス接続　　　　(入力をdevice配列のインデックスとし、デバイスインスタンスを呼び出す)
					System.out.println("どのデバイスを接続しますか   0:マウス       1:メモリー      2:カードリーダー");
					int n = sc.nextInt();
					//あらかじめ作成しておいたデバイス配列の要素(各アプリのインスタンスがはいっている)をsetDeviceでPCクラスのフィールドにセットする。
					pc.setDevice(devices[n]);
					System.out.println("接続しました");
					break;

				case 2 : // USBデバイス取り外し　　　　(PCのフィールド変数deviceをnullにして、他のアプリとの接続をきる  / デバイスがついていない場合は、まず接続させる→この処理はPCクラスで行うのもあり)
					if(pc.getDevice() == null){
						System.out.println("接続をして下さい");
					}else{
					pc.setDevice(null);
					System.out.println("デバイスを取り外しました");
					}
					break;

				case 3:
					break;
				}
		    }
		    sc.close();

		    System.out.println("アプリケーションを終了します。");
		}
	/**
	 * メイン実行時、どの処理を行うか選択させるメソッド。
	 */
	public static void printHedder(){
		System.out.println("----------------------------------------------------");
		System.out.println("0:アプリ実行      1:USBデバイス接続     2:USBデバイス取り外し     3:終わり");
	}

}
