package installationCheck;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Name");
		String s = sc.next();
		String rev="";
		
		for(int i =s.length()-1; i>=0;i--) {
			char a = s.charAt(i);
			rev=rev+a;
		}
		System.out.println(rev);
	}

}
