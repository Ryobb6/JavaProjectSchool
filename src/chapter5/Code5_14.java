package chapter5;

public class Code5_14 {
	public static int[] makeArray(int size){
		int [] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++){
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[] args) {
		int [] array = new int[2];
		array = makeArray(3); // newArrayの番地が渡される
		for(int i : array){
			System.out.println(i);
		}
	}
}
