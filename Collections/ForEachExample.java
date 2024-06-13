package Collections;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(2,3,4,6,89,0);
        System.out.println(nums);
        nums.forEach(n->System.out.println(n));

    }
}
