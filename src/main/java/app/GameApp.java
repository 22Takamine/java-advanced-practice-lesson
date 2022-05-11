package app;

public abstract class GameApp implements App{
	public static String item = "何か";
	
	public GameApp(String item){
		this.item = item;
	}
	public GameApp() {
		
	}
	
	public abstract String play();
	
	public String start(String name){
		String mes = "";
		mes = name + "さんと" + item + "でゲームを開始します。";
		return mes;
	}

}
