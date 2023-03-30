package repeatedNumbres;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    System.out.print(FindIntersection(new String[] {"1, 3, 4, 7, 13", "0, 2, 5, 10, 15"}));

	}

	public static String FindIntersection(String[] strArr) {
		String result = "";

		List<String> firstList= Arrays.asList(strArr[0].split(", "));
		List<String> secondList= Arrays.asList(strArr[1].split(", "));
		Set<Integer> repeatedIndex = new HashSet<Integer>();

		for(String sl : secondList){
			repeatedIndex.add(firstList.indexOf(sl));
		}
		for(int ri : repeatedIndex){
			if(repeatedIndex.size() <= 1){
				result = "false";
			}
			if(ri >= 0){
				result += firstList.get(ri) +", ";
			}
		}
		return result;
	}

}
