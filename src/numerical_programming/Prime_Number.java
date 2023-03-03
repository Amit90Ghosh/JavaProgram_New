package numerical_programming;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int Num = S.nextInt();
		
		int counter=0;
		
		for(int i = 1; i<=Num; i++) {
			int z = Num%i;
			
			if(z==0) {
				counter++;
			}
		}
		
		if(counter<=2) {
			System.out.println("It's a prime number");
		}else {
			System.out.println("This is not Prime");
		}
		
		

	}

}
