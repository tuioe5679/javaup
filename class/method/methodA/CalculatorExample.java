package methodA;

public class CalculatorExample {//Calculator ���� Ŭ����
	public static void main(String []args) {
		Calculator myCalc = new Calculator();
		myCalc.poweron();
		
		int result1 = myCalc.plus(5,6);//Calculator�� plus�޼ҵ� ȣ���� ���ϰ� ����
		System.out.println("result"+result1);
		
		byte x =10;
		byte y =4;
		double result2 =myCalc.divide(x, y);//Calculator�� divide�޼ҵ� ȣ�� 
		System.out.println("divide"+result2);//divide �޼ҵ� ���ϰ� ���
		
		myCalc.poweroff();
	}

}
