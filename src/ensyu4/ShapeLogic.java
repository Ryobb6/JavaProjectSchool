package ensyu4;

public class ShapeLogic {
	public static int square(int tall, int wide){
		int result = CalcLogic.kakeru(tall, wide);
		return result;
	}

	public static int triangle(int bottom, int tall){
		int result = CalcLogic.waru(CalcLogic.kakeru(bottom, tall), 2) ;
		return result;
	}

	public static int trapezoid(int upper, int bottom, int height){
		int result = CalcLogic.waru(CalcLogic.kakeru(CalcLogic.tasu(upper, bottom),height),2);
		return result;
	}

}
