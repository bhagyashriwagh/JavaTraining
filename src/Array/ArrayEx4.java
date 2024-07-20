package Array;

class ArrayEx4 {

	public static void main(String[] args) {
          
		int a[] = {6, 67, 5, 44, 66, 7, 11, 9};
		
		for (int i=0; i<=a.length-1; i++) {
			int count=0;
			for (int j=2; j<a[i]; j++ ) {
			    if(a[i]%j==0) {
				System.out.println(a[i]+" -is sum no");
			    count++;
			    break;
			    }
				else {
				System.out.println(a[i]+" -is odd no");
			    break;
				}
			    }
			}
		System.out.println();
	}
}
	

		