package countDiffersLettersNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countDifferentsLettersNumbers("Aca va un String @@ _ _ ---- [ ^ 9433"));

	}
	
	
	public static int countDifferentsLettersNumbers(String str){
		
		List<String> strList = Arrays.asList(str.replaceAll("[^a-zA-Z0-9]", "").split(""));
		
		if(strList.stream().distinct().count() == strList.size()) {
			return strList.size();
		}
		else {
			return (int) strList.stream().distinct().count();
		}
	}
}
