package chapter11;

public interface Thing {
	// インターフェースにおいて、public abstractはそれぞれ省略可能
	// privateにするときもある??
	// 重要なのは、メソッドの固有情報である、戻り値の型名と引数の型と個数
	public double getWeight();
	abstract void setWeight(double weight);
}
