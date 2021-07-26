package chapter4;

public class Code4_19 {

	public static void main(String[] args) {
		int [] [] scores = {{40, 50, 60},{80, 60, 70},{10, 10, 10}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);

		int [] [] array = new int [3][3];
		int count = 0;
		for (int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				count++;
				array[i][j] = count;
				System.out.println(array[i][j]);
			}
		}
	}
}
