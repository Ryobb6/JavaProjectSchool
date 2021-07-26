package ensyu;

public class Q13 {
	public static void main(String[] args) {
		System.out.println("日本の信号で渡っていい色は(漢字一文字)>");
		String answer = new java.util.Scanner(System.in).nextLine();

		switch (answer){
			case "青" :
			case "緑" :
				System.out.println("OK!");
				break;
			default :
				System.out.println("NG");
		}

	}

}
