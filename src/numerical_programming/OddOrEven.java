package numerical_programming;

import java.util.Scanner;

public class OddOrEven {
	
		int j;

	  OddOrEven(int k) {
		this.j  = k%2;
		if(j==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is odd");
		}
	}
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int A = S.nextInt();
		
		OddOrEven O = new OddOrEven(A);
		//O.OddOrEven(A);
		
		
	}

}
