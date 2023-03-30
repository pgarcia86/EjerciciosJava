package longestWord;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    System.out.print(LongestWord(s.nextLine())); 
	}
	
	
	
	public static String LongestWord(String sen) {  
		String[] senArray = sen.split("[^a-z^0-9]");
		int longestIndex = 0;
		String longestWord = "";
		
		for(int i = 0; i < senArray.length; i++) {
			if(senArray[i].length() > longestIndex) {
				longestWord = senArray[i];
				longestIndex = senArray[i].length();
			}
		}
		return longestWord + " final";
	}	
}
