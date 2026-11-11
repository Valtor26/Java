package DSA.BasicMaths;

import java.util.Scanner;

class Solution{
    public int[] sol(int n){
        int nums[] = new int[n];

        for(int i=1;i<=n;i++){
            if(n%i == 0) nums[i-1] = i;
        }

        return nums;
    }
}

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        Solution s = new Solution();

        int arr[] = s.sol(n);

        for(int el : arr){
            if(el != 0){
                System.out.print(el + " ");
            }
        }
    }
}
