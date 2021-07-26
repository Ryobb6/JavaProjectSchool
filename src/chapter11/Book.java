package chapter11;

public class Book extends TangibleAsset{
	String isbn;

	// コンストラクタ(重複個所はsuperで親コンストラクタを実行!)
	public Book (String name, int price, String color, String isbn){
		super(name, price, color);
		this.isbn = isbn;
	}

	// 追加メソッド
	public String getIsbn(){
		return this.isbn;
	}


}
