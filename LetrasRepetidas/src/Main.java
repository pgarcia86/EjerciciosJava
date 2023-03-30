import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		System.out.println(letrasRepetidas(in.nextLine()));
	}

	private static String letrasRepetidas(String frase) {
		
		List<String> words = Arrays.asList(frase.split(" "));
		
		for(int i = 0; i < words.size(); i++) {
			List<String> letters = Arrays.asList(words.get(i).split(""));			
			long dist = letters.stream().distinct().count();
			if(letters.size() != dist) {
				return words.get(i);
			}	
			else {
				letters = null;
			}			
		}
		return null;
	}

}
