package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collectionss {
    public static void main(String[] args) {
        Collection<Integer> num=new ArrayList<>();
        num.add(33);
        num.add(22);
        num.add(66);
        for(int i:num)
        System.out.println(i);
        System.out.println(num);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(90);
        
        System.out.println(list);
// set colletion which stores unique values and doesn,t maintain insertion order
        Set<Integer> set =new HashSet<>();
        set.add(22);
        set.add(9);
        set.add(33);

System.out.println(set);

 // Tree set will gives sorted set 

      Collection<Integer> sortedSet=new TreeSet<>();
      sortedSet.add(22);
      sortedSet.add(98);
      sortedSet.add(118);
      sortedSet.add(18);
// iterator

    Iterator<Integer> values=sortedSet.iterator();
    while(values.hasNext())
    System.out.print(values.next()+" ,");
     // System.out.println(sortedSet);


     // Map colletions which stores key value pairs

     Map<Integer,String> map=new HashMap<>();
     map.put(1, "Jesus");
     map.put(2, "Holy Sprit");
     map.put(3, "Yahweh");
     System.out.println(map);

//  getting valus of map by using for loop
   for( int key:map.keySet())
   System.out.println(key+":"+map.get(key));
     

    }
    
}
