package app;

public class Cat extends Animal{
	
	public Cat(String name,int age) {
		super(name,age);
		
	}
	public Cat() {
		
	}

	@Override
	public String introduceAge() {
		String msg = "";
		msg = "種類はネコです。";
		
		if(age == 0) {
			msg += "0～10代中盤";
			
		}else if(age == 1) {
			msg += "10代中盤";
			
		}else if(age <= 3) {	//2から3歳
			msg += "20代";
			
		}else if(age <= 5) {	//4から5歳
			msg += "30代";
			
		}else if(age <= 8) {	//6から8歳
			msg += "40代";
			
		}else if(age <= 10) {	//9から10歳
			msg += "50代";
			
		}else{	
			msg += "60歳以上";
			
		}
		
		msg += "です。";
	
		return msg;
	}

	@Override
	public String getFilePath() {
		String msg = "C:\\work\\cat.txt";
		
		return msg;
	}
	
}