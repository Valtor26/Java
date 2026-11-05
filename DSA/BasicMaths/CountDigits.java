package DSA.BasicMaths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = sc.nextInt();
        
        int cnt = 0;
        
        while(n > 0){
            n = n/10;
            cnt += 1;
        }
        System.out.println("The digit count is: " + cnt);
    }
}
