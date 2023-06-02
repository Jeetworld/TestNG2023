package Programming;

public class StringPrograms
{

	public static void reverseWord(String str) {
		char[] ch = str.toCharArray();
		String result = "";
		for(int i =ch.length-1; i>=0; i--){
			 result = result + ch[i];
		}
		System.out.println("Reverse word is "+result);
	}
	
	public static void reverseSententce(String str) {
		String[] ch = str.split(" ");
		String result="";
		for(int i=ch.length-1; i>=0;i--) {
			result = result + ch[i] + " ";
		}
		System.out.println("reverse sentennce is "+result);
	}
	
	public static void addTheArray(int[] arr) {
		int result=0;
		for(int i=0; i<arr.length; i++) {
			result = result + arr[i];
		}
		System.out.println("Addition is "+result);
	}
	
	public static void removeSpecialChar(String str) {
		String result = str.replaceAll("[^a-zA-Z]", "");	//[^0-9a-zA-Z]
		System.out.println("Removing special characters "+result);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi this is Hellow World!!");
		reverseWord("WORLD");
		reverseSententce("Hi this is Hello World");
		addTheArray(new int[] {2,3,4});
		removeSpecialChar("%^7965AGHSJsdAD!@#$%^&*())))))");
	}

}
