package chekingNumbers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    System.out.print(QuestionsMarks("arrb6???4xxbl5???eee5")); 
	}
	
	public static String QuestionsMarks(String str) {
		
		Pattern p = Pattern.compile("([0-9])([?])([?])([?])([0-9])");
		Matcher matcher = p.matcher(str);
		if(matcher.find()) {
			int num = Integer.parseInt(matcher.group(1));
			int num2 = Integer.parseInt(matcher.group(5));			
			if(num + num2 <= 10) {
				return "true";
			}
		}		
		return "false";
	}
}
