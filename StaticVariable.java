public class StaticVariable {
    public static void main(String[] arg){
        class Mobile{
            int price;
            String brand;
            static String name;

            public void show(){
                System.out.println(brand +" : "+price+" : "+name);
            }
        }

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        // This is a static variable
        Mobile.name = "Smart Phone";
        m1.price = 100;
        m1.brand = "Apple";
        m2.price = 200;
        m2.brand = "Samsung";
        m1.show();
        m2.show();
    }
    
}
