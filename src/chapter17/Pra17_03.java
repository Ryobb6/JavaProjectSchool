package chapter17;

public class Pra17_03 {
	public static void main(String[] args) {
		try{
			int i = Integer.parseInt("三");
		}catch(NumberFormatException nfe){
			nfe.printStackTrace();
		}


	}

}
