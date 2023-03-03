package installationCheck;

public class Hello_World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		String str = "23w*#9ef&U3b";
		String A="";
		String B="";
		String C="";
		
		//char[] K = str.toCharArray();
		
		for(int i=0; i< str.length();i++) {
			char k = str.charAt(i);
			if(Character.isDigit(k)) {
				A = A+k;
				
			}else if(Character.isAlphabetic(k)) {
				B= B+k;
			}else {
				C= C+k;
			}
		}
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

	}

}
