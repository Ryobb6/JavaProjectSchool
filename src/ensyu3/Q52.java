package ensyu3;

public class Q52 {
	public static int[] clone(int[] array){
		int[] cloneArray = new int [array.length];
		for(int i = 0;i < array.length; i++){
		 cloneArray[i] = array[i];
		}
		return cloneArray;
	}

	public static void main(String[] args) {
		int[] aryPoint = new int[]{10,20,30};
		int[] ary = clone(aryPoint);
		for(int value : ary){
			System.out.println(value);
		}
	}
}
