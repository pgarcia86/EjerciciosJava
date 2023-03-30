package reverseString;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    System.out.print(FirstReverse("coderbyte Tu Hermana")); 
	}
	
	public static String FirstReverse(String str) {

		List<String> reverseStr = Arrays.asList(str.split(""));
		
		Collections.reverse(reverseStr);
		
		return String.join("", reverseStr);
				
	
	}

}
