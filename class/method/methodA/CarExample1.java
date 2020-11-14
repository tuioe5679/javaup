package methodA;

public class CarExample1 {
	public static void main(String []args) {
		Car1 car = new Car1();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("현재속도:"+speed+"km/h)");
	}

}
