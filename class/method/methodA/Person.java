package methodA;

public class Person {//final 사용시 선언초기값과 생성자 이외에 초기화 할수없다
	                 //한번 초기값이 저장되면 실행도중 수정 불가능
	final String nation = "Korean";
	final String ssn;
	String name;
	
	public Person(String ssn,String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
