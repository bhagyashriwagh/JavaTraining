package Collection;

public class CheckRepeatedCharacter {

	public static void main(String[] args) {
	
		String name= "aannnssiiiiijjjjjjmmmmmmmrrrrrrr";
	    int count= 0;
		for (int i=0; i<name.length(); i++){
			char letter= name.charAt(i);
		    if(letter== name.charAt(i)){
			  count++;
			}
		    else {
		    	
		    	System.out.print(letter +":"+ count);
			    System.out.println();
			    break;
		    }
		}	
			
	}
}

		
				