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
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+this.speed+"km/h)");
		}
	}
	

}
