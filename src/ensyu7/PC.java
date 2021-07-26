package ensyu7;

public class PC {
	// フィールドはデバイスのインスタンスを受け取れるように、USBデバイスを表すインターフェースの型を用いる。
	UsbConnectable device;
	/**
	 * execAppメソッド : デバイスのインスタンスがもつメソッド usbConnect()メソッドを実行するメソッド<br>
	 * 処理内容：PCクラスのフィールドであるdevice( : UsbConnectable型のインスタンス)を用いてメソッドを実行
	 */
	public void execApp(){
		device.usbConnect();
 	}
	/**
	 * UsbConnectable getDeviceメソッド : 接続されているデバイス(this.device)を戻り値として返す。<br>(何も接続されていない場合はnullを返します。)<br>
	 * 処理内容：フィールドの値を返す
	 * @return : フィールドのインスタンス
	 */
	public UsbConnectable getDevice(){
		return this.device;
	}
	/**
	 * setDevice(UsbConnectable device) : 引数でデバイスのインスタンスを取得し、フィールドにセットする（つまり接続する）メソッド <br>
	 * 処理内容：引数を用いてフィールドに値を入れる
	 * @param UsbConnectable型のインスタンス
	 */
	public void setDevice(UsbConnectable device){
		this.device = device;
	}
}
