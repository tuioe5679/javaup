package Example;

public class Example01_memberExample {
	public static void main(String[] args) {
		Example01_membera mem = new Example01_membera("배이한", "qodlgks123", "dlgks123", 19);
		Example01_membera mem2 = new Example01_membera("배정한", "qowjdgks123", "wjdgks123", 20);

		System.out.println("이름:" + mem.name);
		System.out.println("아이디:" + mem.id);
		System.out.println("비밀번호:" + mem.password);
		System.out.println("나이:" + mem.ago);
		System.out.println();

		System.out.println("이름:" + mem2.name);
		System.out.println("아이디:" + mem2.id);
		System.out.println("비밀번호:" + mem2.password);
		System.out.println("나이:" + mem2.ago);

	}

}
