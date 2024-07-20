package Bank;

public class BankAcco {
	
	int depositAmount=50000;
	int withdrawAmount=3245;
	double intrestRate=9.5;
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
				
	}