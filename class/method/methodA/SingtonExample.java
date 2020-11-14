package methodA;

public class SingtonExample {
	public static void main(String[] args) {
		Sington sing = Sington.getinstance();
		Sington sing2 = Sington.getinstance();
		if (sing == sing2) {
			System.out.println("같은 객체를 참조합니다");
		} else
			System.out.println("다른 객체를 참조합니다");
	}

}
