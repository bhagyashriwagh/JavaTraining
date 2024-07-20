package SuperAndThisKeyword;

public class ThisKeyword extends SuperKeyword{
	
	int i=9;
	int b=6;
	
	void show() {
		int a=1;
		int b=2;
		System.out.println("Value of Super a & b ="+super.i+" & "+super.b );
		System.out.println("Value of This a & b ="+this.i+" & "+this.b);
	}
	
	public static void main(String[] args) {
		ThisKeyword t= new ThisKeyword();
		t.show();
	
	
	}
	

}
