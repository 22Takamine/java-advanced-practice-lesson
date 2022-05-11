package app;

public class CardGameApp extends GameApp{
	
	public CardGameApp(String item){
		super(item);
	}
	
	public CardGameApp() {
		
	}
	
	public String start(String name){
		String mes = "";
		String add = "";
		
		if(item.equals("トランプ")) {
			add = "ババ抜きを行います。";
		}
		if(item.equals("ゲーム")) {
			item= "何か";
		}
		mes = name + "さんと" + item + "でゲームを開始します。" + add;
		return mes;
	}

}
