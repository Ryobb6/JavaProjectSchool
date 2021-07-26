package ensyu3;

public class Q53 {
	public static void printArray(int[][] array){
		System.out.println("{");
		for(int[] value : array){
			System.out.print("\t\t{");
			for(int eachValue : value){
				System.out.print(eachValue +",\t\t");
			}
			System.out.println("},");
		}
		System.out.println("}");
	}


	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{ 3, 6, 9, 1 },
			{ 7, 5, 4 },
			{ 7, 4 },
			{ 0, },
		};
		printArray(arr);
	}

}
