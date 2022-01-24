package withdrawproblem;

public class WithdrawTest {

	public static void main(String[] args) {
		Account a = new Account("Kitae", 1, 5000);
		a.deposit(50000);
		System.out.println(a.getOwner() + "ÀÇ ÀÜ¾×Àº " + a.inquiry());
		a.withdraw(20000);
		System.out.println(a.getOwner() + "ÀÇ ÀÜ¾×Àº " + a.inquiry());
	}

}
