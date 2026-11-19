package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public int sum(int nums[]){

        return helper(nums,0);
    }

    private int helper(int nums[],int i){
        if(i == nums.length) return 0;

        return nums[i] + helper(nums,i+1);
    }
}

public class SumOfArrElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        System.out.println(s.sum(nums));
    }
}