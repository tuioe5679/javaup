package Korean;

public class KoreanExample {
	public static void main(String []args) {
		Korean korean1 = new Korean("������","020408-3481618");
		
		System.out.println("����="+korean1.nation);
		System.out.println("�̸�="+korean1.name);
		System.out.println("�ֹε�Ϲ�ȣ="+korean1.ssn);
		
        Korean korean2 = new Korean("������","020408-3481613");
		
		System.out.println("����="+korean2.nation);
		System.out.println("�̸�="+korean2.name);
		System.out.println("�ֹε�Ϲ�ȣ="+korean2.ssn);
	}

}
