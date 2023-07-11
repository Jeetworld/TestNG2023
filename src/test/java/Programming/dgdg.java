package Programming;
import java.util.*;
public class dgdg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        
        hashMap.put(21,"3121");
        hashMap.put(1,"werwerew");
        hashMap.put(11,"rrwrw");
        
        TreeMap<Integer,String> treeMap = new  TreeMap<Integer,String>();
        treeMap.putAll(hashMap);
        
        for(Map.Entry e: treeMap.entrySet())
        {
            System.out.println("sorted map is:"+ e.getKey() +""+ e.getValue());
        }
	}

}
