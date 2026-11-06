package DSA.BasicMaths;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = sc.nextInt();
        int largest = 0;

        while(n > 0){
            int lastDig = n%10;
            n = n/10;

            if(lastDig > largest) largest = lastDig;
        }
        System.out.print("The largest digit from the number is: " + largest);
    }
}
