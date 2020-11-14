package methodA;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		car.setGas(5);//Car클래스의 필드 gas를 5저장

		boolean gasState = car.isLeftGas();//Car의 isLeftGas메소드 호출후 리턴값을 gasState변수에 저장
		if (gasState) {
			System.out.println("출발합니다");
			car.run();
		}
		if (car.isLeftGas()) {//isLeftGas호출시 if문이 실행되고 false를 리턴
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {//false문이 리턴되어 if문이 실행되지 않고 else문이 실행
			System.out.println("gas를 주입하세요");
		}

	}

}
