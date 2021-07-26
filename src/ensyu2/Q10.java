package ensyu2;

public class Q10 {
	public static void main(String[] args) {
		int [] nums = {3,8,10,5,4};
		// 逆順に並べ替える
		int count = nums.length - 1;
		int tmp = 0;
		for (int i = 0; i < nums.length/2 ; i++){
			tmp = nums[i];
			nums[i] = nums[count];
			nums[count] = tmp ;
			count--;
		}

		// 変更された配列を出力する
		for(int value : nums){
			System.out.println(value);
		}
	}
}
