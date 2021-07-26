package ensyu13;

/*
 * 以下の文字列に全てマッチする正規表現を答えよ。
Java
Unity
C#
 */
public class Q01 {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Unity";
		String str3 = "C#";

		if(str1.matches(".*") && str2.matches(".*") && str3.matches(".*") ){
			System.out.println("マッチする");
		}


	}


}
