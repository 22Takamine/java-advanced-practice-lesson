package jp.co.axiz.entity;

public class Car {
	private String carName = "";
	private String bodyColor = "";
	private int maxSpeed = 0;
	private int speed = 0;
	
	public Car() {
		
	}
	
	public Car(String carName, String bodyColor, int maxSpeed) {
		setCarName(carName);
		setBodyClolr(bodyColor);
		setMaxSpeed(maxSpeed);
	}
	
	public Car(String carName, String bodyColor, int maxSpeed, int speed) {
		setCarName(carName);
		setBodyClolr(bodyColor);
		setMaxSpeed(maxSpeed);
		setSpeed(speed);
	}
	
	public String getCarName() {
		return this.carName;
	}
	
	public String getBodyColor() {
		return this.bodyColor;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void setBodyClolr(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed < 0) {
			System.out.println("最高速度にこの値(" + maxSpeed + ")をセットすることはできません");
		}else {
			this.maxSpeed = maxSpeed;
		}
	}
	
	public void setSpeed(int speed) {
		if(speed >= this.maxSpeed) {
			System.out.println("現在速度にこの値(" + maxSpeed + ")をセットすることはできません");
			this.speed = getMaxSpeed();
		}else {
			this.speed = speed;
		}
	}

}


