public class DoWhile {
    public static void main(String args[]){
        int i = 0;

        do{ // this loop will execute at least once even if the condition is false
            System.out.println("Hi " + i);
            i++;
        }while(i == 0); // condition is false, but the loop will execute once

        System.out.println("i = " + i);
    }
}
