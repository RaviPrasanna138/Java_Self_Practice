// program for genrating getters and setters automatically , and generating constructors 
  // through source option availabe in IDE
 class Manishe{
    int age;
    String name;
    
    public Manishe() {
        age=9;
        name="Matthew";
    }
    public Manishe(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

 }

 class GetSet
  {
    public static void main(String[] args) {
    
    Manishe obj=new Manishe();
    Manishe obj1=new Manishe(20,"Ravi");
   obj.setAge(23); 
   System.out.println(obj.age+" ,"+obj.name);
   System.out.println(obj1.age+" ,"+obj1.name);
    }
 }
