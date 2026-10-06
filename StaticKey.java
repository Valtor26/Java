class Mobile{
    String brand;
    int price;
    static String name; // static variable is shared among all instances of the class, it belongs to the class itself rather than any specific instance

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticKey {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.price = 1000;
        m1.name = "Smartphone";
        

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 2000;
        m2.name = "Smartphone"; // Mobile.name = "Smartphone"; // this is the correct way to set the static variable

        
        

        Mobile.name = "Android"; // changing this will affect all instances of the class Mobile
        m1.show();
        m2.show();
    }
}