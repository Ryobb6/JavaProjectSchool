package ensyu;

public class Q14 {
	public static void main(String[] args) {
		int dice1 = new java.util.Random().nextInt(6) +1 ;
		int dice2 = new java.util.Random().nextInt(6) +1 ;
		int score = 0;
		if (dice1 == dice2){
			score = (dice1 + dice2) * 2;
		}else{
			score = dice1 + dice2;
		}
		System.out.println("dice1:" + dice1 + " dice2:" + dice2 +" score:" +score);
	}

}
