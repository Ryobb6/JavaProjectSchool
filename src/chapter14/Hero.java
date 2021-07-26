package chapter14;

public class Hero {
	String name;
	int hp;

	public boolean equals(Object o){
		if(this == o) {
			return true;
		}
		// ダウンキャストできる場合
		if(o instanceof Hero){
			Hero h =(Hero) o;
			if (this.name.equals(h.name)){
				return true;
			}
		}
		return false;
	}

}
