// Program for object class and some of its methhods like tostring(), equals(),hascode()..

class Ex{
    int price;
    String model;
    @Override
    public String toString() {
        return "Ex [price=" + price + ", model=" + model + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ex other = (Ex) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }



    
}
class ObjetClass{
    public static void main(String[] args) {
        Ex ob=new Ex();
        ob.model="Apple";
        ob.price=200;

        Ex obj=new Ex();
        obj.model="Applee";
        obj.price=200;
        System.out.println(ob);
        System.out.println(ob.hashCode()+" "+obj.hashCode());
     System.out.println(ob.equals(obj));
    }
}