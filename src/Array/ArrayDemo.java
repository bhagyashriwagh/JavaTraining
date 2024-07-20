package Array;

public class ArrayDemo {
	public static void main(String[] args) {
		//Way to create array 1)		int[] a
		 //                              a= new int[3];
		
		//Way to create array 1)		int[] a= new int[3];
		
		int[] a= {10,20,30,40};
		System.out.println("******************By for Method******************");
		for (int i=0; i<4; i++) {
		System.out.print("  "+a[i]);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("******************By for each Method******************");
		for (int i:a) {
			System.out.print("  "+i);
		}
	}}

		


