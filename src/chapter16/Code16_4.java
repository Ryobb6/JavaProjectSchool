package chapter16;

import java.util.HashSet;
import java.util.Set;

public class Code16_4 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("黒");
		colors.add("赤");
		colors.add("緑");
		colors.add("白");
		colors.add("青");
		colors.add("黄");
		colors.add("橙");
		for(String s : colors) {
			System.out.print(s + "→");
		}
	}

}
