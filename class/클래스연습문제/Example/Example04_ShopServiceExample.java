package Example;

public class Example04_ShopServiceExample {
	public static void main(String[] args) {
		
		Example04_ShopService Shop = Example04_ShopService.getinstance();
		Example04_ShopService Shop2 = Example04_ShopService.getinstance();

		if (Shop == Shop2) {
			System.out.println("���� ���� ��ü ����");
		} else {
			System.out.println("���� �ٸ� ��ü ����");
		}

	}
}
