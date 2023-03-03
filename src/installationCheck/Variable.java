package installationCheck;

public class Variable {

	int X;
	static String str = "amit";
	
	public Variable() {
		X=10;
		str = "kumar";
	}
	
	public static void main(String args[]) {
		Variable V = new Variable();
		
		System.out.println(V.X);
		
		Variable V2 = new Variable();
		int Z = V2.X = 10;
		System.out.println(Z);
		System.out.println(Variable.str);
		
		/*int Z = Variable.X = 5;
		System.out.println(Z);
		*/
		
		
	}
}
