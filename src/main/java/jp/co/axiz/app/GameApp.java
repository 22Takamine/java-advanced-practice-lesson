package jp.co.axiz.app;

public abstract class GameApp implements App{
	private String item = "";
	private int playTime = 0;
	
	public GameApp(String item){
		this.item = item;
		
	}
	
	public GameApp() {
		
	}
	
	protected abstract String play();
	
	public String start(String name){
		String mes = "";
		mes = name + "さんと" + item + "でゲームを開始します。";
		mes += play();
		return mes;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	
	

}
