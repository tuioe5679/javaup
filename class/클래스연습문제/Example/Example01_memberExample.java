package Example;

public class Example01_memberExample {
	public static void main(String[] args) {
		Example01_membera mem = new Example01_membera("������", "qodlgks123", "dlgks123", 19);
		Example01_membera mem2 = new Example01_membera("������", "qowjdgks123", "wjdgks123", 20);

		System.out.println("�̸�:" + mem.name);
		System.out.println("���̵�:" + mem.id);
		System.out.println("��й�ȣ:" + mem.password);
		System.out.println("����:" + mem.ago);
		System.out.println();

		System.out.println("�̸�:" + mem2.name);
		System.out.println("���̵�:" + mem2.id);
		System.out.println("��й�ȣ:" + mem2.password);
		System.out.println("����:" + mem2.ago);

	}

}
