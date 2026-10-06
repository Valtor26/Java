class Mobile{
    String brand;
    int price;
    static String name; // static variable is shared among all instances of the class, it belongs to the class itself rather than any specific instance

    static{ // called only once when the class is loaded into memory, it is used to initialize static variables
        name = "Android"; // this is the correct way to set the static variable
        System.out.println("Static block is called");
    }

    public Mobile(){
        brand = "Samsung";
        price = 1000;
        System.out.println("Constructor is called");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}



public class StaticBlock {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.show();

        Mobile m2 = new Mobile();
        m2.show();
    }
}
