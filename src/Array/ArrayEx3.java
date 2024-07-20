package Array;

public class ArrayEx3 {
	
	public static void main(String[] args) {
		
		int[] a= {6, 67, 5, 44, 66, 7, 11, 9};
		
		for (int i=0; i<=a.length-1; i++) {
			int count=0;
			for (int j=2; j<a[i]; j++ ) {
				if (a[i]%j==0)
				count++;
				}
			if (count==0) 
				System.out.println(a[i]+" -is prime no");
	
			else 
				System.out.println(a[i]+" -is not prime no");
			}
	}
}

			
	
