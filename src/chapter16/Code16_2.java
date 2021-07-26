package chapter16;

import java.util.ArrayList;
import java.util.Iterator;

public class Code16_2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ミナト");
		names.add("アサカ");
		names.add("スガワラ");

		Iterator<String> ite = names.iterator();

		while (ite.hasNext()){
			String e = ite.next();
			if (e.equals("アサカ")) {
				ite.remove();
			}
			System.out.println(e);
		}

		Iterator<String> ite2 = names.iterator();
		while (ite2.hasNext()){
			String e = ite2.next();
			System.out.println(e);
		}

	}
}
