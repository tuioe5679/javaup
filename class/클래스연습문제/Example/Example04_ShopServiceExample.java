package Example;

public class Example04_ShopServiceExample {
	public static void main(String[] args) {
		
		Example04_ShopService Shop = Example04_ShopService.getinstance();
		Example04_ShopService Shop2 = Example04_ShopService.getinstance();

		if (Shop == Shop2) {
			System.out.println("서로 같은 객체 참조");
		} else {
			System.out.println("서로 다른 객체 참조");
		}

	}
}
