package methodA;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		car.setGas(5);//CarŬ������ �ʵ� gas�� 5����

		boolean gasState = car.isLeftGas();//Car�� isLeftGas�޼ҵ� ȣ���� ���ϰ��� gasState������ ����
		if (gasState) {
			System.out.println("����մϴ�");
			car.run();
		}
		if (car.isLeftGas()) {//isLeftGasȣ��� if���� ����ǰ� false�� ����
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		} else {//false���� ���ϵǾ� if���� ������� �ʰ� else���� ����
			System.out.println("gas�� �����ϼ���");
		}

	}

}
