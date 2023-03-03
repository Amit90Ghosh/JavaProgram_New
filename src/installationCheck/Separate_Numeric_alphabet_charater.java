package installationCheck;

public class Separate_Numeric_alphabet_charater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="sb237r#II@Fwu8";
		String alpha = "";
		String num = "";
		String sp = "";
		//char c[] = str.toCharArray();
		
		for(int i =0; i<str.length();i++) {
			char s = str.charAt(i);
			if(s>='A' && s<='z') {
				alpha = alpha+s;
			}else if(s>='0' && s<='9') {
				num = num+s;
			}else {
				sp = sp+s;
			}
			
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);
	}

}
