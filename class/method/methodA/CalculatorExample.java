package methodA;

public class CalculatorExample {//Calculator 실행 클래스
	public static void main(String []args) {
		Calculator myCalc = new Calculator();
		myCalc.poweron();
		
		int result1 = myCalc.plus(5,6);//Calculator의 plus메소드 호출후 리턴값 저장
		System.out.println("result"+result1);
		
		byte x =10;
		byte y =4;
		double result2 =myCalc.divide(x, y);//Calculator의 divide메소드 호출 
		System.out.println("divide"+result2);//divide 메소드 리턴값 출력
		
		myCalc.poweroff();
	}

}
