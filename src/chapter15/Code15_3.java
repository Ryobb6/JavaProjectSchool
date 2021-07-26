package chapter15;

public class Code15_3 {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));

		// 一文字目を0とするので、3文字目から
		// 9 - 3で 6文字分 (space含む)取り出すと実際の 4から8文字目 a_progが抜き出される
		System.out.println("文字列s1の4～8文字目は(spaceを一文字として含まない場合)" + s1.substring(3,9));

		System.out.println("文字列s1の4～8文字目は" + s1.substring(0,s1.indexOf('g')));

		System.out.println(s1.replace("ava", "ovo"));
		// replaceは、置き換えたうえで、新たなStringインスタンスを返してくれる
		// したがって、s1をsysout すれば、もう一度同じものがでてくる
		System.out.println(s1);
		String s2 = s1.substring(s1.indexOf('J'), s1.lastIndexOf('p'));
		System.out.println(s2);
		System.out.println(s2.trim().replace("a", "o").toUpperCase());

	}


}
