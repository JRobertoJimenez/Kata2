
package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Kata2 {

    
    public static void main(String[] args) {
        Integer [] data={45,6655,89,12,78,45,63,21,78,45,6655,45,89,12,65,48,36};
        Histogram histo=new Histogram(data);
        Map<Integer,Integer> histogr=histo.getHistogram();
        
        
        for(Map.Entry<Integer,Integer> entry: histogr.entrySet()){
            System.out.println("Value = "+entry.getKey()+", Frecuency = "+entry.getValue());
        }
    }
}
