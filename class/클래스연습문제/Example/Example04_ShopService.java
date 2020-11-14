package Example;

public class Example04_ShopService {//ΩÃ±€≈Ê ∞¥√º
	private static Example04_ShopService signlton = new Example04_ShopService();

	private Example04_ShopService() {

	}

	static Example04_ShopService getinstance() {
		return signlton;
	}

}
