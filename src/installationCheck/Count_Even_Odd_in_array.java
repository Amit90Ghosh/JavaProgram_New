package installationCheck;

public class Count_Even_Odd_in_array {

	public static void main(String args[]) {
		
		int A[] = {2,4,3,6,5,8,10};
		int size = A.length;
		
		int count =0;
		
		for (int i=0; i<size;i++) {
			int k = A[i]%2;
			if(k==0) {
				count++;
			}
		}
		int p = size-count;
		System.out.println("even number:" + count);
		System.out.println("odd number" + p);
	}
}
