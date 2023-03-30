package pruebaSubString;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
		 System.out.print(MinWindowSubstring(new String[] {"ahffaksfajeeubsne", "jefaa"}));
		 //{"aaffhkksemckelloe", "fhea"}
		 //{"ahffaksfajeeubsne", "jefaa"}
	}
	
	public static String MinWindowSubstring(String[] stringIn) {
		
		String result = "";
		
		result.chars().anyMatch(Character :: isLetter);
		List<String> firstWord = Arrays.asList(stringIn[0].split(""));
		List<String> secondWord = Arrays.asList(stringIn[1].split(""));
		List<Integer> index = new ArrayList<Integer>();
		
		for(String letter : secondWord) {
			index.add(firstWord.indexOf(letter));
			}
		
		String aux = String.join("", firstWord);
		result = aux.substring(0, Collections.max(index)+1);
		return result;
		
		
	}
	
	
	
	

}
