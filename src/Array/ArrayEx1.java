package Array;

public class ArrayEx1 {

	public static void main(String[] args) {

		int[] number = new int[4];
		number[0]=15;
		number[1]=20;
		number[2]=25;
		number[3]=30;
		
		for(int i=0; i<=3; i++) {
			System.out.println(number[i]);
		}	
		
		System.out.println("*************************************************");
		
		String[] countries = new String[3];
		countries[0]="India";
		countries[1]="China";
		countries[2]="USA";
		
		for(int i=0; i<=2; i++)
		{
			System.out.println(countries[i]);
		}
		
		System.out.println("**************************************************");
		
		int[] num1 = {10,20,30,40,50};
		
		for(int i=0; i<=4; i++) {
			System.out.println(num1[i]);
		}
		
		
	}
	}


