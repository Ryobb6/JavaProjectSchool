package ensyu8special;

public class RspLogic {
	private boolean isJudge;


	public void judge(String myHand, String pcHand, Rsp rsp){
		if(myHand.equals("グー") && pcHand.equals("チョキ") || myHand.equals("チョキ") && pcHand.equals("パー") ||
				myHand.equals("パー") && pcHand.equals("グー")){
			rsp.dispWin();
			rsp.setWinCount(1);
		}else if(myHand.equals("チョキ") && pcHand.equals("グー") || myHand.equals("パー") && pcHand.equals("チョキ") ||
				myHand.equals("グー") && pcHand.equals("パー")){
			rsp.dispLose();
			rsp.setLoseCount(1);
		}else if(myHand.equals(pcHand)){
			rsp.dispDraw();
		}
	}

}
