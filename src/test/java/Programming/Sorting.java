package Programming;

import java.util.Arrays;

public class Sorting {
	
	public static void sorting(int[] input) {
		int temp;
		for(int i =0; i<=input.length-1; i++) {
			for(int k =i+1; k<=input.length-1; k++) {
				if(input[k]<input[i]) {
					temp= input[i];
					input[i]=input[k];
					input[k]=temp;
				}
			}
			
		}
		System.out.println("Sorted arrays is"+Arrays.toString(input));
	}
	
	public static void main(String args[]) {
		int[] arr= {22,11,44,22,0,99};
		sorting(arr);
		
	}

}
