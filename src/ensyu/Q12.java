package ensyu;

public class Q12 {
	public static void main(String[] args) {
		System.out.println("スペイン語で日曜は何?1:Lunes,2:Jueves,3:Domingo　>");
		int answer = new java.util.Scanner(System.in).nextInt();

		switch (answer){
			case 1 :
			case 2 :
				System.out.println("NG");
				break;
			case 3 :
				System.out.println("OK!");
		}
	}
}
