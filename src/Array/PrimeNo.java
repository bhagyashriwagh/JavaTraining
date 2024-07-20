package Array;

import java.util.ArrayList;
import java.util.List;

public class PrimeNo {
	public static void main(String[] args) {
	      int [] a={2, 5, 7, 8, 9, 11, 12, 13, 16, 19, 17};
	      int count=0;
	      List mylist= new ArrayList();
	      for (int i=0; i<a.length; i++){
	          for(int j=2; j<a[i]; j++){
	              if(a[i]%j==0)
	              {
	              count++;
	              break;
	          }
	          else{
	              mylist.add(a[i]);
	          }
	          System.out.println(mylist);
	          
	      }
	}
	}

}
