package Bank;

public class BankAccount {
	int depositAmount=50000;
	int withdrawAmount=3245;
	int balanceAmount;
	
	void depositMoney(){
		System.out.println("amount of deposited="+depositAmount);
	}
	
	void withdrawMoney() {
		
		System.out.println("amount withdraw is="+withdrawAmount);
	}
	
	public void balanceMoney() {
		
		balanceAmount=depositAmount-withdrawAmount;
		System.out.println("amount balance is="+balanceAmount);
	}
	
	
	public static void main(String[] args) {
		BankAccount a =new BankAccount();
		a.depositMoney();
		a.withdrawMoney();
		a.balanceMoney();
	
	}
				
	}

