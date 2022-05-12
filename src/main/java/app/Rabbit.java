package app;

public class Rabbit extends Animal{
	
	public Rabbit(String name,int age) {
		super(name,age);
	}
	
	public Rabbit() {
		
	}
	@Override
	public String introduceAge() {
		String msg = "";
		msg = "種類はウサギです。";
		
		if(age == 0) {
			msg += "0～10代中盤";
			
		}else if(age == 1) {
			msg += "10代中盤";
			
		}else if(age == 2) {	
			msg += "20代";
			
		}else if(age == 3) {	
			msg += "30代";
			
		}else if(age == 4) {	
			msg += "40代";
			
		}else if(age == 5) {	
			msg += "50代";
			
		}else{	
			msg += "60歳以上";
			
		}
		
		msg += "です。";
	
		return msg;
	}
	@Override
	public String getFilePath() {
		String msg = "C:\\work\\rabbit.txt";
		
		return msg;
	}
	
}