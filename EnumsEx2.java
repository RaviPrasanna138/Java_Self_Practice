enum Laptop{
        MAC(2000),REALME(1000),THINKPAD,DELL(1500);
       
        private int price;

        private Laptop() {
            price=200;
        }

        private Laptop(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        


}
public class EnumsEx2 {
    public static void main(String[] args) {
        Laptop lap=Laptop.MAC;
        System.out.println(lap+":"+lap.getPrice());
        for(Laptop i:Laptop.values()){
            System.out.println(i+":"+i.getPrice());
        }
    }
}
