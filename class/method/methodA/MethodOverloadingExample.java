package methodA;

public class MethodOverloadingExample {
	public static void main(String[]args) {
		MethodOverloading method = new MethodOverloading();
		
		double result1 = method.areaRectangle(10);
		double result2 = method.areaREctangle(10, 20);
		
		System.out.println("���谢�� ����="+result1);
		System.out.println("���簢�� ����="+result2);
	}

}
