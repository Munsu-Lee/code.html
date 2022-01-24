package withdrawproblem;

public class Account {
	
	String owner;
	int ownerId;
	int money;
	
	public Account(String owner, int ownerId, int money) {
		this.owner = owner;
		this.ownerId = ownerId;
		this.money = money;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public int inquiry() {
		return money;
	}
}
