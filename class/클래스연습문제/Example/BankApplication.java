package Example;

public class BankApplication {
	private String ano;
	private String owner;
	private int balance;
	
	public BankApplication(String ano,String owner,int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setowner(String owner) {this.owner = owner;}
	public int getbalance() {return balance;}
	public void setbalance(int balance) {this.balance = balance;}
	

}
