package numerical_programming;

public class GreaterOfTwoOrThreeNumbers {
	
	static void greaterOfTwo(int i, int j) {
		if(i>j) {
			System.out.println("Greater is" + " " + i);
		}
		else
		{
			System.out.println("Greater is" + " " + j);
		}
		
	}
	
	static void greaterOfThree(int i, int j, int k) {
		
		if(i>j && i>k) {
			System.out.println("Greater is" + " " + i);
		}else if(j>i && j>k){
			System.out.println("Greater is" + " " + j);
		}else {
			System.out.println("Greater is" + " " + k);
		}
	}

	public static void main(String[] args) {
		
		GreaterOfTwoOrThreeNumbers.greaterOfTwo(5,60);
		greaterOfThree(4,2,0);

	}

}
