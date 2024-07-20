package Bank;
//inheritance to bank acco
//inheritance to NRIaccount
//inheritance to SeniorCitizen

public class BankOfMaharastra
{
	public static void main(String[] args) {
		NRIaccounts obj=new NRIaccounts();
		SeniorCitizen obj1=new SeniorCitizen();
		BankAcco a=new BankAcco();
		obj.applyFixedDeposit();
		obj1.applyFixedDeposite();
		a.depositMoney();
		a.withdrawMoney();
		a.balanceMoney();
		
		
	}
	
	

}
