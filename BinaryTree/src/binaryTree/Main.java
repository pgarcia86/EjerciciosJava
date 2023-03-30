package binaryTree;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(TreeConstructor(new String[] {"(1,2)", "(1,2)", "(5,7)", "(7,2)", "(9,5)"})); 

	}
	
	public static String TreeConstructor(String[] strArr) {
		
		List<String> child = new ArrayList<String>();
		Map<String, Integer> parent = new HashMap<String, Integer>();
		for(String sa : strArr) {
			
			String[] values = sa.replaceAll("[^0-9,]", "").split(",");			
			child.add(values[0]);
			Integer count = parent.get(values[1]);
			
			System.out.println(count);
			
		}
		
		
		
		System.out.println(child);
		System.out.println(parent);
		
		return strArr[0];
	}

}
