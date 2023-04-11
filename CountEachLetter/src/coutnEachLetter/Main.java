package coutnEachLetter;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countEachLetter("acavaunstring"));

	}
	
	public static List<Integer> countEachLetter(String str){
		
		
		List<String> strArray = Arrays.asList(str.split(""));		
		Set<String> letters = new HashSet<String>();
		Map<String, Integer> lettersMap= new HashMap<String, Integer>();
		List<Integer> counter = new ArrayList<Integer>();
		
		for(int i = 0; i < strArray.size() ; i++) {
			letters.add(strArray.get(i));
		}
		for(int i = 0; i < letters.size(); i++) {
			counter.get(i).;
		}
		
		System.out.println(letters);
		
		return null;

	}

}
