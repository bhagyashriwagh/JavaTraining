package ExceptionHandling;

public class DivideByZero {

	public static void main(String[] args) {
		try {
		int num=9/0;   //uncheckedException-ArithmaticExeption
		System.out.println(num);
		}
		catch(ArithmeticException e) //we can write exception only
				{
			e.printStackTrace();
				}
		
		finally {     //---------can be used with try
			System.out.println("finally");		
		}
		System.out.println("hellow");
	

	}

}
