package Example;

import java.util.Scanner;

public class BankApplicationExample {
	@SuppressWarnings("unused")
	private static BankApplication[] back = new BankApplication[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accoutList();
			}else if(selectNo == 3) {
				whitdraw();
			}else if(selectNo == 4) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("���� ����");
		System.out.println("--------------");
		System.out.println("���¹�ȣ");
	    
		
	}
	private static void accoutList() {
		
	}
	private static void whitdraw() {
		
	}
	

}
