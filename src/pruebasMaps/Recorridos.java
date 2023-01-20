package pruebasMaps;

/**
 *
 * @author ItaLow32
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Recorridos {
    public void recorrerMapa(){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        map.put(2, 32);
        map.put(7, 42);
        map.put(32, 104);
        map.put(5, 25);
        map.put(0, 2);
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key - " + entry.getKey() + ", Value - " + entry.getValue());
            
        }
        
        System.out.println(". . . . .");
        for (Integer key : map.keySet()) {
            System.out.println("Key - " + key + ", Value - " + map.get(key));
        }
        
        System.out.println(". . . . .");
        for (Integer value : map.values()) {
            System.out.println("Key - ..." + ", Value - " + value);
        }
        
        System.out.println(". . . . .");
        Iterator<Map.Entry<Integer, Integer>> iteratorEntries = map.entrySet().iterator();
        while(iteratorEntries.hasNext()){
            Map.Entry<Integer, Integer> entry = iteratorEntries.next();
            System.out.println("Key - " + entry.getKey() + ", Value - " + entry.getValue());

        }
    }
}

