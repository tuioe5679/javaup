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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택>");
			
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
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌 생성");
		System.out.println("--------------");
		System.out.println("계좌번호");
	    
		
	}
	private static void accoutList() {
		
	}
	private static void whitdraw() {
		
	}
	

}
