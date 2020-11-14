package methodA;

public class Calculator {
	
	void poweron() {//전원을 키는 메소드
		System.out.println("전원을 킵니다");
	}
	int plus(int x, int y) {//매개변수를 받아 더해주는 메소드
		int result = x+y;
		return result;
	}
	
	double divide (int x, int y) {//매개변수를 받아 나눠주는 메소드
		double result = (double)x /(double)y;
		return result;
	}
	
	void poweroff() {//전원을 끄는 메소드
		System.out.println("전원을 끕니다");
	}

}
