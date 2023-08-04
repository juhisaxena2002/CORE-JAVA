import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

import javax.swing.RowFilter.Entry;

public class stackColl {
    public static void main(String[] args) 
    {
    //    Stack <String> animals = new Stack <>();
    //    animals.add("cat");
    //    animals.add("dog");
    //    animals.add("horse");
    //    animals.add("cow");

    //    System.out.println(animals);
    //    System.out.println(animals.peek());
    //    animals.pop();
    //    System.out.println(animals.peek());
    //    animals.push("rabbit");
    //    System.out.println(animals.peek());


    //    //PriorityQueue <Integer> PQ = new PriorityQueue <>();
    //    PriorityQueue <Integer> PQ = new PriorityQueue <>(Comparator.reverseOrder());
    //    PQ.add(9);
    //    PQ.offer(10);
    //    PQ.offer(1);
    //    PQ.offer(90);
    //    System.out.println(PQ);
    //    PQ.poll();
    //    System.out.println(PQ);

    //    //BY DEFAULT MIN HEAP IS IMPLEMENTED OKAY
    //    // POLL WILL REMOVE THE HIGHEST PRIORITY ELEMENT

    //    ArrayDeque <Integer> AD = new ArrayDeque<>();
    //    AD.add(10);
    //    AD.offer(67);
    //    AD.push(90);
    //    AD.add(21);
    //    System.out.println(AD);
    //    System.out.println(AD.offerFirst(690));
    //    AD.offerLast(890);
    //    System.out.println(AD);
    //    AD.pollFirst();
    //    System.out.println(AD);

    //    HashMap<String, Integer> hm = new HashMap<>();
    //    hm.put("ABC", 1);
    //    hm.put("BCD", 2);
    //    hm.put("CDDA",3);
    //    hm.put("FOUR", 4);
    //    hm.put("SIX", 6);
    //    if(!hm.containsKey("CDA")){
    //     hm.put("ZZZ", 100);
    //    }
       
    //    hm.putIfAbsent("JJJ", 1222);
    //    System.out.println(hm);

    //    for (Map.Entry <String, Integer> e : hm.entrySet()) {
    //     System.out.println(e);
    //    }
    //    for(String key : hm.keySet()){
    //     System.out.println(key);
    //    }
    //    for(Integer value: hm.values()){
    //     System.out.println(value);
    //    }

       int [] numbers = {1,2,3,4,5,6,7,8,9};
       int index = Arrays.binarySearch(numbers,9);
       System.out.println(index);
       


}
}


