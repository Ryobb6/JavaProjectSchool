package ensyu2;

public class Q13 {
	public static void main(String[] args) {
		// 迷路ステージ用の配列を用意
		System.out.println("何行x何列の迷路を作成しますか?");
		System.out.println("何行?");
		int xx = new java.util.Scanner(System.in).nextInt();
		System.out.println("何列?");
		int yy = new java.util.Scanner(System.in).nextInt();
		String [][] block = new String [xx][yy];
		// 中身の作成
		for(int i = 1; i < block.length -1  ; i++){
			int l = new java.util.Random().nextInt(block[i].length -2) +1;
			for(int j = 1; j < block[i].length-1 ; j++){
				if(i%2 == 0){
					block[i][j] = "■";
					block[i][l] = "▢";
				}
				if(i%2 != 0){
					block[i][j] = "▢";
				}
			}
		}
		//ゴールの作成
		int m = block.length - 2;
		int n = block[m-1].length -2;
		block[m][n] = "☆";
		//スタートの作成
		block[1][1] = "○";
		// 枠の作成
		for(int i = 0; i < block.length; i++){
			for(int j = 0; j < block[i].length; j++){
				if(i == 0 | j==0 | i == block.length-1 | j == block[i].length-1){
				block[i][j] = ("■");
				}else {
				continue;
				}
			}
		}
		//ステージの描画
		int limit = xx+yy;
		System.out.println("移動キー(W / A / S / D)で移動します");
		int x = 1;
		int y = 1;
		int count = 0;
		do{
			System.out.println("制限移動数はあと" + limit + "回です");
			System.out.println("移動キーを入力してください");
			for(int i = 0; i < block.length; i++){
				for(int j = 0; j < block[i].length; j++){
					/*if(i == 1 & j == 1){
					block[i][j] = "○";
					}*/
					System.out.print(block[i][j]);
				}
			System.out.println("");
			}
			count++;

		//キーを入力して移動
			String move = new java.util.Scanner(System.in).nextLine();
			String tmp = "";
				switch(move){
					case "w" :
						tmp = block[x-1][y];
						if(tmp.equals("☆")){
							System.out.println("Goal");
							block[x-1][y] = block[x][y];
							block[x][y] = tmp;
							break;
						}
						if (tmp.equals("■")){
							System.out.println("進めないよ‼");
							break;
						}else{
						block[x-1][y] = block[x][y];
						block[x][y] = tmp;
						x--;
						break;}
					case "s":
						tmp = block[x+1][y];
						if(tmp.equals("☆")){
							System.out.println("Goal");
							block[x+1][y] = block[x][y];
							block[x][y] = tmp;
							break;
						}
						if (tmp.equals("■")){
							System.out.println("進めないよ‼");
							break;
						}else{
						block[x+1][y] = block[x][y];
						block[x][y] = tmp;
						x++;
						break;}
					case "d":
						tmp = block[x][y+1];
						if(tmp.equals("☆")){
							System.out.println("Goal");
							block[x][y+1] = block[x][y];
							block[x][y] = tmp;
							break;
						}
						if (tmp.equals("■")){
							System.out.println("進めないよ‼");
							break;
						}else{
						block[x][y+1] = block[x][y];
						block[x][y] = tmp;
						y++;
						break;}
					case "a":
						tmp = block[x][y-1];
						if(tmp.equals("☆")){
							System.out.println("Goal");
							block[x][y-1] = block[x][y];
							block[x][y] = tmp;
							break;
						}
						if (tmp.equals("■")){
							System.out.println("進めないよ‼");
							break;
						}else{
						block[x][y-1] = block[x][y];
						block[x][y] = tmp;
						y--;
						break;}
				}
				limit--;
				if(tmp.equals("☆")){
					break;
				}
			}while(count < xx+yy);
		if(count == xx+yy){
			System.out.println("Gameover!");
		}
		}
}


