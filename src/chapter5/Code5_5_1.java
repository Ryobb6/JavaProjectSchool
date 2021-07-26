package chapter5;

public class Code5_5_1 {
	public static void main(String[] args) {
		System.out.println(addNum(0));
	}

	public static int addNum(int num){
		num += 2;
		if(num < 50){
			num = addNum(num);
		}
		return num;
	}

}
