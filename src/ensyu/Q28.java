package ensyu;

public class Q28 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" 【2021年度カレンダー】");
		int countMonth = 0;
		for(int i = 0; i < 12; i++){
			countMonth++;
			System.out.println("＝＝＝＝＝＝＝＝＝＝  " + countMonth + "月  ＝＝＝＝＝＝＝＝＝＝");
			System.out.println("日"+"     "+"月"+"     "+"火"+"     "+"水"+"     "+"木"+"     "+"金"+"     "+"土");
			//int countWeek = 0;
				//for(int j = 0; j < 5; j++){
					int countDay = 0;
					for(int k = 0; k < 31; k++){
						countDay++;
						if(countDay < 10){
						System.out.print(countDay+"        " );
						}else{
							System.out.print(countDay+"     ");
						}
						if(countDay%7 == 2){
						System.out.println("");
						}
					//}
					//System.out.println("");
				}
			System.out.println("");
		}
	}
}
