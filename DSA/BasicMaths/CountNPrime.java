package DSA.BasicMaths;

import java.util.Scanner;

class Solution{
    public Boolean countPrime(int n){
        int cnt = 0;

        for(int i=1;i*i<=n;i++){
            if(n % i == 0){
                cnt++;

                if(n/i != i) cnt++;
            }
        }
        if(cnt == 2) return true;
        
        return false;
    }
}

public class CountNPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        Solution s = new Solution();

        int primeCnt = 0;
        for(int i=1;i<=n;i++){
            if(s.countPrime(i)) primeCnt++;
        }

        System.out.println("The number of prime till N: " + primeCnt);
    }
}
