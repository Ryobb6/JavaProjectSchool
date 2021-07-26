package ensyu7;

public abstract class Animal implements Creature{
	String name;
	String voice;

	public Animal(String name, String voice){
		this.name = name;
		this.voice = voice;
	}

	//public abstract void live();
	public void bark(){

	}

}
