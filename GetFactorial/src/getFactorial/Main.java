package getFactorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println(getFactorial(s.nextInt()));
	}
	
	public static long getFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		else {
			return num * getFactorial(num - 1);
		}
	}

}
