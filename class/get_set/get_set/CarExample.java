package get_set;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();

		mycar.setspeed(-50);

		System.out.println("����ӵ�" + mycar.getspeed());

		mycar.setspeed(60);

		if (!mycar.isStop()) {
			mycar.setStop(true);
		}
		System.out.println("����ӵ�" + mycar.getspeed());
	}

}
