package ensyu13;

public class Q04 {
	public static void main(String[] args) {
		RegexTool rx = new RegexTool();
		String[] str  = new String[6];
		str[0] = "気合いだ";
		str[1] = "気合いだ気合いだ";
		str[2] = "気合いだ気合いだ気合いだ";
		str[3] = "気合いだ！";
		str[4] = "気合いだ気合いだ気合いだ！！！";
		str[5] = "Javaは気合いだ！";

		for(int i = 0; i < str.length; i++){
			rx.execute(str[i], "(気合いだ)+！*$");
		}

	}


}
