package ensyu13;

public class Q05 {
	public static void main(String[] args) {
		RegexTool rx = new RegexTool();
		String[] str  = new String[6];
		str[0] = "10";
		str[1] = "-1";
		str[2] = "100";
		str[3] = "0";
		str[4] = "00";
		str[5] = "58";

		for(int i = 0; i < str.length; i++){
			rx.execute(str[i], "[1-9]{2}");
		}
	}

}
