package Map;
import java.util.WeakHashMap;
//Uses equals method for comparison but weak in references. If a key is no longer in use elsewhere in the program ,
//it can be garbage collected.
public class WeakHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        WeakHashMap wMap = new WeakHashMap(); //1. Use equals method to compare key during insertion like hashMap
        wMap.put(key1,"Amit");                //2. When key1 is set to null and garbage collection occurs, the entry for
        wMap.put(key2,"Alok");                //   entry for key1 will removed form the map.when garbage collector run.
        System.out.println("WeakHashMap size: "+wMap.size());
        System.out.println(wMap);
        key1=null;
        System.gc(); // Suggesting garbage collection
        System.out.println(wMap);
        System.out.println("WeakHashMap size: "+wMap.size());
    }
}
