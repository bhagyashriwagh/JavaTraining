package Array;

public class abc {
public static int product(int[] temperature)

{
	int answer=0;
	for( int NEGAtive : temperature) {
		if (NEGAtive<0) {
			answer++;
		}
		//System.out.println("ans"+answer);
	}
	return answer;
}
public static void main(String[] args) {
	int numOfProduct= 7;
	int[] temp= {9,-3,8,-6,-7,8,10};
	int temperature[]= new int[temp.length];
	for(int i=0; i<temp.length; i++) {
		temperature[i] = temp[i];
		//System.out.println(temperature[i]);
		}
	int result = product(temperature);
	System.out.println(result);
}

}

