package methodA;

public class Car {
	int gas;

	void setGas(int gas) {//�Ű�����  gas���޾� �ʵ�gas�� �Ű������� ����
		this.gas = gas;
	}

	boolean isLeftGas() {//���ǹ����� booleanŸ�� �����ϴ� �޼ҵ�
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		} else {
			System.out.println("gas�� �ֽ��ϴ�");
			return true;
		}
	}

	void run() {//�޸��� �޼ҵ�
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas--;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return;//��������
			}
		}
	}

}
