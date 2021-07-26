package ensyu7;

public class Rose extends Plant {

	public  Rose(String name, String color){
		super(name, color);

	}

	public void live(){
		System.out.println(this.name + "は光合成して生きる");
	}

	public void makeFlowers(){
		System.out.println(this.name + "は" + this.color + "の花を咲かせる");

	}

}
