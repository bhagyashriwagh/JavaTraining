package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayProblem {
	
	public void EnterCountryName() {
	String Country1="US",Country2="India",Country3="China",Country4="Germani",Country5="UK";
	
	
	List CountryName=new ArrayList();
	
	CountryName.add(Country1);
	CountryName.add(Country2);
	CountryName.add(Country3);
	CountryName.add(Country4);
	CountryName.add(Country5);
	
	System.out.println(CountryName);
	
		
	}

	public static void main(String[] args) {
		ArrayProblem a=new ArrayProblem();
		a.EnterCountryName();
	
		
	}

}
