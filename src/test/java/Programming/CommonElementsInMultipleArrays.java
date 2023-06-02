package Programming;

public class CommonElementsInMultipleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = { 1, 5, 10, 20, 40, 80, 99 };
        int ar2[] = { 6, 7, 20, 80, 100, 99 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        
        for(int i=0; i<ar1.length; i++) {
        	for(int j=0; j<ar2.length; j++) {
        		for(int k=0; k<ar2.length; k++) {
        			if(ar1[i]==ar2[j] && ar1[i]==ar3[k]  ) {
        				System.out.println("Common ele is "+ar1[i]);
        				//break;
        			}
        		}
        	}
        }

	}

}
