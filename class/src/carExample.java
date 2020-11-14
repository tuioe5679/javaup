
public class carExample {
	public static void main(String[] args) {

		car mycar = new car();

		System.out.println("제작회사" + mycar.company);
		System.out.println("모델" + mycar.model);
		System.out.println("색상" + mycar.color);
		System.out.println("최대속도" + mycar.maxspeed);
		System.out.println("현재속도" + mycar.speed);

		mycar.speed = 60;
		System.out.println("수정된 속도" + mycar.speed);
	}

}
