package chapter15;

public class Pra15_2 {
	public static void main(String[] args) {
		String folder = "c:\\javadev\\readme";
		String file = "readme.txt";

		System.out.println(concatPath(folder, file));

	}
	public static String concatPath(String folder1, String file1){
		if(!folder1.endsWith("\\")){
			folder1 += "\\";
		}
		return folder1 + file1;
	}

}
