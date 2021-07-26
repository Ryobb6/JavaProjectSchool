package chapter15;

public class Pra15_1 {
	public static void main(String[] args) {
		StringBuilder br = new StringBuilder();
		int count = 0;
		for(int i = 0; i < 100; i++){
			count++;
			br.append(count + ",");
		}
		System.out.println(br);
		String s = br.toString();
		// 文字列sを","で区切る!! → Stringクラスのsplitメソッド
		String[] a = s.split(",");
		System.out.println(a.length);
	}

}
