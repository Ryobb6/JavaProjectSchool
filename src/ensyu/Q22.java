package ensyu;

public class Q22 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++){
			for(int j = 1; j < 10; j++){
				if (i * j > 50){
					break;
				}
				System.out.print(i * j +" ");
			}
			System.out.println("");
		}
	}
}
