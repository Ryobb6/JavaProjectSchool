package chapter16;

import java.util.HashMap;
import java.util.Map;

public class Pra16_3 {
	public static void main(String[] args) {
		Hero hero = new Hero("斎藤");
		Hero hero2 = new Hero("鈴木");

		Map<Hero, Integer> enemyKilledNum = new HashMap<Hero, Integer>();
		enemyKilledNum.put(hero, 3);
		enemyKilledNum.put(hero2, 7);

		for (Hero key : enemyKilledNum.keySet()){
			int num = enemyKilledNum.get(key);
			System.out.println(key.getName() + "が倒した敵=" + num);
		}
	}
}
