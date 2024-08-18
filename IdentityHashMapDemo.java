package Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = new String("A");

        HashMap map = new HashMap<>(); //1. Use equals method to compare key during insertion
                                       //2. HashMap allow null keys and allow null values
        map.put(s1,"Amit");
        map.put(s2,"Alok");

        IdentityHashMap imap = new IdentityHashMap<>(); //Uses == operator to compare key during insertion
                                                        //IdentityHashMap does not allow null keys and allow null values
        imap.put(s1,"Amit");
        imap.put(s2,"Alok");
        
        System.out.println(map);
        System.out.println(imap);
        while(true)
            System.out.println("...");
    }
}
