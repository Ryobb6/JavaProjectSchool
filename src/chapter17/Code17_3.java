package chapter17;

import java.io.FileWriter;
import java.io.IOException;

public class Code17_3 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("date.txt");
			fw.write("Hello!");
		}catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}finally{
			if (fw != null){
				try {
					System.out.println("fileを閉じます");
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}
	}
}
