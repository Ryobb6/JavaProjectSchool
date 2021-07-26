package ensyu13;

import java.util.regex.PatternSyntaxException;

public class RegexTool {
		// 正規表現が素材にマッチしているか判定する
		public void execute(String source, String regex){
			boolean isMatch = false;
			try{
				boolean isError = source == null || regex == null || source.length() == 0 || regex.length() == 0;
				if(isError){
					throw new PatternSyntaxException("正規表現、マッチ用文字列は両方とも指定してください。", regex, -1);
				}
				isMatch = source.matches(regex);
			}catch(PatternSyntaxException pse){
				StringBuilder sb = new StringBuilder();
				sb.append("==============================\n");
				sb.append("■■■■■■RegexToolでエラー発生！■■■■■■\n");
				sb.append("【エラーメッセージ】\n");
				sb.append(pse.getDescription());
				sb.append("\n【マッチ用文字列】\n");
				sb.append(source);
				sb.append("\n【正規表現パターン】\n");
				sb.append(pse.getPattern());
				sb.append("\n==============================");
				System.out.println(sb.toString());
			}

			System.out.println(isMatch ? source + "   →   OK" : source + "   →   NG");
		}


}
