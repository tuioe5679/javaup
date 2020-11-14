package methodA;

public class staticCalcuator {
	static double pi = 3.14156;//정적 필드 객체를 만들지않고 사용할수있는 필드나 메소드
	                           //(주로 공용적인 데이터를 정적필드로 선언)
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x,int y) {
		return x-y;
	}

}
