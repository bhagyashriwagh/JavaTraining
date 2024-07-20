package Array;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] num = {10,20,30,40};
//		System.out.println(num.length);
		
		int[] num2 = new int[num.length];
		
		for(int i=0; i<num2.length; i++) {
			num2[i]=num[i];
		}
		
		for(int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}

	}

}
