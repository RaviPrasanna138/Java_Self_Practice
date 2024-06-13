package Collections;
// program for collections sorting with inbuilt and without inbuilt functions
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionSorting {
    public static void main(String[] args) {
        
    List<Integer> list=new ArrayList<>();
    list.add(22);
    list.add(24);
    list.add(0);
    list.add(12);
    Collections.sort(list);
    System.out.println(list);

    
    }
}
