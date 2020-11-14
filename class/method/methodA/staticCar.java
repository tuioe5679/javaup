package methodA;

public class staticCar {//static은 객체생성없이 Class에 고정된 맴버
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다");
	}
	public static void main(String[]args) {//static메소드와 정적 블록에서 인스턴스 맴버를 사용하려면 객체를 생성해야한다
		staticCar car = new staticCar();
		car.speed =60;
		car.run();
	    
	}

}
