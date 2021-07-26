package chapter15;

public class Code15_7 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");  // []内のどっちでもいいということ
		for (String w : words){
			System.out.print(w + "->");
		}
	}
}
