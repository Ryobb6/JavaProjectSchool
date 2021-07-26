package chapter16;

import java.util.Set;
import java.util.TreeSet;

public class Code16_5 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("monkey");
		words.add("cat");
		words.add("panda");
		words.add("cat");
		for(String s : words){
			System.out.println(s + "→");
		}

	}
}
