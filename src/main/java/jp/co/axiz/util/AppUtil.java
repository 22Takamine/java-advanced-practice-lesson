package jp.co.axiz.util;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

public class AppUtil {
	public AppUtil() {
		
	}
	
	public static boolean isGameApp(App app) {
		boolean judg = false;
		
		if(app instanceof GameApp) {
			judg = true;
		}
		
		return judg;
	}
	
	public static boolean isCardGameApp(App app) {
		boolean judg = false;
		
		if(app instanceof CardGameApp) {
			judg = true;
		}
		
		return judg;
	}
	
	public static boolean isDartsGameApp(App app) {
		boolean judg = false;
		
		if(app instanceof DartsGameApp) {
			judg = true;
		}
		
		return judg;
	}
	
	public static boolean isClockApp(App app) {
		boolean judg = false;
		
		if(app instanceof ClockApp) {
			judg = true;
		}
		
		return judg;
	}
	
	public static String getAppName(App app) {
		String msg = "";
		
		if(isGameApp(app)) {
			msg += "ゲーム：";
			
			if(isCardGameApp(app)) {
				msg += "カード";
				
			}else if(isDartsGameApp(app)) {
				msg += "ダーツ";
				
			}else {
				msg += "不明";
			}
			
		}else if(isClockApp(app)) {
			msg += "時計";
			
		}else {
			msg += "オブジェクトがわかりません";
			
		}
		
		return msg;
	}
	

}
