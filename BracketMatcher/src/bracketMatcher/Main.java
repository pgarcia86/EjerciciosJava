package bracketMatcher;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(BracketMatcher("(c(oder)) b(yte)"));

	}
	
	public static String BracketMatcher(String str) {

		String brackets = str.replaceAll("[a-z\\s]", "");
		List<String> list = Arrays.asList(brackets.split(""));
		    // code goes here  
		

		System.out.println(list);
		System.out.println(list.size());

		if(list.size() % 2 == 0) {
			return "1";
		}
		return "0";
	}

}
