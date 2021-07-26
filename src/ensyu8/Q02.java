package ensyu8;

public class Q02 {
	public static void main(String[] args) {
		Person[] person = new Person[100];
		String[] name = new String [] {"A", "B", "C", "D", "E", "F"};

		// ランダムにPersonを用意
		for(int i = 0; i < person.length; i++){
			int m = new java.util.Random().nextInt(6);
			int n = new java.util.Random().nextInt(1000);
			person[i] = new Person(name[m], n);
		}

		// 点数で高い順に並べ替え
		for(int i = 0; i < person.length - 1; i++){
			for(int j = i + 1; j < person.length;j++){
				if(person[i].getScore() > person[j].getScore()){
					continue;
				}else{
					Person tmp = person[i];
					person[i] = person[j];
					person[j] = tmp;
				}
			}
		}

		for(int i = 0; i < 10; i++){
			System.out.println((i+1) + "・・・" + person[i].getName() +"[" + person[i].getScore() +"]");
		}

	}

}

