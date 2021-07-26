package chapter16;

import java.util.ArrayList;

public class Code16_1 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for(int i : points){
			System.out.println(i);
		}

		// オートボクシング(基本データ型 → ラッパークラス型)
		Integer i1 = Integer.valueOf(16);

		// オートアンボクシング(ラッパークラス型 → 基本データ型)
		int i2 = i1.intValue();

	}

}
