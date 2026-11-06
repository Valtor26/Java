package DSA.BasicMaths;

import java.util.Scanner;

class Solution{
    public boolean isArmstrong(int n){

        if(n < 0) return false;
        int original = n;
        int temp = n;
        int sum = 0;

        int digits = (n == 0) ? 1 : 0;

        while(temp > 0){
            digits += 1;
            temp /= 10;
        }

        temp = n;

        if(temp == 0) sum = 0;

        while(temp > 0){
            int digit = temp%10;
            int powerVal = 1;

            for(int i=0;i<digits;i++){
                powerVal *= digit;
            }

            sum += powerVal;
            temp /= 10;
        }

        return sum == original;
    }
}

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = sc.nextInt();

        Solution s = new Solution();

        System.out.println(s.isArmstrong(n) ? "true" : "false");
    }
}