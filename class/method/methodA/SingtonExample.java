package methodA;

public class SingtonExample {
	public static void main(String[] args) {
		Sington sing = Sington.getinstance();
		Sington sing2 = Sington.getinstance();
		if (sing == sing2) {
			System.out.println("���� ��ü�� �����մϴ�");
		} else
			System.out.println("�ٸ� ��ü�� �����մϴ�");
	}

}
