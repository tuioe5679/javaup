package Example;

public class Example02_MemberServiceExample {
	public static void main(String[] args) {
		Example02_MemberService mem = new Example02_MemberService();

		boolean result = mem.login("hong", "12345");
		if (result) {
			System.out.println("�α���");
			mem.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
		}
	}

}
