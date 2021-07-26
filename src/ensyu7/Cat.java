package ensyu7;

public class Cat extends Animal{

	public Cat(String name, String voice){
		super(name, voice);
	}

	public void live(){
		System.out.println(this.name + "はのんびり生活する");
	}

	public void bark(){
		System.out.println(this.name + "は" + this.voice);
	}

}
