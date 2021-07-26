package ensyu;

public class Q28_1 {
	public static void main(String[] args) {
		System.out.println(" 【2021年度カレンダー】");
		int countMonth = 0;
		for(int i = 0; i < 12; i++){
			countMonth++;
			System.out.println("＝＝＝＝＝＝＝＝＝＝  " + countMonth + "月  ＝＝＝＝＝＝＝＝＝＝");
			System.out.println("日"+"\t\t\t"+"月"+"\t\t\t"+"火"+"\t\t\t"+"水"+"\t\t\t "+"木"+"\t\t\t"+"金"+"\t\t\t"+"土");
			//int countWeek = 0;
				//for(int j = 0; j < 5; j++){
					int countDay = 0;
					for(int k = 1; k < 32; k++){
						int n = countDay%7 +1;
						switch(n){
						case 1:
							System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + k);
							break;
						case 2:
							System.out.println("\t\t\t\t"+k);
							break;
						case 3:
							System.out.print(k);
							break;
						case 4:
							System.out.print("\t\t\t\t" + k);
							break;
						case 5:
							System.out.print("\t\t\t\t" + k);
							break;
						case 6:
							System.out.print("\t\t\t\t" + k);
							break;
						case 7:
							System.out.print("\t\t\t\t" + k);
							break;
						}
						countDay++;
				}
			System.out.println("");
		}
	}
}