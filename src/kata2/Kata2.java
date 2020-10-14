
package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Kata2 {

    
    public static void main(String[] args) {
        Integer [] data={45,6655,89,12,78,45,63,21,78,45,6655,45,89,12,65,48,36};
        Map<Integer,Integer> histogram=new HashMap<>();
        
        for (Integer key:data) {
            histogram.put(key, histogram.containsKey(key) ?  histogram.get(key)+1: 1); 
        }
        
        for(Map.Entry<Integer,Integer> entry: histogram.entrySet()){
            System.out.println("Value = "+entry.getKey()+", Frecuency = "+entry.getValue());
        }
    }
}
