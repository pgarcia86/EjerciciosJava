package countDiferentLetters;

import java.util.*;

//Contar caracteres repetidos

public class Main {

	public static void main(String[] args) {

		System.out.println(diferentLetters("acaaa vaaa unh String"));
	}
	
	public static int diferentLetters(String s) {
		
		List<String> list = Arrays.asList(s.replaceAll(" ", "").split(""));	
		return (int) list.stream().distinct().count();
	}
}
