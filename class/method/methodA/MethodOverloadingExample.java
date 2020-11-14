package methodA;

public class MethodOverloadingExample {
	public static void main(String[]args) {
		MethodOverloading method = new MethodOverloading();
		
		double result1 = method.areaRectangle(10);
		double result2 = method.areaREctangle(10, 20);
		
		System.out.println("정삭각형 넓이="+result1);
		System.out.println("직사각형 넓이="+result2);
	}

}
