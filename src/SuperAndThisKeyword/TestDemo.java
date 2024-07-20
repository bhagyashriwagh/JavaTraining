package SuperAndThisKeyword;

class TestDemo extends Demo{

	
	int a=67;
	public void show() {
		System.out.println("This Variable="+this.a);
		System.out.println("Super Variable="+super.a);
	}
	public static void main(String[] args) {
		TestDemo t= new TestDemo ();
		t.show();
		
	}
}
