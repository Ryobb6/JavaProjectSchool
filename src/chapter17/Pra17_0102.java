package chapter17;

public class Pra17_0102 {
	public static void main(String[] args) {
		String s = null;

		try{
			System.out.println(s.length());
		}catch(NullPointerException npe){
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			npe.printStackTrace();
			System.out.println("--スタックトレース　（ここまで）--");
		}


	}

}
