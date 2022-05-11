package app;

public class CardGameApp extends GameApp{
	
	public CardGameApp(String item){
		super(item);
	}
	
	public CardGameApp() {
		
	}
	
	public String play() {
		String msg = "ババ抜きを行います。";
		return msg;
	}
//	public String start(String name){
//		String mes = "";
//		String add = "";
//		
//		mes = name + "さんと" + item + "でゲームを開始します。" + play();
//		return mes;
//	}

}
