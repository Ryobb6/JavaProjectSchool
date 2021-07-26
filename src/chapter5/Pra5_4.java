package chapter5;

public class Pra5_4 {

	public static double calcTriangleArea(double bottom , double height){
		double ans = bottom * height/2;
		return ans;
	}

	public static double calcCircleArea(double radius){
		double ans = radius * radius *3.14;
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("底辺と高さを入力してください");
		System.out.println("底辺:");
		double bottom = new java.util.Scanner(System.in).nextDouble();
		System.out.println("高さ:");
		double height = new java.util.Scanner(System.in).nextDouble();
		System.out.println("三角形の面積は" + calcTriangleArea(bottom , height));
		System.out.println("円の半径を入力してください");
		System.out.println("半径:");
		double radius = new java.util.Scanner(System.in).nextDouble();
		System.out.println("円の面積は" + calcCircleArea(radius));
	}

}
