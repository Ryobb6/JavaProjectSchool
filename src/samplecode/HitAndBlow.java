package samplecode;

/*
ヒントを元に4桁の数字を当てましょう。いわゆるHit&Blowです。
短いターンで推理して高得点を目指せ！

【ルール】
・答えとなる4桁の数字（数はバラバラ）を当てればクリア
・桁数と数字があっている個数がHit
・桁数はあっていないが、数字があっている個数がBlow
（例：入力として"1234"、答えが「1354」の時）
　1桁目：入力の1が桁数、数字共に答えと同じなのでHit
　2桁目：入力の2は答えに含まれない、残念！
　3桁目：入力の3は、答えの2桁目、Blow
　4桁目：入力の4が桁数、数字共に答えと同じなのでHit
　よって、Hitが2、Blowが1、となります。
 */

/**
 * 【特別問題Hit&Blow】
 * スコア算出方法は1回目正解で100点、以降1回間違えるごとに-10する。 最低値は0点。
 * 教科書第Ⅰ部の内容だけでコーディングしている（はず）。第Ⅱ部の内容を反映すると、もっともっとスマートになる。
 * ・・・ちなみに、「/**」で始まるコメント部は「javadoc」と呼ばれるコメントで、特別な意味を持つ。
 * 試しにHitAndBlowクラスのクラス名にカーソルを合わせるとこの説明文が出るハズ。
 * このjavadocを使ってAPIリファレンスを自動生成することも可能。
 * メソッドにjavadocを付けると引数の詳細な説明、戻り値の説明を付与できるので非常に便利。
 * 「@author」等のアットマークが付いているところも特殊な意味を持つ。「@author」であれば作成者を表す。
 * 「@～」の形式をアノテーションと呼ぶ。
 *
 * @author tmk
 * @version 1.0
 */
public class HitAndBlow {

	public static void main(String[] args) {
		/*
		 * ==================================================
		 *  定数
		 * ==================================================
		 * ↑こんな感じで定数や変数などに帯をつけるとプログラムが見やすくなる。
		 * プロもこの手法を結構使う。
		 */
		// X桁目がHit or Blowしたかどうかの区分
		// int型戻り値に意味を付与した値（すなわち区分）として扱う
		// 5章までの知識なので区分を使うが、第二部（７章～）を学ぶとよりスマートな書き方ができる
		//
		// 0: はずれ
		// 1: Hit
		// 2: Blow
		// メソッド内だけでなく、クラス全体で定数を定義できる方法は教科書第２部で学ぶ
		final int KBN_LOSE = 0;
		final int KBN_HIT = 1;
		final int KBN_BLOW = 2;

		// 桁数
		// 4固定を想定。4以外でもこの定数値を変えれば対応可能
		// 今回は定数で定義しているが、ユーザーに桁数を入力させるとおもしろいかもしれない
		final int NUMBER_OF_DIGIT = 4;

		// スコア初期値
		final int INIT_SCORE = 100;
		// スコア減点
		final int DEC_SCORE = 10;

		/*
		 * ==================================================
		 *  変数
		 * ==================================================
		 */
		// 桁の値を保持するための配列
		// ユーザー入力用
		// 1桁目 → index0, 2桁目 → index1・・・
		int[] digits = new int[NUMBER_OF_DIGIT];

		// 桁の値を保持するための配列(乱数用)
		int[] randomDigits;

		// Hit数
		int numberOfHits = 0;
		// Blow数
		int numberOfBlows = 0;

		// 繰り返しフラグ
		boolean isDone = false;

		// スコア
		int score = INIT_SCORE;

		/*
		 * ==================================================
		 *  メイン処理
		 * ==================================================
		 */
		// 乱数を発生させ、各桁の値を保持
		randomDigits = getRandomDigits(NUMBER_OF_DIGIT);

		// 正解までループ
		while (!isDone) {
			// 入力内容が不正値でない場合、桁の値を保持
			if (inputNumberToDigits(digits, NUMBER_OF_DIGIT)) {
				// 各桁の集計
				for (int i = 0; i < NUMBER_OF_DIGIT; i++) {
					switch (hitAndBlow(randomDigits, digits, i)) {
						case KBN_HIT:
							numberOfHits++;
							break;
						case KBN_BLOW:
							numberOfBlows++;
							break;
						case KBN_LOSE:
							// nop
					}
				}

				// 結果を出力
				System.out.println("よって、Hitが" + numberOfHits + "、Blowが" + numberOfBlows + "、となります。");

				// HIT数が桁数と同じであればクリア
				if (numberOfHits == NUMBER_OF_DIGIT) {
					System.out.println("全てHitでクリア！");
					System.out.println("スコア：" + (score >= 0 ? score : 0));

					isDone = true;
				} else {
					// カウントリセット
					numberOfHits = 0;
					numberOfBlows = 0;

					// スコア減少
					score -= DEC_SCORE;
				}
			} else {
				// 不正値が入力された場合
				System.out.println("不正な値が入力されましたので、判定処理をスキップします。");
			}
		}
	}

	/**
	 * ヘッダ出力（桁指定）
	 *
	 * @param digits
	 *            桁数
	 */
	public static void printHeader(int digits) {
		System.out.print(digits + "桁の数値を入力してください>");
	}

	/**
	 * 入力値を桁別に配列変数へ格納
	 *
	 * @param digits
	 *            桁の値を保持するための配列
	 * @param numberOfDigits
	 *            桁数
	 * @return 入力値が不正値では無いかどうか(true: 正、false: 不正)
	 */
	public static boolean inputNumberToDigits(int[] digits, int numberOfDigits) {
		// 入力値が不正値では無いかどうか(true: 正、false: 不正)
		boolean isValid = false;

		// ヘッダ出力（桁指定）
		printHeader(numberOfDigits);

		// ユーザー入力値を変数へ代入(文字列)
		String inputNumberStr = new java.util.Scanner(System.in).nextLine();

		// 入力値の不正値チェック
		if (!isValidInputNumber(inputNumberStr, numberOfDigits)) {
			// 不正値の場合は以降の処理を行わない
			return isValid;
		} else {
			// 正常な値の場合は処理を続行する
			isValid = true;

			// 入力値（文字列）を数値に変換
			int inputNumber = Integer.parseInt(inputNumberStr);

			// 一時的な数値
			// 初期値は入力値
			int tmpNumber = inputNumber;

			// 各桁の数値を決定
			for (int i = 0; i < numberOfDigits; i++) {
				// 各桁の係数
				// 係数が1000（1 * 10 * 10 * 10）であれば入力値を1000で割った値が、その桁に入る
				int coefficient = 1;
				for (int j = 0; j < numberOfDigits - i - 1; j++) {
					coefficient *= 10;
				}

				// 桁の数値を配列の要素へ代入
				digits[i] = tmpNumber / coefficient;

				// 一時的な数値からその桁の値×係数ぶんだけ引く
				// 例) 6254 - (6 * 1000) → 254
				tmpNumber -= digits[i] * coefficient;
			}
		}

		return isValid;
	}

	/**
	 * 入力値が不正値かどうかを判別する
	 *
	 * @param inputNumberStr
	 *            入力値(文字列)
	 * @param numberOfDigits
	 *            桁数
	 * @return 入力値が不正値では無いかどうか(true: 正、false: 不正)
	 */
	public static boolean isValidInputNumber(String inputNumberStr, int numberOfDigits) {
		// 入力値の桁数が規定桁数と異なる場合
		if (inputNumberStr.length() != numberOfDigits) {
			return false;
		}

		// 入力値を数値に変換
		int inputNumber = Integer.parseInt(inputNumberStr);

		// 入力値の値が0未満の場合
		if (inputNumber < 0) {
			return false;
		}

		// チェックをすべて掻い潜ったときだけtrueが戻る
		return true;
	}

	/**
	 * 乱数を得る
	 *
	 * @param numberOfDigits
	 *            桁数
	 * @return 乱数（各桁を配列の要素へ代入したもの）
	 */
	public static int[] getRandomDigits(int numberOfDigits) {
		// 桁の値を保持するための配列(乱数用)
		int[] randomDigit = new int[numberOfDigits];

		// 配列の初期化
		for (int i = 0; i < numberOfDigits; i++) {
			// 同じ値が他の桁にあるかどうか
			boolean isSameNum;

			// 他の桁と重複しないように乱数を各桁に発生させる
			do {
				isSameNum = false;
				randomDigit[i] = new java.util.Random().nextInt(10);
				for (int j = 0; j < i; j++) {
					if (randomDigit[i] == randomDigit[j]) {
						isSameNum = true;
					}
				}
			} while (isSameNum);
		}

		return randomDigit;
	}

	/**
	 * Hit & Blow
	 *
	 * @param randomDigits
	 *            各桁が格納されている配列（乱数用）
	 * @param digits
	 *            各桁が格納されている配列（入力値用）
	 * @param index
	 *            対象となる桁
	 * @return Hit & Blowの結果区分。0: はずれ、1: Hit、2: Blow
	 */
	public static int hitAndBlow(int[] randomDigits, int[] digits, int index) {
		// 0: はずれ
		// 1: Hit
		// 2: Blow
		// メソッド内だけでなく、クラス全体で定数を定義できる方法は教科書第２部で学ぶ
		final int KBN_LOSE = 0;
		final int KBN_HIT = 1;
		final int KBN_BLOW = 2;

		// 指定桁の値が同じであればHit
		if (randomDigits[index] == digits[index]) {
			System.out.println("　" + (index + 1) + "桁目：入力の" + digits[index] + "が桁数、数字共に答えと同じなのでHit");

			return KBN_HIT;
		} else {
			// Blow有無用変数
			boolean isBlow = false;

			// Blow時の桁用変数
			int blowIndex = 0;

			// 指定桁以外でも桁違いで同じ数値があればBlow
			for (int i = 0; i < digits.length; i++) {
				if (i != index && digits[index] == randomDigits[i]) {
					isBlow = true;
					blowIndex = i;
					break;
				}
			}

			// 結果出力
			if (isBlow) {
				System.out.println("　" + (index + 1) + "桁目：入力の" + digits[index] + "は、答えの" + (blowIndex + 1) + "桁目、Blow");

				return KBN_BLOW;
			} else {
				System.out.println("　" + (index + 1) + "桁目：入力の" + digits[index] + "は答えに含まれない、残念！");

				return KBN_LOSE;
			}
		}
	}
}
