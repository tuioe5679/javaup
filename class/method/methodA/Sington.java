package methodA;

public class Sington {// 싱글톤 객체 (하나의 객체만 만들도록 보장)
	private static Sington sing = new Sington();

	private Sington() {

	}

	static Sington getinstance() {//메소드로 객체를 참조하도록 하여 객체 생성제한
		return sing;
	}

}
