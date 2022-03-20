
public class TestAccount
{

	public static void main(String[] args)
	{
		  Account account;
		  account=new Account();
		  account.deposit=100;
		  account.withdraw=30;
		  account.checkbalance= account.deposit- account.withdraw;
		  System.out.println("Deposited amount:"+" "+account.deposit+" ");
		  System.out.println("Withdraw amount:"+" "+account.withdraw+" ");
		  System.out.println("Checkbalance:"+" "+account.checkbalance+" ");
	}

}
