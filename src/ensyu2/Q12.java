package ensyu2;

public class Q12 {
	public static void main(String[] args) {
		//配列を100個作り、それぞれの要素の中身にランダムな数を代入する
		int [] nums = new int[100];
		for(int i =0; i < 100; i++ ){
			nums[i] = new java.util.Random().nextInt(101);
		}

		//要素の中身が77の要素を探索
		//インデックスを j とする
		//要素の数分ループをまわして全て含まれない場合のみ、
		//count == nums.lengthとなるので、その時に「含まれていない」を表示
		int count = 0;
		for(int j = 0 ; j < nums.length; j++){
			if(nums[j] == 77){
				System.out.println("インデックス" + j +"が77です");
				break;
			}else{
				count++;
				if(count == nums.length){
					System.out.println("含まれていない");
				}
			}
		}




	}

}
