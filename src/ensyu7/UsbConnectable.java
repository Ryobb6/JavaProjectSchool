package ensyu7;

public interface UsbConnectable {
	/**
	 * USBを接続した際の処理メソッド<br>
	 * 各サブクラス(USB機器)で各処理を記述
	 */
	public abstract void usbConnect();

}
