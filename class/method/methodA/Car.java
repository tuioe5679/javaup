package methodA;

public class Car {
	int gas;

	void setGas(int gas) {//매개변수  gas를받아 필드gas를 매개값으로 변경
		this.gas = gas;
	}

	boolean isLeftGas() {//조건문으로 boolean타입 리턴하는 메소드
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		} else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}

	void run() {//달리는 메소드
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;//강제종료
			}
		}
	}

}
