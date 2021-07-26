package chapter5;

public class Code5_3 {
	public static void main(String[] args) {
		methodA();
	}

	public static void methodA(){
		System.out.println("methodA");
		methodB();
	}

	public static void methodB(){
		System.out.println("methodB");
	}
}
