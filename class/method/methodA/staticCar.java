package methodA;

public class staticCar {//static�� ��ü�������� Class�� ������ �ɹ�
	int speed;
	
	void run() {
		System.out.println(speed+"���� �޸��ϴ�");
	}
	public static void main(String[]args) {//static�޼ҵ�� ���� ��Ͽ��� �ν��Ͻ� �ɹ��� ����Ϸ��� ��ü�� �����ؾ��Ѵ�
		staticCar car = new staticCar();
		car.speed =60;
		car.run();
	    
	}

}
