package hackerLenguage;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(changeLetters("aca va un string"));

	}
	
	public static String changeLetters(String str) {

		Map<String, String> newAlphabet= new HashMap<>(){{
			put("A", "4"); 	put("B", "I3");	put("C", "[");	put("D", ")");	put("E", "3");	put("F", "|=");	put("G", "&"); 
			put("H", "#");	put("I", "1");	put("J", ",_|");put("K", ">|");	put("L", "1");	put("M", "/\\/\\");	put("N", " ^/"); 
	        put("O", "0");	put("P", " |*");	put("Q", "(_,)");	put("R", "I2");	put("S", "5");	put("T", "7");	put("U", "(_)"); 
	        put("V", "\\/");	put("W", "\\/\\/");	put("X", "><");	put("Y", "j");	put("Z", "2");	put("1", "L");	put("2", "R"); 
	        put("3", "E"); 	put("4", "A");	put("5", "S");	put("6", "b");	put("7", "T");	put("8", "B");	put("9", "g");	put("0", "o");
	         }};


	}

}
