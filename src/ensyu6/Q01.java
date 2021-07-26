package ensyu6;

public class Q01 {
	public static void main(String[] args) {
		System.out.println("本のページ数を入力してください");
		int ttlPage = inputPage();
		System.out.println("本の価格を入力してください");
		int value = inputValue();
		System.out.println("ノートのページ数を入力してください");
		int notePage = inputPage();
		System.out.println("ノートの価格を入力してください");
		int noteValue = inputValue();

		Book book = new Book(ttlPage, value);
		NoteBook notebook = new NoteBook(notePage, noteValue);

		int m = 0;
		while(m!=4){
			hedder();
			m = new java.util.Scanner(System.in).nextInt();
				switch(m){
				case 1 :
					book.viewInfo();
					break;
				case 2 :
					notebook.viewInfo();
					break;
				case 3 :
					System.out.println("書き込む内容を書いて下さい");
					String sntc = new java.util.Scanner(System.in).nextLine();
					notebook.addSntc(sntc);
					System.out.println("書き込みました");
					break;
				}
		}
		System.out.println("アプリケーションを終了します。");
}

	public static void hedder(){
		System.out.println("----------------------------------------------------");
		System.out.println("1.本の情報表示   /  2.ノートの情報表示   /  3.ノートに追加書込   /  4.終了");
	}

	public static int inputPage(){
		int ttlPage = new java.util.Scanner(System.in).nextInt();
		return ttlPage;
	}

	public static int inputValue(){
		int value = new java.util.Scanner(System.in).nextInt();
		return value;
	}


}
