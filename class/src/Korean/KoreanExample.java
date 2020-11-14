package Korean;

public class KoreanExample {
	public static void main(String []args) {
		Korean korean1 = new Korean("배이한","020408-3481618");
		
		System.out.println("나라="+korean1.nation);
		System.out.println("이름="+korean1.name);
		System.out.println("주민등록번호="+korean1.ssn);
		
        Korean korean2 = new Korean("베정한","020408-3481613");
		
		System.out.println("나라="+korean2.nation);
		System.out.println("이름="+korean2.name);
		System.out.println("주민등록번호="+korean2.ssn);
	}

}
