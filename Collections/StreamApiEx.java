package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiEx {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,5,3,7,3,22,0,8);
        Stream s0=list.stream().sorted();
        s0.forEach(n->System.out.println(n));
        int s1=list.stream().filter(n->n%2==0).map(n->n*2).reduce(0, (c,e)->c+e);
        //s1.forEach(n-> System.out.println(n));
        System.out.println(s1);
    }
}
