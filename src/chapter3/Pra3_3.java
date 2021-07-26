package chapter3;

public class Pra3_3 {
	public static void main(String[] args) {
		int isHungry = new java.util.Random().nextInt(2);
		String food = "みかん";
		System.out.println("こんにちは");
		if (isHungry == 0){
			System.out.println("お腹がいっぱいです");
		}else{
			System.out.println("腹ペコです");
			System.out.println(food + "を頂きます");
			System.out.println("ご馳走様でした");
		}
	}

}
