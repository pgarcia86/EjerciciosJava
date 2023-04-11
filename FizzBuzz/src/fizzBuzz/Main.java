package fizzBuzz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writeNumbers();

	}
	
	public static void writeNumbers() {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 != 0) {
				System.out.println("fizz");
			}
			else if(i % 5 == 0 && i % 3 != 0){
				System.out.println("buzz");
			}
			else if(i % 5 == 0 && i % 3 == 0) {
				System.out.println("fizzBuzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
