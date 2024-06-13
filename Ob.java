class Student {
    int roll;
    String Name;
}
class Ob{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.Name="The lord";
        obj.roll=1;
        Student obj2=new Student();
        obj2.Name="Jesus";
        obj2.roll=2;
        Student obj3=new Student();
        obj3.Name="Holy sprit";
        obj3.roll=3;

        Student arr[]=new Student[3];
        arr[0]=obj;
        arr[1]=obj2;
        arr[2]=obj3;
        System.out.println(obj.Name);
        /*for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].Name+":"+arr[i].roll);
        }*/
        for(Student o:arr){
            System.out.println(o.Name+": "+o.roll);
        }
        
    }
}
