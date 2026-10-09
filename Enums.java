enum Status{
    Running, Pending, Failed, Success; // named constants, these are objects
}

enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), Thinkpad(1000);

    private int price;

    Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}


class Enums{
    public static void main(String[] args){
        // Status s = Status.Running;
        // System.out.println(s);


        // Status[] s = Status.values();

        // for(Status i : s){
        //     System.out.println(i + " : " + i.ordinal());
        // }



        // Status s = Status.Running;

        // switch(s){
        //     case Running:
        //         System.out.println("Running");
        //         break;
        //     case Pending:
        //         System.out.println("Pending");
        //         break;
        //     case Failed:
        //         System.out.println("Failed");
        //         break;
        //     case Success:
        //         System.out.println("Success");
        //         break;
        //     default:
        //         System.out.println("Default");
        //         break;
        // }



        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());
        
    }
}