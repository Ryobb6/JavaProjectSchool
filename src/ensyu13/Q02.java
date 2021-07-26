package ensyu13;

public class Q02 {
	public static void main(String[] args) {
		String[] str = new String[5];
		str[0] = "【Java】";
		str[1] = "【Unity";
		str[2] = "【C#】スクリプト";
		str[3] = "HTML【4.2】";
		str[4] = "【【【Java】】】】】";

		for(int i = 0; i < str.length; i++){
			if(str[i].matches("^【.*】$")){
				System.out.println(str[i] + "  →  OK");
			}else{
				System.out.println(str[i] + "  →  NG");
			}
		}
	}

}
