package jp.co.axiz.app;

public class DartsGameApp extends GameApp {

	public DartsGameApp(String item){
		super(item);
		setPlayTime(10);
	}
	
	public DartsGameApp() {
		
	}
	public String play() {
		String msg = "10回投げて合計点を競います。";
		msg += "<br>";
		return msg;
	}

}
