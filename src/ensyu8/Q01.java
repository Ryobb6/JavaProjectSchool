package ensyu8;

public class Q01 {
	public static void main(String[] args) {
		Pokemon[] pokemon = new Pokemon[3];

		pokemon[0] = new Pokemon("ヒトカゲ",100);
		pokemon[1] = new Pokemon("ぜにがめ",50);
		pokemon[2] = new Pokemon("フシギダネ",200);

		//if(Math.max(pokemon[0].getHp(), Math.max(pokemon[1].getHp(), pokemon[2].getHp())))

		for(int i = 0; i < pokemon.length - 1; i++){
			for(int j = i + 1; j < pokemon.length;j++){
				if(pokemon[i].getHp() > pokemon[j].getHp()){
					continue;
				}else{
					Pokemon tmp = pokemon[i];
					pokemon[i] = pokemon[j];
					pokemon[j] = tmp;
				}
			}

		}

		for(Pokemon monster : pokemon){
			System.out.println(monster.getName() +"[" +monster.getHp() +"]" );


		}


	}

}
