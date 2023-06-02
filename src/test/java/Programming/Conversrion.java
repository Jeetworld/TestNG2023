package Programming;

public class Conversrion {
	
	public static void main(String arsg[]) {
		
		int i = 100;
		String str1 = String.valueOf(i);	//convert int to str
		System.out.println("Convert integer to String "+str1);
		
		String str2= "200";
		Integer itr = Integer.valueOf(str2);	//convert str to int
		System.out.println("Convert String to integer "+itr);
		
		String str3 ="100";
		String result = str3+ 4;
		System.out.println("result is "+result);
		
	}

}
