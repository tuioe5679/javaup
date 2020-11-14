package Example;

public class Example05_Account {

	static final int MIN_BALACE = 0;
	static final int MAX_BALACE = 1000000;

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance <= MIN_BALACE) {
			balance = this.balance;
			return;
		} else if (balance >= MAX_BALACE) {
			balance = this.balance;
			return;
		} else {
			this.balance += balance;
			return;
		}
	}

}
