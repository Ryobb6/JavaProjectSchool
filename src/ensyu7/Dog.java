package ensyu7;

public class Dog extends Animal {

	public Dog(String name, String voice){
		super(name, voice);

	}
	public void live(){
		System.out.println(this.name + "は無邪気に生活する");
	}

	public void bark(){
		System.out.println(this.name + "は" + this.voice);
	}

}
