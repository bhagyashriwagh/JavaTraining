package Array;

public class Array_1_100 {

	//Write a java program to print numbers from 1 to 100 using array. 
	//If number is even then exclude it (print only odd numbers)

	public static void main(String[] args) {
		int a[]= new int [100];
		int b[]=new int [50];
		for (int i=0; i<100; i++) {
			a[i]=i+1;
//			System.out.println("a["+i+"]="+a[i]);
		}
		for ( int i=0; i<100; i++) {
			if ((a[i])%2==0) {
			for (int k=0; k<50;k++ ) {
			b[k]=a[i];
			System.out.println("b["+k+"]="+b[i]);
			}}
//		System.out.println(a[0]);
//		System.out.println(b[0]);
//		System.out.println(b.length);
//		System.out.println();
//		System.out.println(a.length);
		
}
	}}
