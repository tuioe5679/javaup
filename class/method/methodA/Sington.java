package methodA;

public class Sington {// �̱��� ��ü (�ϳ��� ��ü�� ���鵵�� ����)
	private static Sington sing = new Sington();

	private Sington() {

	}

	static Sington getinstance() {//�޼ҵ�� ��ü�� �����ϵ��� �Ͽ� ��ü ��������
		return sing;
	}

}
