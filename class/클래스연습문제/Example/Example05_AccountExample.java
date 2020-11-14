package Example;

public class Example05_AccountExample {
	public static void main(String[]args) {
		
		Example05_Account acc = new Example05_Account();
		
		acc.setBalance(100000);
		System.out.println("현재잔고"+acc.getBalance());
		
		acc.setBalance(-1000);
		System.out.println("현재잔고"+acc.getBalance());
		
		acc.setBalance(2000000);
		System.out.println("현재잔고"+acc.getBalance());
		
		acc.setBalance(10000);
		System.out.println("현재잔고"+acc.getBalance());
	}

}
