package methodA;

public class Calculator {
	
	void poweron() {//������ Ű�� �޼ҵ�
		System.out.println("������ ŵ�ϴ�");
	}
	int plus(int x, int y) {//�Ű������� �޾� �����ִ� �޼ҵ�
		int result = x+y;
		return result;
	}
	
	double divide (int x, int y) {//�Ű������� �޾� �����ִ� �޼ҵ�
		double result = (double)x /(double)y;
		return result;
	}
	
	void poweroff() {//������ ���� �޼ҵ�
		System.out.println("������ ���ϴ�");
	}

}
