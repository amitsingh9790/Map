package Map;
import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args) {


        HashMap hmap = new HashMap();
        hmap.put("Apple",50);
        hmap.put("Banana",20);
        hmap.put("Mango",70);
        System.out.println(hmap.entrySet());

        System.out.println("Contain Orange Key: "+hmap.containsKey("Orange"));
        System.out.println("Contain 50 Value: "+hmap.containsValue(50));

        Set set = hmap.entrySet();
        System.out.println(set);
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getValue());
            //Replace a Value
            if(entry.getValue().equals(20))
                entry.setValue(100);
        }
        hmap.remove("Mango"); // Remove an Entry
        System.out.println(hmap);

        // Converting the HashMap into a synchronized map
        Map synchronizedMap = Collections.synchronizedMap((hmap));

        //Now the synchronizedMap can be safely accessed by multiple threads
        System.out.println("Synchronized HashMap: "+synchronizedMap);


        class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            // Override the equals method to define when two Person objects are considered equal
            public boolean equals(Object o) {
                if (this == o) return true; // If objects are the same instance, they are equal
                if (o == null || getClass() != o.getClass()) return false; // If the object is null or not of the same
                                                                           // class, they are not equal.
                Person person = (Person) o;
                return age == person.age && Objects.equals(name, person.name); // Two person objects are equal if their
                                                                               // name and age are both equal.
            }
            // Override the hashCode method  to generate a hash code based on name and age
            @Override
            public int hashCode() {
                return Objects.hash(name, age); //Generate a hash code using the name and age fields
            }

            @Override
            public String toString(){
                return "Person{name='"+name+"',age="+age+"}";
            }
        }

        HashMap hashMap = new HashMap();
        Person p1 = new Person("Amit",25);
        Person p2 = new Person("Amit",25);
        hashMap.put(p1,"amitsingh434@gmail.com");
//        hashMap.put(p2,"rishidev221@gmail.com");
        System.out.println(hashMap);
        //Both p1 and p2 should have the same hash code and be considered equal
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
        System.out.println("Value for p1: "+ hashMap.get(p1));
        System.out.println("Value for p2: "+hashMap.get(p2)); //Should return the same as p1
    }
}
