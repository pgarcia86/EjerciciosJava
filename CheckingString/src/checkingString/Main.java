package checkingString;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkRepeatedLetters("aabccdefg"));

	}
	
	//Dado un String, hallar el primer caracter que no se repite. Si no se repite ninguno, devolver "_"
	
	public static String checkRepeatedLetters(String str) {
		List<String> list = Arrays.asList(str.split(""));
		
		if(list.stream().distinct().count() == list.size()) {
			return "_";
		}
		else {
			for(String l : list) {
				if(list.indexOf(l) == list.lastIndexOf(l)) {
					return l;
				}
			}
			return "_";
		}		
		
	}
}
