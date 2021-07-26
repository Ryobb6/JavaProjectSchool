package ensyu2;

public class Q11 {
	public static void main(String[] args) {
		// 配列を昇順に並べ替える
		int [] nums = {3,8,10,5,4};
		//一番左に小さい数をもってくる
		for (int i = 0; i < nums.length - 1; i++){
			for(int j = i+ 1; j < nums.length; j++){
				//nums[1] < nums[2] ならループをスキップ
				if(nums[i] < nums[j]){
					continue;
				}
				//nums[1] > nums[2]なら要素の中身を入れ替え
				//次のっループは入れ替
				else{
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}

		for(int value : nums){
		System.out.println(value);
		}
	}
}