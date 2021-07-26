package ensyu;

public class Q25 {
	public static void main(String[] args) {
		int num1 = new java.util.Random().nextInt(21);
		int num2 = new java.util.Random().nextInt(21);
		int num3 = new java.util.Random().nextInt(21);
		int small  = 0;
		int middle = 0;
		int large = 0;
		if (num1 < num2 && num1< num3){
			 if(num2 < num3){
				 small = num1;
				 middle = num2;
				 large = num3;
			}else if (num2 > num3){
				 small = num1;
				 middle = num3;
				 large = num2;
			}
		}else if(num2 < num1 && num2< num3){
			if (num1 < num3){
				small = num2;
				middle = num1;
				large = num3;
			}else if(num1 > num3){
				small = num2;
				middle = num3;
				large = num1;
			}
		}else if(num3 < num1 && num3< num2){
			if (num1 < num2){
				small = num3;
				middle = num1;
				large = num2;
			}else if(num1 > num2){
			small = num3;
			middle = num2;
			large = num1;
			}
		}
		System.out.println("三つの乱数を小さい順に並べました。" + small +"," + middle + "," + large );
	}

}
