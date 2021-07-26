package ensyu7;
/*
 *                 【実行例】


動物でまとめた処理　

柴犬はわんわん
タマはにゃーにゃー

------------------------------------------------

植物でまとめた処理　

薔薇は赤色の花を咲かせる
ひまわりは黄色の花を咲かせる

------------------------------------------------

生き物でまとめた処理　

柴犬は無邪気に生活する
タマはのんびり生活する
薔薇は光合成して生きる
ひまわりは太陽の方角を向いて光合成をして生きる

------------------------------------------------

 */

public class Q01 {
	public static void main(String[] args) {
		System.out.println("動物でまとめた処理");
		Animal[] animals = new Animal[2];
		animals[0] = new Dog("柴犬","わんわん");
		animals[1] = new Cat("タマ","にゃーにゃー");
		for(Animal animal :animals){
			animal.bark();
		}
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("植物でまとめた処理　");
		Plant[] plants = new Plant[2];
		plants[0] = new Rose("薔薇","赤色");
		plants[1] = new Sunflower("ひまわり","黄色");
		for(Plant plant :plants){
			plant.makeFlowers();
		}
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("生き物でまとめた処理");


		// Creatureでまとめることもできます!
		Creature[] creatures = new Creature[4];
		creatures[0] = new Dog("柴犬","わんわん");
		creatures[1] = new Cat("タマ","にゃーにゃー");
		creatures[2] = new Rose("薔薇","赤色");
		creatures[3] = new Sunflower("ひまわり","黄色");
		for(Creature creature :creatures){
			creature.live();
		}

		System.out.println("");
		System.out.println("------------------------------------------------");



	}

}
