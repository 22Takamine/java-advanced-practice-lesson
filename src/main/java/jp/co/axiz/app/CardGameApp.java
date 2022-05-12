package jp.co.axiz.app;

public class CardGameApp extends GameApp{

	public CardGameApp(String item){
		super(item);
		setPlayTime(5);

	}
	
	public CardGameApp() {
		
	}
	
	protected String play() {
		String msg = "ババ抜きを行います。" ;
		msg += "<br>";
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
