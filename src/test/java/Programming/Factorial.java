package Programming;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorial= 5;
		int result=1;
		for(int i=1; i<=factorial; i++) {
			result = result*i;
		}
		
		System.out.println("result is "+result);
	}

}
