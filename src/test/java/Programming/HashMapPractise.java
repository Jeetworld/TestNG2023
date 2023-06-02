package Programming;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  HashMap<Integer,String> map=new HashMap<>();
//		  map.put(100,"ABC");
//		  map.put(101,"DEF");
//		  map.put(103,"XXX");
//		  map.put(104,"ZZZ");
		
		int[] rollno= {2,40,1,5,4};	//rollno[1], rollno[2]
		String[] name = {"arun", "varun", "karun", "sohi","wawa"};
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0; i<rollno.length; i++) {
			map.put(rollno[i], name[i]);
			
		}
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println("Key is "+m.getKey()+" : "+ m.getValue());
			
		}
		  
		  
		  
		

	}

}
