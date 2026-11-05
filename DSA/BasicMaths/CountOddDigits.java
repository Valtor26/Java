package DSA.BasicMaths;

import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = sc.nextInt();
        int oddCnt = 0;

        while(n > 0){
            int lastDig = n%10;
            if(lastDig%2 != 0) oddCnt+= 1;
            
            n = n/10;
        }
        System.out.println("The number of odd digits are: "+ oddCnt);
    }
}
