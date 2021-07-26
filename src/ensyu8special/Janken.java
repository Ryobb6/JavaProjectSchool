package ensyu8special;
import java.util.Random;
import java.util.Scanner;

public class Janken {
	public static void main(String[] args) {
		Rsp rsp = new Rsp();
		rsp.firstHedder();
		RspLogic rspLgc = new RspLogic();
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		// 出す手のインデックス管理
		String[] hand = new String[] {"グー" , "チョキ" , "パー" };
		int m = 0;
		int n = 0;
		while(m != 4){
			rsp.printHedder();
			// 自分の手
			m = sc.nextInt();
			if(m == 4){
				break;
			}
			//セットする
			rsp.setMyHand(hand[m-1]);
			// 相手の手
			n = rm.nextInt(3);
			rsp.setPcHand(hand[n]);
			rsp.myHand();
			rsp.pcHand();
			rspLgc.judge(rsp.getMyHand(), rsp.getPcHand(), rsp);
			rsp.dispWinLose();
		}
		sc.close();
		rsp.footer();
	}

}
