package chapter12;

public class Pra12_3 {
	public static void main(String[] args) {

		Y[] abArray = new Y[2];
		abArray[0] = new A();
		abArray[1] = new B();

		for(Y yClassVar : abArray){
			yClassVar.b();
		}


	}

}
