package installationCheck;

public class Extract_num_alpha {

	public static void main(String[] args) {

		String s = "Ami#$$amt1234";
		String alpha="";
		String num ="";
		String Special="";
		
		for(int i=0; i<s.length();i++) {
			char a = s.charAt(i);
			if(a>='A' && a<='z') {
				alpha = alpha+a;
			}else if(a>='0' && a<='9') {
				num =num+a;
			}else {
				Special =Special+a;
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(Special);
	}

}
