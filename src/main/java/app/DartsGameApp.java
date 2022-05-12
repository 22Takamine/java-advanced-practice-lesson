package app;

public class DartsGameApp extends GameApp {
	
	public DartsGameApp(String item){
		super(item);
	}
	
	public DartsGameApp() {
		
	}
	public String play() {
		String msg = "10回投げて合計点を競います。";
		return msg;
	}

}
