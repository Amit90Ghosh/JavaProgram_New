package numerical_programming;

public class Swap_2_Num {

	void with_Third_Variable(int A, int B){
		
		int Z;
		
		Z=A;
		A=B;
		B=Z;
		
		System.out.println("Value of A" + " " +A);
		System.out.println("Value of B" + " " +B);
	}
	
	void without_Third_Variable(int A , int B) {
		
		A=A+B;
		B=A-B;
		A=A-B;
		System.out.println("Value of A" + " " +A);
		System.out.println("Value of B" + " " +B);
	}


	
	public static void main (String args[]) {
		
		Swap_2_Num K = new Swap_2_Num();
		K.without_Third_Variable(5, 6);
		
		K.with_Third_Variable(2, 0);
		
	}
}

