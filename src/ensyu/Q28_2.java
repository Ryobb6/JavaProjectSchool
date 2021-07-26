package ensyu;

public class Q28_2 {
	public static void main(String[] args) {
		System.out.println(" 【2021年度カレンダー】");
		int countMonth = 0;
		for(int i = 0; i < 12; i++){
			countMonth++;
			int countDay = 0;
			for(int j = 1; j < 32; j++){
				countDay++;
				if( j < 10){
				System.out.print("\t\t" + j);
				}else{
				System.out.print("\t" +j);
				}
				if(countDay%7 == 0){
					System.out.println("");
				}
				if( j == 28 && countMonth == 2 ){
					break;
				}
				else if( j == 30 && countMonth == 4 ){
					break;
				}
				else if ( j == 30 && countMonth == 6 ){
					break;
				}
				else if( j == 30 && countMonth == 9 ){
					break;
				}
				else if( j == 30 && countMonth == 11 ){
					break;
				}
			}
			System.out.println("");
		}
	}
}

