// Throw: throwing an exception


class AbhiException extends Exception{ // user created exception
    public AbhiException(String msg){
        super(msg);
    }
}


public class ThrowExp {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;

            if(j == 0){
                // throw new ArithmeticException("Division by zero");
                throw new AbhiException("I dont want to print this");
            }
        }
        catch(AbhiException e){
            j = 18/1;
            System.out.println("thats the default value: " + e);
        }

        System.out.println(j);
        System.out.println("Byeeee");
    }
}
