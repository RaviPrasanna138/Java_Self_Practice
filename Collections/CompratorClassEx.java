package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
  int roll;
  String name;
  public Student(int roll, String name) {
    this.roll = roll;
    this.name = name;
  }
  @Override
  public String toString() {
    return "Student [roll=" + roll + ", name=" + name + "]";
  }
  
  public int compareTo(Student that) {
    if(this.roll>that.roll)
    return 1;
    else
    return -1;
    
  }
  
}
public class CompratorClassEx {
      public static void main(String[] args) {
      Comparator<Student> num=(i,j)-> i.roll>j.roll? 1:1;
      //  {
           // i%10>j%10?return 1:return-1;
          
          //  if(i.roll>j.roll)
          //  return 1;
          //  else
          //  return -1;
        //}
        
    List<Student> list=new ArrayList<Student>();
    list.add(new Student(1, "Alpha"));
    list.add(new Student(2, "beta"));
    list.add(new Student(3, "omegha"));
    
   // Collections.sort(list,num);
    System.out.println(list);


    List<String> names=new ArrayList<>();
    names.add("Yahweh");
    names.add("Holy Sprit");
    names.add("Jesus of Nazereth");
   // System.out.println(names);

    Collections.sort(list,num);
    System.out.println(list);
   




    
    }
}
