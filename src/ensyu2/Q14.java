package ensyu2;

public class Q14 {
	public static void main(String[] args) {
		int [][] trump = new int [4][13];

		for(int i = 0;i < trump.length; i++){
			int count = 0;
			for(int j = 0; j < trump[i].length; j++){
				count++;
				trump[i][j] += count;
				if(trump[i][j]==1){
					System.out.print("A");
				}else{
				System.out.print(trump[i][j]);
				}
			}
			System.out.println("");
		}
		for (int i = 0; i < trump.length; i++){
			for(int j = 0; j < trump[i].length; j++){
				int m = new java.util.Random().nextInt(trump.length);
				int n = new java.util.Random().nextInt(trump[i].length);
				int tmp = trump[i][j];
				trump[i][j] = trump[m][n];
				trump[m][n] = tmp;
			}
		}

		for (int i = 0; i < trump.length; i++){
			for(int j = 0; j < trump[i].length; j++){
					switch(trump[i][j]){
					case 1 :
					System.out.print("A" + " ");
					break;
					case 2 :
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
						System.out.print(trump[i][j]+" ");
						break;
					case 11:
					System.out.print("J" + " ");
					break;
					case 12:
					System.out.print("Q" + " ");
					break;
					case 13:
					System.out.print("K" + " ");
					break;
					}
			}
			System.out.println("");
		}



		//勝ち負け判定
		int countwin = 0;
		int countlose = 0;
		int count = 0;

		for(int j = 0; j < trump[0].length; j++){
			System.out.println(trump[0][j]);
			System.out.println("high(h) or low?(l)");
			String judge = new java.util.Scanner(System.in).nextLine();
			if(trump[0][j] == trump[0][j+1]){
				System.out.println("ドロー　もう一回");
				continue;
			}
			if (trump[0][j] < trump[0][j+1]){
				if(judge.equals("h")){
					countwin++;
					count++;
					System.out.println("アタリ!");
				}else{
					countlose++;
					count++;
					System.out.println("ハズレ");
				}
			}
			if (trump[0][j] > trump[0][j+1]){
				if(judge.equals("l")){
					countwin++;
					count++;
					System.out.println("アタリ!");
				}else{
					countlose++;
					count++;
					System.out.println("ハズレ");
				}
			}
			if(count == 5){
				break;
			}
		}
		if(countwin > countlose){
			System.out.println("勝ち!!");
		}else{
			System.out.println("勝ち!!");
		}




	}
}
