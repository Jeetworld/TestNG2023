package Programming;

import java.util.Arrays;

public class DuplicateAndUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="hhellklkOHh";
		
		char[] ch= str.toCharArray();
		
		int count;
		char[] temp = {'a'}; 
		int k=0;
		for(int i=0; i<ch.length; i++) {
			count=1;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
			}
			 if(count>1 && ch[i]!='0')
				System.out.println("Duplicate chars are "+ch[i]+ " with frequency "+count);
			 else if(count==1 && ch[i]!='0' ) {
				 System.out.println("Unique chars are "+ch[i]);
				 //temp[k++]=ch[i];
			 }
		}
		//temp[k++]=ch[ch.length-1];
		
		//System.out.println("Unique arrays are "+Arrays.toString(temp));

	}

}
