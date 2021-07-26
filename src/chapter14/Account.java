package chapter14;

public class Account {
	String accountNumber;
	int balance;

	// ストリングメソッドのオーバライド
	public String toString(){
		return "\\" + this.balance + "(口座番号 :" + this.accountNumber + ")";
	}

	/**等価判定 equals()のオーバーライド<br>
	* 何らかのインスタンスoを引数ととり、<br>
 	* そのインスタンスのアカウント名と比べる元となるアカウントインスタンスが持っている名前が等しければ、trueを返すequals()メソッドへオーバライド<br>
	* まったく同じ(等値 : this == o)となる時も等しいとする<br>
	* 先頭へ空白がある場合でも、等しいと判定できるように、各インスタンスのアカウント名に対して、Stringクラスのtrimメソッドを使用して、前後の空白を切り捨てる<br>
	*/
	public boolean equals(Object o){
		// 等値の判定を忘れない
		if(this == o){
			return true;
		}

		if(o instanceof Account){
			// インスタンスをダウンキャストして、アカウントクラスで統一
			Account account = (Account)o;
			String name1 = this.accountNumber.trim();
			String name2 = account.accountNumber.trim();
			if(name1.equals(name2)){
				return true;
			}
		}
		return false;
	}

}
