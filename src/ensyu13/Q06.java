package ensyu13;

public class Q06 {
	public static void main(String[] args) {
		RegexTool rx = new RegexTool();
		String[] str  = new String[10];
		str[0] = "00/00";
		str[1] = "1/1";
		str[2] = "1/01";
		str[3] = "01/01";
		str[4] = "01/00";
		str[5] = "02/31";
		str[6] = "02/32";
		str[7] = "12/aa";
		str[8] = "12/31";
		str[9] = "13/01";

		//
		for(int i = 0; i < str.length; i++){
			/*if(str[i].matches("([^0[1-9]$)(^1[1-2]$)]/[(0[1-9])(1[0-9])(2[0-9])(3[0-2])]")){
				System.out.println("OK");
			}*/

			rx.execute(str[i], "((0[1-9])|(1[0-2]))/((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))");
		}

	}

}
