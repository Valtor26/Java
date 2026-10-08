interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Inside Desktop code");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Inside Laptop code");
    }
}

class Developer {
    public void devApp(Computer c){
        c.code();
    }
}


public class InterfaceNeed {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer obj = new Developer();
        obj.devApp(lap);
        
    }
}
