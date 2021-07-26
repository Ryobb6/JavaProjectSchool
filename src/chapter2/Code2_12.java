package chapter2;
//大きいほうの数値を代入する命令
public class Code2_12 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = Math.max(a, b);
		System.out.println("比較実験" + a + "と" + b + "とで大きいほうは…" + c);
	}

}
