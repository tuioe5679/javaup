package methodA;

public class instanceCar {
	String model;
	int speed;
	
	instanceCar(String model){
		this.model = model;
	}
	void setspeed(int speed){
		this.speed = speed;
	}
	void run() {
		for(int i = 0;i<=50;i+=10) {
			this.setspeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}
	

}
