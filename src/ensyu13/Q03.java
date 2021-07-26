package ensyu13;

public class Q03 {
	public static void main(String[] args) {
		RegexTool rx = new RegexTool();
		String[] str = new String[5];
		str[0] = "090-1234-5678";
		str[1] = "080-1234-5678";
		str[2] = "070-1234-5678";
		str[3] = "08012345678";
		str[4] = "080-123-45678";
		for(int i = 0; i < str.length; i++){
			rx.execute(str[i], "0[89]0-[\\d]{4}-[\\d]{4}");
		}

	}

}
