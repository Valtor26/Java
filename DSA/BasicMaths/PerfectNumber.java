package DSA.BasicMaths;

import java.util.Scanner;

class Solution{
    public boolean isPerfect(int n){
        int ans = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                ans += i;
            }
        }

        return n == ans;
    }
}

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = sc.nextInt();

        Solution s = new Solution();

        System.out.println(s.isPerfect(n) ? "true" : "false");
    }
}
