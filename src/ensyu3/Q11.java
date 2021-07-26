package ensyu3;

public class Q11 {
	// １：新規作成の処理をするメソッド
	public static String[] createAccount(){
		String[] account = new String[2];
		System.out.println("IDを入力して下さい");
		String id = new java.util.Scanner(System.in).nextLine();
		System.out.println("PASSを入力して下さい");
		String pass = new java.util.Scanner(System.in).nextLine();
		if(id == null | pass == null){
		System.out.println("ID・PASSは１文字以上入力してください");
		//start(idpass );
		}else{
		account[0] = id;
		account[1] = pass;
		System.out.println("登録が完了しました");
		}
		return account;
	}
	// ２：ID・PASSの確認をするメソッド / startメソッドの実引数idpassと混同しないように 仮引数名をidandpassとしました。
	public static void displayAccount(String[] idandpass , String[] loginconfirm) {
		if(idandpass[0] == null | idandpass[1] == null){
		System.out.println("アカウントを作成してください");
		start(idandpass ,loginconfirm);
		}else{
			System.out.println("あなたのIDは" + idandpass[0] + "PASSは" +idandpass[1]);
		}
	}
	// ３：ログイン処理するメソッド
	public static String[] loginChecker(String[] idandpass, String[] loginconfirm){

		if(idandpass[0] == null){
		System.out.println("アカウントを作成してください");
		start(idandpass , loginconfirm);
		}else{
			System.out.println("ログインの処理をします");
			System.out.println("IDを入力して下さい");
			String id = new java.util.Scanner(System.in).nextLine();
			System.out.println("Passを入力してください");
			String pass = new java.util.Scanner(System.in).nextLine();
			if(idandpass[0].equals(id) & idandpass[1].equals(pass)){
				loginconfirm[0] = id;
				loginconfirm[1] = pass;
				System.out.println("ログイン完了");
			}else{
				System.out.println("入力が間違っています");
			}
		}
		return loginconfirm;
	}
	// ４：実行するメソッド
	public static void execution(String[] idandpass , String[] loginconfirm) {
		if(loginconfirm[0] == null){
			System.out.println("ログインしてください");
			}else{
			System.out.println(idandpass[0] + "さんこんにちは");
			}
	}
	// ５：ログアウトするメソッド
	public static void logout() {
		System.out.println("ログアウトしました");
	}
	// 処理をするメソッド
	public static void start(String[] acount , String[] loginconfirm){
		System.out.println("----------------------------------------------");
		System.out.println("どの処理をしますか？");
		System.out.println("1:新規作成  2:ID・PASS確認   3:ログイン  4:実行  5:ログアウト  6:終了");
		int selectNum = new java.util.Scanner(System.in).nextInt();
		switch(selectNum){
		case 1:
			acount = createAccount(); //アカウントを作成した時点で、変数idpassにIDが入ります。
			start(acount,loginconfirm); //そのidpassを使用して、startメソッドを呼び出します。
			break;
		case 2:
			displayAccount(acount , loginconfirm); // アカウントを作成していない場合、メインメソッドで初期化したidpass[null][null]を引数にとります。
			start(acount,loginconfirm); // アカウントを作成している場合は、createAccountメソッドの戻り値が、idpass[xx][yy]として与えられます。
			break;
		case 3:
			loginconfirm = loginChecker(acount ,loginconfirm);
			start(acount,loginconfirm);
			break;
		case 4 :
			execution(acount , loginconfirm);
			start(acount , loginconfirm);
			break;
		case 5 :
			logout();
			start(acount , loginconfirm);
			break;
		case 6 :
			System.out.println("アプリケーションを終了します");
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("ログインアプリケーションを開始します");
		String[] account = new String[2];
		boolean createAccountFlag = false;
		boolean loginFlag = false;
		String[] loginconfirm = new String[2];
		start(account,loginconfirm);
	}
}
