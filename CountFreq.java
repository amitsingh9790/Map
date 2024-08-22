package Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountFreq {
    public static void countF(int[] arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }
        //To print the key and value of HashMap
        Set<Map.Entry<Integer, Integer>> s = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> it = s.iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Value: "+entry.getKey()+" "+"Repeating: "+entry.getValue());
        }

        System.out.println("----------------------------------");
        //Find first no repeating element
        for (int i = 0; i < n; i++) { //We are checking all the values of array from 0 index if map has key with 1 value
            if(map.get(arr[i])==1){   //it will print and break the loop
                System.out.println("First no repeating element: "+arr[i]);
                break;
            }
        }
        //K Occurrence If A[i] exist B no. of times, Return sum of A[i] else return -1
        //    A = {1,2,2,3,3} , B = 2 ;
        //   o/p: 2+3 = 5
        int B=2;
        int Sum=0;
        Set<Map.Entry<Integer, Integer>> s2 = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> it2 = s2.iterator();
        while (it2.hasNext()){
            Map.Entry entry = (Map.Entry) it2.next();
            if(entry.getValue().equals(B))
                Sum+=(Integer)entry.getKey();
        }
        if(Sum==0)
            System.out.println("-1");
        else
            System.out.println("A[i] B no. of times : "+Sum);

    }
    public static void main(String[] args) {
//        int[] a = {2,6,3,8,2,8,2,3,8,5};
        int[] a = {1,2,2,3,3,6,6,6};
        countF(a);
    }
}
