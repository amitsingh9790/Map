package Map;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Amit");
        map.put(2,"Ajay");
        map.put(4,"Vishal");
        map.put(5,"Alok");
        map.put(3,"Vijay");
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.remove(1));

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Vishal"));
        System.out.println("Key: "+map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map);
    }
}
